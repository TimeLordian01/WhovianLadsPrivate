package com.thevale.whovianlads.registry;

import com.thevale.whovianlads.whovianlads;
import com.thevale.whovianlads.blocks.ValeBlocks;
import com.thevale.whovianlads.client.models.interiordoors.*;
import com.thevale.whovianlads.client.renders.consoles.CoralConsoleRender;
import com.thevale.whovianlads.client.renders.consoles.SmithConsoleRender;
import com.thevale.whovianlads.client.renders.consoles.ValeConsoleRender;
import com.thevale.whovianlads.client.renders.exteriors.*;
import com.thevale.whovianlads.tileentities.*;
import com.thevale.whovianlads.util.EnumDoorTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = whovianlads.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ValeModelRegistry {
    @SubscribeEvent
    public static void Register(FMLClientSetupEvent event) {
        // Render Stuff
        event.enqueueWork(() -> {
            //Consoles
            RenderTypeLookup.setRenderLayer(ValeBlocks.console_vale.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.console_smith.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.console_coral2.get(), RenderType.getTranslucent());
            //Exteriors
            RenderTypeLookup.setRenderLayer(ValeBlocks.exterior_wardrobe.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.exterior_streetside.get(), RenderType.getTranslucent());
                });

        //ClientRegistry
        //Exteriors
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_wardrobe.get(), WardrobeRender::new);
            EnumDoorTypes.WARDROBE.setInteriorDoorModel(new WardrobeInteriorDoor());
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_streetside.get(), StreetsideRender::new);
            EnumDoorTypes.STREETSIDE.setInteriorDoorModel(new StreetsideInteriorDoor());
        //Consoles
        ClientRegistry.bindTileEntityRenderer(ValeTiles.console_vale.get(), ValeConsoleRender::new);
        ClientRegistry.bindTileEntityRenderer(ValeTiles.console_coral2.get(), CoralConsoleRender::new);
        ClientRegistry.bindTileEntityRenderer(ValeTiles.console_smith.get(), SmithConsoleRender::new);
    }

}
