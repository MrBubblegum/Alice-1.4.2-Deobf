

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  me.snow.aclient.core.setting.superblaubeere27obfuscator.IIIllIIllIIllIIlllIIlllIIllIIllIllIIIlIlIlIlIIllIIIlIIllIIlllIIIlIllIllIIlllIlllIIIllIlIIIllIIIlIlIIlIIlllIIlllIIlllIlllIIlllIIIlIlllIIlllIlIIlIIlllIIlllIIIllIlIIIllIllIIllIIlllIIllIIlIIIlIIlIllIllIIllIIIlllIIlllIIllIIIllIIIllIIIlIIIlIIIll
 *  me.snow.aclient.core.setting.superblaubeere27obfuscator.IIllIIlIllIIlIlllIIllIIIllIIIllIlIIlIIIllIIlllIIllIllIlIIlllIIlllIlIlIIlllIIlllIIIllIIllIIlIIIllIIIlllIIIllIllIIIlllIIllIllIlllIIIllIIIllIIlIlIIllIIlIIIlllIIllIIllIllIlllIIIlIIlIIIlIIllIlIIllIlllIlIIIllIIIlIIIllIIIlIlIllIIllIlIll
 *  me.snow.aclient.core.setting.superblaubeere27obfuscator.IIlllIIIllIIllIIllIllIlllIIlllIIllIIlIIIlllIIllIIIllIllIlIIllIlIIllIIlIlllIIIllIIIlllIllIIIllIIlIIlllIIlIIllIlIIllIlIllIlllIIlIIlIIlllIIlIIllIIllIllIIIlllIllIIlllIIlllIllIIlllIIllIIlIIlllIllIllIlllIIIllIIllIIlIllIIlIlIllIllIIIlll
 *  me.snow.aclient.core.setting.superblaubeere27obfuscator.IllIIIlllIllIIIllIIIlIlIIIlllIlIIlllIIllIIlllIIlllIllIIllIIIlIIlllIIIlIIllIllIlllIIIllIIlIllIllIlIIllIlllIllIIllIIIlIllIIlIIllIIIlIllIIlIllIIIllIIlIlIIIllIIlIIlIIllIIIlIIlllIlllIIlIIllIIIlIllIIlIIlIIlIIlllIIIllIIllIIlIIIllIIl
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ChatLine
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiNewChat
 */
package me.snow.aclient.mixin.mixins;

