package com.netcatgirl.immersivethunder;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants {

    public static final String MOD_ID = "immersivethunder";
    public static final String MOD_NAME = "Immersive Thunder";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static final ResourceLocation THUNDER_CLOSE = ResourceLocation.fromNamespaceAndPath(MOD_ID, "thunder_close");
    public static SoundEvent ENTITY_LIGHTNING_BOLT_THUNDER_CLOSE = SoundEvent.createVariableRangeEvent(THUNDER_CLOSE);

    public static final ResourceLocation THUNDER_MEDIUM = ResourceLocation.fromNamespaceAndPath(MOD_ID, "thunder_medium");
    public static SoundEvent ENTITY_LIGHTNING_BOLT_THUNDER_MEDIUM = SoundEvent.createVariableRangeEvent(THUNDER_MEDIUM);

    public static final ResourceLocation THUNDER_FAR = ResourceLocation.fromNamespaceAndPath(MOD_ID, "thunder_far");
    public static SoundEvent ENTITY_LIGHTNING_BOLT_THUNDER_FAR = SoundEvent.createVariableRangeEvent(THUNDER_FAR);
}