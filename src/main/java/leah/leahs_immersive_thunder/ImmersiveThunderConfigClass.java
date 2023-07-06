package leah.leahs_immersive_thunder;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = ImmersiveThunderClient.MOD_ID)
@Config(name = "immersive-thunder-config", wrapperName = "ImmersiveThunderConfig")
public class ImmersiveThunderConfigClass {
    public float thunderCloseVolume = 5000.0f;
    public float thunderMediumVolume = 10000.0f;
    public float thunderFarVolume = 10000.0f;

    public boolean muteImpactSound = true;
}
