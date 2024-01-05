package com.thevale.whovianlads.texturevariants;

import com.thevale.whovianlads.whovianlads;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.Tardis;
import net.tardis.mod.helper.Helper;
import net.tardis.mod.misc.TexVariant;

public class ConsoleTextureVariants {

    public static final TexVariant[] VALE = {
            new TexVariant(new ResourceLocation(whovianlads.MODID, "textures/consoles/valeconsole.png"), "tardis.consoles.common.normal"),
            new TexVariant(new ResourceLocation(whovianlads.MODID, "textures/consoles/valeconsole2.png"), "console.vale.purple"),
    };
}
