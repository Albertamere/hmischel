package net.albertamere.hmischel.potion;

import net.albertamere.hmischel.HardcoreMischel;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {
    
    public static final Potion REGEN_POTION = registerPotion("modded_regen",
    new Potion(new StatusEffectInstance(StatusEffects.REGENERATION, 3600, 0)));
    


    private static Potion registerPotion(String name, Potion potion) {
        return Registry.register(Registries.POTION, new Identifier(HardcoreMischel.MOD_ID, name), potion);
    }

    public static void registerModPotions() {
        HardcoreMischel.LOGGER.info("Registering Mod Potions for " + HardcoreMischel.MOD_ID);
    }
}