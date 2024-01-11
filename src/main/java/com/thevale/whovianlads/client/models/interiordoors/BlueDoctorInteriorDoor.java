package com.thevale.whovianlads.client.models.interiordoors;// Made with Blockbench 4.9.0-beta.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.whovianlads.client.renders.exteriors.BlueDoctorRender;
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
import net.tardis.mod.tileentities.ConsoleTile;

public class BlueDoctorInteriorDoor extends EntityModel<Entity> implements IInteriorDoorRenderer {
	private final ModelRenderer shell;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer doors;
	private final ModelRenderer rightdoor;
	private final ModelRenderer cube_r4;
	private final ModelRenderer leftdoor;
	private final ModelRenderer cube_r5;
	private final ModelRenderer BOTI;

	public BlueDoctorInteriorDoor() {
		textureWidth = 192;
		textureHeight = 192;

		shell = new ModelRenderer(this);
		shell.setRotationPoint(0.0F, 23.0F, 0.0F);
		shell.setTextureOffset(19, 19).addBox(-12.0F, -1.0F, -12.0F, 24.0F, 2.0F, 5.0F, 0.0F, false);
		shell.setTextureOffset(138, 88).addBox(-9.0F, -42.5F, -11.5F, 18.0F, 3.0F, 1.0F, 0.0F, false);
		shell.setTextureOffset(136, 135).addBox(-9.0F, -42.5F, -9.25F, 18.0F, 3.0F, 1.0F, 0.0F, false);
		shell.setTextureOffset(19, 45).addBox(-11.5F, -2.0F, -11.5F, 23.0F, 1.0F, 4.0F, 0.0F, false);
		shell.setTextureOffset(120, 146).addBox(-11.0F, -44.0F, -11.0F, 2.0F, 42.0F, 2.0F, 0.0F, false);
		shell.setTextureOffset(112, 146).addBox(9.0F, -44.0F, -11.0F, 2.0F, 42.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -4.0F, -18.75F);
		shell.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.setTextureOffset(120, 108).addBox(-9.75F, -39.5F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -4.0F, -1.0F);
		shell.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.setTextureOffset(116, 127).addBox(-10.0F, -39.5F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);
		cube_r2.setTextureOffset(116, 127).addBox(-9.75F, -35.5F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);
		cube_r2.setTextureOffset(96, 126).addBox(-9.25F, -35.0F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, -18.75F);
		shell.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
		cube_r3.setTextureOffset(120, 108).addBox(-9.75F, -39.5F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);
		cube_r3.setTextureOffset(120, 65).addBox(-9.25F, -39.0F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);

		doors = new ModelRenderer(this);
		doors.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		rightdoor = new ModelRenderer(this);
		rightdoor.setRotationPoint(9.0F, -20.0F, -9.0F);
		doors.addChild(rightdoor);
		setRotationAngle(rightdoor, 0.0F, 0.0F, 0.0F);
		rightdoor.setTextureOffset(16, 0).addBox(-8.75F, -8.0F, -1.5F, 1.0F, 3.0F, 1.0F, -0.2F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-10.0F, 19.0F, -11.0F);
		rightdoor.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
		cube_r4.setTextureOffset(76, 126).addBox(10.0F, -38.0F, -10.0F, 1.0F, 36.0F, 9.0F, 0.0F, false);

		leftdoor = new ModelRenderer(this);
		leftdoor.setRotationPoint(-9.0F, -20.0F, -9.0F);
		doors.addChild(leftdoor);
		leftdoor.setTextureOffset(0, 6).addBox(6.75F, -7.0F, -1.5F, 1.0F, 3.0F, 1.0F, -0.2F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 19.0F, -11.0F);
		leftdoor.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -1.5708F, 0.0F);
		cube_r5.setTextureOffset(38, 76).addBox(10.0F, -38.0F, -9.0F, 1.0F, 36.0F, 9.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setRotationPoint(0.0F, 24.0F, -2.0F);
		BOTI.setTextureOffset(38, 126).addBox(-9.0F, -39.0F, -9.0F, 18.0F, 36.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void render(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		EnumDoorState state = door.getOpenState();
		matrixStack.push();
		matrixStack.translate(0.0D, 0.15D, 0.05D);
		switch (state) {
			case ONE:
				this.rightdoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.ONE));
				this.leftdoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.rightdoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.ONE));
				this.leftdoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.rightdoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.CLOSED));
				this.leftdoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.CLOSED));
		}
		matrixStack.scale(0.9f, 0.9f, 0.9f);
		shell.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.pop();
		matrixStack.push();
		matrixStack.translate(0,1.5,0);
		matrixStack.scale(0.9f, 0.9f, 0.9f);
		leftdoor.render(matrixStack, buffer, packedLight, packedOverlay);
		rightdoor.render(matrixStack, buffer, packedLight, packedOverlay);
		//BOTI.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.pop();
	}

	@Override
	public void renderBones(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		matrixStack.push();


		this.rightdoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(door.getOpenState()));

		this.renderDoorWhenClosed(door, matrixStack, buffer, packedLight, packedOverlay, this.rightdoor);
		shell.render(matrixStack, buffer, packedLight, packedOverlay);

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
					matrix.scale(1F, 1F, 1F);
					this.BOTI.render(matrix, impl.getBuffer(RenderType.getEntityCutout(this.getTexture())), packedLight, packedOverlay);
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

		return BlueDoctorRender.TEXTURE;
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

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}