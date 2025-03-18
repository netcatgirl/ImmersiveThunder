package com.netcatgirl.immersivethunder;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;


public class ImmersiveThunderClient implements ModInitializer {

    @Override
    public void onInitialize() {
        CommonClass.init();

        Registry.register(BuiltInRegistries.SOUND_EVENT, Constants.THUNDER_CLOSE, Constants.ENTITY_LIGHTNING_BOLT_THUNDER_CLOSE);
        Registry.register(BuiltInRegistries.SOUND_EVENT, Constants.THUNDER_MEDIUM, Constants.ENTITY_LIGHTNING_BOLT_THUNDER_MEDIUM);
        Registry.register(BuiltInRegistries.SOUND_EVENT, Constants.THUNDER_FAR, Constants.ENTITY_LIGHTNING_BOLT_THUNDER_FAR);
    }
}
