package com.thevale.whovianlads.registry;

import com.thevale.whovianlads.sounds.SoundSchemeVale;
import com.thevale.whovianlads.whovianlads;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.registries.SoundSchemeRegistry;
import net.tardis.mod.sounds.AbstractSoundScheme;

public class ValeSoundSchemeRegistry extends SoundSchemeRegistry {

    public static final DeferredRegister<AbstractSoundScheme> SOUND_SCHEMES = DeferredRegister.create(AbstractSoundScheme.class, whovianlads.MODID);

    public static final RegistryObject<AbstractSoundScheme> VALE = SOUND_SCHEMES.register("valeyard", () -> new SoundSchemeVale());
}