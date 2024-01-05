package com.thevale.whovianlads.blocks;

import com.thevale.whovianlads.whovianlads;
import com.thevale.whovianlads.items.ValeItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tardis.mod.blocks.exteriors.ExteriorBlock;
import net.tardis.mod.itemgroups.TItemGroups;


import java.util.function.Supplier;

public class ValeBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, whovianlads.MODID);

    //Exteriors
    public static RegistryObject<Block> exterior_wardrobe = register("exterior_wardrobe", () -> setUpBlock(new ExteriorBlock()), false);
    public static RegistryObject<Block> exterior_streetside = register("exterior_streetside", () -> setUpBlock(new ExteriorBlock()), false);
    //Consoles
    public static RegistryObject<Block> console_vale = register("console_vale", () -> setUpBlock(new VConsoleBlock()), false);
    public static RegistryObject<Block> console_coral2 = register("console_coral2", () -> setUpBlock(new VConsoleBlock()), false);
    public static RegistryObject<Block> console_smith = register("console_smith", () -> setUpBlock(new VConsoleBlock()), false);
    public static RegistryObject<Block> console_newcoral = register("console_newcoral", () -> setUpBlock(new VConsoleBlock()), false);


    private static Block setUpBlock(Block block) {
        return block;
    }

    public static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier, ItemGroup itemGroup) {
        RegistryObject<T> registryObject = BLOCKS.register(id, blockSupplier);
        ValeItems.ITEMS.register(id, () -> new BlockItem(registryObject.get(), (new Item.Properties()).group(itemGroup)));
        return registryObject;
    }

    public static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier) {
        RegistryObject<T> registryObject = BLOCKS.register(id, blockSupplier);
        ValeItems.ITEMS.register(id, () -> new BlockItem(registryObject.get(), (new Item.Properties()).group(TItemGroups.FUTURE)));
        return registryObject;
    }

    public static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier, boolean hasItem) {
        RegistryObject<T> registryObject = BLOCKS.register(id, blockSupplier);
        if (hasItem) {
            ValeItems.ITEMS.register(id, () -> new BlockItem(registryObject.get(),new Item.Properties().group(TItemGroups.FUTURE)));
        }

        return registryObject;
    }
}