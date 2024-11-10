package com.tattieverb.charmingmod.item;

import com.tattieverb.charmingmod.CharmingMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CHARMED_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CharmingMod.MOD_ID, "charming_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BLOSSOM_SPORES))
                    .displayName(Text.translatable("itemgroup.charming-mod.charming_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLOSSOM_SPORES);
                        entries.add(ModItems.MOCHI);
                        entries.add(ModItems.SEASONED_PIE);
                        entries.add(ModItems.SEASONED_COOKIE);
                        entries.add(ModItems.HERALD_MUSIC_DISC);

                    }).build());

    public static void registerItemGroups() {
        CharmingMod.LOGGER.info("Registering Item Group for " + CharmingMod.MOD_ID);
    }
}
