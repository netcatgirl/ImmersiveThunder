package com.netcatgirl.immersivethunder.mixin;

import com.netcatgirl.immersivethunder.Constants;
import com.netcatgirl.immersivethunder.ThunderSoundInterface;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Objects;


@Mixin(LightningBolt.class)
public class ImmersiveThunderMixin implements ThunderSoundInterface {

    @Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;playLocalSound(DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V"))
    private void playSound(Level level, double x, double y, double z, SoundEvent sound, SoundSource source, float volume, float pitch, boolean useDistance) {
        LightningBolt lightningBolt = (LightningBolt) (Object) this;
        LocalPlayer player = Minecraft.getInstance().player;

        double distanceToEntity = Objects.requireNonNull(player).distanceTo(lightningBolt);

        if (distanceToEntity <= closeDistance) {
            playThunderSound(level, lightningBolt, Constants.ENTITY_LIGHTNING_BOLT_THUNDER_CLOSE, thunderCloseVolume, false);
        } else if (distanceToEntity <= mediumDistance) {
            playThunderSound(level, lightningBolt, Constants.ENTITY_LIGHTNING_BOLT_THUNDER_MEDIUM, thunderMediumVolume, true);
        } else {
            playThunderSound(level, lightningBolt, Constants.ENTITY_LIGHTNING_BOLT_THUNDER_FAR, thunderFarVolume, true);
        }
    }

    @Override
    public void playThunderSound(Level level, LightningBolt lightningBolt, SoundEvent soundEvent, float volume, boolean useDistance) {
        level.playLocalSound(lightningBolt.getX(), lightningBolt.getY(), lightningBolt.getZ(), soundEvent, SoundSource.WEATHER, volume, 0.8f, useDistance);
    }
}