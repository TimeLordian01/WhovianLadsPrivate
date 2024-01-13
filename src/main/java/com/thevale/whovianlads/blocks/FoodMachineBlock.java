package com.thevale.whovianlads.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.properties.Prop;

public class FoodMachineBlock extends HorizontalBlock {
    public static final DirectionProperty FACING;
    public static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape FM_EAST_AABB;
    protected static final VoxelShape FM_WEST_AABB;
    protected static final VoxelShape FM_SOUTH_AABB;
    protected static final VoxelShape FM_NORTH_AABB;
    public static final DirectionProperty HORIZONTAL_FACING = BlockStateProperties.HORIZONTAL_FACING;
    public FoodMachineBlock(Properties properties) {
        super(Prop.Blocks.BASIC_TECH.get());
    }

    public VoxelShape getShape(BlockState blockState, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        switch ((Direction)blockState.get(FACING)) {
            case NORTH:
                return FM_NORTH_AABB;
            case SOUTH:
                return FM_SOUTH_AABB;
            case WEST:
                return FM_WEST_AABB;
            case EAST:
            default:
                return FM_EAST_AABB;
        }
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.HORIZONTAL_FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    public BlockState rotate(BlockState blockState, Rotation rotation) {
        return (BlockState)blockState.with(FACING, rotation.rotate((Direction)blockState.get(FACING)));
    }

    public BlockState mirror(BlockState blockState, Mirror mirror) {
        return blockState.rotate(mirror.toRotation((Direction)blockState.get(FACING)));
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (player.isCrouching()) {
            player.addItemStackToInventory(new ItemStack(Items.COOKED_BEEF, 16));
        }
        else  {
            player.addItemStackToInventory(new ItemStack(Items.COOKED_BEEF, 1));
        }
        return ActionResultType.SUCCESS;
    }

    public PushReaction getPushReaction(BlockState p_149656_1_) {
        return PushReaction.DESTROY;
    }

    static {
        FACING = HorizontalBlock.HORIZONTAL_FACING;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        FM_NORTH_AABB = Block.makeCuboidShape(3, 0.0, 3.5, 13.0, 23.0, 12.0);
        FM_WEST_AABB = Block.makeCuboidShape(3.5, 0.0, 3, 12.0, 23.0, 13.0);
        FM_SOUTH_AABB = Block.makeCuboidShape(3, 0.0, 3.5, 13.0, 23.0, 12.0);
        FM_EAST_AABB = Block.makeCuboidShape(3.5, 0.0, 3, 12.0, 23.0, 13.0);
    }
}