package com.thevale.whovianlads.blocks;

import com.thevale.whovianlads.util.WhovianLadsItemGroup;
import com.thevale.whovianlads.whovianlads;
import com.thevale.whovianlads.items.ValeItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tardis.mod.blocks.*;
import net.tardis.mod.blocks.exteriors.ExteriorBlock;
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
            () -> setUpBlock(new FoodMachineBlock(AbstractBlock.Properties.create(Material.ANVIL).variableOpacity())));

    public static RegistryObject<Block> structure_panel_old = register("structure_panel_old",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)));

   public static RegistryObject<Block> structure_spawn_old = register("structure_spawn_old",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));

   public static RegistryObject<Block> structure_remove_old = register("structure_remove_old",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)));

    public static RegistryObject<Block> structure_panel_open_old = register("structure_panel_open_old",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)));

    public static RegistryObject<SlabBlock> megalos_slab = register("megalos_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .notSolid()));

    public static RegistryObject<Block> megalos_block = register("megalos",
            () -> new BasicBlock(AbstractBlock.Properties.create(Material.WOOD)));

    public static RegistryObject<Block> megalos_floor = register("megalos_floor",
            () -> new BasicBlock(AbstractBlock.Properties.create(Material.WOOD)));

    public static RegistryObject<Block> megalos_white_full_roundel = register("megalos_white_full_roundel",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_white_half_roundel = register("megalos_white_half_roundel",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_white_half_roundel_bottom_edge = register("megalos_white_half_roundel_bottom_edge",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));
    public static RegistryObject<Block> megalos_white_half_roundel_top_edge = register("megalos_white_half_roundel_top_edge",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_white_half_roundel_top = register("megalos_white_half_roundel_top",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_white_half_roundel_bottom = register("megalos_white_half_roundel_bottom",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_pillar = register("megalos_pillar",
            () -> new BasicBlock(AbstractBlock.Properties.create(Material.IRON)));

    public static RegistryObject<Block> megalos__full_rouundel = register("megalos_full_roundel",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_half_roundel = register("megalos_half_roundel",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_half_roundel_bottom_edge = register("megalos_half_roundel_bottom_edge",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_half_roundel_top_edge = register("megalos_half_roundel_top_edge",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_pillar_top = register("megalos_pillar_top",
            () -> new BasicBlock(AbstractBlock.Properties.create(Material.IRON)));



    public static RegistryObject<Block> toyota_lower_hexagon_full = register("toyota_lower_hexagon_full",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_lower_hexagon_full_lit = register("toyota_lower_hexagon_full_lit",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));
    public static RegistryObject<Block> toyota_lower_hexagon_left = register("toyota_lower_hexagon_left",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_lower_hexagon_left_blank = register("toyota_lower_hexagon_left_blank",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_lower_hexagon_left_lit = register("toyota_lower_hexagon_left_lit",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));
    public static RegistryObject<Block> toyota_lower_hexagon_right = register("toyota_lower_hexagon_right",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_lower_hexagon_right_blank = register("toyota_lower_hexagon_right_blank",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_lower_hexagon_right_lit = register("toyota_lower_hexagon_right_lit",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));
    public static RegistryObject<Block> toyota_lower_lightstrip = register("toyota_lower_lightstrip",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_lower_lightstrip_blank = register("toyota_lower_lightstrip_blank",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_lower_lightstrip_lit = register("toyota_lower_lightstrip_lit",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));
    public static RegistryObject<Block> toyota_platform_block = register("toyota_platform_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_platform_edge = register("toyota_platform_edge",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_roof = register("toyota_roof",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_roof_roundel = register("toyota_roof_roundel",
            () -> new RoundelBlock(AbstractBlock.Properties.create(Material.IRON), SoundType.METAL,1,1));
    public static RegistryObject<Block> toyota_upper_divider = register("toyota_upper_divider",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static final RegistryObject<RedstoneLampBlock> toyota_upper_light_emergency = register("toyota_upper_light_emergency",
            () -> new RedstoneLampBlock(AbstractBlock.Properties.create(Material.GLASS)));
    public static final RegistryObject<RedstoneLampBlock> toyota_upper_light = register("toyota_upper_light",
            () -> new RedstoneLampBlock(AbstractBlock.Properties.create(Material.GLASS)));
    public static RegistryObject<Block> toyota_upper_wall_pattern_bottom_left = register("toyota_upper_wall_pattern_bottom_left",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_upper_wall_pattern_bottom_middle = register("toyota_upper_wall_pattern_bottom_middle",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_upper_wall_pattern_bottom_right = register("toyota_upper_wall_pattern_bottom_right",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_upper_wall_pattern_top_left = register("toyota_upper_wall_pattern_top_left",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_upper_wall_pattern_top_middle = register("toyota_upper_wall_pattern_top_middle",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));
    public static RegistryObject<Block> toyota_upper_wall_pattern_top_right = register("toyota_upper_wall_pattern_top_right",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));

    /**public static RegistryObject<Block> brach_doors = register("brach_doors",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)));**/















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