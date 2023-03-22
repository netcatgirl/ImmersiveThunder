package leah.leahs_immersive_thunder;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImmersiveThunder implements ModInitializer {
    public static final String MOD_ID = "leahs-immersive-thunder";
    public static final Logger LOGGER = LoggerFactory.getLogger("leahs-immersive-thunder");

    @Override
    public void onInitialize() {
        LOGGER.info("Immersive Thunder loaded.");
    }
}