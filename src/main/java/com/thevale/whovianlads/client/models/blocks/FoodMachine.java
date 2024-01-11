package com.thevale.whovianlads.client.models.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.tardis.mod.properties.Prop;

import javax.annotation.Nullable;

public class FoodMachine extends Block {
    public static final DirectionProperty FACING;
    public static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape FM_EAST_AABB;
    protected static final VoxelShape FM_WEST_AABB;
    protected static final VoxelShape FM_SOUTH_AABB;
    protected static final VoxelShape FM_NORTH_AABB;

    public FoodMachine(AbstractBlock.Properties properties) {
        super(properties);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateContainer.getBaseState()).with(FACING, Direction.NORTH)).with(WATERLOGGED, false));
    }

    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        switch ((Direction)p_220053_1_.get(FACING)) {
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

    private boolean canAttachTo(IBlockReader p_196471_1_, BlockPos p_196471_2_, Direction p_196471_3_) {
        BlockState lvt_4_1_ = p_196471_1_.getBlockState(p_196471_2_);
        return lvt_4_1_.isSolidSide(p_196471_1_, p_196471_2_, p_196471_3_);
    }

    public boolean isValidPosition(BlockState p_196260_1_, IWorldReader p_196260_2_, BlockPos p_196260_3_) {
        Direction lvt_4_1_ = (Direction)p_196260_1_.get(FACING);
        return this.canAttachTo(p_196260_2_, p_196260_3_.offset(lvt_4_1_.getOpposite()), lvt_4_1_);
    }

    public BlockState updatePostPlacement(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
        if (p_196271_2_.getOpposite() == p_196271_1_.get(FACING) && !p_196271_1_.isValidPosition(p_196271_4_, p_196271_5_)) {
            return Blocks.AIR.getDefaultState();
        } else {
            if ((Boolean)p_196271_1_.get(WATERLOGGED)) {
                p_196271_4_.getPendingFluidTicks().scheduleTick(p_196271_5_, Fluids.WATER, Fluids.WATER.getTickRate(p_196271_4_));
            }

            return super.updatePostPlacement(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
        }
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        BlockState lvt_2_2_;
        if (!p_196258_1_.replacingClickedOnBlock()) {
            lvt_2_2_ = p_196258_1_.getWorld().getBlockState(p_196258_1_.getPos().offset(p_196258_1_.getFace().getOpposite()));
            if (lvt_2_2_.isIn(this) && lvt_2_2_.get(FACING) == p_196258_1_.getFace()) {
                return null;
            }
        }

        lvt_2_2_ = this.getDefaultState();
        IWorldReader lvt_3_1_ = p_196258_1_.getWorld();
        BlockPos lvt_4_1_ = p_196258_1_.getPos();
        FluidState lvt_5_1_ = p_196258_1_.getWorld().getFluidState(p_196258_1_.getPos());
        Direction[] var6 = p_196258_1_.getNearestLookingDirections();
        int var7 = var6.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            Direction lvt_9_1_ = var6[var8];
            if (lvt_9_1_.getAxis().isHorizontal()) {
                lvt_2_2_ = (BlockState)lvt_2_2_.with(FACING, lvt_9_1_.getOpposite());
                if (lvt_2_2_.isValidPosition(lvt_3_1_, lvt_4_1_)) {
                    return (BlockState)lvt_2_2_.with(WATERLOGGED, lvt_5_1_.getFluid() == Fluids.WATER);
                }
            }
        }

        return null;
    }

    public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
        return (BlockState)p_185499_1_.with(FACING, p_185499_2_.rotate((Direction)p_185499_1_.get(FACING)));
    }

    public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
        return p_185471_1_.rotate(p_185471_2_.toRotation((Direction)p_185471_1_.get(FACING)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(new Property[]{FACING, WATERLOGGED});
    }

    public FluidState getFluidState(BlockState p_204507_1_) {
        return (Boolean)p_204507_1_.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(p_204507_1_);
    }

    static {
        FACING = HorizontalBlock.HORIZONTAL_FACING;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        FM_EAST_AABB = Block.makeCuboidShape(4, 0.0, 4, 10.0, 16, 10.0);
        FM_WEST_AABB = Block.makeCuboidShape(4, 0.0, 4, 10.0, 16.0, 10.0);
        FM_SOUTH_AABB = Block.makeCuboidShape(4, 0.0, 4, 10.0, 16.0, 10.0);
        FM_NORTH_AABB = Block.makeCuboidShape(4, 0.0, 4, 10.0, 16.0, 10.0);
    }
}