package net.james.armsandcharms;

import net.fabricmc.api.ModInitializer;

import net.james.armsandcharms.block.ModBlocks;
import net.james.armsandcharms.item.ModItemGroups;
import net.james.armsandcharms.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArmsAndCharms implements ModInitializer {
	public static final String MOD_ID = "arms_and_charms";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}