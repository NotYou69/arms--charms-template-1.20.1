package net.james.armsandcharms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.james.armsandcharms.ArmsAndCharms;
import net.james.armsandcharms.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArmsAndCharms.MOD_ID, "modgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modgroup"))
                    .icon(() -> new ItemStack(ModItems.LEAD_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LEAD_INGOT);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.ZINC_INGOT);
                        entries.add(ModItems.RAW_ZINC);
                        entries.add(ModBlocks.SMILE_BLOCK);


                    }).build());


    public static void registerItemGroups() {
        ArmsAndCharms.LOGGER.info("Registering Item Groups for " +ArmsAndCharms.MOD_ID);
    }
}
