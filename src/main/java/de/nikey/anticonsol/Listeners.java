package de.nikey.anticonsol;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;

public class Listeners implements Listener {
    @EventHandler
    public void onServerCommand(ServerCommandEvent event) {
        event.setCancelled(true);
    }
}
