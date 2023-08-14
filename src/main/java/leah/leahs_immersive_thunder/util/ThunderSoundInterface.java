package leah.leahs_immersive_thunder.util;

import net.minecraft.entity.LightningEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public interface ThunderSoundInterface {
  double closeDistance = 90;
  double mediumDistance = 140;

  float thunderCloseVolume = 5000.0f;
  float thunderMediumVolume = 10000.0f;
  float thunderFarVolume = 10000.0f;
  float impactSoundVolume = 2.0f;

  void playThunderSound(World world, LightningEntity lightning, SoundEvent soundEvent, float volume, boolean useDistance);
}