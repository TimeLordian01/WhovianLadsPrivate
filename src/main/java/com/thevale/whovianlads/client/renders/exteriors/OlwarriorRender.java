package com.thevale.whovianlads.client.renders.exteriors;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.whovianlads.client.models.exteriors.OlwarriorExterior;
import com.thevale.whovianlads.tileentities.exteriors.OlwarriorTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;

public class OlwarriorRender extends ExteriorRenderer<OlwarriorTile> {
    public static ResourceLocation TEXTURE = new ResourceLocation("whovianlads", "textures/exteriors/olwarrior/olwarrior.png");
    public static OlwarriorExterior MODEL = new OlwarriorExterior();
    public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0);

    public OlwarriorRender(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void renderExterior(OlwarriorTile tile, float v, MatrixStack matrixStack, IRenderTypeBuffer bufferIn, int i, int i1, float v1) {
        matrixStack.push();
        matrixStack.translate(0.0, -1.0, 0.0);
        ResourceLocation texture = TEXTURE;
        if (tile.getVariant() != null) {
            texture = tile.getVariant().getTexture();
        }

        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(TRenderTypes.getTardis(texture));
        MODEL.render(tile, 0.25F, matrixStack, ivertexbuilder, i, i1, v1);
        matrixStack.pop();
    }

    public boolean floatInAir() {
        return true;
    }

}
