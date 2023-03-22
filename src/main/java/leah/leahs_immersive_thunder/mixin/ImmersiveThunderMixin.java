package leah.leahs_immersive_thunder.mixin;

import net.minecraft.entity.LightningEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LightningEntity.class)
public class ImmersiveThunderMixin {
    @Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;playSound(DDDLnet/minecraft/sound/SoundEvent;Lnet/minecraft/sound/SoundCategory;FFZ)V"))
    private void playSound(World world, double x, double y, double z, SoundEvent sound, SoundCategory category, float volume, float pitch, boolean useDistance) {
        LightningEntity lightning = (LightningEntity) (Object) this;

        world.playSound(lightning.getX(), lightning.getY(), lightning.getZ(), SoundEvents.ENTITY_LIGHTNING_BOLT_THUNDER, SoundCategory.WEATHER, 10000.0f, 0.8f + world.random.nextFloat() * 0.2f, true);
        world.playSound(lightning.getX(), lightning.getY(), lightning.getZ(), SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT, SoundCategory.WEATHER, 2.0f, 0.5f + world.random.nextFloat() * 0.2f, true);
    }
}
