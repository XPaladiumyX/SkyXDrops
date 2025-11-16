package skyxnetwork.skyXDrops;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class SkyXDrops extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SkyXDropsListener(), this);
        Bukkit.getLogger().info("[SkyXDrops] Enabled!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[SkyXDrops] Disabled!");
    }
}
