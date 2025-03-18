package com.netcatgirl.immersivethunder;

import com.netcatgirl.immersivethunder.platform.Services;

public class CommonClass {

    public static void init() {
        if (Services.PLATFORM.isModLoaded("immersivethunder")) {

            Constants.LOG.info("ImmersiveThunder loaded");
        }
    }
}