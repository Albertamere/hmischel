package net.albertamere.hmischel.item;

import net.albertamere.hmischel.HardcoreMischel;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems {

    //MISC
    public static final Item EYE_OF_THE_SEA = registerItem("eye_of_the_sea", 
        new Item(new FabricItemSettings()));
    
    public static final Item MOLTEN_GOLD = registerItem("molten_gold", 
        new Item(new FabricItemSettings()));

    public static final Item MOLTEN_GOLD_AMALGAM = registerItem("molten_gold_amalgam", 
        new Item(new FabricItemSettings()));

    public static final Item ROYAL_APPLE = registerItem("royal_apple", 
        new Item(new FabricItemSettings()));
    
    //Registering
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HardcoreMischel.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HardcoreMischel.LOGGER.info("Registering Mod Items for " + HardcoreMischel.MOD_ID);
    }
}