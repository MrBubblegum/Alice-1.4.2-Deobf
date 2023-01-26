

/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package me.snow.aclient.core.setting.superblaubeere27obfuscator;

import java.awt.Color;
import java.util.HashMap;

import me.snow.aclient.core.setting.superblaubeere27obfuscator.FramebufferShader;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class RainbowCubeShader
        extends FramebufferShader {
    public static final RainbowCubeShader Field3637 = new RainbowCubeShader();
    public float Field3638;

    public RainbowCubeShader() {
        super("rainbowCube.frag");
    }

    @Override
    public void Method2164193() {
        this.Method2164198("resolution");
        this.Method2164198("time");
        this.Method2164198("alpha");
        this.Method2164198("WAVELENGTH");
        this.Method2164198("R");
        this.Method2164198("G");
        this.Method2164198("B");
        this.Method2164198("RSTART");
        this.Method2164198("GSTART");
        this.Method2164198("BSTART");
    }

    public void Method2164149(float f, Color color, int n2, int n3, int n4, int n5) {
        GL20.glUniform2f((int) this.Method2164199("resolution"), (float) ((float) new ScaledResolution(this.Field3343).getScaledWidth() / f), (float) ((float) new ScaledResolution(this.Field3343).getScaledHeight() / f));
        GL20.glUniform1f((int) this.Method2164199("time"), (float) this.Field3638);
        GL20.glUniform1f((int) this.Method2164199("alpha"), (float) ((float) color.getAlpha() / 255.0f));
        GL20.glUniform1f((int) this.Method2164199("WAVELENGTH"), (float) n2);
        GL20.glUniform1i((int) this.Method2164199("R"), (int) color.getRed());
        GL20.glUniform1i((int) this.Method2164199("G"), (int) color.getGreen());
        GL20.glUniform1i((int) this.Method2164199("B"), (int) color.getBlue());
        GL20.glUniform1i((int) this.Method2164199("RSTART"), (int) n3);
        GL20.glUniform1i((int) this.Method2164199("GSTART"), (int) n4);
        GL20.glUniform1i((int) this.Method2164199("BSTART"), (int) n5);
    }

    public void Method2164140(Color color, float f, float f2, float f3, Color color2, int n2, int n3, int n4, int n5) {
        this.Field3343.gameSettings.entityShadows = this.Field3342;
        this.Field3335.unbindFramebuffer();
        GL11.glEnable((int) 3042);
        GL11.glBlendFunc((int) 770, (int) 771);
        this.Field3343.getFramebuffer().bindFramebuffer(true);
        this.Field3336 = (float) color.getRed() / 255.0f;
        this.Field3337 = (float) color.getGreen() / 255.0f;
        this.Field3338 = (float) color.getBlue() / 255.0f;
        this.Field3339 = (float) color.getAlpha() / 255.0f;
        this.Field3340 = f;
        this.Field3341 = f2;
        this.Field3343.entityRenderer.disableLightmap();
        RenderHelper.disableStandardItemLighting();
        this.Method2164151(f3, color2, n2, n3, n4, n5);
        this.Field3343.entityRenderer.setupOverlayRendering();
        this.Method2164124(this.Field3335);
        this.Method2164192();
        this.Field3343.entityRenderer.disableLightmap();
        GlStateManager.popMatrix();
        GlStateManager.popAttrib();
    }

    public void Method2164151(float f, Color color, int n2, int n3, int n4, int n5) {
        GL11.glPushMatrix();
        GL20.glUseProgram((int) this.Field1381);
        if (this.Field1382 == null) {
            this.Field1382 = new HashMap();
            this.Method2164193();
        }
        this.Method2164149(f, color, n2, n3, n4, n5);
    }

    public void Method2164152(double d) {
        this.Field3638 = (float) ((double) this.Field3638 + d);
    }
}

