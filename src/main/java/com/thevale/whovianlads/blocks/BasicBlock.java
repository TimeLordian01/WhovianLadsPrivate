package com.thevale.whovianlads.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BasicBlock extends Block {
    public BasicBlock(Properties properties) {
        super(AbstractBlock.Properties.create(Material.WOOD)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(1,1));
    }
}
