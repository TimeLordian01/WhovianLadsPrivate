package com.thevale.whovianlads.client.models.consoles;// Made with Blockbench 4.9.0-beta.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.whovianlads.tileentities.consoles.BrackolinConsoleTile;
import com.thevale.whovianlads.tileentities.consoles.ValeConsoleTile;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.tardis.mod.client.models.EntityGlowRenderer;
import net.tardis.mod.client.models.LightModelRenderer;
import net.tardis.mod.client.models.TileModel;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.controls.*;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.subsystem.StabilizerSubsystem;
import net.tardis.mod.subsystem.Subsystem;

public class BrackolinConsole extends EntityModel<Entity> implements TileModel<BrackolinConsoleTile> {
	private final ModelRenderer Console;
	private final ModelRenderer BaseConsole;
	private final ModelRenderer Feet;
	private final ModelRenderer Foot1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Foot2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer Foot3;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer ConsolePillar;
	private final ModelRenderer Part1;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer Part2;
	private final ModelRenderer hexadecagon_r5;
	private final ModelRenderer hexadecagon_r6;
	private final ModelRenderer hexadecagon_r7;
	private final ModelRenderer hexadecagon_r8;
	private final ModelRenderer Part3;
	private final ModelRenderer hexadecagon_r9;
	private final ModelRenderer hexadecagon_r10;
	private final ModelRenderer hexadecagon_r11;
	private final ModelRenderer hexadecagon_r12;
	private final ModelRenderer Part4;
	private final ModelRenderer hexadecagon_r13;
	private final ModelRenderer hexadecagon_r14;
	private final ModelRenderer hexadecagon_r15;
	private final ModelRenderer hexadecagon_r16;
	private final ModelRenderer Part5;
	private final ModelRenderer hexadecagon_r17;
	private final ModelRenderer hexadecagon_r18;
	private final ModelRenderer hexadecagon_r19;
	private final ModelRenderer hexadecagon_r20;
	private final ModelRenderer PanelBase;
	private final ModelRenderer P1;
	private final ModelRenderer PanelSplitters;
	private final ModelRenderer Rotation;
	private final ModelRenderer Angle;
	private final ModelRenderer cube_r10;
	private final ModelRenderer PanelBaseSlant;
	private final ModelRenderer bone19;
	private final ModelRenderer bone18;
	private final ModelRenderer P2;
	private final ModelRenderer PanelSplitters2;
	private final ModelRenderer Rotation2;
	private final ModelRenderer Angle2;
	private final ModelRenderer cube_r11;
	private final ModelRenderer PanelBaseSlant2;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer P3;
	private final ModelRenderer PanelSplitters3;
	private final ModelRenderer Rotation3;
	private final ModelRenderer Angle3;
	private final ModelRenderer cube_r12;
	private final ModelRenderer PanelBaseSlant3;
	private final ModelRenderer P4;
	private final ModelRenderer PanelSplitters4;
	private final ModelRenderer Rotation4;
	private final ModelRenderer Angle4;
	private final ModelRenderer cube_r13;
	private final ModelRenderer PanelBaseSlant4;
	private final ModelRenderer cube_r14;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer P5;
	private final ModelRenderer PanelSplitters5;
	private final ModelRenderer Rotation5;
	private final ModelRenderer Angle5;
	private final ModelRenderer cube_r15;
	private final ModelRenderer PanelBaseSlant5;
	private final ModelRenderer Monitor;
	private final ModelRenderer P6;
	private final ModelRenderer PanelSplitters6;
	private final ModelRenderer Rotation6;
	private final ModelRenderer Angle6;
	private final ModelRenderer cube_r16;
	private final ModelRenderer PanelBaseSlant6;
	private final ModelRenderer SupportStruts;
	private final ModelRenderer Strut1;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer Strut2;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer Strut3;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer TimeRotor;
	private final ModelRenderer Part6;
	private final ModelRenderer hexadecagon_r21;
	private final ModelRenderer hexadecagon_r22;
	private final ModelRenderer hexadecagon_r23;
	private final ModelRenderer hexadecagon_r24;
	private final ModelRenderer Part7;
	private final ModelRenderer hexadecagon_r25;
	private final ModelRenderer hexadecagon_r26;
	private final ModelRenderer hexadecagon_r27;
	private final ModelRenderer hexadecagon_r28;
	private final ModelRenderer Part8;
	private final ModelRenderer hexadecagon_r29;
	private final ModelRenderer hexadecagon_r30;
	private final ModelRenderer hexadecagon_r31;
	private final ModelRenderer hexadecagon_r32;
	private final ModelRenderer Controls;
	private final ModelRenderer Panel1;
	private final ModelRenderer PanelBaseSlant7;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final LightModelRenderer Refuel;
	private final ModelRenderer DimensionalShifter;
	private final ModelRenderer cube_r31;
	private final LightModelRenderer XControl;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final LightModelRenderer YControl;
	private final LightModelRenderer ZControl;
	private final LightModelRenderer ControlIncMod;
	private final ModelRenderer Panel2;
	private final ModelRenderer PanelBaseSlant8;
	private final ModelRenderer cube_r32;
	private final ModelRenderer DoorSwitch;
	private final ModelRenderer cube_r33;
	private final ModelRenderer DoorSwitch2;
	private final ModelRenderer cube_r34;
	private final ModelRenderer Panel3;
	private final ModelRenderer PanelBaseSlant9;
	private final LightModelRenderer Randomiser;
	private final LightModelRenderer VerticalLandType;
	private final LightModelRenderer VerticalLandTypeUp;
	private final LightModelRenderer VerticalLandTypeDown;
	private final LightModelRenderer ExteriorFacing;
	private final ModelRenderer bone15;
	private final LightModelRenderer ExteriorFacingNorth;
	private final LightModelRenderer ExteriorFacingEast;
	private final LightModelRenderer ExteriorFacingSouth;
	private final LightModelRenderer ExteriorFacingWest;
	private final ModelRenderer RandomLevers;
	private final ModelRenderer Lever;
	private final ModelRenderer Lever2;
	private final ModelRenderer Lever3;
	private final ModelRenderer Lever4;
	private final ModelRenderer Lever6;
	private final ModelRenderer Lever7;
	private final ModelRenderer Lever8;
	private final ModelRenderer Lever9;
	private final LightModelRenderer Lights2;
	private final EntityGlowRenderer Lamp2;
	private final  EntityGlowRenderer bone5;
	private final  EntityGlowRenderer bone6;
	private final  EntityGlowRenderer bone7;
	private final  EntityGlowRenderer bone8;
	private final ModelRenderer Panel4;
	private final ModelRenderer PanelBaseSlant10;
	private final ModelRenderer Handbrake;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer Throttle;
	private final LightModelRenderer Lights3;
	private final  EntityGlowRenderer Lamp3;
	private final LightModelRenderer Lights5;
	private final  EntityGlowRenderer Lamp5;
	private final  EntityGlowRenderer bone;
	private final  EntityGlowRenderer bone2;
	private final  EntityGlowRenderer bone4;
	private final  EntityGlowRenderer bone3;
	private final ModelRenderer Panel6;
	private final ModelRenderer PanelBaseSlant11;
	private final LightModelRenderer FastReturn;
	private final LightModelRenderer Lights4;
	private final LightModelRenderer Lamp4;
	private final  EntityGlowRenderer bone13;
	private final  EntityGlowRenderer bone14;
	private final  EntityGlowRenderer bone12;
	private final  EntityGlowRenderer bone11;
	private final ModelRenderer RandomLevers2;
	private final ModelRenderer Lever5;
	private final ModelRenderer Lever10;
	private final ModelRenderer Lever11;
	private final ModelRenderer Lever12;
	private final ModelRenderer Lever13;
	private final ModelRenderer Lever14;
	private final ModelRenderer Lever15;
	private final ModelRenderer Lever16;

