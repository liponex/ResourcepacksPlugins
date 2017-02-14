package de.themoep.resourcepacksplugin.bukkit.internal;

import de.themoep.resourcepacksplugin.core.ResourcePack;
import org.bukkit.craftbukkit.v1_9_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;

/**
 * Created by Phoenix616 on 22.07.2016.
 */
public class InternalHelper_v1_9_R2 implements InternalHelper {

    @Override
    public void setResourcePack(Player player, ResourcePack pack) {
        ((CraftPlayer) player).getHandle().setResourcePack(pack.getUrl(), pack.getHash());
    }
}
