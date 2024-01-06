package com.thevale.whovianlads.client.models.exteriors;// Made with Blockbench 4.9.0-beta.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.whovianlads.client.renders.exteriors.BrackolinRender;
import com.thevale.whovianlads.util.EnumDoorTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ModelRenderer;
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

public class BrackolinExterior extends ExteriorModel {
	private final ModelRenderer Shell;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private final ModelRenderer BOTI;
	private final ModelRenderer Doors;


	public BrackolinExterior() {
		textureWidth = 176;
		textureHeight = 176;

		Shell = new ModelRenderer(this);
		Shell.setRotationPoint(0.0F, 24.0F, 0.0F);
		Shell.setTextureOffset(0, 0).addBox(-14.0F, -2.0F, -14.0F, 28.0F, 2.0F, 28.0F, 0.0F, false);
		Shell.setTextureOffset(36, 123).addBox(10.0F, -48.0F, -13.0F, 3.0F, 46.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(52, 123).addBox(9.0F, -44.0F, -12.0F, 1.0F, 42.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(42, 61).addBox(-12.0F, -44.0F, -10.0F, 1.0F, 42.0F, 20.0F, 0.0F, false);
		Shell.setTextureOffset(84, 61).addBox(-10.0F, -44.0F, 11.0F, 20.0F, 42.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(0, 61).addBox(11.0F, -44.0F, -10.0F, 1.0F, 42.0F, 20.0F, 0.0F, false);
		Shell.setTextureOffset(48, 123).addBox(-10.0F, -44.0F, -12.0F, 1.0F, 42.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(22, 61).addBox(-9.0F, -44.0F, -12.0F, 18.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(24, 123).addBox(-13.0F, -48.0F, -13.0F, 3.0F, 46.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(0, 123).addBox(10.0F, -48.0F, 10.0F, 3.0F, 46.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(12, 123).addBox(-13.0F, -48.0F, 10.0F, 3.0F, 46.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(112, 0).addBox(-12.0F, -47.0F, -14.0F, 24.0F, 3.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(96, 54).addBox(-12.0F, -47.0F, 12.0F, 24.0F, 3.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(0, 30).addBox(-12.0F, -51.0F, -12.0F, 24.0F, 7.0F, 24.0F, 0.0F, false);
		Shell.setTextureOffset(24, 0).addBox(1.5F, -57.5F, -2.5F, 1.0F, 6.0F, 1.0F, -0.25F, false);
		Shell.setTextureOffset(20, 20).addBox(1.5F, -57.5F, 1.5F, 1.0F, 6.0F, 1.0F, -0.25F, false);
		Shell.setTextureOffset(20, 0).addBox(-2.5F, -57.5F, 1.5F, 1.0F, 6.0F, 1.0F, -0.25F, false);
		Shell.setTextureOffset(16, 20).addBox(-2.5F, -57.5F, -2.5F, 1.0F, 6.0F, 1.0F, -0.25F, false);
		Shell.setTextureOffset(0, 0).addBox(-2.5F, -52.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		Shell.setTextureOffset(0, 6).addBox(-2.5F, -58.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		Shell.setTextureOffset(0, 12).addBox(-2.0F, -57.5F, -2.0F, 4.0F, 6.0F, 4.0F, -0.25F, false);
		Shell.setTextureOffset(16, 12).addBox(-1.5F, -57.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(88, 27).addBox(-14.0F, -47.0F, -12.0F, 2.0F, 3.0F, 24.0F, 0.0F, false);
		Shell.setTextureOffset(84, 0).addBox(12.0F, -47.0F, -12.0F, 2.0F, 3.0F, 24.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setRotationPoint(0.0F, 24.0F, 0.0F);
		BOTI.setTextureOffset(136, 133).addBox(-9.0F, -43.0F, -11.0F, 18.0F, 41.0F, 2.0F, 0.0F, false);

		Doors = new ModelRenderer(this);
		Doors.setRotationPoint(0.0F, 24.0F, 0.0F);


		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(9.0F, -2.0F, -11.0F);
		Doors.addChild(RightDoor);
		RightDoor.setTextureOffset(84, 104).addBox(-9.0F, -41.0F, -1.0F, 9.0F, 41.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(21, 7).addBox(-8.75F, -27.0F, -2.0F, 1.0F, 3.0F, 2.0F, -0.25F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(-9.0F, -2.0F, -11.0F);
		Doors.addChild(LeftDoor);
		LeftDoor.setTextureOffset(15, 6).addBox(7.25F, -27.0F, -2.0F, 1.0F, 3.0F, 2.0F, -0.25F, false);
		LeftDoor.setTextureOffset(104, 104).addBox(0.0F, -41.0F, -1.0F, 9.0F, 41.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void renderBones(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
		matrixStack.push();
		EnumDoorState state = exterior.getOpen();
		matrixStack.translate(0.0D, 0.3D, 0.0D);
		matrixStack.scale(0.8F, 0.8F, 0.8F);
		switch (state) {
			case ONE:
				this.RightDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.RightDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.RightDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.CLOSED));
				this.LeftDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.CLOSED));
		}
		Shell.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.translate(0,1.5,0);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		//BOTI.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.pop();
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
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
			//Interior Portal Position
			info.setTranslatePortal(matrix -> {
				matrix.rotate(Vector3f.ZN.rotationDegrees(180));
				matrix.rotate(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(exterior.getBotiWorld().getPortalDirection())));
				matrix.translate(-0.5, -1.2, -0.5);
			});
			//Exterior Portal Location
			info.setRenderPortal((matrix, buf) -> {
				matrix.push();
				matrix.scale(0.8f, 0.8f, 0.8f);
				this.BOTI.render(matrix, buf.getBuffer(RenderType.getEntityCutout(BrackolinRender.TEXTURE)), packedLight, packedOverlay);
				matrix.pop();
			});
			//Interior Doors Location
			info.setRenderDoor((matrix, buf) -> {
				matrix.push();
				matrix.scale(0.8F, 0.8F, 0.8F);
				this.Doors.render(matrix, buf.getBuffer(RenderType.getEntityCutout(BrackolinRender.TEXTURE)), packedLight, packedOverlay);
				matrix.pop();
			});

			BOTIRenderer.addPortal(info);
		}

	}

}