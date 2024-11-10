package com.tattieverb.charmingmod.datagen;

import com.tattieverb.charmingmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BLOSSOM_SPORES, Models.GENERATED);

        itemModelGenerator.register(ModItems.MOCHI, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEASONED_PIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEASONED_COOKIE, Models.GENERATED);
    }
}
