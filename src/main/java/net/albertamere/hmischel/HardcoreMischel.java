package net.albertamere.hmischel;

import net.fabricmc.api.ModInitializer;

import net.albertamere.hmischel.item.ModItems;
import net.albertamere.hmischel.item.ModItemGroups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HardcoreMischel implements ModInitializer {

	public static final String MOD_ID ="hmischel";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}

