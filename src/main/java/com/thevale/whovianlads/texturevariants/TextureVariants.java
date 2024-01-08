package com.thevale.whovianlads.texturevariants;

import com.thevale.whovianlads.whovianlads;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.misc.TexVariant;

public class TextureVariants {
    //Exteriors
    public static final TexVariant[] WARDROBE = {
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/wardrobe/acacia_exterior.png"), "wardrobe.acacia"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/wardrobe/birch_exterior.png"), "wardrobe.birch"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/wardrobe/crimson_exterior.png"), "wardrobe.crimson"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/wardrobe/dark_oak_exterior.png"), "wardrobe.dark_oak"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/wardrobe/jungle_exterior.png"), "wardrobe.jungle"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/wardrobe/mangrove_exterior.png"), "wardrobe.mangrove"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/wardrobe/oak_exterior.png"), "wardrobe.oak"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/wardrobe/spruce_exterior.png"), "wardrobe.spruce"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/wardrobe/stone_exterior.png"), "wardrobe.stone"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/wardrobe/stone_spruce_exterior.png"), "wardrobe.spruce_stone"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/exteriors/wardrobe/warped_forest_exterior.png"), "wardrobe.warped")

    };
    public static final TexVariant[] BRACKOLIN = {
            new TexVariant(new ResourceLocation(whovianlads.MODID, "textures/exteriors/brackolin/brackolin.png"),"brackolin.normal")
    };
    public static final TexVariant[] OLWARRIOR = {
            new TexVariant(new ResourceLocation(whovianlads.MODID, "textures/exteriors/olwarrior/olwarrior.png"),"olwarrior.normal")
    };
    //Consoles
    public static final TexVariant[] VALE = {
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/consoles/valeconsole.png"), "vale.normal"),
            new TexVariant(new ResourceLocation(whovianlads.MODID,"textures/consoles/valeconsole2.png"), "vale.purple"),
      };
}
