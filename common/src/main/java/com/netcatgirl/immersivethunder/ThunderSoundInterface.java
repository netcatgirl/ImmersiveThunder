package com.netcatgirl.immersivethunder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.Level;

public interface ThunderSoundInterface {
    double closeDistance = 90;
    double mediumDistance = 140;

    float thunderCloseVolume = 5000.0f;
    float thunderMediumVolume = 10000.0f;
    float thunderFarVolume = 10000.0f;
    float impactSoundVolume = 2.0f;

    void playThunderSound(Level level, LightningBolt lightningBolt, SoundEvent soundEvent, float volume, boolean useDistance);

}
