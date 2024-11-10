package com.tattieverb.charmingmod.item;

import com.tattieverb.charmingmod.CharmingMod;
import com.tattieverb.charmingmod.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BLOSSOM_SPORES = registerItem("blossom_spores", new Item(new Item.Settings()));

    public static final Item MOCHI = registerItem("mochi", new Item(new Item.Settings().food(ModFoodComponents.MOCHI)));
    public static final Item SEASONED_PIE = registerItem("seasoned_pie", new Item(new Item.Settings().food(ModFoodComponents.SEASONED_PIE)));
    public static final Item SEASONED_COOKIE = registerItem("seasoned_cookie", new Item(new Item.Settings().food(ModFoodComponents.SEASONED_COOKIE)));

    public static final Item HERALD_MUSIC_DISC = registerItem("herald_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.HERALD_KEY).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CharmingMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
            CharmingMod.LOGGER.info("Registering Mod Items for "+CharmingMod.MOD_ID);

            ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
                entries.add(BLOSSOM_SPORES);
            });

            ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
                entries.add(MOCHI);
                entries.add(SEASONED_PIE);
                entries.add(SEASONED_COOKIE);
            });

            ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
                entries.add(HERALD_MUSIC_DISC);
            });
    }
}
