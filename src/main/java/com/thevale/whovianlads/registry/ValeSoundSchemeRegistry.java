package com.thevale.whovianlads.registry;

import com.thevale.whovianlads.sounds.SoundSchemeVale;
import net.minecraftforge.fml.RegistryObject;
import net.tardis.mod.sounds.AbstractSoundScheme;

import static net.tardis.mod.registries.SoundSchemeRegistry.SOUND_SCHEMES;

public class ValeSoundSchemeRegistry {
    public static final RegistryObject<AbstractSoundScheme> VALE = SOUND_SCHEMES.register("vale", ()-> new SoundSchemeVale());
}
