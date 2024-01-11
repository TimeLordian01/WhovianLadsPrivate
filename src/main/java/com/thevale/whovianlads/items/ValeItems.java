package com.thevale.whovianlads.items;

import com.thevale.whovianlads.util.WhovianLadsItemGroup;
import com.thevale.whovianlads.whovianlads;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tardis.mod.items.TItems;

public class ValeItems{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, whovianlads.MODID);

    public static final RegistryObject<Item> TEZARAK_COIN = ITEMS.register("tezarak_coin",
            ()-> new Item(new Item.Properties()
                    .group(WhovianLadsItemGroup.WHOVIANREST).maxStackSize(16).rarity(Rarity.RARE).isImmuneToFire()));

}
