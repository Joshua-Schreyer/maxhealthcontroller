package com.joshuaschreyer.maxhealthcontroller;

import org.bukkit.plugin.java.JavaPlugin;

public final class MaxHealthController extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("maxhealth").setExecutor(new MaxHealthCommand());
    }
}
