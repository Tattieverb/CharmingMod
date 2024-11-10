package com.tattieverb.charmingmod.item;

import com.tattieverb.charmingmod.CharmingMod;
import com.tattieverb.charmingmod.effect.ModEffects;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {

    public static final FoodComponent MOCHI = new FoodComponent.Builder().nutrition(4).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(ModEffects.CHARMED, 2000), 1f).build();

    public static final FoodComponent SEASONED_PIE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(ModEffects.CHARMED, 1200), 1f).build();

    public static final FoodComponent SEASONED_COOKIE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(ModEffects.CHARMED, 1200), 1f).build();
}
