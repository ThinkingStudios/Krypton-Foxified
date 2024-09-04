package me.steinborn.krypton.mod.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class KryptonServerInitializer {
    private static final Logger LOGGER = LogManager.getLogger(KryptonServerInitializer.class);

    public static void onInitializeServer() {
        LOGGER.info("Krypton is now accelerating your Minecraft server's networking stack \uD83D\uDE80");
    }
}
