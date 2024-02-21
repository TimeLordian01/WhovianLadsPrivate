package com.thevale.whovianlads.registry;

import com.thevale.whovianlads.sounds.SoundSchemeVale;
import net.minecraftforge.fml.RegistryObject;
import net.tardis.mod.registries.SoundSchemeRegistry;
import net.tardis.mod.sounds.AbstractSoundScheme;

public class ValeSoundSchemeRegistry extends SoundSchemeRegistry {
    public static final RegistryObject<AbstractSoundScheme> VALE = SOUND_SCHEMES.register("vale", ()-> new SoundSchemeVale());
}
