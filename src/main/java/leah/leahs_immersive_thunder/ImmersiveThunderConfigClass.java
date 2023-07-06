package leah.leahs_immersive_thunder;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.RangeConstraint;
import io.wispforest.owo.config.annotation.SectionHeader;

@Modmenu(modId = ImmersiveThunderClient.MOD_ID)
@Config(name = "immersive-thunder-config", wrapperName = "ImmersiveThunderConfig")
public class ImmersiveThunderConfigClass {
    @SectionHeader("thunder-volume-header")
    @RangeConstraint(min = 0f, max = 5000.0f)
    public float thunderCloseVolume = 5000.0f;

    @RangeConstraint(min = 0f, max = 15000.0f)
    public float thunderMediumVolume = 10000.0f;

    @RangeConstraint(min = 0f, max = 15000.0f)
    public float thunderFarVolume = 10000.0f;

    @SectionHeader("impact-sound-header")
    public boolean impactSound = true;
    @RangeConstraint(min = 0f, max = 5.0f)
    public float impactSoundVolume = 2.0f;
}
