/*
 * Decompiled with CFR 0.150.
 */
package org.spongepowered.asm.util.asm;

import java.util.List;
import org.spongepowered.asm.lib.Type;
import org.spongepowered.asm.lib.tree.analysis.SimpleVerifier;
import org.spongepowered.asm.mixin.transformer.ClassInfo;

public class MixinVerifier
extends SimpleVerifier {
    private Type currentClass;
    private Type currentSuperClass;
    private List<Type> currentClassInterfaces;
    private boolean isInterface;

    public MixinVerifier(Type currentClass, Type currentSuperClass, List<Type> currentClassInterfaces, boolean isInterface) {
        super(currentClass, currentSuperClass, currentClassInterfaces, isInterface);
        this.currentClass = currentClass;
        this.currentSuperClass = currentSuperClass;
        this.currentClassInterfaces = currentClassInterfaces;
        this.isInterface = isInterface;
    }

    @Override
    protected boolean isInterface(Type type) {
        if (this.currentClass != null && type.equals(this.currentClass)) {
            return this.isInterface;
        }
        return ClassInfo.forType(type).isInterface();
    }

    @Override
    protected Type getSuperClass(Type type) {
        if (this.currentClass != null && type.equals(this.currentClass)) {
            return this.currentSuperClass;
        }
        ClassInfo c = ClassInfo.forType(type).getSuperClass();
        return c == null ? null : Type.getType("L" + c.getName() + ";");
    }

    @Override
    protected boolean isAssignableFrom(Type type, Type other) {
        if (type.equals(other)) {
            return true;
        }
        if (this.currentClass != null && type.equals(this.currentClass)) {
            if (this.getSuperClass(other) == null) {
                return false;
            }
            if (this.isInterface) {
                return other.getSort() == 10 || other.getSort() == 9;
            }
            return this.isAssignableFrom(type, this.getSuperClass(other));
        }
        if (this.currentClass != null && other.equals(this.currentClass)) {
            if (this.isAssignableFrom(type, this.currentSuperClass)) {
                return true;
            }
            if (this.currentClassInterfaces != null) {
                for (int i2 = 0; i2 < this.currentClassInterfaces.size(); ++i2) {
                    Type v = this.currentClassInterfaces.get(i2);
                    if (!this.isAssignableFrom(type, v)) continue;
                    return true;
                }
            }
            return false;
        }
        ClassInfo typeInfo = ClassInfo.forType(type);
        if (typeInfo == null) {
            return false;
        }
        if (typeInfo.isInterface()) {
            typeInfo = ClassInfo.forName("java/lang/Object");
        }
        return ClassInfo.forType(other).hasSuperClass(typeInfo);
    }
}

