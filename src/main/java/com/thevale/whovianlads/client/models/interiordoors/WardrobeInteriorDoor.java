package com.thevale.whovianlads.client.models.interiordoors;// Made with Blockbench 4.9.0-beta.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.whovianlads.client.renders.exteriors.WardrobeRender;
import com.thevale.whovianlads.util.EnumDoorTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.client.renderers.exteriors.TrunkExteriorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.enums.EnumMatterState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class WardrobeInteriorDoor extends EntityModel<Entity> implements IInteriorDoorRenderer {
	private final ModelRenderer Shell;
	private final ModelRenderer RightDoor;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer BOTI;
	private ResourceLocation texture;

	public WardrobeInteriorDoor() {
		textureWidth = 160;
		textureHeight = 160;

		Shell = new ModelRenderer(this);
		Shell.setRotationPoint(0.0F, 24.0F, 0.0F);
		Shell.setTextureOffset(19, 47).addBox(-17.0F, -5.0F, -12.0F, 34.0F, 3.0F, 5.0F, 0.0F, false);
		Shell.setTextureOffset(19, 19).addBox(-17.0F, -47.0F, -12.0F, 34.0F, 3.0F, 5.0F, 0.0F, false);
		Shell.setTextureOffset(93, 0).addBox(-12.0F, -44.0F, -10.0F, 24.0F, 2.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(10, 9).addBox(13.0F, -2.0F, -11.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(97, 112).addBox(12.0F, -44.0F, -11.0F, 3.0F, 39.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(84, 112).addBox(-15.0F, -44.0F, -11.0F, 3.0F, 39.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(10, 3).addBox(-16.0F, -2.0F, -11.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(12.0F, -0.25F, -10.0F);
		RightDoor.setTextureOffset(0, 98).addBox(-12.0F, -17.75F, 0.0F, 12.0F, 37.0F, 2.0F, 0.0F, false);
		RightDoor.setTextureOffset(7, 15).addBox(-12.0F, -2.75F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(-12.0F, -0.25F, -10.0F);
		LeftDoor.setTextureOffset(0, 12).addBox(11.0F, -2.75F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		LeftDoor.setTextureOffset(29, 112).addBox(0.0F, -17.75F, 0.0F, 12.0F, 37.0F, 2.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setRotationPoint(0.0F, 24.0F, 0.0F);
		BOTI.setTextureOffset(92, 3).addBox(2.0F, -24.0F, -11.0F, 10.0F, 19.0F, 2.0F, 0.0F, false);
		BOTI.setTextureOffset(92, 3).addBox(-12.0F, -42.0F, -11.0F, 10.0F, 18.0F, 2.0F, 0.0F, false);
		BOTI.setTextureOffset(92, 3).addBox(2.0F, -42.0F, -11.0F, 10.0F, 18.0F, 2.0F, 0.0F, false);
		BOTI.setTextureOffset(92, 3).addBox(-2.0F, -42.0F, -11.0F, 4.0F, 18.0F, 2.0F, 0.0F, false);
		BOTI.setTextureOffset(92, 3).addBox(-2.0F, -24.0F, -11.0F, 4.0F, 19.0F, 2.0F, 0.0F, false);
		BOTI.setTextureOffset(92, 3).addBox(-12.0F, -24.0F, -11.0F, 10.0F, 19.0F, 2.0F, 0.0F, false);
	}


	@Override
	public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void render(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		EnumDoorState state = door.getOpenState();
		matrixStack.push();
		matrixStack.translate(0.0D, 0.3D, -0.05D);
		switch (state) {
			case ONE:
				this.RightDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.RightDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.RightDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
				this.LeftDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
		}
		matrixStack.scale(0.8F, 0.8F, 0.8F);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		BOTI.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.pop();
	}

	@Override
	public void renderBones(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1) {
		this.texture = WardrobeRender.TEXTURE;
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

		return WardrobeRender.TEXTURE;
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
	public void render(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3) {

	}
}