package com.thevale.whovianlads.registry;

import com.thevale.whovianlads.whovianlads;
import com.thevale.whovianlads.blocks.ValeBlocks;
import com.thevale.whovianlads.consoles.VConsoles;
import com.thevale.whovianlads.texturevariants.TextureVariants;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.misc.Console;

public class ValeConsoleRegistry {
    public static final DeferredRegister<Console> CONSOLES = DeferredRegister.create(Console.class, whovianlads.MODID);

    public static final RegistryObject<VConsoles> SMITH = CONSOLES.register("smith",
            () -> new VConsoles(() -> ValeBlocks.console_smith.get().getDefaultState(), "smithconsole"));
    public static final RegistryObject<VConsoles> CORAL2 = CONSOLES.register("coral2",
            () -> new VConsoles(() -> ValeBlocks.console_coral2.get().getDefaultState(), "coralconsole"));
    public static final RegistryObject<VConsoles> VALE = CONSOLES.register("vale",
            () -> new VConsoles(() -> ValeBlocks.console_vale.get().getDefaultState(), "valeconsole"));
}