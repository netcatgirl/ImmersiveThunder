package leah.leahs_immersive_thunder.util;

import net.minecraft.entity.LightningEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public interface ThunderSoundInterface {
  double closeDistance = 90;
  double mediumDistance = 140;

  void playThunderSound(World world, LightningEntity lightning, SoundEvent soundEvent, float volume, boolean useDistance);
}