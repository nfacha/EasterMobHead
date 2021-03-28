package com.nunofacha.eastermobhead;

import com.nunofacha.eastermobhead.listeners.EntityListener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class Main extends JavaPlugin {
    public static Plugin plugin;
    public static Logger logger;
    @Override
    public void onEnable() {
        Main.plugin = this;
        Main.logger = this.getLogger();
        logger.setLevel(Level.FINEST);
        logger.info("Initializing...");
        getServer().getPluginManager().registerEvents(new EntityListener(), this);
        logger.info("Ready!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
