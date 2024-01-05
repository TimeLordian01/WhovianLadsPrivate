package com.thevale.whovianlads.texturevariants;

import com.thevale.whovianlads.whovianlads;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.misc.TexVariant;

public class TextureVariants {

    public static final TexVariant[] WARDROBE = {
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/acacia_exterior.png"), "tardis.common.normal"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/birch_exterior.png"), "wardrobe.birch"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/crimson_exterior.png"), "wardrobe.crimson"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/dark_oak_exterior.png"), "wardrobe.dark_oak"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/jungle_exterior.png"), "wardrobe.jungle"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/mangrove_exterior.png"), "wardrobe.mangrove"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/oak_exterior.png"), "wardrobe.oak"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/spruce_exterior.png"), "wardrobe.spruce"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/stone_exterior.png"), "wardrobe.stone"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/stone_spruce_exterior.png"), "wardrobe.spruce_stone"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/warped_forest_exterior.png"), "wardrobe.warped")

    };
    public static final TexVariant[] VALE = {
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/consoles/valeconsole.png"), "tardis.common.normal"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/consoles/valeconsole2.png"), "vale.purple"),
      };
}
