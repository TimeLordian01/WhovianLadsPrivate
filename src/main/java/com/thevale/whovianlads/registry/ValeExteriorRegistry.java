package com.thevale.whovianlads.registry;

import com.thevale.whovianlads.util.EnumDoorTypes;
import com.thevale.whovianlads.whovianlads;
import com.thevale.whovianlads.blocks.ValeBlocks;
import com.thevale.whovianlads.texturevariants.TextureVariants;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.exterior.AbstractExterior;
import net.tardis.mod.exterior.TwoBlockBasicExterior;
import net.tardis.mod.misc.DoorSounds;

public class ValeExteriorRegistry {
    public static final DeferredRegister<AbstractExterior> EXTERIORS = DeferredRegister.create(AbstractExterior.class, whovianlads.MODID);


    public static final RegistryObject<AbstractExterior> WARDROBE = EXTERIORS.register("wardrobe",
            () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_wardrobe.get().getDefaultState(),
                    true, EnumDoorTypes.WARDROBE, DoorSounds.WOOD,
                    new ResourceLocation(whovianlads.MODID, "textures/gui/exteriors/wardrobeexterior.png"), TextureVariants.WARDROBE));
    public static final RegistryObject<AbstractExterior> STREETSIDE = EXTERIORS.register("streetside",
            () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_streetside.get().getDefaultState(),
                    true, EnumDoorTypes.STREETSIDE, DoorSounds.WOOD,
                    new ResourceLocation(whovianlads.MODID, "textures/gui/exteriors/streetsideexterior.png")));

    public static final RegistryObject<AbstractExterior> BRACKOLIN = EXTERIORS.register("brackolin",
            () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_brackolin.get().getDefaultState(),
                    true, EnumDoorTypes.BRACKOLIN, DoorSounds.WOOD,
                    new ResourceLocation(whovianlads.MODID, "textures/gui/exteriors/brackolin.png")));

    public static final RegistryObject<AbstractExterior> RANI_NET = EXTERIORS.register("rani",
            () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_rani.get().getDefaultState(),
                    true, EnumDoorTypes.RANI, DoorSounds.WOOD,
                    new ResourceLocation(whovianlads.MODID, "textures/gui/exteriors/rani.png")));



}