import java.awt.Color;
import java.util.List;
import me.snow.aclient.core.setting.superblaubeere27obfuscator.IIIllIIllIIllIIlllIIlllIIllIIllIllIIIlIlIlIlIIllIIIlIIllIIlllIIIlIllIllIIlllIlllIIIllIlIIIllIIIlIlIIlIIlllIIlllIIlllIlllIIlllIIIlIlllIIlllIlIIlIIlllIIlllIIIllIlIIIllIllIIllIIlllIIllIIlIIIlIIlIllIllIIllIIIlllIIlllIIllIIIllIIIllIIIlIIIlIIIll;
import me.snow.aclient.core.setting.superblaubeere27obfuscator.IIllIIlIllIIlIlllIIllIIIllIIIllIlIIlIIIllIIlllIIllIllIlIIlllIIlllIlIlIIlllIIlllIIIllIIllIIlIIIllIIIlllIIIllIllIIIlllIIllIllIlllIIIllIIIllIIlIlIIllIIlIIIlllIIllIIllIllIlllIIIlIIlIIIlIIllIlIIllIlllIlIIIllIIIlIIIllIIIlIlIllIIllIlIll;
import me.snow.aclient.core.setting.superblaubeere27obfuscator.IIlllIIIllIIllIIllIllIlllIIlllIIllIIlIIIlllIIllIIIllIllIlIIllIlIIllIIlIlllIIIllIIIlllIllIIIllIIlIIlllIIlIIllIlIIllIlIllIlllIIlIIlIIlllIIlIIllIIllIllIIIlllIllIIlllIIlllIllIIlllIIllIIlIIlllIllIllIlllIIIllIIllIIlIllIIlIlIllIllIIIlll;
import me.snow.aclient.core.setting.superblaubeere27obfuscator.IllIIIlllIllIIIllIIIlIlIIIlllIlIIlllIIllIIlllIIlllIllIIllIIIlIIlllIIIlIIllIllIlllIIIllIIlIllIllIlIIllIlllIllIIllIIIlIllIIlIIllIIIlIllIIlIllIIIllIIlIlIIIllIIlIIlIIllIIIlIIlllIlllIIlIIllIIIlIllIIlIIlIIlIIlllIIIllIIllIIlIIIllIIl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ChatLine;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiNewChat;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={GuiNewChat.class})
public class MixinGuiNewChat
extends Gui {
    @Shadow
    @Final
    public List<ChatLine> drawnChatLines;
    private ChatLine chatLine;

    @Redirect(method={"drawChat"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiNewChat;drawRect(IIIII)V"))
    private void drawRectHook(int left, int top, int right, int bottom, int color) {
        Gui.drawRect((int)left, (int)top, (int)right, (int)bottom, (int)(IIlllIIIllIIllIIllIllIlllIIlllIIllIIlIIIlllIIllIIIllIllIlIIllIlIIllIIlIlllIIIllIIIlllIllIIIllIIlIIlllIIlIIllIlIIllIlIllIlllIIlIIlIIlllIIlIIllIIllIllIIIlllIllIIlllIIlllIllIIlllIIllIIlIIlllIllIllIlllIIIllIIllIIlIllIIlIlIllIllIIIlll.Method2161839().Method2150386() && (Boolean)IIlllIIIllIIllIIllIllIlllIIlllIIllIIlIIIlllIIllIIIllIllIlIIllIlIIllIIlIlllIIIllIIIlllIllIIIllIIlIIlllIIlIIllIlIIllIlIllIlllIIlIIlIIlllIIlIIllIIllIllIIIlllIllIIlllIIlllIllIIlllIIllIIlIIlllIllIllIlllIIIllIIllIIlIllIIlIlIllIllIIIlll.Method2161839().IllIllIllIlllIIlllIIlllIIlIIlllIIlIIllIIllIIllIIIlIllIIllIlllIlIIllIIlllIIlIIIlIIlIIllIlllIIlIIIlIIIlIllIlIIllIIllIIlllIIllIIlIlllIlllIIIlIIIlllIIllIIIlllIIllIllIIlllIIllIIllIIllIlIIllIllIIlllIIllIIlIIllIlIIIlllIIlIllIIlllIllIIl.getValue() != false ? 0 : color));
    }

    @Redirect(method={"drawChat"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/FontRenderer;drawStringWithShadow(Ljava/lang/String;FFI)I"))
    private int drawStringWithShadow(FontRenderer fontRenderer, String text, float x2, float y, int color) {
        if (text.contains("\u00a7+")) {
            IIllIIlIllIIlIlllIIllIIIllIIIllIlIIlIIIllIIlllIIllIllIlIIlllIIlllIlIlIIlllIIlllIIIllIIllIIlIIIllIIIlllIIIllIllIIIlllIIllIllIlllIIIllIIIllIIlIlIIllIIlIIIlllIIllIIllIllIlllIIIlIIlIIIlIIllIlIIllIlllIlIIIllIIIlIIIllIIIlIlIllIIllIlIll.IlIllIIlllIIlllIIlllIIIllIIIllIIlllIlIIllIllIIIllIlIIlllIlIIlIIllIllIlIIlIllIIIllIIllIIIllIllIlIIIlllIIIlIIlllIIlIIIlllIIIllIIIllIIlllIIllIIlIIIllIIllIIlllIIllIlIllIIllIIllIllIIIllIIllIIlIIIlIIlllIIIlIIlllIIlIIIllIlIlllIlIllIIlIIIll.Method2150331(text, x2, y, Color.HSBtoRGB(IllIIIlllIllIIIllIIIlIlIIIlllIlIIlllIIllIIlllIIlllIllIIllIIIlIIlllIIIlIIllIllIlllIIIllIIlIllIllIlIIllIlllIllIIllIIIlIllIIlIIllIIIlIllIIlIllIIIllIIlIlIIIllIIlIIlIIllIIIlIIlllIlllIIlIIllIIIlIllIIlIIlIIlIIlllIIIllIIllIIlIIIllIIl.IllIllIIIlllIllIIlllIlIllIIllIllIIlIIIlIIlllIIllIlllIIlIlIlIIlIIIllIIlIIIllIIIllIIlIIlIIIllIIlIllIIlllIlIIlllIllIIIllIIllIIlllIIIllIIllIIIllIIIllIIIlllIIlIlIIIlIlllIIIlIIllIlIIlllIlIIllIllIllIlllIIllIIIllIIIllIIlIIlIIIlIIllIll.IIlllIIIllIIllIIllIlIIIlIIIllIIIlIIlllIIIlIlllIIlIIllIlIlIlIlIIIlllIIIlllIIIlllIIIlllIIlIllIIllIlllIllIIlllIlllIlllIIlIIlIIIllIllIIIlllIIllIIlIlllIIllIIIllIIlIIllIIIlIllIIIllIIllIIIlIIllIIlllIIlllIIIllIllIIIllIIllIIllIlIllIllIIIlIIllIIl, (float)((Integer)IIIllIIllIIllIIlllIIlllIIllIIllIllIIIlIlIlIlIIllIIIlIIllIIlllIIIlIllIllIIlllIlllIIIllIlIIIllIIIlIlIIlIIlllIIlllIIlllIlllIIlllIIIlIlllIIlllIlIIlIIlllIIlllIIIllIlIIIllIllIIllIIlllIIllIIlIIIlIIlIllIllIIllIIIlllIIlllIIllIIIllIIIllIIIlIIIlIIIll.Method2150598().IIlIIlIllIIllIIllIIIlIIIlllIIIlIIlllIIIlIIllIIlIIlIIllIIIllIlllIIIlllIIlIlIIIllIIlllIIlIlllIIllIIlIIllIIlIllIllIIlIIllIIllIIllIIlllIIlIIllIlIIllIlIIllIlllIllIlllIIIlIIllIIlllIlIllIIlIllIIlIIllIIIllIllIIlIIIlIllIllIlllIll.getValue()).intValue() / 255.0f, (float)((Integer)IIIllIIllIIllIIlllIIlllIIllIIllIllIIIlIlIlIlIIllIIIlIIllIIlllIIIlIllIllIIlllIlllIIIllIlIIIllIIIlIlIIlIIlllIIlllIIlllIlllIIlllIIIlIlllIIlllIlIIlIIlllIIlllIIIllIlIIIllIllIIllIIlllIIllIIlIIIlIIlIllIllIIllIIIlllIIlllIIllIIIllIIIllIIIlIIIlIIIll.Method2150598().IIlllIIIllIIllIIllIlIIIlIIIllIIIlIIlllIIIlIlllIIlIIllIlIlIlIlIIIlllIIIlllIIIlllIIIlllIIlIllIIllIlllIllIIlllIlllIlllIIlIIlIIIllIllIIIlllIIllIIlIlllIIllIIIllIIlIIllIIIlIllIIIllIIllIIIlIIllIIlllIIlllIIIllIllIIIllIIllIIllIlIllIllIIIlIIllIIl.getValue()).intValue() / 255.0f), ((Float)IIIllIIllIIllIIlllIIlllIIllIIllIllIIIlIlIlIlIIllIIIlIIllIIlllIIIlIllIllIIlllIlllIIIllIlIIIllIIIlIlIIlIIlllIIlllIIlllIlllIIlllIIIlIlllIIlllIlIIlIIlllIIlllIIIllIlIIIllIllIIllIIlllIIllIIlIIIlIIlIllIllIIllIIIlllIIlllIIllIIIllIIIllIIIlIIIlIIIll.Method2150598().IlIllIIlllIIlllIIlllIIIllIIIllIIlllIlIIllIllIIIllIlIIlllIlIIlIIllIllIlIIlIllIIIllIIllIIIllIllIlIIIlllIIIlIIlllIIlIIIlllIIIllIIIllIIlllIIllIIlIIIllIIllIIlllIIllIlIllIIllIIllIllIIIllIIllIIlIIIlIIlllIIIlIIlllIIlIIIllIlIlllIlIllIIlIIIll.getValue()).floatValue(), true);
        } else {
            Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(text, x2, y, color);
        }
        return 0;
    }

    @Redirect(method={"setChatLine"}, at=@At(value="INVOKE", target="Ljava/util/List;size()I", ordinal=0, remap=false))
    public int drawnChatLinesSize(List<ChatLine> list) {
        return IIlllIIIllIIllIIllIllIlllIIlllIIllIIlIIIlllIIllIIIllIllIlIIllIlIIllIIlIlllIIIllIIIlllIllIIIllIIlIIlllIIlIIllIlIIllIlIllIlllIIlIIlIIlllIIlIIllIIllIllIIIlllIllIIlllIIlllIllIIlllIIllIIlIIlllIllIllIlllIIIllIIllIIlIllIIlIlIllIllIIIlll.Method2161839().Method2150386() && (Boolean)IIlllIIIllIIllIIllIllIlllIIlllIIllIIlIIIlllIIllIIIllIllIlIIllIlIIllIIlIlllIIIllIIIlllIllIIIllIIlIIlllIIlIIllIlIIllIlIllIlllIIlIIlIIlllIIlIIllIIllIllIIIlllIllIIlllIIlllIllIIlllIIllIIlIIlllIllIllIlllIIIllIIllIIlIllIIlIlIllIllIIIlll.Method2161839().IlIllIlllIIllIlllIIllIIlllIIIllIIllIIlIIIlllIllIIlIlIIllIIIllIlIlIIllIllIlllIlIIllIIIlllIIllIIIlIIIlIIlIIlIIIlllIllIlllIIIlIIllIIIlIllIIIllIIlIIlIIIlIlIlIIIlllIlllIIlIllIIlllIIllIllIIlllIIIllIlIIllIIllIIlIIlIIllIllIIIllIl.getValue() != false ? -2147483647 : list.size();
    }

    @Redirect(method={"setChatLine"}, at=@At(value="INVOKE", target="Ljava/util/List;size()I", ordinal=2, remap=false))
    public int chatLinesSize(List<ChatLine> list) {
        return IIlllIIIllIIllIIllIllIlllIIlllIIllIIlIIIlllIIllIIIllIllIlIIllIlIIllIIlIlllIIIllIIIlllIllIIIllIIlIIlllIIlIIllIlIIllIlIllIlllIIlIIlIIlllIIlIIllIIllIllIIIlllIllIIlllIIlllIllIIlllIIllIIlIIlllIllIllIlllIIIllIIllIIlIllIIlIlIllIllIIIlll.Method2161839().Method2150386() && (Boolean)IIlllIIIllIIllIIllIllIlllIIlllIIllIIlIIIlllIIllIIIllIllIlIIllIlIIllIIlIlllIIIllIIIlllIllIIIllIIlIIlllIIlIIllIlIIllIlIllIlllIIlIIlIIlllIIlIIllIIllIllIIIlllIllIIlllIIlllIllIIlllIIllIIlIIlllIllIllIlllIIIllIIllIIlIllIIlIlIllIllIIIlll.Method2161839().IlIllIlllIIllIlllIIllIIlllIIIllIIllIIlIIIlllIllIIlIlIIllIIIllIlIlIIllIllIlllIlIIllIIIlllIIllIIIlIIIlIIlIIlIIIlllIllIlllIIIlIIllIIIlIllIIIllIIlIIlIIIlIlIlIIIlllIlllIIlIllIIlllIIllIllIIlllIIIllIlIIllIIllIIlIIlIIllIllIIIllIl.getValue() != false ? -2147483647 : list.size();
    }
}

