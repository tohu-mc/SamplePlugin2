package org.tofu.sampleplugin2;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class studySpigot implements Listener {
    SamplePlugin2 plugin;

    public studySpigot(SamplePlugin2 plugin) {
        this.plugin = plugin;
        this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
    }

    @EventHandler
    public void onStudy() {
        //コード
        //コード
    }

    //他のイベントのクラスも作成してみよう
}
