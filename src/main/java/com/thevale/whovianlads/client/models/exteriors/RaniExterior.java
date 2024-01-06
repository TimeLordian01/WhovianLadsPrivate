package com.thevale.whovianlads.client.models.exteriors;// Made with Blockbench 4.9.0-beta.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.whovianlads.client.renders.exteriors.BrackolinRender;
import com.thevale.whovianlads.util.EnumDoorTypes;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.enums.EnumMatterState;
import net.tardis.mod.helper.Helper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class RaniExterior extends ExteriorModel {
	private final ModelRenderer Door;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer Shell;
	private final ModelRenderer BOTI;

	public RaniExterior() {
		textureWidth = 160;
		textureHeight = 160;

		Door = new ModelRenderer(this);
		Door.setRotationPoint(7.0F, 3.0F, -9.0F);
		Door.setTextureOffset(116, 56).addBox(-13.0F, 17.0F, 0.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Door.setTextureOffset(112, 118).addBox(-14.0F, -18.0F, 0.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Door.setTextureOffset(92, 0).addBox(-13.0F, -17.0F, 0.5F, 12.0F, 34.0F, 1.0F, 0.0F, false);
		Door.setTextureOffset(116, 118).addBox(-1.0F, -18.0F, 0.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Door.setTextureOffset(66, 45).addBox(-13.0F, -18.0F, 0.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Door.setTextureOffset(92, 35).addBox(-12.0F, -12.0F, -0.25F, 10.0F, 24.0F, 1.0F, -0.25F, false);
		Door.setTextureOffset(116, 39).addBox(-12.0F, -7.0F, -0.75F, 10.0F, 14.0F, 1.0F, -0.25F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-6.9876F, -6.75F, -0.15F);
		Door.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.setTextureOffset(0, 23).addBox(-3.5F, -3.5F, -0.5F, 7.0F, 7.0F, 1.0F, -0.151F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-6.9876F, 6.75F, -0.15F);
		Door.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.setTextureOffset(0, 8).addBox(-3.5F, -3.5F, -0.5F, 7.0F, 7.0F, 1.0F, -0.151F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-6.9848F, -11.75F, 0.348F);
		Door.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.setTextureOffset(0, 0).addBox(-3.5F, -3.5F, -0.5F, 7.0F, 7.0F, 1.0F, -0.153F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-6.9848F, 11.75F, 0.348F);
		Door.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.setTextureOffset(0, 31).addBox(-3.5F, -3.5F, -0.5F, 7.0F, 7.0F, 1.0F, -0.153F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-7.0F, 0.0F, -0.75F);
		Door.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.setTextureOffset(0, 45).addBox(-3.5F, -3.5F, -0.5F, 7.0F, 7.0F, 1.0F, -0.25F, false);

		Shell = new ModelRenderer(this);
		Shell.setRotationPoint(0.0F, 24.0F, 0.0F);
		Shell.setTextureOffset(76, 64).addBox(-11.0F, -40.0F, 8.0F, 22.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(84, 77).addBox(-7.0F, -40.0F, -9.5F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(19, 78).addBox(-7.0F, -3.0F, -9.5F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(0, 23).addBox(-13.0F, -2.0F, -10.0F, 26.0F, 2.0F, 20.0F, 0.0F, false);
		Shell.setTextureOffset(0, 0).addBox(-13.0F, -43.0F, -10.0F, 26.0F, 3.0F, 20.0F, 0.0F, false);
		Shell.setTextureOffset(0, 45).addBox(-12.0F, -44.0F, -9.0F, 24.0F, 1.0F, 18.0F, 0.0F, false);
		Shell.setTextureOffset(38, 64).addBox(-12.0F, -40.0F, -9.0F, 1.0F, 38.0F, 18.0F, 0.0F, false);
		Shell.setTextureOffset(84, 103).addBox(-11.0F, -40.0F, -9.0F, 3.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(76, 103).addBox(8.0F, -40.0F, -9.0F, 3.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(98, 103).addBox(9.0F, -40.0F, -9.5F, 2.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(92, 103).addBox(-11.0F, -40.0F, -9.5F, 2.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(107, 117).addBox(7.0F, -40.0F, -9.5F, 1.0F, 38.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(103, 117).addBox(-8.0F, -40.0F, -9.5F, 1.0F, 38.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(0, 64).addBox(11.0F, -40.0F, -9.0F, 1.0F, 38.0F, 18.0F, 0.0F, false);
		Shell.setTextureOffset(20, 120).addBox(11.25F, -39.0F, -8.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(16, 120).addBox(11.25F, -39.0F, 7.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(104, 103).addBox(11.25F, -4.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		Shell.setTextureOffset(100, 48).addBox(11.25F, -39.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		Shell.setTextureOffset(8, 120).addBox(-12.25F, -39.0F, 7.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(4, 120).addBox(-11.0F, -39.0F, 8.25F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(0, 120).addBox(10.0F, -39.0F, 8.25F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(114, 37).addBox(-10.0F, -4.0F, 8.25F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(114, 35).addBox(-10.0F, -39.0F, 8.25F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(20, 64).addBox(-12.25F, -4.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		Shell.setTextureOffset(12, 120).addBox(-12.25F, -39.0F, -8.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(66, 48).addBox(-12.25F, -39.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setRotationPoint(0.0F, 24.0F, 0.0F);
		BOTI.setTextureOffset(130, 123).addBox(-7.0F, -39.0F, -7.5F, 14.0F, 36.0F, 1.0F, 0.0F, false);
	}
	public void renderBones(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
		matrixStack.push();
		EnumDoorState state = exterior.getOpen();
		matrixStack.translate(0.0D, 0.3D, 0.0D);
		matrixStack.scale(0.8F, 0.8F, 0.8F);
		switch (state) {
			case ONE:
				this.Door.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.RANI.getRotationForState(EnumDoorState.ONE));
				break;
			case CLOSED:
				this.Door.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.RANI.getRotationForState(EnumDoorState.CLOSED));
		}
		Door.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		//BOTI.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.pop();
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

	}
	public void renderBoti(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer,
						   int packedLight, int packedOverlay, float alpha) {
		if(exterior.getBotiWorld() != null && exterior.getOpen() != EnumDoorState.CLOSED) {
			PortalInfo info = new PortalInfo();
			info.setPosition(exterior.getPos());
			info.setWorldShell(exterior.getBotiWorld());

			info.setTranslate(matrix -> {
				matrix.translate(-0.5, 0.7, -0.5);
				ExteriorRenderer.applyTransforms(matrix, exterior);
			});
			info.setTranslatePortal(matrix -> {
				matrix.rotate(Vector3f.ZN.rotationDegrees(180));
				matrix.rotate(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(exterior.getBotiWorld().getPortalDirection())));
				matrix.translate(-0.5, -1, -0.5);
			});

			info.setRenderPortal((matrix, buf) -> {
				matrix.push();
				matrix.scale(0.8f, 0.8f, 1f);
				this.BOTI.render(matrix, buf.getBuffer(TRenderTypes.getTardis(Helper.getVariantTextureOr(exterior.getVariant(), BrackolinRender.TEXTURE))), packedLight, packedOverlay);
				matrix.pop();
			});
			BOTIRenderer.addPortal(info);
		}

	}

}
