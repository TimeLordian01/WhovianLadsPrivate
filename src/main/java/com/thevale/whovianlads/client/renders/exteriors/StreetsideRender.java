package com.thevale.whovianlads.client.renders.exteriors;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.thevale.whovianlads.client.models.exteriors.StreetsideExterior;
import com.thevale.whovianlads.tileentities.StreetsideTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;


public class StreetsideRender extends ExteriorRenderer<StreetsideTile> {
    public static final ResourceLocation TEXTURE = new ResourceLocation("whovianlads","textures/exteriors/streetside.png");
    public static StreetsideExterior MODEL = new StreetsideExterior();
    public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0x000000);

    public StreetsideRender(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void renderExterior(StreetsideTile StreetsideTile, float v, MatrixStack matrixStack, IRenderTypeBuffer iRenderTypeBuffer, int i, int i1, float v1) {
        matrixStack.push();
        matrixStack.translate(0, -1, 0);
        MODEL.render(StreetsideTile, 0.25F, matrixStack, iRenderTypeBuffer.getBuffer(RenderType.getEntityCutoutNoCull(TEXTURE)), i, i1, v1);
        matrixStack.pop();
    }
}
