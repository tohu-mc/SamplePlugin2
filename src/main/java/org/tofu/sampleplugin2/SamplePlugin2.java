package org.tofu.sampleplugin2;

import org.bukkit.plugin.java.JavaPlugin;

public final class SamplePlugin2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new studySpigot(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