	public BrackolinConsole() {
		textureHeight = 160;
		textureWidth = 160;

		Console = new ModelRenderer(this);
		Console.setRotationPoint(0.0F, 24.0F, 0.0F);


		BaseConsole = new ModelRenderer(this);
		BaseConsole.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(BaseConsole);


		Feet = new ModelRenderer(this);
		Feet.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseConsole.addChild(Feet);


		Foot1 = new ModelRenderer(this);
		Foot1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Feet.addChild(Foot1);
		setRotationAngle(Foot1, 0.0F, -1.0472F, 0.0F);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -0.7119F, -8.1283F);
		Foot1.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(46, 92).addBox(-1.0F, -1.75F, -4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 99).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, -0.25F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -0.4775F, -6.0761F);
		Foot1.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(26, 124).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, -0.249F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.1736F, -3.9923F);
		Foot1.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(94, 86).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);

		Foot2 = new ModelRenderer(this);
		Foot2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Feet.addChild(Foot2);
		setRotationAngle(Foot2, 0.0F, 3.1416F, 0.0F);


		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -0.7119F, -8.1283F);
		Foot2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(86, 6).addBox(-1.0F, -1.75F, -4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(75, 29).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, -0.25F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -0.4775F, -6.0761F);
		Foot2.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(80, 66).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, -0.249F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.1736F, -3.9923F);
		Foot2.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(86, 21).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);

		Foot3 = new ModelRenderer(this);
		Foot3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Feet.addChild(Foot3);
		setRotationAngle(Foot3, 0.0F, 1.0472F, 0.0F);


		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -0.7119F, -8.1283F);
		Foot3.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(42, 70).addBox(-1.0F, -1.75F, -4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 67).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, -0.25F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -0.4775F, -6.0761F);
		Foot3.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(16, 70).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, -0.249F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.1736F, -3.9923F);
		Foot3.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(66, 78).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);

		ConsolePillar = new ModelRenderer(this);
		ConsolePillar.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseConsole.addChild(ConsolePillar);


		Part1 = new ModelRenderer(this);
		Part1.setRotationPoint(0.0F, -10.75F, 0.0F);
		ConsolePillar.addChild(Part1);
		Part1.setTextureOffset(39, 135).addBox(-0.9946F, -9.0F, -5.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);
		Part1.setTextureOffset(53, 103).addBox(-0.9946F, -9.0F, 4.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);
		Part1.setTextureOffset(43, 39).addBox(-5.0F, -9.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, 0.0F, false);
		Part1.setTextureOffset(0, 13).addBox(4.0F, -9.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, 0.0F, false);

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part1.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r1.setTextureOffset(0, 26).addBox(4.0F, -2.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, 0.0F, false);
		hexadecagon_r1.setTextureOffset(0, 39).addBox(-5.0F, -2.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, 0.0F, false);
		hexadecagon_r1.setTextureOffset(104, 105).addBox(-0.9946F, -2.0F, 4.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);
		hexadecagon_r1.setTextureOffset(78, 133).addBox(-0.9946F, -2.0F, -5.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part1.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r2.setTextureOffset(0, 0).addBox(4.0F, -2.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, 0.0F, false);
		hexadecagon_r2.setTextureOffset(34, 52).addBox(-5.0F, -2.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, 0.0F, false);
		hexadecagon_r2.setTextureOffset(39, 102).addBox(-0.9946F, -2.0F, 4.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);
		hexadecagon_r2.setTextureOffset(110, 135).addBox(-0.9946F, -2.0F, -5.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part1.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r3.setTextureOffset(48, 55).addBox(-0.9946F, -2.0F, -5.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);
		hexadecagon_r3.setTextureOffset(107, 86).addBox(-0.9946F, -2.0F, 4.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part1.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r4.setTextureOffset(0, 81).addBox(-0.9946F, -2.0F, 4.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);
		hexadecagon_r4.setTextureOffset(117, 135).addBox(-0.9946F, -2.0F, -5.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);

		Part2 = new ModelRenderer(this);
		Part2.setRotationPoint(0.0F, -3.0F, 0.0F);
		ConsolePillar.addChild(Part2);
		Part2.setTextureOffset(0, 81).addBox(-0.8951F, -11.0F, -4.5F, 1.7902F, 8.0F, 9.0F, 0.0F, false);
		Part2.setTextureOffset(0, 112).addBox(-4.5F, -11.0F, -0.8951F, 9.0F, 8.0F, 1.7902F, 0.0F, false);

		hexadecagon_r5 = new ModelRenderer(this);
		hexadecagon_r5.setRotationPoint(0.0F, -8.0F, 0.0F);
		Part2.addChild(hexadecagon_r5);
		setRotationAngle(hexadecagon_r5, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r5.setTextureOffset(108, 73).addBox(-4.5F, -3.0F, -0.8951F, 9.0F, 8.0F, 1.7902F, 0.0F, false);
		hexadecagon_r5.setTextureOffset(66, 75).addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 8.0F, 9.0F, 0.0F, false);

		hexadecagon_r6 = new ModelRenderer(this);
		hexadecagon_r6.setRotationPoint(0.0F, -8.0F, 0.0F);
		Part2.addChild(hexadecagon_r6);
		setRotationAngle(hexadecagon_r6, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r6.setTextureOffset(113, 105).addBox(-4.5F, -3.0F, -0.8951F, 9.0F, 8.0F, 1.7902F, 0.0F, false);
		hexadecagon_r6.setTextureOffset(82, 66).addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 8.0F, 9.0F, 0.0F, false);

		hexadecagon_r7 = new ModelRenderer(this);
		hexadecagon_r7.setRotationPoint(0.0F, -8.0F, 0.0F);
		Part2.addChild(hexadecagon_r7);
		setRotationAngle(hexadecagon_r7, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r7.setTextureOffset(43, 70).addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 8.0F, 9.0F, 0.0F, false);

		hexadecagon_r8 = new ModelRenderer(this);
		hexadecagon_r8.setRotationPoint(0.0F, -8.0F, 0.0F);
		Part2.addChild(hexadecagon_r8);
		setRotationAngle(hexadecagon_r8, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r8.setTextureOffset(23, 84).addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 8.0F, 9.0F, 0.0F, false);

		Part3 = new ModelRenderer(this);
		Part3.setRotationPoint(0.0F, 1.0F, 0.0F);
		ConsolePillar.addChild(Part3);
		Part3.setTextureOffset(86, 6).addBox(-0.9946F, -7.0F, -5.0F, 1.9891F, 4.0F, 10.0F, 0.0F, false);
		Part3.setTextureOffset(111, 116).addBox(-5.0F, -7.0F, -0.9946F, 10.0F, 4.0F, 1.9891F, 0.0F, false);

		hexadecagon_r9 = new ModelRenderer(this);
		hexadecagon_r9.setRotationPoint(0.0F, -8.0F, 0.0F);
		Part3.addChild(hexadecagon_r9);
		setRotationAngle(hexadecagon_r9, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r9.setTextureOffset(114, 26).addBox(-5.0F, 1.0F, -0.9946F, 10.0F, 4.0F, 1.9891F, 0.0F, false);
		hexadecagon_r9.setTextureOffset(85, 40).addBox(-0.9946F, 1.0F, -5.0F, 1.9891F, 4.0F, 10.0F, 0.0F, false);

		hexadecagon_r10 = new ModelRenderer(this);
		hexadecagon_r10.setRotationPoint(0.0F, -8.0F, 0.0F);
		Part3.addChild(hexadecagon_r10);
		setRotationAngle(hexadecagon_r10, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r10.setTextureOffset(23, 117).addBox(-5.0F, 1.0F, -0.9946F, 10.0F, 4.0F, 1.9891F, 0.0F, false);
		hexadecagon_r10.setTextureOffset(86, 21).addBox(-0.9946F, 1.0F, -5.0F, 1.9891F, 4.0F, 10.0F, 0.0F, false);

		hexadecagon_r11 = new ModelRenderer(this);
		hexadecagon_r11.setRotationPoint(0.0F, -8.0F, 0.0F);
		Part3.addChild(hexadecagon_r11);
		setRotationAngle(hexadecagon_r11, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r11.setTextureOffset(79, 84).addBox(-0.9946F, 1.0F, -5.0F, 1.9891F, 4.0F, 10.0F, 0.0F, false);

		hexadecagon_r12 = new ModelRenderer(this);
		hexadecagon_r12.setRotationPoint(0.0F, -8.0F, 0.0F);
		Part3.addChild(hexadecagon_r12);
		setRotationAngle(hexadecagon_r12, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r12.setTextureOffset(46, 88).addBox(-0.9946F, 1.0F, -5.0F, 1.9891F, 4.0F, 10.0F, 0.0F, false);

		Part4 = new ModelRenderer(this);
		Part4.setRotationPoint(0.0F, 3.0F, 0.0F);
		ConsolePillar.addChild(Part4);
		Part4.setTextureOffset(17, 55).addBox(-1.1935F, -5.0F, -6.0F, 2.3869F, 2.0F, 12.0F, 0.0F, false);
		Part4.setTextureOffset(101, 11).addBox(-6.0F, -5.0F, -1.1935F, 12.0F, 2.0F, 2.3869F, 0.0F, false);

		hexadecagon_r13 = new ModelRenderer(this);
		hexadecagon_r13.setRotationPoint(0.0F, -8.0F, 0.0F);
		Part4.addChild(hexadecagon_r13);
		setRotationAngle(hexadecagon_r13, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r13.setTextureOffset(101, 6).addBox(-6.0F, 3.0F, -1.1935F, 12.0F, 2.0F, 2.3869F, 0.0F, false);
		hexadecagon_r13.setTextureOffset(0, 52).addBox(-1.1935F, 3.0F, -6.0F, 2.3869F, 2.0F, 12.0F, 0.0F, false);

		hexadecagon_r14 = new ModelRenderer(this);
		hexadecagon_r14.setRotationPoint(0.0F, -8.0F, 0.0F);
		Part4.addChild(hexadecagon_r14);
		setRotationAngle(hexadecagon_r14, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r14.setTextureOffset(101, 21).addBox(-6.0F, 3.0F, -1.1935F, 12.0F, 2.0F, 2.3869F, 0.0F, false);
		hexadecagon_r14.setTextureOffset(46, 55).addBox(-1.1935F, 3.0F, -6.0F, 2.3869F, 2.0F, 12.0F, 0.0F, false);

		hexadecagon_r15 = new ModelRenderer(this);
		hexadecagon_r15.setRotationPoint(0.0F, -8.0F, 0.0F);
		Part4.addChild(hexadecagon_r15);
		setRotationAngle(hexadecagon_r15, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r15.setTextureOffset(41, 40).addBox(-1.1935F, 3.0F, -6.0F, 2.3869F, 2.0F, 12.0F, 0.0F, false);

		hexadecagon_r16 = new ModelRenderer(this);
		hexadecagon_r16.setRotationPoint(0.0F, -8.0F, 0.0F);
		Part4.addChild(hexadecagon_r16);
		setRotationAngle(hexadecagon_r16, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r16.setTextureOffset(58, 29).addBox(-1.1935F, 3.0F, -6.0F, 2.3869F, 2.0F, 12.0F, 0.0F, false);

		Part5 = new ModelRenderer(this);
		Part5.setRotationPoint(0.0F, -17.0F, 0.0F);
		ConsolePillar.addChild(Part5);
		Part5.setTextureOffset(133, 139).addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);
		Part5.setTextureOffset(139, 6).addBox(-0.8951F, -3.0F, 3.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);
		Part5.setTextureOffset(99, 120).addBox(3.5F, -3.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, 0.0F, false);
		Part5.setTextureOffset(25, 84).addBox(-4.5F, -3.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, 0.0F, false);

		hexadecagon_r17 = new ModelRenderer(this);
		hexadecagon_r17.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part5.addChild(hexadecagon_r17);
		setRotationAngle(hexadecagon_r17, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r17.setTextureOffset(57, 70).addBox(-4.5F, 4.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, 0.0F, false);
		hexadecagon_r17.setTextureOffset(53, 120).addBox(3.5F, 4.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, 0.0F, false);
		hexadecagon_r17.setTextureOffset(139, 0).addBox(-0.8951F, 4.0F, 3.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);
		hexadecagon_r17.setTextureOffset(139, 126).addBox(-0.8951F, 4.0F, -4.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);

		hexadecagon_r18 = new ModelRenderer(this);
		hexadecagon_r18.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part5.addChild(hexadecagon_r18);
		setRotationAngle(hexadecagon_r18, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r18.setTextureOffset(87, 39).addBox(-4.5F, 4.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, 0.0F, false);
		hexadecagon_r18.setTextureOffset(73, 125).addBox(3.5F, 4.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, 0.0F, false);
		hexadecagon_r18.setTextureOffset(139, 28).addBox(-0.8951F, 4.0F, 3.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);
		hexadecagon_r18.setTextureOffset(140, 13).addBox(-0.8951F, 4.0F, -4.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);

		hexadecagon_r19 = new ModelRenderer(this);
		hexadecagon_r19.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part5.addChild(hexadecagon_r19);
		setRotationAngle(hexadecagon_r19, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r19.setTextureOffset(137, 98).addBox(-0.8951F, 4.0F, 3.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);
		hexadecagon_r19.setTextureOffset(139, 90).addBox(-0.8951F, 4.0F, -4.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);

		hexadecagon_r20 = new ModelRenderer(this);
		hexadecagon_r20.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part5.addChild(hexadecagon_r20);
		setRotationAngle(hexadecagon_r20, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r20.setTextureOffset(139, 84).addBox(-0.8951F, 4.0F, 3.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);
		hexadecagon_r20.setTextureOffset(140, 66).addBox(-0.8951F, 4.0F, -4.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);

		PanelBase = new ModelRenderer(this);
		PanelBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseConsole.addChild(PanelBase);


		P1 = new ModelRenderer(this);
		P1.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelBase.addChild(P1);
		P1.setTextureOffset(96, 66).addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, -0.25F, false);
		P1.setTextureOffset(43, 16).addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, -0.25F, false);

		PanelSplitters = new ModelRenderer(this);
		PanelSplitters.setRotationPoint(0.0F, 0.0F, 0.0F);
		P1.addChild(PanelSplitters);


		Rotation = new ModelRenderer(this);
		Rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelSplitters.addChild(Rotation);
		setRotationAngle(Rotation, 0.0F, -0.5236F, 0.0F);


		Angle = new ModelRenderer(this);
		Angle.setRotationPoint(0.0F, -16.25F, -10.5F);
		Rotation.addChild(Angle);
		setRotationAngle(Angle, 0.4625F, 0.0F, 0.0F);


		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -0.5F, 2.5F);
		Angle.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.7854F);
		cube_r10.setTextureOffset(100, 28).addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, -0.25F, false);

		PanelBaseSlant = new ModelRenderer(this);
		PanelBaseSlant.setRotationPoint(0.0F, -15.75F, -8.65F);
		P1.addChild(PanelBaseSlant);
		setRotationAngle(PanelBaseSlant, 0.5236F, 0.0F, 0.0F);
		PanelBaseSlant.setTextureOffset(100, 45).addBox(-7.0F, -0.634F, -2.5F, 14.0F, 1.0F, 2.0F, -0.25F, false);
		PanelBaseSlant.setTextureOffset(98, 129).addBox(3.0F, -0.634F, -1.0F, 3.0F, 3.0F, 3.0F, -0.25F, false);
		PanelBaseSlant.setTextureOffset(10, 123).addBox(-6.0F, -0.634F, -1.0F, 3.0F, 3.0F, 3.0F, -0.25F, false);
		PanelBaseSlant.setTextureOffset(23, 90).addBox(-5.0F, -0.634F, 1.5F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		PanelBaseSlant.setTextureOffset(94, 91).addBox(2.0F, -0.634F, 1.5F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		PanelBaseSlant.setTextureOffset(114, 33).addBox(-4.0F, -0.634F, 2.0F, 8.0F, 1.0F, 4.0F, -0.25F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 0.2075F, -0.2255F);
		PanelBaseSlant.addChild(bone19);
		setRotationAngle(bone19, -0.5236F, 0.0F, 0.0F);
		bone19.setTextureOffset(116, 123).addBox(-3.5F, -0.5F, -1.0F, 7.0F, 1.0F, 3.0F, -0.25F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, -0.0308F, 2.2654F);
		PanelBaseSlant.addChild(bone18);
		setRotationAngle(bone18, 0.829F, 0.0F, 0.0F);
		bone18.setTextureOffset(121, 90).addBox(-3.5F, -0.5F, -2.5F, 7.0F, 1.0F, 3.0F, -0.25F, false);

		P2 = new ModelRenderer(this);
		P2.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelBase.addChild(P2);
		setRotationAngle(P2, 0.0F, -1.0472F, 0.0F);
		P2.setTextureOffset(86, 3).addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, -0.25F, false);
		P2.setTextureOffset(43, 3).addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, -0.25F, false);

		PanelSplitters2 = new ModelRenderer(this);
		PanelSplitters2.setRotationPoint(0.0F, 0.0F, 0.0F);
		P2.addChild(PanelSplitters2);


		Rotation2 = new ModelRenderer(this);
		Rotation2.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelSplitters2.addChild(Rotation2);
		setRotationAngle(Rotation2, 0.0F, -0.5236F, 0.0F);


		Angle2 = new ModelRenderer(this);
		Angle2.setRotationPoint(0.0F, -16.25F, -10.5F);
		Rotation2.addChild(Angle2);
		setRotationAngle(Angle2, 0.4625F, 0.0F, 0.0F);


		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, -0.5F, 2.5F);
		Angle2.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.setTextureOffset(74, 99).addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, -0.25F, false);

		PanelBaseSlant2 = new ModelRenderer(this);
		PanelBaseSlant2.setRotationPoint(0.0F, -15.75F, -8.65F);
		P2.addChild(PanelBaseSlant2);
		setRotationAngle(PanelBaseSlant2, 0.5236F, 0.0F, 0.0F);
		PanelBaseSlant2.setTextureOffset(100, 41).addBox(-7.0F, -0.634F, -2.5F, 14.0F, 1.0F, 2.0F, -0.25F, false);
		PanelBaseSlant2.setTextureOffset(0, 58).addBox(3.5F, -0.634F, -1.0F, 2.0F, 2.0F, 3.0F, -0.25F, false);
		PanelBaseSlant2.setTextureOffset(121, 84).addBox(-5.5F, -0.634F, -1.0F, 7.0F, 2.0F, 3.0F, -0.25F, false);
		PanelBaseSlant2.setTextureOffset(110, 49).addBox(-4.5F, -0.634F, 1.5F, 9.0F, 1.0F, 4.0F, -0.25F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(3.0F, 0.7075F, 0.6405F);
		PanelBaseSlant2.addChild(bone16);
		setRotationAngle(bone16, -0.5236F, 0.0F, 0.0F);
		bone16.setTextureOffset(130, 20).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 3.0F, -0.25F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(3.0F, 0.3905F, 1.5915F);
		PanelBaseSlant2.addChild(bone17);
		setRotationAngle(bone17, 1.0472F, 0.0F, 0.0F);
		bone17.setTextureOffset(129, 55).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 3.0F, -0.25F, false);

		P3 = new ModelRenderer(this);
		P3.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelBase.addChild(P3);
		setRotationAngle(P3, 0.0F, -2.0944F, 0.0F);
		P3.setTextureOffset(80, 63).addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, -0.25F, false);
		P3.setTextureOffset(0, 39).addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, -0.25F, false);

		PanelSplitters3 = new ModelRenderer(this);
		PanelSplitters3.setRotationPoint(0.0F, 0.0F, 0.0F);
		P3.addChild(PanelSplitters3);


		Rotation3 = new ModelRenderer(this);
		Rotation3.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelSplitters3.addChild(Rotation3);
		setRotationAngle(Rotation3, 0.0F, -0.5236F, 0.0F);


		Angle3 = new ModelRenderer(this);
		Angle3.setRotationPoint(0.0F, -16.25F, -10.5F);
		Rotation3.addChild(Angle3);
		setRotationAngle(Angle3, 0.4625F, 0.0F, 0.0F);


		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -0.5F, 2.5F);
		Angle3.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.setTextureOffset(0, 99).addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, -0.25F, false);

		PanelBaseSlant3 = new ModelRenderer(this);
		PanelBaseSlant3.setRotationPoint(0.0F, -15.75F, -8.65F);
		P3.addChild(PanelBaseSlant3);
		setRotationAngle(PanelBaseSlant3, 0.5236F, 0.0F, 0.0F);
		PanelBaseSlant3.setTextureOffset(63, 55).addBox(-6.5F, -0.634F, -2.5F, 13.0F, 1.0F, 4.0F, -0.25F, false);
		PanelBaseSlant3.setTextureOffset(111, 16).addBox(-5.0F, -0.634F, 1.0F, 10.0F, 1.0F, 2.0F, -0.25F, false);
		PanelBaseSlant3.setTextureOffset(117, 98).addBox(-4.0F, -0.634F, 2.5F, 8.0F, 1.0F, 3.0F, -0.25F, false);

		P4 = new ModelRenderer(this);
		P4.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelBase.addChild(P4);
		setRotationAngle(P4, 0.0F, 3.1416F, 0.0F);
		P4.setTextureOffset(43, 0).addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, -0.25F, false);
		P4.setTextureOffset(0, 0).addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, -0.25F, false);

		PanelSplitters4 = new ModelRenderer(this);
		PanelSplitters4.setRotationPoint(0.0F, 0.0F, 0.0F);
		P4.addChild(PanelSplitters4);


		Rotation4 = new ModelRenderer(this);
		Rotation4.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelSplitters4.addChild(Rotation4);
		setRotationAngle(Rotation4, 0.0F, -0.5236F, 0.0F);


		Angle4 = new ModelRenderer(this);
		Angle4.setRotationPoint(0.0F, -16.25F, -10.5F);
		Rotation4.addChild(Angle4);
		setRotationAngle(Angle4, 0.4625F, 0.0F, 0.0F);


		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, -0.5F, 2.5F);
		Angle4.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.setTextureOffset(60, 93).addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, -0.25F, false);

		PanelBaseSlant4 = new ModelRenderer(this);
		PanelBaseSlant4.setRotationPoint(0.0F, -15.75F, -8.65F);
		P4.addChild(PanelBaseSlant4);
		setRotationAngle(PanelBaseSlant4, 0.5236F, 0.0F, 0.0F);
		PanelBaseSlant4.setTextureOffset(96, 69).addBox(-7.0F, -0.634F, -2.5F, 14.0F, 1.0F, 2.0F, -0.25F, false);
		PanelBaseSlant4.setTextureOffset(63, 61).addBox(-5.4F, -0.634F, -1.0F, 2.0F, 2.0F, 3.0F, -0.25F, false);
		PanelBaseSlant4.setTextureOffset(121, 0).addBox(-1.4F, -0.634F, -1.0F, 7.0F, 2.0F, 3.0F, -0.25F, false);
		PanelBaseSlant4.setTextureOffset(43, 29).addBox(-4.5F, -0.634F, 1.5F, 9.0F, 1.0F, 4.0F, -0.25F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.0F, 0.7075F, 0.6405F);
		PanelBaseSlant4.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.5236F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(0, 73).addBox(-0.5F, -0.65F, -2.0F, 2.0F, 1.0F, 3.0F, -0.25F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-3.0F, 0.7075F, 0.6405F);
		PanelBaseSlant4.addChild(bone20);
		setRotationAngle(bone20, -0.5236F, 0.0F, 0.0F);
		bone20.setTextureOffset(133, 47).addBox(-0.9F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-3.0F, 0.3905F, 1.5915F);
		PanelBaseSlant4.addChild(bone21);
		setRotationAngle(bone21, 1.0472F, 0.0F, 0.0F);
		bone21.setTextureOffset(127, 128).addBox(-1.9F, -0.5F, -2.0F, 4.0F, 1.0F, 3.0F, -0.25F, false);

		P5 = new ModelRenderer(this);
		P5.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelBase.addChild(P5);
		setRotationAngle(P5, 0.0F, 2.0944F, 0.0F);
		P5.setTextureOffset(78, 0).addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, -0.25F, false);
		P5.setTextureOffset(0, 26).addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, -0.25F, false);

		PanelSplitters5 = new ModelRenderer(this);
		PanelSplitters5.setRotationPoint(0.0F, 0.0F, 0.0F);
		P5.addChild(PanelSplitters5);


		Rotation5 = new ModelRenderer(this);
		Rotation5.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelSplitters5.addChild(Rotation5);
		setRotationAngle(Rotation5, 0.0F, -0.5236F, 0.0F);


		Angle5 = new ModelRenderer(this);
		Angle5.setRotationPoint(0.0F, -16.25F, -10.5F);
		Rotation5.addChild(Angle5);
		setRotationAngle(Angle5, 0.4625F, 0.0F, 0.0F);


		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, -0.5F, 2.5F);
		Angle5.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
		cube_r15.setTextureOffset(94, 73).addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, -0.25F, false);

		PanelBaseSlant5 = new ModelRenderer(this);
		PanelBaseSlant5.setRotationPoint(0.0F, -15.75F, -8.65F);
		P5.addChild(PanelBaseSlant5);
		setRotationAngle(PanelBaseSlant5, 0.5236F, 0.0F, 0.0F);
		PanelBaseSlant5.setTextureOffset(88, 101).addBox(-6.5F, -0.634F, -2.5F, 13.0F, 1.0F, 2.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(129, 60).addBox(-2.5F, -0.734F, -1.25F, 5.0F, 1.0F, 1.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(0, 105).addBox(1.5F, -0.634F, -1.0F, 4.0F, 1.0F, 1.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(23, 102).addBox(-5.5F, -0.634F, -1.0F, 4.0F, 1.0F, 1.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(58, 38).addBox(-5.5F, -0.634F, 3.0F, 4.0F, 1.0F, 1.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(17, 61).addBox(1.5F, -0.634F, 3.0F, 4.0F, 1.0F, 1.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(108, 129).addBox(1.3F, -0.734F, 2.9F, 2.0F, 1.0F, 1.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(123, 128).addBox(-3.3F, -0.734F, 2.9F, 2.0F, 1.0F, 1.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(32, 74).addBox(-3.3F, -0.734F, -0.75F, 2.0F, 1.0F, 1.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(82, 112).addBox(1.3F, -0.734F, -0.75F, 2.0F, 1.0F, 1.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(17, 55).addBox(2.3F, -0.734F, -0.5F, 1.0F, 1.0F, 4.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(0, 52).addBox(-3.3F, -0.734F, -0.5F, 1.0F, 1.0F, 4.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(37, 88).addBox(-3.5F, -0.634F, 3.5F, 7.0F, 1.0F, 2.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(73, 122).addBox(-2.5F, -0.734F, 3.25F, 5.0F, 1.0F, 1.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(128, 7).addBox(2.5F, -0.634F, -0.5F, 3.0F, 1.0F, 4.0F, -0.25F, false);
		PanelBaseSlant5.setTextureOffset(14, 84).addBox(-5.5F, -0.634F, -0.5F, 3.0F, 1.0F, 4.0F, -0.25F, false);

		Monitor = new ModelRenderer(this);
		Monitor.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelBaseSlant5.addChild(Monitor);
		Monitor.setTextureOffset(71, 115).addBox(-3.0F, -0.384F, -1.0F, 6.0F, 1.0F, 5.0F, -0.25F, false);

		P6 = new ModelRenderer(this);
		P6.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelBase.addChild(P6);
		setRotationAngle(P6, 0.0F, 1.0472F, 0.0F);
		P6.setTextureOffset(75, 36).addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, -0.25F, false);
		P6.setTextureOffset(0, 13).addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, -0.25F, false);

		PanelSplitters6 = new ModelRenderer(this);
		PanelSplitters6.setRotationPoint(0.0F, 0.0F, 0.0F);
		P6.addChild(PanelSplitters6);


		Rotation6 = new ModelRenderer(this);
		Rotation6.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelSplitters6.addChild(Rotation6);
		setRotationAngle(Rotation6, 0.0F, -0.5236F, 0.0F);


		Angle6 = new ModelRenderer(this);
		Angle6.setRotationPoint(0.0F, -16.25F, -10.5F);
		Rotation6.addChild(Angle6);
		setRotationAngle(Angle6, 0.4625F, 0.0F, 0.0F);


		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, -0.5F, 2.5F);
		Angle6.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
		cube_r16.setTextureOffset(93, 88).addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, -0.25F, false);

		PanelBaseSlant6 = new ModelRenderer(this);
		PanelBaseSlant6.setRotationPoint(0.0F, -15.75F, -8.65F);
		P6.addChild(PanelBaseSlant6);
		setRotationAngle(PanelBaseSlant6, 0.5236F, 0.0F, 0.0F);
		PanelBaseSlant6.setTextureOffset(58, 44).addBox(-7.0F, -0.634F, -2.5F, 14.0F, 1.0F, 4.0F, -0.25F, false);
		PanelBaseSlant6.setTextureOffset(93, 56).addBox(-5.0F, -0.634F, 1.0F, 10.0F, 1.0F, 5.0F, -0.25F, false);

		SupportStruts = new ModelRenderer(this);
		SupportStruts.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseConsole.addChild(SupportStruts);


		Strut1 = new ModelRenderer(this);
		Strut1.setRotationPoint(0.0F, 0.0F, 0.0F);
		SupportStruts.addChild(Strut1);
		setRotationAngle(Strut1, 0.0F, -1.0472F, 0.0F);


		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, -12.3986F, -9.7876F);
		Strut1.addChild(cube_r17);
		setRotationAngle(cube_r17, 1.7453F, 0.0F, 0.0F);
		cube_r17.setTextureOffset(131, 71).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 4.0F, -0.5F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, -5.7953F, -6.5822F);
		Strut1.addChild(cube_r18);
		setRotationAngle(cube_r18, 2.0508F, 0.0F, 0.0F);
		cube_r18.setTextureOffset(107, 86).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 9.0F, -0.6F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -5.7953F, -6.5822F);
		Strut1.addChild(cube_r19);
		setRotationAngle(cube_r19, 1.6144F, 0.0F, 0.0F);
		cube_r19.setTextureOffset(53, 108).addBox(-1.0F, 0.0F, 0.5F, 2.0F, 2.0F, 9.0F, -0.6F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -2.0F, -9.0F);
		Strut1.addChild(cube_r20);
		setRotationAngle(cube_r20, 1.0036F, 0.0F, 0.0F);
		cube_r20.setTextureOffset(87, 117).addBox(-1.0F, -4.0F, 4.25F, 2.0F, 2.0F, 7.0F, -0.7F, false);
		cube_r20.setTextureOffset(16, 70).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 11.0F, -0.5F, false);

		Strut2 = new ModelRenderer(this);
		Strut2.setRotationPoint(0.0F, 0.0F, 0.0F);
		SupportStruts.addChild(Strut2);
		setRotationAngle(Strut2, 0.0F, 3.1416F, 0.0F);


		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, -12.3986F, -9.7876F);
		Strut2.addChild(cube_r21);
		setRotationAngle(cube_r21, 1.7453F, 0.0F, 0.0F);
		cube_r21.setTextureOffset(65, 131).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 4.0F, -0.5F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, -5.7953F, -6.5822F);
		Strut2.addChild(cube_r22);
		setRotationAngle(cube_r22, 2.0508F, 0.0F, 0.0F);
		cube_r22.setTextureOffset(39, 105).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 9.0F, -0.6F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, -5.7953F, -6.5822F);
		Strut2.addChild(cube_r23);
		setRotationAngle(cube_r23, 1.6144F, 0.0F, 0.0F);
		cube_r23.setTextureOffset(90, 105).addBox(-1.0F, 0.0F, 0.5F, 2.0F, 2.0F, 9.0F, -0.6F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, -2.0F, -9.0F);
		Strut2.addChild(cube_r24);
		setRotationAngle(cube_r24, 1.0036F, 0.0F, 0.0F);
		cube_r24.setTextureOffset(117, 56).addBox(-1.0F, -4.0F, 4.25F, 2.0F, 2.0F, 7.0F, -0.7F, false);
		cube_r24.setTextureOffset(0, 67).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 11.0F, -0.5F, false);

		Strut3 = new ModelRenderer(this);
		Strut3.setRotationPoint(0.0F, 0.0F, 0.0F);
		SupportStruts.addChild(Strut3);
		setRotationAngle(Strut3, 0.0F, 1.0472F, 0.0F);


		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, -12.3986F, -9.7876F);
		Strut3.addChild(cube_r25);
		setRotationAngle(cube_r25, 1.7453F, 0.0F, 0.0F);
		cube_r25.setTextureOffset(52, 131).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 4.0F, -0.5F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, -5.7953F, -6.5822F);
		Strut3.addChild(cube_r26);
		setRotationAngle(cube_r26, 2.0508F, 0.0F, 0.0F);
		cube_r26.setTextureOffset(34, 55).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 9.0F, -0.6F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, -5.7953F, -6.5822F);
		Strut3.addChild(cube_r27);
		setRotationAngle(cube_r27, 1.6144F, 0.0F, 0.0F);
		cube_r27.setTextureOffset(25, 102).addBox(-1.0F, 0.0F, 0.5F, 2.0F, 2.0F, 9.0F, -0.6F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, -2.0F, -9.0F);
		Strut3.addChild(cube_r28);
		setRotationAngle(cube_r28, 1.0036F, 0.0F, 0.0F);
		cube_r28.setTextureOffset(41, 117).addBox(-1.0F, -4.0F, 4.25F, 2.0F, 2.0F, 7.0F, -0.7F, false);
		cube_r28.setTextureOffset(64, 61).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 11.0F, -0.5F, false);

		TimeRotor = new ModelRenderer(this);
		TimeRotor.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(TimeRotor);
		TimeRotor.setTextureOffset(89, 127).addBox(-1.0F, -19.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);

		Part6 = new ModelRenderer(this);
		Part6.setRotationPoint(0.0F, -16.75F, 0.0F);
		TimeRotor.addChild(Part6);
		Part6.setTextureOffset(99, 120).addBox(-0.6962F, -3.0F, -3.5F, 1.3924F, 1.0F, 7.0F, 0.0F, false);
		Part6.setTextureOffset(53, 35).addBox(-3.5F, -3.0F, -0.6962F, 7.0F, 1.0F, 1.3924F, 0.0F, false);

		hexadecagon_r21 = new ModelRenderer(this);
		hexadecagon_r21.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part6.addChild(hexadecagon_r21);
		setRotationAngle(hexadecagon_r21, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r21.setTextureOffset(17, 52).addBox(-3.5F, 4.0F, -0.6962F, 7.0F, 1.0F, 1.3924F, 0.0F, false);
		hexadecagon_r21.setTextureOffset(53, 120).addBox(-0.6962F, 4.0F, -3.5F, 1.3924F, 1.0F, 7.0F, 0.0F, false);

		hexadecagon_r22 = new ModelRenderer(this);
		hexadecagon_r22.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part6.addChild(hexadecagon_r22);
		setRotationAngle(hexadecagon_r22, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r22.setTextureOffset(57, 75).addBox(-3.5F, 4.0F, -0.6962F, 7.0F, 1.0F, 1.3924F, 0.0F, false);
		hexadecagon_r22.setTextureOffset(63, 122).addBox(-0.6962F, 4.0F, -3.5F, 1.3924F, 1.0F, 7.0F, 0.0F, false);

		hexadecagon_r23 = new ModelRenderer(this);
		hexadecagon_r23.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part6.addChild(hexadecagon_r23);
		setRotationAngle(hexadecagon_r23, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r23.setTextureOffset(32, 70).addBox(-0.6962F, 4.0F, -3.5F, 1.3924F, 1.0F, 7.0F, 0.0F, false);

		hexadecagon_r24 = new ModelRenderer(this);
		hexadecagon_r24.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part6.addChild(hexadecagon_r24);
		setRotationAngle(hexadecagon_r24, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r24.setTextureOffset(0, 123).addBox(-0.6962F, 4.0F, -3.5F, 1.3924F, 1.0F, 7.0F, 0.0F, false);

		Part7 = new ModelRenderer(this);
		Part7.setRotationPoint(0.0F, -16.0F, 0.0F);
		TimeRotor.addChild(Part7);
		Part7.setTextureOffset(32, 124).addBox(-0.5967F, -7.5F, -3.0F, 1.1935F, 1.0F, 6.0F, 0.0F, false);
		Part7.setTextureOffset(67, 112).addBox(-3.0F, -7.5F, -0.5967F, 6.0F, 1.0F, 1.1935F, 0.0F, false);

		hexadecagon_r25 = new ModelRenderer(this);
		hexadecagon_r25.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part7.addChild(hexadecagon_r25);
		setRotationAngle(hexadecagon_r25, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r25.setTextureOffset(14, 107).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.1935F, 0.0F, false);
		hexadecagon_r25.setTextureOffset(17, 124).addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, 0.0F, false);

		hexadecagon_r26 = new ModelRenderer(this);
		hexadecagon_r26.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part7.addChild(hexadecagon_r26);
		setRotationAngle(hexadecagon_r26, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r26.setTextureOffset(23, 114).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.1935F, 0.0F, false);
		hexadecagon_r26.setTextureOffset(74, 125).addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, 0.0F, false);

		hexadecagon_r27 = new ModelRenderer(this);
		hexadecagon_r27.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part7.addChild(hexadecagon_r27);
		setRotationAngle(hexadecagon_r27, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r27.setTextureOffset(14, 99).addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, 0.0F, false);

		hexadecagon_r28 = new ModelRenderer(this);
		hexadecagon_r28.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part7.addChild(hexadecagon_r28);
		setRotationAngle(hexadecagon_r28, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r28.setTextureOffset(41, 127).addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, 0.0F, false);

		Part8 = new ModelRenderer(this);
		Part8.setRotationPoint(0.0F, -13.25F, 0.0F);
		TimeRotor.addChild(Part8);
		Part8.setTextureOffset(69, 138).addBox(-0.5027F, -10.5F, -2.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Part8.setTextureOffset(119, 55).addBox(-0.5027F, -10.5F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Part8.setTextureOffset(14, 99).addBox(1.5F, -10.5F, -0.4973F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Part8.setTextureOffset(74, 93).addBox(-2.5F, -10.5F, -0.4973F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hexadecagon_r29 = new ModelRenderer(this);
		hexadecagon_r29.setRotationPoint(0.0F, -10.75F, 0.0F);
		Part8.addChild(hexadecagon_r29);
		setRotationAngle(hexadecagon_r29, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r29.setTextureOffset(61, 88).addBox(-2.0F, -2.5F, -0.4973F, 1.0F, 7.0F, 1.0F, -0.2F, false);
		hexadecagon_r29.setTextureOffset(98, 136).addBox(1.0F, -2.5F, -0.4973F, 1.0F, 7.0F, 1.0F, -0.2F, false);
		hexadecagon_r29.setTextureOffset(136, 103).addBox(-0.5027F, -2.5F, 1.0F, 1.0F, 7.0F, 1.0F, -0.2F, false);
		hexadecagon_r29.setTextureOffset(0, 137).addBox(-0.5027F, -2.5F, -2.0F, 1.0F, 7.0F, 1.0F, -0.2F, false);

		hexadecagon_r30 = new ModelRenderer(this);
		hexadecagon_r30.setRotationPoint(0.0F, -10.75F, 0.0F);
		Part8.addChild(hexadecagon_r30);
		setRotationAngle(hexadecagon_r30, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r30.setTextureOffset(46, 135).addBox(-2.0F, -2.5F, -0.4973F, 1.0F, 7.0F, 1.0F, -0.2F, false);
		hexadecagon_r30.setTextureOffset(103, 136).addBox(1.0F, -2.5F, -0.4973F, 1.0F, 7.0F, 1.0F, -0.2F, false);
		hexadecagon_r30.setTextureOffset(136, 112).addBox(-0.5027F, -2.5F, 1.0F, 1.0F, 7.0F, 1.0F, -0.2F, false);
		hexadecagon_r30.setTextureOffset(5, 137).addBox(-0.5027F, -2.5F, -2.0F, 1.0F, 7.0F, 1.0F, -0.2F, false);

		hexadecagon_r31 = new ModelRenderer(this);
		hexadecagon_r31.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part8.addChild(hexadecagon_r31);
		setRotationAngle(hexadecagon_r31, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r31.setTextureOffset(29, 105).addBox(-0.5027F, -3.5F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		hexadecagon_r31.setTextureOffset(0, 123).addBox(-0.5027F, -3.5F, -2.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		hexadecagon_r32 = new ModelRenderer(this);
		hexadecagon_r32.setRotationPoint(0.0F, -7.0F, 0.0F);
		Part8.addChild(hexadecagon_r32);
		setRotationAngle(hexadecagon_r32, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r32.setTextureOffset(63, 120).addBox(-0.5027F, -3.5F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		hexadecagon_r32.setTextureOffset(85, 139).addBox(-0.5027F, -3.5F, -2.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		Controls = new ModelRenderer(this);
		Controls.setRotationPoint(0.0F, 24.0F, 0.0F);


		Panel1 = new ModelRenderer(this);
		Panel1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(Panel1);


		PanelBaseSlant7 = new ModelRenderer(this);
		PanelBaseSlant7.setRotationPoint(0.0F, -15.75F, -8.65F);
		Panel1.addChild(PanelBaseSlant7);
		setRotationAngle(PanelBaseSlant7, 0.5236F, 0.0F, 0.0F);
		PanelBaseSlant7.setTextureOffset(125, 133).addBox(-4.75F, -0.884F, -2.5F, 4.0F, 1.0F, 2.0F, -0.45F, false);
		PanelBaseSlant7.setTextureOffset(60, 138).addBox(-1.25F, -0.884F, -2.5F, 2.0F, 1.0F, 2.0F, -0.45F, false);
		PanelBaseSlant7.setTextureOffset(51, 138).addBox(0.0F, -0.884F, -2.5F, 2.0F, 1.0F, 2.0F, -0.45F, false);
		PanelBaseSlant7.setTextureOffset(124, 137).addBox(1.25F, -0.884F, -2.5F, 2.0F, 1.0F, 2.0F, -0.45F, false);
		PanelBaseSlant7.setTextureOffset(28, 137).addBox(2.5F, -0.884F, -2.5F, 2.0F, 1.0F, 2.0F, -0.45F, false);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(1.2F, -0.584F, 3.4F);
		PanelBaseSlant7.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.7854F, 0.0F);
		cube_r29.setTextureOffset(135, 33).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, -0.4F, false);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.2F, -0.584F, 3.4F);
		PanelBaseSlant7.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, -0.7854F, 0.0F);
		cube_r30.setTextureOffset(10, 137).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, -0.4F, false);

		Refuel = new LightModelRenderer(this);
		Refuel.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelBaseSlant7.addChild(Refuel);
		Refuel.setTextureOffset(137, 25).addBox(-4.25F, -0.884F, -2.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);

		DimensionalShifter = new ModelRenderer(this);
		DimensionalShifter.setRotationPoint(0.0F, 0.2075F, -0.2255F);
		PanelBaseSlant7.addChild(DimensionalShifter);


		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
		DimensionalShifter.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.5236F, 0.0F, 0.0F);
		cube_r31.setTextureOffset(44, 147).addBox(-1.05F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(39, 147).addBox(-1.05F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(147, 18).addBox(-0.5F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(147, 11).addBox(-0.5F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(64, 147).addBox(0.05F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(147, 60).addBox(0.05F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(147, 128).addBox(0.6F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(128, 147).addBox(0.6F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(69, 147).addBox(-1.6F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(147, 66).addBox(-1.6F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(95, 147).addBox(-2.15F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(90, 147).addBox(-2.15F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(103, 147).addBox(1.15F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(108, 147).addBox(1.15F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r31.setTextureOffset(67, 106).addBox(-2.5F, -0.65F, -0.5F, 5.0F, 1.0F, 2.0F, -0.25F, false);

		XControl = new LightModelRenderer(this);
		XControl.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelBaseSlant7.addChild(XControl);
		XControl.setTextureOffset(80, 145).addBox(-0.75F, -0.884F, -2.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.2F, -0.584F, 3.4F);
		PanelBaseSlant7.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -0.7854F, 0.0F);
		bone9.setTextureOffset(19, 137).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, -0.3F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(1.2F, -0.584F, 3.4F);
		PanelBaseSlant7.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.7854F, 0.0F);
		bone10.setTextureOffset(136, 135).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, -0.3F, false);

		YControl = new LightModelRenderer(this);
		YControl.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelBaseSlant7.addChild(YControl);
		YControl.setTextureOffset(75, 145).addBox(0.5F, -0.884F, -2.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		ZControl = new LightModelRenderer(this);
		ZControl.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelBaseSlant7.addChild(ZControl);
		ZControl.setTextureOffset(145, 63).addBox(1.75F, -0.884F, -2.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		ControlIncMod = new LightModelRenderer(this);
		ControlIncMod.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelBaseSlant7.addChild(ControlIncMod);
		ControlIncMod.setTextureOffset(60, 145).addBox(3.0F, -0.884F, -2.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		Panel2 = new ModelRenderer(this);
		Panel2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(Panel2);
		setRotationAngle(Panel2, 0.0F, -1.0472F, 0.0F);


		PanelBaseSlant8 = new ModelRenderer(this);
		PanelBaseSlant8.setRotationPoint(0.0F, -15.75F, -8.65F);
		Panel2.addChild(PanelBaseSlant8);
		setRotationAngle(PanelBaseSlant8, 0.5236F, 0.0F, 0.0F);
		PanelBaseSlant8.setTextureOffset(128, 66).addBox(-3.4F, -0.884F, -1.1F, 4.0F, 1.0F, 3.0F, -0.25F, false);
		PanelBaseSlant8.setTextureOffset(88, 105).addBox(-3.4F, -1.384F, 1.0F, 4.0F, 1.0F, 1.0F, -0.25F, false);
		PanelBaseSlant8.setTextureOffset(45, 144).addBox(-3.3F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(79, 142).addBox(-2.95F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(107, 144).addBox(-2.25F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(61, 142).addBox(-2.6F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(55, 145).addBox(-0.85F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(145, 57).addBox(-1.2F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(40, 144).addBox(-1.9F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(144, 98).addBox(-1.55F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(139, 143).addBox(-1.9F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(94, 144).addBox(-1.55F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(145, 39).addBox(-1.2F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(50, 145).addBox(-0.85F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(144, 34).addBox(-2.25F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(51, 142).addBox(-2.6F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(56, 142).addBox(-3.3F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(142, 60).addBox(-2.95F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(29, 145).addBox(-0.5F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(89, 144).addBox(-0.5F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(144, 69).addBox(-0.5F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(134, 142).addBox(-3.3F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(141, 132).addBox(-3.3F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(142, 3).addBox(-2.95F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(142, 17).addBox(-2.95F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(142, 20).addBox(-2.6F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(70, 144).addBox(-2.25F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(143, 9).addBox(-2.25F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(142, 31).addBox(-2.6F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(35, 143).addBox(-1.9F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(143, 46).addBox(-1.9F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(144, 74).addBox(-1.55F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(144, 81).addBox(-1.55F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(9, 145).addBox(-1.2F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(14, 145).addBox(-1.2F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(19, 145).addBox(-0.85F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(145, 23).addBox(-0.85F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(141, 117).addBox(-3.3F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(124, 141).addBox(-2.95F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(129, 141).addBox(-2.6F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(142, 87).addBox(-2.25F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(142, 129).addBox(-1.9F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(144, 52).addBox(-1.55F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(127, 144).addBox(-1.2F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(144, 142).addBox(-0.85F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(65, 144).addBox(-0.5F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant8.setTextureOffset(24, 145).addBox(-0.5F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(3.0F, 0.7075F, 0.6405F);
		PanelBaseSlant8.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.5236F, 0.0F, 0.0F);
		cube_r32.setTextureOffset(32, 70).addBox(-1.0F, -0.35F, -1.65F, 1.0F, 1.0F, 2.0F, 0.1F, false);

		DoorSwitch = new ModelRenderer(this);
		DoorSwitch.setRotationPoint(2.25F, -15.5634F, -8.584F);
		Panel2.addChild(DoorSwitch);
		setRotationAngle(DoorSwitch, 0.5236F, 0.0F, 0.0F);


		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.4F, 0.5209F, 0.5745F);
		DoorSwitch.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.5236F, 0.0F, 0.0F);
		cube_r33.setTextureOffset(122, 144).addBox(-1.0F, -1.95F, -1.25F, 1.0F, 1.0F, 1.0F, -0.32F, false);
		cube_r33.setTextureOffset(141, 101).addBox(-1.0F, -1.85F, -1.25F, 1.0F, 2.0F, 1.0F, -0.35F, false);

		DoorSwitch2 = new ModelRenderer(this);
		DoorSwitch2.setRotationPoint(2.9F, -15.5634F, -8.584F);
		Panel2.addChild(DoorSwitch2);
		setRotationAngle(DoorSwitch2, 0.5236F, 0.0F, 0.0F);


		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.4F, 0.5209F, 0.5745F);
		DoorSwitch2.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.5236F, 0.0F, 0.0F);
		cube_r34.setTextureOffset(117, 144).addBox(-1.0F, -1.95F, -1.25F, 1.0F, 1.0F, 1.0F, -0.32F, false);
		cube_r34.setTextureOffset(141, 94).addBox(-1.0F, -1.85F, -1.25F, 1.0F, 2.0F, 1.0F, -0.35F, false);

		Panel3 = new ModelRenderer(this);
		Panel3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(Panel3);
		setRotationAngle(Panel3, 0.0F, -2.0944F, 0.0F);


		PanelBaseSlant9 = new ModelRenderer(this);
		PanelBaseSlant9.setRotationPoint(0.0F, -15.75F, -8.65F);
		Panel3.addChild(PanelBaseSlant9);
		setRotationAngle(PanelBaseSlant9, 0.5236F, 0.0F, 0.0F);
		PanelBaseSlant9.setTextureOffset(26, 132).addBox(-4.25F, -0.884F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);

		Randomiser = new LightModelRenderer(this);
		Randomiser.setRotationPoint(0.0F, 15.75F, 8.65F);
		PanelBaseSlant9.addChild(Randomiser);
		Randomiser.setTextureOffset(131, 78).addBox(-4.25F, -17.034F, -10.65F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		VerticalLandType = new LightModelRenderer(this);
		VerticalLandType.setRotationPoint(0.0F, 15.75F, 8.65F);
		PanelBaseSlant9.addChild(VerticalLandType);
		VerticalLandType.setTextureOffset(74, 99).addBox(2.5F, -16.634F, -10.65F, 2.0F, 1.0F, 3.0F, -0.25F, false);

		VerticalLandTypeUp = new LightModelRenderer(this);
		VerticalLandTypeUp.setRotationPoint(0.0F, -15.75F, -8.65F);
		VerticalLandType.addChild(VerticalLandTypeUp);
		VerticalLandTypeUp.setTextureOffset(43, 3).addBox(2.5F, -1.384F, -1.0F, 2.0F, 2.0F, 2.0F, -0.55F, false);

		VerticalLandTypeDown = new LightModelRenderer(this);
		VerticalLandTypeDown.setRotationPoint(0.0F, -15.75F, -8.65F);
		VerticalLandType.addChild(VerticalLandTypeDown);
		VerticalLandTypeDown.setTextureOffset(43, 16).addBox(2.5F, -1.384F, -2.0F, 2.0F, 2.0F, 2.0F, -0.55F, false);

		ExteriorFacing = new LightModelRenderer(this);
		ExteriorFacing.setRotationPoint(0.0F, 15.75F, 8.65F);
		PanelBaseSlant9.addChild(ExteriorFacing);
		ExteriorFacing.setTextureOffset(146, 116).addBox(-2.0F, -16.334F, -6.4F, 1.0F, 1.0F, 1.0F, 0.15F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-1.5F, -16.134F, -5.9F);
		ExteriorFacing.addChild(bone15);
		setRotationAngle(bone15, 0.0F, -0.7854F, 0.0F);
		bone15.setTextureOffset(13, 132).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, -0.35F, false);

		ExteriorFacingNorth = new LightModelRenderer(this);
		ExteriorFacingNorth.setRotationPoint(0.0F, -15.75F, -8.65F);
		ExteriorFacing.addChild(ExteriorFacingNorth);
		ExteriorFacingNorth.setTextureOffset(5, 147).addBox(-2.0F, -0.934F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		ExteriorFacingEast = new LightModelRenderer(this);
		ExteriorFacingEast.setRotationPoint(0.75F, -15.75F, -9.4F);
		ExteriorFacing.addChild(ExteriorFacingEast);
		ExteriorFacingEast.setTextureOffset(137, 146).addBox(-2.0F, -0.934F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		ExteriorFacingSouth = new LightModelRenderer(this);
		ExteriorFacingSouth.setRotationPoint(0.0F, -15.75F, -10.15F);
		ExteriorFacing.addChild(ExteriorFacingSouth);
		ExteriorFacingSouth.setTextureOffset(146, 131).addBox(-2.0F, -0.934F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		ExteriorFacingWest = new LightModelRenderer(this);
		ExteriorFacingWest.setRotationPoint(-0.75F, -15.75F, -9.4F);
		ExteriorFacing.addChild(ExteriorFacingWest);
		ExteriorFacingWest.setTextureOffset(146, 125).addBox(-2.0F, -0.934F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		RandomLevers = new ModelRenderer(this);
		RandomLevers.setRotationPoint(-0.25F, 15.75F, 8.4F);
		PanelBaseSlant9.addChild(RandomLevers);
		RandomLevers.setTextureOffset(136, 63).addBox(0.1F, -16.284F, -7.15F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Lever = new ModelRenderer(this);
		Lever.setRotationPoint(0.35F, -16.234F, -6.65F);
		RandomLevers.addChild(Lever);
		Lever.setTextureOffset(74, 141).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever.setTextureOffset(146, 101).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever2 = new ModelRenderer(this);
		Lever2.setRotationPoint(0.65F, -16.234F, -6.65F);
		RandomLevers.addChild(Lever2);
		Lever2.setTextureOffset(141, 41).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever2.setTextureOffset(146, 95).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever3 = new ModelRenderer(this);
		Lever3.setRotationPoint(0.95F, -16.234F, -6.65F);
		RandomLevers.addChild(Lever3);
		Lever3.setTextureOffset(30, 141).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever3.setTextureOffset(146, 89).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever4 = new ModelRenderer(this);
		Lever4.setRotationPoint(1.25F, -16.234F, -6.65F);
		RandomLevers.addChild(Lever4);
		Lever4.setTextureOffset(25, 141).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever4.setTextureOffset(85, 146).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever6 = new ModelRenderer(this);
		Lever6.setRotationPoint(1.95F, -16.234F, -6.65F);
		RandomLevers.addChild(Lever6);
		Lever6.setTextureOffset(20, 141).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever6.setTextureOffset(146, 84).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever7 = new ModelRenderer(this);
		Lever7.setRotationPoint(2.25F, -16.234F, -6.65F);
		RandomLevers.addChild(Lever7);
		Lever7.setTextureOffset(15, 141).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever7.setTextureOffset(146, 77).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever8 = new ModelRenderer(this);
		Lever8.setRotationPoint(2.55F, -16.234F, -6.65F);
		RandomLevers.addChild(Lever8);
		Lever8.setTextureOffset(10, 141).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever8.setTextureOffset(146, 49).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever9 = new ModelRenderer(this);
		Lever9.setRotationPoint(2.85F, -16.234F, -6.65F);
		RandomLevers.addChild(Lever9);
		Lever9.setTextureOffset(140, 139).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever9.setTextureOffset(146, 42).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lights2 = new LightModelRenderer(this);
		Lights2.setRotationPoint(0.0F, 15.75F, 8.65F);
		PanelBaseSlant9.addChild(Lights2);
		Lights2.setTextureOffset(146, 5).addBox(-1.35F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Lights2.setTextureOffset(146, 5).addBox(-1.35F, -16.284F, -9.15F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Lights2.setTextureOffset(146, 5).addBox(1.6F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Lights2.setTextureOffset(146, 5).addBox(1.6F, -16.284F, -9.15F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		Lamp2 = new  EntityGlowRenderer(this);
		Lamp2.setRotationPoint(0.0F, -15.75F, -8.65F);
		Lights2.addChild(Lamp2);


		bone5 = new  EntityGlowRenderer(this);
		bone5.setRotationPoint(2.1F, -0.334F, 0.0F);
		Lamp2.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -0.7854F, 0.0F);
		bone5.setTextureOffset(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

		bone6 = new  EntityGlowRenderer(this);
		bone6.setRotationPoint(2.1F, -0.334F, -1.25F);
		Lamp2.addChild(bone6);
		setRotationAngle(bone6, 0.0F, -0.7854F, 0.0F);
		bone6.setTextureOffset(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

		bone7 = new  EntityGlowRenderer(this);
		bone7.setRotationPoint(-0.85F, -0.334F, 0.0F);
		Lamp2.addChild(bone7);
		setRotationAngle(bone7, 0.0F, -0.7854F, 0.0F);
		bone7.setTextureOffset(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		bone8 = new  EntityGlowRenderer(this);
		bone8.setRotationPoint(-0.85F, -0.334F, -1.25F);
		Lamp2.addChild(bone8);
		setRotationAngle(bone8, 0.0F, -0.7854F, 0.0F);
		bone8.setTextureOffset(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		Panel4 = new ModelRenderer(this);
		Panel4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(Panel4);
		setRotationAngle(Panel4, 0.0F, 3.1416F, 0.0F);


		PanelBaseSlant10 = new ModelRenderer(this);
		PanelBaseSlant10.setRotationPoint(0.0F, -15.75F, -8.65F);
		Panel4.addChild(PanelBaseSlant10);
		setRotationAngle(PanelBaseSlant10, 0.5236F, 0.0F, 0.0F);
		PanelBaseSlant10.setTextureOffset(112, 128).addBox(0.75F, -1.134F, -2.25F, 3.0F, 2.0F, 4.0F, -0.45F, false);

		Handbrake = new ModelRenderer(this);
		Handbrake.setRotationPoint(-2.5F, -0.3925F, -1.5425F);
		PanelBaseSlant10.addChild(Handbrake);


		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, -0.4352F, 2.419F);
		Handbrake.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.2182F, 0.0F, 0.0F);
		cube_r35.setTextureOffset(130, 13).addBox(-1.0F, -0.25F, -0.75F, 2.0F, 1.0F, 1.0F, -0.25F, false);
		cube_r35.setTextureOffset(112, 144).addBox(-0.5F, 0.0F, -0.75F, 1.0F, 1.0F, 1.0F, -0.26F, false);

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.0F, 0.85F, 1.25F);
		Handbrake.addChild(cube_r36);
		setRotationAngle(cube_r36, -0.7418F, 0.0F, 0.0F);
		cube_r36.setTextureOffset(7, 52).addBox(-0.5F, -1.3378F, -0.3814F, 1.0F, 2.0F, 1.0F, -0.26F, false);

		Throttle = new ModelRenderer(this);
		Throttle.setRotationPoint(0.0F, 15.75F, 8.65F);
		PanelBaseSlant10.addChild(Throttle);
		Throttle.setTextureOffset(61, 131).addBox(1.25F, -17.384F, -10.4F, 2.0F, 1.0F, 1.0F, -0.25F, false);
		Throttle.setTextureOffset(34, 146).addBox(1.75F, -16.884F, -10.4F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		Lights3 = new LightModelRenderer(this);
		Lights3.setRotationPoint(0.0F, 15.75F, 8.65F);
		PanelBaseSlant10.addChild(Lights3);


		Lamp3 = new  EntityGlowRenderer(this);
		Lamp3.setRotationPoint(0.0F, -15.75F, -8.65F);
		Lights3.addChild(Lamp3);


		Lights5 = new LightModelRenderer(this);
		Lights5.setRotationPoint(0.0F, 15.75F, 8.65F);
		PanelBaseSlant10.addChild(Lights5);
		Lights5.setTextureOffset(146, 5).addBox(0.15F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Lights5.setTextureOffset(146, 5).addBox(0.15F, -16.284F, -9.15F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Lights5.setTextureOffset(146, 5).addBox(1.4F, -16.284F, -7.15F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Lights5.setTextureOffset(146, 5).addBox(0.15F, -16.284F, -7.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Lamp5 = new  EntityGlowRenderer(this);
		Lamp5.setRotationPoint(0.0F, -15.75F, -8.65F);
		Lights5.addChild(Lamp5);


		bone = new  EntityGlowRenderer(this);
		bone.setRotationPoint(0.65F, -0.334F, -1.25F);
		Lamp5.addChild(bone);
		setRotationAngle(bone, 0.0F, -0.7854F, 0.0F);
		bone.setTextureOffset(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		bone2 = new  EntityGlowRenderer(this);
		bone2.setRotationPoint(0.65F, -0.334F, 0.0F);
		Lamp5.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -0.7854F, 0.0F);
		bone2.setTextureOffset(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		bone4 = new  EntityGlowRenderer(this);
		bone4.setRotationPoint(1.9F, -0.334F, 2.0F);
		Lamp5.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -0.7854F, 0.0F);
		bone4.setTextureOffset(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		bone3 = new  EntityGlowRenderer(this);
		bone3.setRotationPoint(0.65F, -0.334F, 1.25F);
		Lamp5.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -0.7854F, 0.0F);
		bone3.setTextureOffset(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		Panel6 = new ModelRenderer(this);
		Panel6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(Panel6);
		setRotationAngle(Panel6, 0.0F, 1.0472F, 0.0F);


		PanelBaseSlant11 = new ModelRenderer(this);
		PanelBaseSlant11.setRotationPoint(0.0F, -15.75F, -8.65F);
		Panel6.addChild(PanelBaseSlant11);
		setRotationAngle(PanelBaseSlant11, 0.5236F, 0.0F, 0.0F);
		PanelBaseSlant11.setTextureOffset(0, 132).addBox(-1.5F, -0.784F, -2.25F, 3.0F, 1.0F, 3.0F, -0.25F, false);
		PanelBaseSlant11.setTextureOffset(70, 50).addBox(-2.0F, -0.684F, 1.55F, 4.0F, 1.0F, 3.0F, -0.25F, false);
		PanelBaseSlant11.setTextureOffset(134, 123).addBox(-2.0F, -0.884F, 3.55F, 4.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(131, 39).addBox(-2.0F, -0.884F, 1.55F, 4.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(130, 95).addBox(-2.0F, -0.884F, 2.05F, 4.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(134, 13).addBox(-2.0F, -0.884F, 1.55F, 1.0F, 1.0F, 3.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(101, 26).addBox(1.0F, -0.884F, 1.55F, 1.0F, 1.0F, 3.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(148, 8).addBox(-1.0F, -0.884F, 3.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(147, 147).addBox(0.0F, -0.884F, 3.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(148, 8).addBox(-1.0F, -0.884F, 1.8F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(147, 147).addBox(0.0F, -0.884F, 1.8F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(10, 148).addBox(-1.2F, -0.884F, 2.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(123, 147).addBox(0.2F, -0.884F, 2.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(118, 147).addBox(-0.2F, -0.884F, 2.8F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(113, 147).addBox(-0.8F, -0.884F, 2.8F, 1.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(99, 117).addBox(-2.0F, -0.884F, 2.55F, 4.0F, 1.0F, 1.0F, -0.35F, false);
		PanelBaseSlant11.setTextureOffset(113, 0).addBox(-2.0F, -0.884F, 3.05F, 4.0F, 1.0F, 1.0F, -0.35F, false);

		FastReturn = new LightModelRenderer(this);
		FastReturn.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelBaseSlant11.addChild(FastReturn);
		FastReturn.setTextureOffset(131, 42).addBox(-1.5F, -1.084F, -2.25F, 3.0F, 1.0F, 3.0F, -0.35F, false);

		Lights4 = new LightModelRenderer(this);
		Lights4.setRotationPoint(0.0F, 15.75F, 8.65F);
		PanelBaseSlant11.addChild(Lights4);
		Lights4.setTextureOffset(146, 5).addBox(-2.6F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Lights4.setTextureOffset(146, 5).addBox(-2.6F, -16.284F, -7.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Lights4.setTextureOffset(146, 5).addBox(1.6F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Lights4.setTextureOffset(146, 5).addBox(1.6F, -16.284F, -7.9F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		Lamp4 = new LightModelRenderer(this);
		Lamp4.setRotationPoint(0.0F, -15.75F, -8.65F);
		Lights4.addChild(Lamp4);


		bone13 = new  EntityGlowRenderer(this);
		bone13.setRotationPoint(-2.1F, -0.334F, 1.25F);
		Lamp4.addChild(bone13);
		setRotationAngle(bone13, 0.0F, -0.7854F, 0.0F);
		bone13.setTextureOffset(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		bone14 = new  EntityGlowRenderer(this);
		bone14.setRotationPoint(-2.1F, -0.334F, -1.25F);
		Lamp4.addChild(bone14);
		setRotationAngle(bone14, 0.0F, -0.7854F, 0.0F);
		bone14.setTextureOffset(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		bone12 = new  EntityGlowRenderer(this);
		bone12.setRotationPoint(2.1F, -0.334F, 1.25F);
		Lamp4.addChild(bone12);
		setRotationAngle(bone12, 0.0F, -0.7854F, 0.0F);
		bone12.setTextureOffset(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

		bone11 = new  EntityGlowRenderer(this);
		bone11.setRotationPoint(2.1F, -0.334F, -1.25F);
		Lamp4.addChild(bone11);
		setRotationAngle(bone11, 0.0F, -0.7854F, 0.0F);
		bone11.setTextureOffset(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

		RandomLevers2 = new ModelRenderer(this);
		RandomLevers2.setRotationPoint(-1.6F, 15.75F, 7.9F);
		PanelBaseSlant11.addChild(RandomLevers2);
		RandomLevers2.setTextureOffset(109, 123).addBox(0.1F, -16.284F, -7.15F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Lever5 = new ModelRenderer(this);
		Lever5.setRotationPoint(0.35F, -16.234F, -6.65F);
		RandomLevers2.addChild(Lever5);
		Lever5.setTextureOffset(90, 140).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever5.setTextureOffset(146, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever10 = new ModelRenderer(this);
		Lever10.setRotationPoint(0.65F, -16.234F, -6.65F);
		RandomLevers2.addChild(Lever10);
		Lever10.setTextureOffset(140, 71).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever10.setTextureOffset(0, 146).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever11 = new ModelRenderer(this);
		Lever11.setRotationPoint(0.95F, -16.234F, -6.65F);
		RandomLevers2.addChild(Lever11);
		Lever11.setTextureOffset(129, 71).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever11.setTextureOffset(143, 145).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever12 = new ModelRenderer(this);
		Lever12.setRotationPoint(1.25F, -16.234F, -6.65F);
		RandomLevers2.addChild(Lever12);
		Lever12.setTextureOffset(50, 129).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever12.setTextureOffset(145, 137).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever13 = new ModelRenderer(this);
		Lever13.setRotationPoint(1.95F, -16.234F, -6.65F);
		RandomLevers2.addChild(Lever13);
		Lever13.setTextureOffset(83, 126).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever13.setTextureOffset(145, 134).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever14 = new ModelRenderer(this);
		Lever14.setRotationPoint(2.25F, -16.234F, -6.65F);
		RandomLevers2.addChild(Lever14);
		Lever14.setTextureOffset(66, 93).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever14.setTextureOffset(132, 145).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever15 = new ModelRenderer(this);
		Lever15.setRotationPoint(2.55F, -16.234F, -6.65F);
		RandomLevers2.addChild(Lever15);
		Lever15.setTextureOffset(37, 84).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever15.setTextureOffset(145, 122).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

		Lever16 = new ModelRenderer(this);
		Lever16.setRotationPoint(2.85F, -16.234F, -6.65F);
		RandomLevers2.addChild(Lever16);
		Lever16.setTextureOffset(24, 55).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		Lever16.setTextureOffset(145, 119).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);
	}


	@Override
	public void setRotationAngles(Entity entity, float v, float v1, float v2, float v3, float v4) {

	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

	}


	public void render(ValeConsoleTile tile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {
		//TODO Find out wtf this below is
		//WorldText text = new WorldText(0.22F, 0.15F, 0.002F, 0xFFFFFF);
		//text.renderMonitor(Helper.getConsoleText(tile));
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void render(BrackolinConsoleTile tile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {

		tile.getControl(LandingTypeControl.class).ifPresent(landingTypeControl -> {
			if (landingTypeControl.getLandType() == LandingTypeControl.EnumLandType.DOWN) {
				this.VerticalLandTypeDown.setBright(1);
				this.VerticalLandTypeUp.setBright(0);
			} else {
				this.VerticalLandTypeDown.setBright(0);
				this.VerticalLandTypeUp.setBright(1);
			}
		});

		tile.getControl(XControl.class).ifPresent(x -> {
			this.XControl.setBright(x.getAnimationTicks() != 0 ? 1F : 0F);
		});

		tile.getControl(YControl.class).ifPresent(y -> {
			this.YControl.setBright(y.getAnimationTicks() != 0 ? 1F : 0F);
		});

		tile.getControl(ZControl.class).ifPresent(z -> {
			this.ZControl.setBright(z.getAnimationTicks() != 0 ? 1F : 0F);
		});

		tile.getControl(IncModControl.class).ifPresent(incModControl -> {
			this.ControlIncMod.setBright(incModControl.getAnimationTicks() != 0 ? 1F : 0F);
		});

		tile.getControl(HandbrakeControl.class).ifPresent(control -> {
			this.Handbrake.rotateAngleX = (float) Math.toRadians(control.isFree() ? -12 : 35);
		});


		//this.ExteriorFacingNorth.rotateAngleY = (float) Math.toRadians(WorldHelper.getAngleFromFacing(tile.getExteriorFacingDirection()));
		tile.getControl(FacingControl.class).ifPresent(facingControl -> {
			if (tile.getExteriorFacingDirection() == Direction.NORTH) {
				this.ExteriorFacingNorth.setBright(2);
				this.ExteriorFacingEast.setBright(1);
				this.ExteriorFacingSouth.setBright(1);
				this.ExteriorFacingWest.setBright(1);
			} else if (tile.getExteriorFacingDirection() == Direction.EAST) {
				this.ExteriorFacingNorth.setBright(1);
				this.ExteriorFacingEast.setBright(2);
				this.ExteriorFacingSouth.setBright(1);
				this.ExteriorFacingWest.setBright(1);
			} else if (tile.getExteriorFacingDirection() == Direction.SOUTH) {
				this.ExteriorFacingNorth.setBright(1);
				this.ExteriorFacingEast.setBright(1);
				this.ExteriorFacingSouth.setBright(2);
				this.ExteriorFacingWest.setBright(1);
			}
			else {
				this.ExteriorFacingNorth.setBright(1);
				this.ExteriorFacingEast.setBright(1);
				this.ExteriorFacingSouth.setBright(1);
				this.ExteriorFacingWest.setBright(2);
			}
		});



		this.TimeRotor.rotateAngleY = (float)Math.toRadians((double)(tile.flightTicks * -3 % 360));
		this.TimeRotor.rotationPointY = - (float)Math.cos((double)tile.flightTicks * 0.1D) * 2F;


		tile.getControl(RandomiserControl.class).ifPresent(randomiserControl -> {
			this.Randomiser.setBright(randomiserControl.getAnimationTicks() != 0 ? 1F: 0F);
		});



		tile.getControl(ThrottleControl.class).ifPresent(throttleControl -> {
			this.Throttle.rotationPointZ = (float)Math.toRadians(525 + (throttleControl.getAmount()) * 100);
			this.Throttle.rotationPointY = (float)Math.abs((float)-15.3) ;
			this.Throttle.rotateAngleX = (float)Math.toRadians(1);
		});

		tile.getDoor().ifPresent((door) -> {
			this.DoorSwitch.rotateAngleX = (float)Math.toRadians(door.getOpenState() == EnumDoorState.CLOSED ? 0 : 60);
			this.DoorSwitch2.rotateAngleX = (float)Math.toRadians(door.getOpenState() == EnumDoorState.CLOSED ? 60 : 0);
		});

		tile.getControl(FastReturnControl.class).ifPresent(fastReturnControl -> {
			this.FastReturn.setBright(fastReturnControl.getAnimationTicks() != 0 ? 2F: 1F);
		});

		tile.getSubsystem(StabilizerSubsystem.class).ifPresent((sys) -> {
				this.Lever.rotateAngleX = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
				this.Lever2.rotateAngleX = (float) Math.toRadians(sys.isActivated() ? -45 : 45);
				this.Lever3.rotateAngleX = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
				this.Lever4.rotateAngleX = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
				this.Lever5.rotateAngleX = (float) Math.toRadians(sys.isActivated() ? -45 : 45);
				this.Lever6.rotateAngleX = (float) Math.toRadians(sys.isActivated() ? -45 : 45);
				this.Lever7.rotateAngleX = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
				this.Lever8.rotateAngleX = (float) Math.toRadians(sys.isActivated() ? -45 : 45);
				this.Lever9.rotateAngleX = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
			});

		this.Lever10.rotateAngleX = (float) Math.toRadians( 45);
		this.Lever11.rotateAngleX = (float) Math.toRadians( 45);
		this.Lever12.rotateAngleX = (float) Math.toRadians(-45);
		this.Lever13.rotateAngleX = (float) Math.toRadians( 45);
		this.Lever14.rotateAngleX = (float) Math.toRadians(-45);
		this.Lever15.rotateAngleX = (float) Math.toRadians( 45);
		this.Lever16.rotateAngleX = (float) Math.toRadians(-45);
		matrixStack.push();
		this.Lights2.render(matrixStack, iVertexBuilder,i,i1);
		this.Lights3.render(matrixStack, iVertexBuilder,i,i1);
		this.Lights4.render(matrixStack, iVertexBuilder,i,i1);
		this.Lights5.render(matrixStack, iVertexBuilder,i,i1);
		matrixStack.pop();
		matrixStack.push();
		matrixStack.scale(0.95F,0.95F,0.95F);
		matrixStack.translate(0.0685F,0.275F,-0.07F);
		Console.render(matrixStack, iVertexBuilder,i,i1);
		Controls.render(matrixStack,iVertexBuilder,i,i1);
		matrixStack.pop();
	}

}