package com.thevale.whovianlads.util;

import com.thevale.whovianlads.items.ValeItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WhovianLadsItemGroup {

    public static final ItemGroup WHOVIANREST = new ItemGroup("whoviansRestCreativeTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ValeItems.TEZARAK_COIN.get());
        }
    };


}
