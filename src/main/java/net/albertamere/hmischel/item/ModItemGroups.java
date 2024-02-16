package net.albertamere.hmischel.item;

import net.albertamere.hmischel.HardcoreMischel;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup H_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HardcoreMischel.MOD_ID, "hmischel_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hmischel_group"))
                    .icon(() -> new ItemStack(ModItems.EYE_OF_THE_SEA)).entries((displayContext, entries) -> {
                        entries.add(ModItems.EYE_OF_THE_SEA);
                        entries.add(Items.ENDER_EYE);
                        entries.add(Items.HEART_OF_THE_SEA);
                        entries.add(Items.FERMENTED_SPIDER_EYE);
                        entries.add(ModItems.MOLTEN_GOLD);
                        entries.add(ModItems.ROYAL_APPLE);
                        entries.add(ModItems.MOLTEN_GOLD_AMALGAM);
                    }).build());


    public static void registerItemGroups() {
        HardcoreMischel.LOGGER.info("Registering Item Groups for " + HardcoreMischel.MOD_ID);
    }
}
