package leah.leahs_immersive_thunder.config;

import leah.leahs_immersive_thunder.ImmersiveThunderClient;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = ImmersiveThunderClient.MOD_ID)
public class ImmersiveThunderConfig implements ConfigData {
    public boolean impactSound = true;
}