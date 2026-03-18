package com.extrareach;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraReachMod implements ModInitializer {
    public static final String MOD_ID = "extra-reach";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Extra Reach Mod loaded! Your reach has been extended by 1 block.");
    }
}
