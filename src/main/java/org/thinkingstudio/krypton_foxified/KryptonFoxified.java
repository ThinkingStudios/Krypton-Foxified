package org.thinkingstudio.krypton_foxified;

import me.steinborn.krypton.mod.client.KryptonClientInitializer;
import me.steinborn.krypton.mod.server.KryptonServerInitializer;
import me.steinborn.krypton.mod.shared.KryptonSharedInitializer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLLoader;

@Mod("krypton")
public class KryptonFoxified {
    public KryptonFoxified() {
        // By default, Netty allocates 16MiB arenas for the PooledByteBufAllocator. This is too much
        // memory for Minecraft, which imposes a maximum packet size of 2MiB! We'll use 4MiB as a more
        // sane default.
        //
        // Note: io.netty.allocator.pageSize << io.netty.allocator.maxOrder is the formula used to
        // compute the chunk size. We lower maxOrder from its default of 11 to 9. (We also use a null
        // check, so that the user is free to choose another setting if need be.)
        if (System.getProperty("io.netty.allocator.maxOrder") == null) {
            System.setProperty("io.netty.allocator.maxOrder", "9");
        }

        KryptonSharedInitializer.onInitialize();

        if (FMLLoader.getDist().isClient()) {
            KryptonClientInitializer.onInitializeClient();
        }

        if (FMLLoader.getDist().isDedicatedServer()) {
            KryptonServerInitializer.onInitializeServer();
        }
    }
}
