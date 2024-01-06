package com.thevale.whovianlads.client.models.interiordoors;// Made with Blockbench 4.9.0-beta.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.whovianlads.client.renders.exteriors.BrackolinRender;
import com.thevale.whovianlads.util.EnumDoorTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.entity.DoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.misc.IDoorType;
import net.tardis.mod.tileentities.ConsoleTile;

public class BrackolinInteriorDoor extends EntityModel<Entity> implements IInteriorDoorRenderer {
	private final ModelRenderer Shell;
	private final ModelRenderer cube_r1;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private final ModelRenderer SOTO;

	public BrackolinInteriorDoor() {
		textureWidth = 176;
		textureHeight = 176;

		Shell = new ModelRenderer(this);
		Shell.setRotationPoint(0.0F, 24.0F, 0.0F);
		Shell.setTextureOffset(36, 123).addBox(10.0F, -48.0F, -13.0F, 3.0F, 46.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(52, 123).addBox(9.0F, -44.0F, -12.0F, 1.0F, 42.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(48, 123).addBox(-10.0F, -44.0F, -12.0F, 1.0F, 42.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(22, 61).addBox(-9.0F, -44.0F, -12.0F, 18.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(24, 123).addBox(-13.0F, -48.0F, -13.0F, 3.0F, 46.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(112, 0).addBox(-12.0F, -47.0F, -14.0F, 24.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(112, 0).addBox(-12.0F, -47.0F, 10.0F, 24.0F, 3.0F, 2.0F, -0.01F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(-9.0F, 22.0F, -11.0F);
		LeftDoor.setTextureOffset(15, 6).addBox(7.25F, -27.0F, -2.0F, 1.0F, 3.0F, 2.0F, -0.25F, false);
		LeftDoor.setTextureOffset(104, 104).addBox(0.0F, -41.0F, -1.0F, 9.0F, 41.0F, 1.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(9.0F, 22.0F, -11.0F);
		RightDoor.setTextureOffset(84, 104).addBox(-9.0F, -41.0F, -1.0F, 9.0F, 41.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(21, 7).addBox(-8.75F, -27.0F, -2.0F, 1.0F, 3.0F, 2.0F, -0.25F, false);

		SOTO = new ModelRenderer(this);
		SOTO.setRotationPoint(0.0F, 24.0F, -3.0F);
		SOTO.setTextureOffset(136, 133).addBox(-9.0F, -43.0F, -11.0F, 18.0F, 41.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void render(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		EnumDoorState state = door.getOpenState();
		matrixStack.push();
		matrixStack.translate(0.0D, 0.4D, 0.05D);
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
		matrixStack.scale(0.8F, 0.8F, 0.8F);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		//BOTI.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.pop();
	}

	@Override
	public void renderBones(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		matrixStack.push();

		matrixStack.translate(0, 1.25, -0.5);
		matrixStack.scale(1, 1, 1);
		this.RightDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(door.getOpenState()));

		this.renderDoorWhenClosed(door, matrixStack, buffer, packedLight, packedOverlay, this.RightDoor);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay);

		matrixStack.pop();


	}

	@Override
	public void renderBoti(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
						   int packedOverlay) {
		if(Minecraft.getInstance().world != null && door.getOpenState() != EnumDoorState.CLOSED){
			Minecraft.getInstance().world.getCapability(Capabilities.TARDIS_DATA).ifPresent(data -> {
				matrixStack.push();
				PortalInfo info = new PortalInfo();
				info.setPosition(door.getPositionVec());
				info.setWorldShell(data.getBotiWorld());

				info.setTranslate(matrix -> {

					matrix.scale(1.1f, 1.1f, 1.2f);
					matrix.translate(0.025, 0, 0);
					DoorRenderer.applyTranslations(matrix, door.rotationYaw - 180, door.getHorizontalFacing());
				});
				info.setTranslatePortal(matrix -> {
					matrix.rotate(Vector3f.ZN.rotationDegrees(180));
					matrix.rotate(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(data.getBotiWorld().getPortalDirection())));
					matrix.translate(-0.5, -1.75, -0.5);
				});

				info.setRenderPortal((matrix, impl) -> {
					matrix.push();
					matrix.translate(-0.05, -0.2, -0.5f);
					matrix.scale(1.1F, 1.1F, 1.1F);
					this.SOTO.render(matrix, impl.getBuffer(RenderType.getEntityCutout(this.getTexture())), packedLight, packedOverlay);
					matrix.pop();
				});

				BOTIRenderer.addPortal(info);
				matrixStack.pop();
			});
		}
	}


	@Override
	public ResourceLocation getTexture() {
		ConsoleTile tile = TardisHelper.getConsoleInWorld(Minecraft.getInstance().world).orElse(null);
		if (tile != null) {
			int index = tile.getExteriorManager().getExteriorVariant();
			if (tile.getExteriorType().getVariants() != null && index < tile.getExteriorType().getVariants().length)
				return tile.getExteriorType().getVariants()[index].getTexture();
		}

		return BrackolinRender.TEXTURE;
	}

	@Override
	public void renderDoorWhenClosed(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, ModelRenderer modelRenderer) {

	}

	@Override
	public void renderDoorWhenClosed(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, ModelRenderer... modelRenderers) {

	}

	@Override
	public boolean doesDoorOpenIntoBotiWindow() {
		return true;
	}


	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3) {

	}

}