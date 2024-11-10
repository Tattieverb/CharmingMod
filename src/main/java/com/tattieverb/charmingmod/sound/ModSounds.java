package com.tattieverb.charmingmod.sound;

import com.tattieverb.charmingmod.CharmingMod;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent PING = registerSoundEvent("ping");

    public static final SoundEvent HERALD = registerSoundEvent("herald");
    public static final RegistryKey<JukeboxSong> HERALD_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CharmingMod.MOD_ID, "herald"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(CharmingMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        CharmingMod.LOGGER.info("Registering Mod Sounds for " + CharmingMod.MOD_ID);
    }
}
