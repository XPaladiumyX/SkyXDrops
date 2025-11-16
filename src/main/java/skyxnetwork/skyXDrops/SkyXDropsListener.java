package skyxnetwork.skyXDrops;

import org.bukkit.Bukkit;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wither;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class SkyXDropsListener implements Listener {

    @EventHandler
    public void onBossDeath(EntityDeathEvent event) {

        // Vérifie que celui qui a mis le dernier coup est un joueur
        if (!(event.getEntity().getKiller() instanceof Player killer)) return;

        // --- WITHER ---
        if (event.getEntity() instanceof Wither) {
            String cmd = "iagive " + killer.getName() + " wandspack2:soul_essence 1";
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), cmd);
            return;
        }

        // --- ENDER DRAGON ---
        if (event.getEntity() instanceof EnderDragon) {
            String cmd = "iagive " + killer.getName() + " wandspack2:dragon_essence 1";
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), cmd);
        }
    }
}
