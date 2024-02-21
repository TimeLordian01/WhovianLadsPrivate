package com.thevale.whovianlads.sounds;

import com.thevale.whovianlads.whovianlads;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ValeSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, whovianlads.MODID);


    public static final RegistryObject<SoundEvent> VALE_TARDIS_LANDING= registerSoundEvent("vale_tardis_landing");
    public static final RegistryObject<SoundEvent> VALE_TARDIS_TAKEOFF= registerSoundEvent("vale_tardis_takeoff");
    public static final RegistryObject<SoundEvent> VALE_TARDIS_FLIGHTLOOP= registerSoundEvent("vale_tardis_flightloop");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, ()-> new SoundEvent(new ResourceLocation(whovianlads.MODID, name)));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
