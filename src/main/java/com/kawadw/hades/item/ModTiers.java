package com.kawadw.hades.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier REDSTONE = new ForgeTier(3, 1405, 2, 3, 22, BlockTags. NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.REDSTONE));
}
