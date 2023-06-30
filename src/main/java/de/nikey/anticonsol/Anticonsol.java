package de.nikey.anticonsol;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Anticonsol extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager plM = Bukkit.getPluginManager();
        plM.registerEvents(new Listeners(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
