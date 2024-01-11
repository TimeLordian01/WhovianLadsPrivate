package com.thevale.whovianlads.client.renders.consoles;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.thevale.whovianlads.client.models.consoles.BrackolinConsole;
import com.thevale.whovianlads.tileentities.consoles.BrackolinConsoleTile;
import com.thevale.whovianlads.whovianlads;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import org.spongepowered.asm.service.modlauncher.ModLauncherAuditTrail;

public class BrackolinConsoleRender extends TileEntityRenderer<BrackolinConsoleTile> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(whovianlads.MODID, "textures/consoles/brackolin.png");
	public static final BrackolinConsole MODEL = new BrackolinConsole();

	public BrackolinConsoleRender(TileEntityRendererDispatcher rendererDispatcherIn) {
		super(rendererDispatcherIn);
	}

	@Override
	public void render(BrackolinConsoleTile tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
		matrixStackIn.push();
		float scale = 0.0625F;
		matrixStackIn.scale((float) 1.15, (float) 1.15, (float) 1.15);
		matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180));
		matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180));
		matrixStackIn.translate(-0.5, -1.68, 0.5);
		MODEL.render(tileEntityIn, scale, matrixStackIn, bufferIn.getBuffer(RenderType.getEntityTranslucent(TEXTURE )), combinedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
		matrixStackIn.pop();
		matrixStackIn.push();
		matrixStackIn.translate(0.2, 1.25,0.55);
		matrixStackIn.scale(0.5f,0.5f,0.5f);
		matrixStackIn.rotate(Vector3f.YP.rotationDegrees(-120));
		matrixStackIn.rotate(Vector3f.XP.rotationDegrees(110));
		matrixStackIn.scale((float) 0.5, (float) 0.5, (float) 0.5);
		matrixStackIn.rotate(Vector3f.XP.rotationDegrees(90));
		Minecraft.getInstance().getItemRenderer().renderItem(tileEntityIn.getSonicItem(), ItemCameraTransforms.TransformType.NONE, combinedLightIn, combinedOverlayIn, matrixStackIn, bufferIn);
		matrixStackIn.pop();
	}
}