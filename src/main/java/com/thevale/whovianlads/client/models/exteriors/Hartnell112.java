package com.thevale.whovianlads.client.models.exteriors;// Made with Blockbench 4.9.0-beta.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.whovianlads.client.renders.exteriors.BrackolinRender;
import com.thevale.whovianlads.client.renders.exteriors.Hartnell112Render;
import com.thevale.whovianlads.util.EnumDoorTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class Hartnell112 extends ExteriorModel {
	private final ModelRenderer Shell;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer BOTI;
	private final ModelRenderer Doors;
	private final ModelRenderer Right;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer Left;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public Hartnell112() {
		textureWidth = 224;
		textureHeight = 224;

		Shell = new ModelRenderer(this);
		Shell.setRotationPoint(0.0F, 24.0F, 0.0F);
		Shell.setTextureOffset(0, 23).addBox(-10.5F, -1.5F, -10.5F, 21.0F, 1.0F, 21.0F, 0.0F, false);
		Shell.setTextureOffset(81, 133).addBox(-10.6F, -35.5F, -6.5F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		Shell.setTextureOffset(50, 177).addBox(-7.5F, -32.5F, 7.75F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(174, 112).addBox(-8.65F, -32.5F, -0.5F, 1.0F, 31.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(56, 46).addBox(-10.5F, -36.0F, -8.5F, 21.0F, 2.0F, 17.0F, 0.0F, false);
		Shell.setTextureOffset(8, 2).addBox(-8.4F, -25.5F, 1.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Shell.setTextureOffset(8, 9).addBox(-8.4F, -25.5F, -6.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Shell.setTextureOffset(8, 16).addBox(1.5F, -25.5F, 7.65F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(8, 32).addBox(-6.5F, -25.5F, 7.65F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(0, 0).addBox(7.65F, -25.5F, -6.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Shell.setTextureOffset(0, 7).addBox(7.65F, -25.5F, 1.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Shell.setTextureOffset(168, 80).addBox(-1.5F, -32.5F, 7.75F, 3.0F, 30.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(165, 35).addBox(-8.5F, -32.5F, -1.5F, 1.0F, 30.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(177, 0).addBox(-7.5F, -25.0F, 7.75F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(174, 66).addBox(-7.5F, -17.5F, 7.75F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(174, 63).addBox(-7.5F, -10.0F, 7.75F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(27, 70).addBox(-8.2F, -31.5F, -6.5F, 0.0F, 29.0F, 13.0F, 0.0F, false);
		Shell.setTextureOffset(0, 46).addBox(-8.5F, -36.0F, -10.5F, 17.0F, 2.0F, 21.0F, 0.0F, false);
		Shell.setTextureOffset(116, 56).addBox(-6.5F, -35.5F, -10.6F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(116, 53).addBox(-6.5F, -35.5F, 9.6F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(92, 116).addBox(9.6F, -35.5F, -6.5F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		Shell.setTextureOffset(160, 76).addBox(-7.5F, -32.5F, 7.75F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(160, 73).addBox(-7.5F, -2.5F, 7.75F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(96, 133).addBox(-8.5F, -17.5F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(63, 133).addBox(-8.5F, -25.0F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(132, 53).addBox(-8.5F, -32.5F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(129, 83).addBox(-8.5F, -2.5F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(107, 116).addBox(7.75F, -2.5F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(12, 130).addBox(-8.5F, -10.0F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(45, 177).addBox(6.5F, -32.5F, 7.75F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(155, 175).addBox(-8.5F, -32.5F, 6.5F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(174, 30).addBox(-0.5F, -32.5F, 7.95F, 1.0F, 31.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(150, 175).addBox(-8.5F, -32.5F, -7.5F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(140, 175).addBox(7.75F, -32.5F, 6.5F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(145, 175).addBox(7.75F, -32.5F, -7.5F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(45, 122).addBox(7.75F, -17.5F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(125, 103).addBox(7.75F, -25.0F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(125, 120).addBox(7.75F, -32.5F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(150, 34).addBox(7.75F, -32.5F, -1.5F, 1.0F, 30.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(0, 70).addBox(8.45F, -31.5F, -6.5F, 0.0F, 29.0F, 13.0F, 0.0F, false);
		Shell.setTextureOffset(128, 17).addBox(7.75F, -10.0F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(169, 145).addBox(7.9F, -32.5F, -0.5F, 1.0F, 31.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(0, 113).addBox(-6.5F, -31.5F, 8.45F, 13.0F, 29.0F, 0.0F, 0.0F, false);
		Shell.setTextureOffset(164, 157).addBox(9.0F, -37.5F, 9.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(164, 119).addBox(9.0F, -37.5F, -10.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(163, 81).addBox(9.2F, -37.5F, -9.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(161, 0).addBox(9.2F, -37.5F, -9.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(159, 138).addBox(9.2F, -37.5F, 8.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(158, 100).addBox(9.2F, -37.5F, 8.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(154, 137).addBox(8.5F, -37.5F, 9.2F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(120, 150).addBox(8.0F, -37.5F, 9.2F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(115, 150).addBox(8.0F, -37.5F, -10.2F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(110, 150).addBox(8.5F, -37.5F, -10.2F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(105, 150).addBox(-9.5F, -37.5F, -10.2F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(100, 150).addBox(-9.0F, -37.5F, -10.2F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(95, 150).addBox(-10.0F, -37.5F, -10.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(90, 150).addBox(-10.2F, -37.5F, -9.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(85, 150).addBox(-10.2F, -37.5F, -9.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(80, 150).addBox(7.5F, -37.5F, -10.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(75, 150).addBox(-8.5F, -37.5F, -10.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(129, 137).addBox(-8.5F, -37.5F, -9.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(134, 137).addBox(7.5F, -37.5F, -9.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(70, 150).addBox(7.5F, -37.5F, 9.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(139, 137).addBox(-8.5F, -37.5F, 9.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(55, 139).addBox(-8.5F, -37.5F, 8.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(0, 143).addBox(7.5F, -37.5F, 8.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(65, 150).addBox(9.0F, -37.5F, -8.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(60, 150).addBox(9.0F, -37.5F, 7.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(45, 139).addBox(8.0F, -37.5F, 7.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(50, 139).addBox(8.0F, -37.5F, -8.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(149, 137).addBox(-10.0F, -37.5F, -8.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(10, 147).addBox(-9.0F, -37.5F, -8.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(40, 147).addBox(-9.0F, -37.5F, 9.2F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(5, 143).addBox(-9.0F, -37.5F, 8.2F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(35, 147).addBox(-10.2F, -37.5F, 8.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(30, 147).addBox(-10.0F, -37.5F, 7.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(144, 137).addBox(-9.0F, -37.5F, 7.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(25, 147).addBox(-10.2F, -37.5F, 8.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(20, 147).addBox(-9.5F, -37.5F, 9.2F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(0, 70).addBox(-1.0F, -43.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(116, 0).addBox(-1.0F, -45.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(64, 0).addBox(-1.5F, -44.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(56, 58).addBox(-1.5F, -40.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		Shell.setTextureOffset(110, 30).addBox(7.75F, -38.5F, -9.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(89, 96).addBox(-9.75F, -38.5F, -9.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(23, 78).addBox(7.75F, -38.5F, 7.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(15, 147).addBox(-10.0F, -37.5F, 9.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(0, 0).addBox(-10.5F, -1.0F, -10.5F, 21.0F, 1.0F, 21.0F, 0.0F, false);
		Shell.setTextureOffset(41, 70).addBox(-3.5F, -40.0F, -3.5F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		Shell.setTextureOffset(132, 70).addBox(-4.5F, -39.9F, -4.5F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		Shell.setTextureOffset(89, 103).addBox(-5.5F, -39.8F, -5.5F, 11.0F, 1.0F, 11.0F, 0.0F, false);
		Shell.setTextureOffset(89, 88).addBox(-6.5F, -39.7F, -6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		Shell.setTextureOffset(64, 23).addBox(-7.5F, -39.6F, -7.5F, 15.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(64, 0).addBox(-8.5F, -39.5F, -8.5F, 17.0F, 1.0F, 17.0F, 0.0F, false);
		Shell.setTextureOffset(59, 66).addBox(-9.0F, -38.5F, -9.0F, 18.0F, 3.0F, 18.0F, 0.0F, false);
		Shell.setTextureOffset(14, 78).addBox(-9.75F, -38.5F, 7.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Shell.setTextureOffset(160, 70).addBox(-7.5F, -34.5F, -8.9F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(97, 40).addBox(-7.5F, -34.0F, -8.8F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(85, 43).addBox(-7.5F, -33.5F, -8.7F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(116, 0).addBox(-8.7F, -33.5F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(116, 36).addBox(-8.8F, -34.0F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(74, 116).addBox(-8.9F, -34.5F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(64, 40).addBox(-7.5F, -33.5F, 7.95F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(41, 79).addBox(-7.5F, -34.0F, 8.05F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(85, 19).addBox(-7.5F, -34.5F, 8.15F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.setTextureOffset(110, 19).addBox(7.95F, -33.5F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(27, 113).addBox(8.05F, -34.0F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		Shell.setTextureOffset(114, 66).addBox(8.15F, -34.5F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -24.0F, 0.0F);
		Shell.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.setTextureOffset(11, 58).addBox(0.0F, -19.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(114, 74).addBox(-2.0F, -19.5F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(7.95F, -28.5F, 4.0F);
		Shell.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.setTextureOffset(0, 23).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 14).addBox(-0.5F, -0.5F, -10.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(7.95F, -28.5F, -5.0F);
		Shell.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
		cube_r3.setTextureOffset(29, 70).addBox(-0.6F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(7.95F, -28.5F, -3.0F);
		Shell.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.7854F, 0.0F);
		cube_r4.setTextureOffset(24, 70).addBox(-0.4F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(7.95F, -28.5F, 3.0F);
		Shell.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
		cube_r5.setTextureOffset(19, 70).addBox(-0.4F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(7.95F, -28.5F, 5.0F);
		Shell.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.7854F, 0.0F);
		cube_r6.setTextureOffset(14, 70).addBox(-0.6F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-4.0F, -28.5F, 7.95F);
		Shell.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(64, 8).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(64, 5).addBox(5.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(5.0F, -28.5F, 7.95F);
		Shell.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.7854F, 0.0F);
		cube_r8.setTextureOffset(89, 88).addBox(-0.6F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(3.0F, -28.5F, 7.95F);
		Shell.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.7854F, 0.0F);
		cube_r9.setTextureOffset(8, 75).addBox(-0.4F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.0F, -28.5F, 7.95F);
		Shell.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -0.7854F, 0.0F);
		cube_r10.setTextureOffset(70, 70).addBox(-0.6F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-5.0F, -28.5F, 7.95F);
		Shell.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -0.7854F, 0.0F);
		cube_r11.setTextureOffset(34, 70).addBox(-0.4F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-7.7F, -28.5F, -4.0F);
		Shell.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.setTextureOffset(0, 30).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		cube_r12.setTextureOffset(8, 25).addBox(-0.5F, -0.5F, 5.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-7.7F, -28.5F, -3.0F);
		Shell.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.7854F, 0.0F);
		cube_r13.setTextureOffset(89, 103).addBox(-0.6F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-7.7F, -28.5F, -5.0F);
		Shell.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.7854F, 0.0F);
		cube_r14.setTextureOffset(94, 88).addBox(-0.4F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-7.7F, -28.5F, 5.0F);
		Shell.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.7854F, 0.0F);
		cube_r15.setTextureOffset(110, 22).addBox(-0.4F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-7.7F, -28.5F, 3.0F);
		Shell.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.7854F, 0.0F);
		cube_r16.setTextureOffset(94, 103).addBox(-0.6F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setRotationPoint(0.0F, 24.0F, 0.0F);
		BOTI.setTextureOffset(54, 88).addBox(-7.5F, -32.5F, -8.0F, 15.0F, 31.0F, 2.0F, 0.0F, false);

		Doors = new ModelRenderer(this);
		Doors.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Right = new ModelRenderer(this);
		Right.setRotationPoint(7.5F, -20.625F, -8.5F);
		Doors.addChild(Right);
		Right.setTextureOffset(0, 49).addBox(-7.0F, -11.875F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Right.setTextureOffset(174, 145).addBox(-1.0F, -11.875F, 0.0F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		Right.setTextureOffset(149, 0).addBox(-6.0F, -10.875F, 0.3F, 5.0F, 29.0F, 0.0F, 0.0F, false);
		Right.setTextureOffset(125, 174).addBox(-7.0F, -11.875F, 0.0F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		Right.setTextureOffset(0, 37).addBox(-7.0F, 10.625F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Right.setTextureOffset(0, 40).addBox(-7.0F, 3.125F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Right.setTextureOffset(0, 46).addBox(-7.0F, -4.375F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Right.setTextureOffset(0, 52).addBox(-7.0F, 18.125F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Right.setTextureOffset(64, 23).addBox(-6.0F, -4.875F, 0.1F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Right.setTextureOffset(41, 70).addBox(-4.5F, -1.125F, 0.1F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		Right.setTextureOffset(8, 0).addBox(-4.0F, -0.625F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Right.setTextureOffset(0, 7).addBox(-4.0F, -0.625F, 0.3F, 1.0F, 1.0F, 1.0F, 0.2F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.5F, -7.875F, 0.8F);
		Right.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.7854F, 0.0F, 0.0F);
		cube_r17.setTextureOffset(64, 11).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.5F, -7.875F, 0.8F);
		Right.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, -0.7854F, 0.0F);
		cube_r18.setTextureOffset(27, 113).addBox(-0.6F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-4.5F, -7.875F, 0.8F);
		Right.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, -0.7854F, 0.0F);
		cube_r19.setTextureOffset(32, 113).addBox(-0.4F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		Left = new ModelRenderer(this);
		Left.setRotationPoint(-7.5F, -20.3409F, -8.5F);
		Doors.addChild(Left);
		Left.setTextureOffset(0, 55).addBox(0.0F, -12.1591F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(130, 175).addBox(0.0F, -12.1591F, 0.0F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(166, 0).addBox(1.0F, -11.1591F, 0.3F, 5.0F, 29.0F, 0.0F, 0.0F, false);
		Left.setTextureOffset(135, 175).addBox(6.0F, -12.1591F, 0.0F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(0, 0).addBox(6.0F, 2.8409F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(56, 46).addBox(0.0F, -4.6591F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(56, 49).addBox(0.0F, 2.8409F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(64, 32).addBox(1.0F, 2.3409F, 0.1F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(64, 29).addBox(1.0F, -4.1591F, 0.1F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(64, 26).addBox(1.0F, -5.1591F, 0.1F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(115, 22).addBox(0.5F, -3.4091F, 0.1F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(114, 66).addBox(5.5F, -3.4091F, 0.1F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(0, 58).addBox(1.5F, -3.4091F, 0.2F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(56, 52).addBox(0.0F, 10.3409F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(56, 55).addBox(0.0F, 17.8409F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Left.setTextureOffset(169, 112).addBox(7.0F, -12.1591F, -0.2F, 1.0F, 31.0F, 1.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(3.5F, -8.1591F, 0.8F);
		Left.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.7854F, 0.0F, 0.0F);
		cube_r20.setTextureOffset(64, 14).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(4.5F, -8.1591F, 0.8F);
		Left.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.7854F, 0.0F);
		cube_r21.setTextureOffset(37, 113).addBox(-0.6F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(2.5F, -8.1591F, 0.8F);
		Left.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.7854F, 0.0F);
		cube_r22.setTextureOffset(45, 113).addBox(-0.4F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, 0.0F, false);
	}
	@Override
	public void renderBones(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
		matrixStack.push();
		EnumDoorState state = exterior.getOpen();
		matrixStack.translate(0.0D, 0D, 0.0D);
		matrixStack.scale(1F, 1F, 1F);
		switch (state) {
			case ONE:
				this.Right.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.HARTNELL.getRotationForState(EnumDoorState.ONE));
				this.Left.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.HARTNELL.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.Right.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.HARTNELL.getRotationForState(EnumDoorState.ONE));
				this.Left.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.HARTNELL.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.Right.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.HARTNELL.getRotationForState(EnumDoorState.CLOSED));
				this.Left.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.HARTNELL.getRotationForState(EnumDoorState.CLOSED));
		}
		Shell.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.translate(0,1.5,0);
		Left.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		Right.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
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
				matrix.translate(-0.5, 1, -0.5);
				ExteriorRenderer.applyTransforms(matrix, exterior);
			});
			//Interior Portal Position
			info.setTranslatePortal(matrix -> {
				matrix.rotate(Vector3f.ZN.rotationDegrees(180));
				matrix.rotate(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(exterior.getBotiWorld().getPortalDirection())));
				matrix.translate(-0.5, -1.4, -0.5);
			});
			//Exterior Portal Location
			info.setRenderPortal((matrix, buf) -> {
				matrix.push();
				matrix.scale(1F, 1F, 1F);
				this.BOTI.render(matrix, buf.getBuffer(RenderType.getEntityCutout(Hartnell112Render.TEXTURE)), packedLight, packedOverlay);
				matrix.pop();
			});
			//Interior Doors Location
			info.setRenderDoor((matrix, buf) -> {
				matrix.push();
				matrix.scale(1F, 1F, 1F);
				this.Doors.render(matrix, buf.getBuffer(RenderType.getEntityCutout(Hartnell112Render.TEXTURE)), packedLight, packedOverlay);
				matrix.pop();
			});

			BOTIRenderer.addPortal(info);
		}

	}

}