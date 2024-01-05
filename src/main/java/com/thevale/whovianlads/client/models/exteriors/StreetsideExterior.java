package com.thevale.whovianlads.client.models.exteriors;// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.whovianlads.util.EnumDoorTypes;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class StreetsideExterior extends ExteriorModel {
	private final ModelRenderer Posts;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Panels;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer PPCB;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer Roof;
	private final ModelRenderer Lamp;
	private final ModelRenderer cube_r9;
	private final ModelRenderer Door;
	private final ModelRenderer RDoor;
	private final ModelRenderer LDoor;
	private final ModelRenderer BOTI;
	private final ModelRenderer Base;

	public StreetsideExterior() {
		textureWidth = 256;
		textureHeight = 256;

		Posts = new ModelRenderer(this);
		Posts.setRotationPoint(19.0F, 24.0F, -19.0F);
		Posts.setTextureOffset(30, 115).addBox(-37.0F, -66.0F, 1.0F, 4.0F, 62.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-19.0F, -4.0F, 19.0F);
		Posts.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.setTextureOffset(30, 115).addBox(-18.0F, -62.0F, -18.0F, 4.0F, 62.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(8.0F, -4.0F, 33.0F);
		Posts.addChild(cube_r2);
		setRotationAngle(cube_r2, -3.1416F, 0.0F, 3.1416F);
		cube_r2.setTextureOffset(30, 115).addBox(9.0F, -62.0F, -4.0F, 4.0F, 62.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-37.0F, -4.0F, 33.0F);
		Posts.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
		cube_r3.setTextureOffset(30, 115).addBox(-4.0F, -62.0F, 0.0F, 4.0F, 62.0F, 4.0F, 0.0F, false);

		Panels = new ModelRenderer(this);
		Panels.setRotationPoint(0.0F, 24.0F, 0.0F);
		Panels.setTextureOffset(49, 196).addBox(-14.0F, -55.0F, -15.0F, 28.0F, 1.0F, 1.0F, 0.0F, false);
		Panels.setTextureOffset(74, 115).addBox(13.0F, -54.0F, -15.0F, 1.0F, 50.0F, 1.0F, 0.0F, false);
		Panels.setTextureOffset(79, 115).addBox(-14.0F, -54.0F, -15.0F, 1.0F, 50.0F, 1.0F, 0.0F, false);
		Panels.setTextureOffset(100, 111).addBox(-15.0F, -55.0F, -14.0F, 1.0F, 51.0F, 28.0F, 0.0F, false);
		Panels.setTextureOffset(0, 42).addBox(-17.0F, -58.0F, -17.0F, 34.0F, 3.0F, 34.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(26.0F, -4.0F, 19.0F);
		Panels.addChild(cube_r4);
		setRotationAngle(cube_r4, -3.1416F, 0.0F, 3.1416F);
		cube_r4.setTextureOffset(100, 111).addBox(11.0F, -51.0F, 5.0F, 1.0F, 51.0F, 28.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-19.0F, -4.0F, 19.0F);
		Panels.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 1.5708F, 0.0F);
		cube_r5.setTextureOffset(100, 111).addBox(4.0F, -51.0F, 5.0F, 1.0F, 51.0F, 28.0F, 0.0F, false);

		PPCB = new ModelRenderer(this);
		PPCB.setRotationPoint(0.0F, 24.0F, 0.0F);
		PPCB.setTextureOffset(102, 42).addBox(-16.0F, -64.0F, -19.0F, 32.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -4.0F, 0.0F);
		PPCB.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -1.5708F, 0.0F);
		cube_r6.setTextureOffset(102, 42).addBox(-16.0F, -60.0F, -19.0F, 32.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(26.0F, -58.0F, 14.0F);
		PPCB.addChild(cube_r7);
		setRotationAngle(cube_r7, -3.1416F, 0.0F, 3.1416F);
		cube_r7.setTextureOffset(102, 42).addBox(10.0F, -6.0F, -5.0F, 32.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-19.0F, -58.0F, 14.0F);
		PPCB.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 1.5708F, 0.0F);
		cube_r8.setTextureOffset(102, 42).addBox(-1.0F, -6.0F, 0.0F, 32.0F, 6.0F, 3.0F, 0.0F, false);

		Roof = new ModelRenderer(this);
		Roof.setRotationPoint(-15.0F, -34.0F, -18.0F);
		Roof.setTextureOffset(0, 79).addBox(-1.0F, -10.0F, 2.0F, 32.0F, 4.0F, 32.0F, 0.0F, false);
		Roof.setTextureOffset(96, 79).addBox(0.0F, -12.0F, 3.0F, 30.0F, 2.0F, 30.0F, 0.0F, false);
		Roof.setTextureOffset(0, 0).addBox(11.0F, -14.0F, 14.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);

		Lamp = new ModelRenderer(this);
		Lamp.setRotationPoint(0.0F, 24.0F, 0.0F);
		Lamp.setTextureOffset(0, 12).addBox(-3.0F, -74.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
		Lamp.setTextureOffset(0, 33).addBox(-2.0F, -75.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.2F, false);
		Lamp.setTextureOffset(0, 33).addBox(-2.0F, -80.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.2F, false);
		Lamp.setTextureOffset(0, 20).addBox(-3.0F, -81.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		Lamp.setTextureOffset(0, 33).addBox(-2.0F, -82.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Lamp.setTextureOffset(20, 25).addBox(-2.0F, -79.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.2F, false);
		Lamp.setTextureOffset(0, 42).addBox(-2.0F, -78.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -77.0F, 0.0F);
		Lamp.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.7854F, 0.0F);
		cube_r9.setTextureOffset(18, 13).addBox(-0.5F, -2.5F, -3.5F, 1.0F, 5.0F, 7.0F, 0.0F, false);
		cube_r9.setTextureOffset(0, 27).addBox(-3.5F, -2.5F, -0.5F, 7.0F, 5.0F, 1.0F, 0.0F, false);

		Door = new ModelRenderer(this);
		Door.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		RDoor = new ModelRenderer(this);
		RDoor.setRotationPoint(13.0F, -4.0F, -14.0F);
		Door.addChild(RDoor);
		RDoor.setTextureOffset(46, 115).addBox(-13.0F, -50.0F, -1.0F, 13.0F, 50.0F, 1.0F, 0.0F, false);
		RDoor.setTextureOffset(0, 0).addBox(-12.0F, -27.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		LDoor = new ModelRenderer(this);
		LDoor.setRotationPoint(-13.0F, -4.0F, -14.0F);
		Door.addChild(LDoor);
		LDoor.setTextureOffset(3, 3).addBox(11.0F, -33.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		LDoor.setTextureOffset(0, 116).addBox(0.0F, -50.0F, -1.0F, 13.0F, 50.0F, 1.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setRotationPoint(0.0F, 24.0F, -20.0F);
		BOTI.setTextureOffset(198, 0).addBox(-14.0F, -54.0F, 6.0F, 28.0F, 51.0F, 1.0F, 0.0F, false);

		Base = new ModelRenderer(this);
		Base.setRotationPoint(19.0F, 24.0F, -19.0F);
		Base.setTextureOffset(0, 0).addBox(-38.0F, -4.0F, 0.0F, 38.0F, 4.0F, 38.0F, 0.0F, false);
	}


	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(ExteriorTile tile, float v, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float v1) {
		EnumDoorState state = tile.getOpen();
		matrixStack.push();
		matrixStack.translate(0.0D, 0.44D, 0.0D);
		matrixStack.scale(0.7F, 0.7F, 0.7F);
		switch(state) {
			case ONE:
				this.RDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.STREETSIDE.getRotationForState(EnumDoorState.ONE));
				this.LDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.STREETSIDE.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.RDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.STREETSIDE.getRotationForState(EnumDoorState.ONE));
				this.LDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.STREETSIDE.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.RDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.STREETSIDE.getRotationForState(EnumDoorState.CLOSED));
				this.LDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.STREETSIDE.getRotationForState(EnumDoorState.CLOSED));
		}
		this.Base.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.push();
		matrixStack.translate(0.0D,1.5D,0.0D);
		RDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		LDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.pop();
		this.BOTI.render(matrixStack, buffer, packedLight, packedOverlay);
		this.Lamp.render(matrixStack, buffer, packedLight, packedOverlay);
		this.Roof.render(matrixStack, buffer, packedLight, packedOverlay);
		this.PPCB.render(matrixStack, buffer, packedLight, packedOverlay);
		this.Panels.render(matrixStack, buffer, packedLight, packedOverlay);
		this.Posts.render(matrixStack, buffer, packedLight, packedOverlay);
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

	@Override
	public void renderBones(ExteriorTile exteriorTile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1) {

	}
}