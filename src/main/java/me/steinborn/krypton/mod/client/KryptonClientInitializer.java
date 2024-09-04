package me.steinborn.krypton.mod.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@OnlyIn(Dist.CLIENT)
public class KryptonClientInitializer {
    private static final Logger LOGGER = LogManager.getLogger(KryptonClientInitializer.class);

    public static void onInitializeClient() {
        LOGGER.info("Krypton is now accelerating your Minecraft client's networking stack \uD83D\uDE80");
        LOGGER.info("Note that Krypton is most effective on servers, not the client.");
    }
}
