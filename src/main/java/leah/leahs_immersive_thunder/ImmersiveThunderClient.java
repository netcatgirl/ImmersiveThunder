package leah.leahs_immersive_thunder;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImmersiveThunderClient implements ModInitializer {
  public static final String MOD_ID = "leahs-immersive-thunder";
  public static final Logger LOGGER = LoggerFactory.getLogger("leahs-immersive-thunder");

  public static final ImmersiveThunderConfig CONFIG = ImmersiveThunderConfig.createAndLoad();

  public static final Identifier THUNDER_CLOSE = new Identifier("leahs-immersive-thunder:thunder_close");
  public static SoundEvent ENTITY_LIGHTNING_BOLT_THUNDER_CLOSE = SoundEvent.of(THUNDER_CLOSE);

  public static final Identifier THUNDER_MEDIUM = new Identifier("leahs-immersive-thunder:thunder_medium");
  public static SoundEvent ENTITY_LIGHTNING_BOLT_THUNDER_MEDIUM = SoundEvent.of(THUNDER_MEDIUM);

  public static final Identifier THUNDER_FAR = new Identifier("leahs-immersive-thunder:thunder_far");
  public static SoundEvent ENTITY_LIGHTNING_BOLT_THUNDER_FAR = SoundEvent.of(THUNDER_FAR);

  @Override
  public void onInitialize() {
    Registry.register(Registries.SOUND_EVENT, ImmersiveThunderClient.THUNDER_CLOSE, ENTITY_LIGHTNING_BOLT_THUNDER_CLOSE);
    Registry.register(Registries.SOUND_EVENT, ImmersiveThunderClient.THUNDER_MEDIUM, ENTITY_LIGHTNING_BOLT_THUNDER_MEDIUM);
    Registry.register(Registries.SOUND_EVENT, ImmersiveThunderClient.THUNDER_FAR, ENTITY_LIGHTNING_BOLT_THUNDER_FAR);
    LOGGER.info("Immersive Thunder loaded.");
  }
}