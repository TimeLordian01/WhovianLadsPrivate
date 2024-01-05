package com.thevale.whovianlads.client.renders.consoles;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.whovianlads.whovianlads;
import com.thevale.whovianlads.client.models.consoles.ValeConsoleModel;
import com.thevale.whovianlads.tileentities.consoles.ValeConsoleTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class ValeConsoleRender extends TileEntityRenderer<ValeConsoleTile> {
    public static final ValeConsoleModel MODEL = new ValeConsoleModel();

    public ValeConsoleRender(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void render(ValeConsoleTile tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        matrixStackIn.push();
        float scale = 1F;
        matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90));
        matrixStackIn.translate(1.725, -0.5, 0.5);
        matrixStackIn.scale((float) 1.15, (float) 1.15, (float) 1.15);
        matrixStackIn.rotate(Vector3f.XP.rotationDegrees(0));
        matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90));
        ResourceLocation texture = new ResourceLocation(whovianlads.MODID, "textures/consoles/valeconsole.png");
        if(tileEntityIn.getVariant() != null)
            texture = tileEntityIn.getVariant().getTexture();
        MODEL.render(tileEntityIn, 0.25F, matrixStackIn, bufferIn.getBuffer(RenderType.getEntityTranslucent(texture)), combinedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1.0F);
        matrixStackIn.push();
        matrixStackIn.translate(0.43, 0.55, 0.5995);
        matrixStackIn.rotate(Vector3f.XN.rotationDegrees(0));
        float sonic_scale = 0.25F;
        matrixStackIn.scale(sonic_scale, sonic_scale, sonic_scale);
        Minecraft.getInstance().getItemRenderer().renderItem(tileEntityIn.getSonicItem(), ItemCameraTransforms.TransformType.NONE, combinedLightIn, combinedOverlayIn, matrixStackIn, bufferIn);
        matrixStackIn.pop();

        matrixStackIn.pop();
    }
}