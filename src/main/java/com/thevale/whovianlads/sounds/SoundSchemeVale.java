package com.thevale.whovianlads.sounds;

import net.tardis.mod.sounds.SoundSchemeBase;

public class SoundSchemeVale extends SoundSchemeBase {

    public SoundSchemeVale() {
        super(
                () -> ValeSounds.VALE_TARDIS_TAKEOFF.get(),
                () -> ValeSounds.VALE_TARDIS_LANDING.get(),
                () -> ValeSounds.VALE_TARDIS_FLIGHTLOOP.get());
    }

    @Override
    public int getLandTime() {
        return 400;
    }

    @Override
    public int getTakeoffTime() {
        return 360;
    }

}
