package com.thevale.whovianlads.client.models.interiordoors;// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.whovianlads.client.renders.exteriors.StreetsideRender;
import com.thevale.whovianlads.util.EnumDoorTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.tileentities.ConsoleTile;

public class StreetsideInteriorDoor extends EntityModel<Entity> implements IInteriorDoorRenderer {
	private final ModelRenderer Posts;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Panels;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer PPCB;
	private final ModelRenderer cube_r5;
	private final ModelRenderer Door;
	private final ModelRenderer RDoor;
	private final ModelRenderer cube_r6;
	private final ModelRenderer LDoor;
	private final ModelRenderer cube_r7;
	private final ModelRenderer BOTI;

	public StreetsideInteriorDoor() {
		textureWidth = 256;
		textureHeight = 256;

		Posts = new ModelRenderer(this);
		Posts.setRotationPoint(19.0F, 24.0F, -19.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-20.0F, 0.0F, 16.0F);
		Posts.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.setTextureOffset(30, 115).addBox(-13.0F, -62.0F, -17.0F, 4.0F, 62.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-20.0F, 0.0F, 16.0F);
		Posts.addChild(cube_r2);
		setRotationAngle(cube_r2, -3.1416F, 0.0F, 3.1416F);
		cube_r2.setTextureOffset(30, 115).addBox(-19.0F, -62.0F, -13.0F, 4.0F, 62.0F, 4.0F, 0.0F, false);

		Panels = new ModelRenderer(this);
		Panels.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.0F, 0.0F, -3.0F);
		Panels.addChild(cube_r3);
		setRotationAngle(cube_r3, -3.1416F, 0.0F, 3.1416F);
		cube_r3.setTextureOffset(147, 198).addBox(-16.0F, -54.0F, -12.0F, 30.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.0F, 0.0F, -4.0F);
		Panels.addChild(cube_r4);
		setRotationAngle(cube_r4, -3.1416F, 0.0F, 3.1416F);
		cube_r4.setTextureOffset(79, 115).addBox(-15.0F, -50.0F, -10.0F, 1.0F, 50.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(74, 115).addBox(12.0F, -50.0F, -10.0F, 1.0F, 50.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(49, 196).addBox(-15.0F, -51.0F, -10.0F, 28.0F, 1.0F, 1.0F, 0.0F, false);

		PPCB = new ModelRenderer(this);
		PPCB.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.0F, 0.0F, -3.0F);
		PPCB.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(102, 42).addBox(-15.0F, -60.0F, 7.0F, 32.0F, 6.0F, 3.0F, 0.0F, false);

		Door = new ModelRenderer(this);
		Door.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		RDoor = new ModelRenderer(this);
		RDoor.setRotationPoint(-13.0F, 0.0F, 5.0F);
		Door.addChild(RDoor);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(12.0F, 0.0F, -9.0F);
		RDoor.addChild(cube_r6);
		setRotationAngle(cube_r6, -3.1416F, 0.0F, 3.1416F);
		cube_r6.setTextureOffset(0, 0).addBox(0.0F, -27.0F, -11.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(46, 115).addBox(-1.0F, -50.0F, -10.0F, 13.0F, 50.0F, 1.0F, 0.0F, false);

		LDoor = new ModelRenderer(this);
		LDoor.setRotationPoint(13.0F, 0.0F, 5.0F);
		Door.addChild(LDoor);
		LDoor.setTextureOffset(121, 204).addBox(-10.0F, -36.0F, -3.0F, 8.0F, 9.0F, 3.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-14.0F, 0.0F, -9.0F);
		LDoor.addChild(cube_r7);
		setRotationAngle(cube_r7, -3.1416F, 0.0F, 3.1416F);
		cube_r7.setTextureOffset(0, 116).addBox(-14.0F, -50.0F, -10.0F, 13.0F, 50.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(3, 3).addBox(-3.0F, -33.0F, -11.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setRotationPoint(0.0F, 24.0F, 0.0F);
		BOTI.setTextureOffset(198, 0).addBox(-14.0F, -51.0F, 6.0F, 28.0F, 51.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void render(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		EnumDoorState state = door.getOpenState();
		matrixStack.push();
		matrixStack.rotate(Vector3f.YP.rotation( 3.15F));
		matrixStack.translate(0.0D, 0.44D, 0.0D);
		matrixStack.scale(0.7F, 0.7F, 0.7F);
		switch (state) {
			case ONE:
				this.RDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.STREETSIDE.getRotationForState(EnumDoorState.ONE));
				this.LDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.STREETSIDE.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.LDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.STREETSIDE.getRotationForState(EnumDoorState.BOTH));
				this.RDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.STREETSIDE.getRotationForState(EnumDoorState.ONE));
				break;
			case CLOSED:
				this.RDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.STREETSIDE.getRotationForState(EnumDoorState.CLOSED));
				this.LDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.STREETSIDE.getRotationForState(EnumDoorState.CLOSED));
		}
		matrixStack.push();
		matrixStack.translate(0.0D,1.5D,0.0D);
		RDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		LDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.pop();
		PPCB.render(matrixStack, buffer, packedLight, packedOverlay);
		BOTI.render(matrixStack, buffer, packedLight, packedOverlay);
		Panels.render(matrixStack, buffer, packedLight, packedOverlay);
		Posts.render(matrixStack, buffer, packedLight, packedOverlay);

		matrixStack.pop();
	}

	@Override
	public void renderBones(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1) {

	}

	@Override
	public void renderBoti(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1) {

	}


	@Override
	public ResourceLocation getTexture() {
		ConsoleTile tile = TardisHelper.getConsoleInWorld(Minecraft.getInstance().world).orElse(null);
		if (tile != null) {
			int index = tile.getExteriorManager().getExteriorVariant();
			if (tile.getExteriorType().getVariants() != null && index < tile.getExteriorType().getVariants().length)
				return tile.getExteriorType().getVariants()[index].getTexture();
		}


		return StreetsideRender.TEXTURE;
	}

	@Override
	public void renderDoorWhenClosed(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, ModelRenderer modelRenderer) {

	}

	@Override
	public void renderDoorWhenClosed(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, ModelRenderer... modelRenderers) {

	}

	@Override
	public boolean doesDoorOpenIntoBotiWindow() {
		return false;
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}