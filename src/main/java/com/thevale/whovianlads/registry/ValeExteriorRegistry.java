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
    public static final RegistryObject<AbstractExterior> BRACKOLIN = EXTERIORS.register("brackolin",
            () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_brackolin.get().getDefaultState(),
                    true, EnumDoorTypes.BRACKOLIN, DoorSounds.WOOD,
                    new ResourceLocation(whovianlads.MODID, "textures/gui/exteriors/brackolinexterior.png")));

    public static final RegistryObject<AbstractExterior> RANI_NET = EXTERIORS.register("rani",
            () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_rani.get().getDefaultState(),
                    true, EnumDoorTypes.RANI, DoorSounds.WOOD,
                    new ResourceLocation(whovianlads.MODID, "textures/gui/exteriors/raniexterior.png")));

    public static final RegistryObject<AbstractExterior> OLWARRIOR = EXTERIORS.register("olwarrior",
            () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_olwarrior.get().getDefaultState(),
                    true, EnumDoorTypes.OLWARRIOR, DoorSounds.WOOD,
                    new ResourceLocation(whovianlads.MODID, "textures/gui/exteriors/olwarriorexterior.png")));

    public static final RegistryObject<AbstractExterior> BLUEDOCTOR = EXTERIORS.register("bluedoctor",
            () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_bluedoctor.get().getDefaultState(),
                    true, EnumDoorTypes.BLUEDOCTOR, DoorSounds.WOOD,
                    new ResourceLocation(whovianlads.MODID, "textures/gui/exteriors/bluedoctorexterior.png")));

}
