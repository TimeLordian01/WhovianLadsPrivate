package com.thevale.whovianlads.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.tardis.mod.blocks.TileBlock;
import net.tardis.mod.misc.IDontBreak;

public class VConsoleBlock extends TileBlock implements IDontBreak {
    public VConsoleBlock() {
        super(Block.Properties.create(Material.BARRIER).variableOpacity().hardnessAndResistance(99999F, 99999F));
    }
}
