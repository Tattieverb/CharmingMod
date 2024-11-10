package com.tattieverb.charmingmod;

import com.tattieverb.charmingmod.effect.ModEffects;
import com.tattieverb.charmingmod.item.ModFoodComponents;
import com.tattieverb.charmingmod.item.ModItemGroups;
import com.tattieverb.charmingmod.item.ModItems;
import com.tattieverb.charmingmod.potion.ModPotions;
import com.tattieverb.charmingmod.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.potion.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CharmingMod implements ModInitializer {
	public static final String MOD_ID = "charming-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModSounds.registerSounds();
		ModItems.registerModItems();
		ModEffects.registerEffects();
		ModPotions.registerPotions();

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, ModItems.BLOSSOM_SPORES, ModPotions.CHARMED_POTION);
		});

	}
}