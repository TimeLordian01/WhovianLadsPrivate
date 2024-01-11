package com.thevale.whovianlads.client.models.interiordoors;// Made with Blockbench 4.9.0-beta.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.whovianlads.client.renders.exteriors.RaniRender;
import com.thevale.whovianlads.util.EnumDoorTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.tileentities.ConsoleTile;

public class RaniInteriorDoor extends EntityModel<Entity> implements IInteriorDoorRenderer {
	private final ModelRenderer Door;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer Shell;
	private final ModelRenderer BOTI;

	public RaniInteriorDoor() {
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
		Shell.setTextureOffset(82, 73).addBox(-7.0F, -40.0F, -9.5F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(20, 82).addBox(-7.0F, -3.0F, -9.5F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(102, 1).addBox(-12.0F, -40.0F, -9.0F, 4.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(94, 1).addBox(8.0F, -40.0F, -9.0F, 4.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(98, 103).addBox(9.0F, -39.0F, -8.5F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(92, 103).addBox(-11.0F, -39.0F, -8.5F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(104, 12).addBox(7.0F, -40.0F, -9.5F, 1.0F, 38.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(104, 117).addBox(-8.0F, -40.0F, -9.5F, 1.0F, 38.0F, 2.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setRotationPoint(0.0F, 24.0F, 0.0F);
		BOTI.setTextureOffset(130, 123).addBox(-7.0F, -39.0F, -10.5F, 14.0F, 36.0F, 1.0F, 0.0F, false);
	}
	@Override
	public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void render(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		EnumDoorState state = door.getOpenState();
		matrixStack.push();
		matrixStack.translate(0.0D, 0.3D, -0.1D);
		matrixStack.scale(0.8F, 0.8F, 0.8F);
		switch (state) {
			case ONE:
				this.Door.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.RANI.getRotationForState(EnumDoorState.ONE));
				break;
			case CLOSED:
				this.Door.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.RANI.getRotationForState(EnumDoorState.CLOSED));
		}
		Door.render(matrixStack, buffer, packedLight, packedOverlay);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay);
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


		return RaniRender.TEXTURE;
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