package com.thevale.whovianlads.blocks;

import com.thevale.whovianlads.client.models.blocks.FoodMachine;
import com.thevale.whovianlads.util.WhovianLadsItemGroup;
import com.thevale.whovianlads.whovianlads;
import com.thevale.whovianlads.items.ValeItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tardis.mod.blocks.ArsEggBlock;
import net.tardis.mod.blocks.ArtronCollectorBlock;
import net.tardis.mod.blocks.TileBlock;
import net.tardis.mod.blocks.exteriors.ExteriorBlock;
import net.tardis.mod.blocks.template.NotSolidTileBlock;
import net.tardis.mod.itemgroups.TItemGroups;
import org.lwjgl.system.CallbackI;


import java.util.function.Supplier;

public class ValeBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, whovianlads.MODID);

    //Exteriors
    public static RegistryObject<Block> exterior_wardrobe = register("exterior_wardrobe",
            () -> setUpBlock(new ExteriorBlock()), false);
    public static RegistryObject<Block> exterior_brackolin = register("exterior_brackolin",
            () -> setUpBlock(new ExteriorBlock()), false);
    public static RegistryObject<Block> exterior_rani = register("exterior_rani",
            () -> setUpBlock(new ExteriorBlock()), false);
    public static RegistryObject<Block> exterior_olwarrior = register("exterior_olwarrior",
            () -> setUpBlock(new ExteriorBlock()), false);
    public static RegistryObject<Block> exterior_bluedoctor = register("exterior_bluedoctor",
            () -> setUpBlock(new ExteriorBlock()), false);






    //Consoles
    public static RegistryObject<Block> console_vale = register("console_vale",
            () -> setUpBlock(new VConsoleBlock()), false);
    public static RegistryObject<Block> console_smith = register("console_smith",
            () -> setUpBlock(new VConsoleBlock()), false);
    public static RegistryObject<Block> console_brackolin = register("console_brackolin",
            () -> setUpBlock(new VConsoleBlock()), false);







    //Blocks
    //1.12 Port
    public static RegistryObject<Block> ars_egg_old = register("ars_egg_old",
            () -> setUpBlock(new ArsEggBlock()), true);
    public static RegistryObject<Block> artron_bank_old = register("artron_bank_old",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ANVIL)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .notSolid()
            ));
    public static RegistryObject<Block> foodmachine_old = register("foodmachine_old",
            () -> setUpBlock(new FoodMachine(AbstractBlock.Properties.create(Material.ANVIL))),true);






    private static Block setUpBlock(Block block) {
        return block;
    }

    public static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier, ItemGroup itemGroup) {
        RegistryObject<T> registryObject = BLOCKS.register(id, blockSupplier);
        ValeItems.ITEMS.register(id, () -> new BlockItem(registryObject.get(), (new Item.Properties()).group(WhovianLadsItemGroup.WHOVIANREST)));
        return registryObject;
    }

    public static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier) {
        RegistryObject<T> registryObject = BLOCKS.register(id, blockSupplier);
        ValeItems.ITEMS.register(id, () -> new BlockItem(registryObject.get(), (new Item.Properties()).group(WhovianLadsItemGroup.WHOVIANREST)));
        return registryObject;
    }

    public static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier, boolean hasItem) {
        RegistryObject<T> registryObject = BLOCKS.register(id, blockSupplier);
        if (hasItem) {
            ValeItems.ITEMS.register(id, () -> new BlockItem(registryObject.get(), new Item.Properties().group(WhovianLadsItemGroup.WHOVIANREST)));
        }

        return registryObject;
    }
}