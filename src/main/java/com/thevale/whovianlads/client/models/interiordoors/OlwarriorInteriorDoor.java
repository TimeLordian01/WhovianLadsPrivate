package com.thevale.whovianlads.client.models.interiordoors;// Made with Blockbench 4.9.0-beta.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.whovianlads.client.renders.exteriors.OlwarriorRender;
import com.thevale.whovianlads.util.EnumDoorTypes;
import net.minecraft.client.Minecraft;
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

public class OlwarriorInteriorDoor extends EntityModel<Entity> implements IInteriorDoorRenderer {
	private final ModelRenderer Shell;
	private final ModelRenderer bone;
	private final ModelRenderer Doors;
	private final ModelRenderer rightdoor;
	private final ModelRenderer leftdoor;
	private final ModelRenderer cube_r1;
	private final ModelRenderer BOTI;

	public OlwarriorInteriorDoor() {
		textureWidth = 176;
		textureHeight = 176;

		Shell = new ModelRenderer(this);
		Shell.setRotationPoint(0.0F, 24.0F, 0.0F);
		Shell.setTextureOffset(17, 39).addBox(-10.0F, -40.5F, -10.25F, 20.0F, 1.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(58, 113).addBox(-10.0F, -39.5F, -9.0F, 1.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(30, 99).addBox(-9.0F, -40.5F, -9.0F, 1.0F, 39.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(54, 113).addBox(-9.0F, -39.5F, -10.0F, 1.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(63, 12).addBox(-9.0F, -39.5F, -10.5F, 18.0F, 3.0F, 1.0F, -0.01F, false);
		Shell.setTextureOffset(104, 72).addBox(-8.0F, -38.5F, -10.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(104, 68).addBox(-8.0F, -38.0F, -9.5F, 16.0F, 3.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(63, 8).addBox(-9.0F, -39.5F, -8.0F, 18.0F, 3.0F, 1.0F, -0.01F, false);
		Shell.setTextureOffset(74, 113).addBox(-10.0F, -38.5F, -10.0F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(70, 113).addBox(9.0F, -38.5F, -10.0F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(46, 113).addBox(8.0F, -39.5F, -10.0F, 1.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(26, 99).addBox(8.0F, -40.5F, -9.0F, 1.0F, 39.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(50, 113).addBox(9.0F, -39.5F, -9.0F, 1.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(16, 38).addBox(-10.0F, -1.5F, -10.0F, 20.0F, 1.0F, 4.0F, 0.0F, false);
		Shell.setTextureOffset(16, 16).addBox(-10.5F, -1.0F, -10.5F, 21.0F, 1.0F, 5.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(bone);
		setRotationAngle(bone, 0.0F, 3.1416F, 0.0F);
		bone.setTextureOffset(104, 68).addBox(-8.0F, -38.0F, 8.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(104, 72).addBox(-8.0F, -38.5F, 7.5F, 16.0F, 3.0F, 1.0F, 0.0F, false);

		Doors = new ModelRenderer(this);
		Doors.setRotationPoint(8.0F, 6.0F, -8.5F);


		rightdoor = new ModelRenderer(this);
		rightdoor.setRotationPoint(0.0F, 0.0F, 0.5F);
		Doors.addChild(rightdoor);
		rightdoor.setTextureOffset(0, 99).addBox(-8.0F, -17.0F, -1.0F, 8.0F, 34.0F, 1.0F, 0.0F, false);
		rightdoor.setTextureOffset(10, 10).addBox(-7.55F, -5.5F, -1.5F, 1.0F, 3.0F, 2.0F, -0.2F, false);

		leftdoor = new ModelRenderer(this);
		leftdoor.setRotationPoint(-16.0F, 0.0F, 0.5F);
		Doors.addChild(leftdoor);
		leftdoor.setTextureOffset(102, 78).addBox(0.0F, -17.0F, -1.0F, 8.0F, 34.0F, 1.0F, 0.0F, false);
		leftdoor.setTextureOffset(0, 12).addBox(6.55F, -5.5F, -1.5F, 1.0F, 3.0F, 2.0F, -0.2F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(7.9782F, 0.0F, -0.9995F);
		leftdoor.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.829F, 0.0F);
		cube_r1.setTextureOffset(78, 113).addBox(-0.5F, -17.5F, -0.5F, 1.0F, 35.0F, 1.0F, -0.3F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setRotationPoint(0.0F, 24.0F, -2.0F);
		BOTI.setTextureOffset(119, 112).addBox(-8.0F, -35.5F, -8.0F, 16.0F, 34.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float v, float v1, float v2, float v3, float v4) {

	}


	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3) {

	}

	@Override
	public void render(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		EnumDoorState state = door.getOpenState();
		matrixStack.push();
		matrixStack.translate(0.0D, 0.15D, 0.0D);
		matrixStack.scale(0.9F, 0.9F, 0.9F);
		switch (state) {
			case ONE:
				this.rightdoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.OLWARRIOR.getRotationForState(EnumDoorState.ONE));
				this.leftdoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.OLWARRIOR.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.rightdoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.OLWARRIOR.getRotationForState(EnumDoorState.ONE));
				this.leftdoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.OLWARRIOR.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.rightdoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.OLWARRIOR.getRotationForState(EnumDoorState.CLOSED));
				this.leftdoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.OLWARRIOR.getRotationForState(EnumDoorState.CLOSED));
		}


		Shell.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.translate(0.5,0.35,-0.54);
		leftdoor.render(matrixStack, buffer, packedLight, packedOverlay);
			rightdoor.render(matrixStack, buffer, packedLight, packedOverlay);
		//BOTI.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.pop();
	}

	@Override
	public void renderBones(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1) {

	}

	@Override
	public void renderBoti(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1) {
		if(Minecraft.getInstance().world != null && doorEntity.getOpenState() != EnumDoorState.CLOSED){
			Minecraft.getInstance().world.getCapability(Capabilities.TARDIS_DATA).ifPresent(data -> {
				matrixStack.push();
				PortalInfo info = new PortalInfo();
				info.setPosition(doorEntity.getPositionVec());
				info.setWorldShell(data.getBotiWorld());

				info.setTranslate(matrix -> {
					matrix.scale(1.1f, 1.1f, 1.2f);
					matrix.translate(0.025, 0, 0);
					DoorRenderer.applyTranslations(matrix, doorEntity.rotationYaw - 180, doorEntity.getHorizontalFacing());
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
					//this.BOTI.render(matrix, impl.getBuffer(RenderType.getEntityCutout(this.getTexture())), i, i1);
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

		return OlwarriorRender.TEXTURE;
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

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
