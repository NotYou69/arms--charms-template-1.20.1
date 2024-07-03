package net.james.armsandcharms.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.james.armsandcharms.ArmsAndCharms;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new FabricItemSettings()));
    public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ZINC = registerItem("raw_zinc", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(LEAD_INGOT);
        entries.add(RAW_LEAD);
        entries.add(SILVER_INGOT);
        entries.add(RAW_SILVER);
        entries.add(ZINC_INGOT);
        entries.add(RAW_ZINC);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ArmsAndCharms.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ArmsAndCharms.LOGGER.info("Registering Mod Items for " + ArmsAndCharms.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
