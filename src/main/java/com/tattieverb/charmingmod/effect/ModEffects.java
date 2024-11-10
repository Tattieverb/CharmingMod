package com.tattieverb.charmingmod.effect;

import com.tattieverb.charmingmod.CharmingMod;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.entry.RegistryEntry;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> CHARMED = registerStatusEffect("charmed",
            new CharmedEffect(StatusEffectCategory.NEUTRAL, 0xD35FD4)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(CharmingMod.MOD_ID, "charmed"), -0.25f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(CharmingMod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        CharmingMod.LOGGER.info("Registering Mod Effects for " + CharmingMod.MOD_ID);
    }
}
