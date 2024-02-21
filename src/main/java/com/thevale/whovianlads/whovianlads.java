package com.thevale.whovianlads;

import com.thevale.whovianlads.blocks.ValeBlocks;
import com.thevale.whovianlads.items.ValeItems;
import com.thevale.whovianlads.registry.ValeConsoleRegistry;
import com.thevale.whovianlads.registry.ValeExteriorRegistry;
import com.thevale.whovianlads.sounds.ValeSounds;
import com.thevale.whovianlads.tileentities.ValeTiles;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(whovianlads.MODID)
public class whovianlads {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "whovianlads";
    public whovianlads() {
               // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        ValeItems.ITEMS.register(modBus);
        ValeBlocks.BLOCKS.register(modBus);
        ValeConsoleRegistry.CONSOLES.register(modBus);
        ValeTiles.TILES.register(modBus);
        ValeExteriorRegistry.EXTERIORS.register(modBus);
        ValeSounds.SOUND_EVENTS.register(modBus);
    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
        }
    }
}
