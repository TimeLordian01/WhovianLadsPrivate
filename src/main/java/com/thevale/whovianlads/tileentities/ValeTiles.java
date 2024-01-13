package com.thevale.whovianlads.tileentities;


import com.google.common.base.Supplier;
import com.thevale.whovianlads.blocks.ValeBlocks;
import com.thevale.whovianlads.tileentities.consoles.BrackolinConsoleTile;
import com.thevale.whovianlads.tileentities.exteriors.*;
import com.thevale.whovianlads.whovianlads;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tardis.mod.blocks.TileBlock;

public class ValeTiles {
    public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, whovianlads.MODID);
    //Exteriors
    public static RegistryObject<TileEntityType<WardrobeTile>> exterior_wardrobe =
            TILES.register("exterior_wardrobe", () -> registerTiles(WardrobeTile::new,
                    ValeBlocks.exterior_wardrobe.get()));
    public static RegistryObject<TileEntityType<BrackolinTile>> exterior_brackolin =
            TILES.register("exterior_brackolin", () -> registerTiles(BrackolinTile::new,
                    ValeBlocks.exterior_brackolin.get()));
    public static RegistryObject<TileEntityType<RaniTile>> exterior_rani =
            TILES.register("exterior_rani", () -> registerTiles(RaniTile::new,
                    ValeBlocks.exterior_rani.get()));

    public static RegistryObject<TileEntityType<OlwarriorTile>> exterior_olwarrior =
            TILES.register("exterior_olwarrior", () -> registerTiles(OlwarriorTile::new,
                    ValeBlocks.exterior_olwarrior.get()));

    public static RegistryObject<TileEntityType<BlueDoctorTile>> exterior_bluedoctor =
            TILES.register("exterior_bluedoctor", () -> registerTiles(BlueDoctorTile::new,
                    ValeBlocks.exterior_bluedoctor.get()));

    //Consoles
    public static final RegistryObject<TileEntityType<BrackolinConsoleTile>> console_brackolin =
            TILES.register("console_brackolin", () ->registerTiles(BrackolinConsoleTile::new,
                    ValeBlocks.console_brackolin.get()));




    //TileBlocks







    private static <T extends TileEntity> TileEntityType<T> registerTiles(Supplier<T> tile, Block... validBlock) {
        TileEntityType<T> type = TileEntityType.Builder.create(tile, validBlock).build(null);

        for (Block block : validBlock) {
            if (block instanceof TileBlock) {
                ((TileBlock) block).setTileEntity(type);
            }
        }

        return type;
    }
}