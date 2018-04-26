package net.bor.spleg;

import org.bukkit.plugin.java.JavaPlugin;

public class Spleg extends JavaPlugin {

    @Override
    public void onLoad() {
        System.out.println("my first pluging loading");
               

    }

    @Override
    public void onEnable() {
        System.out.println("hello/it`s me ");
        getServer().getPluginManager().registerEvents(new Listeners(), this);
//        Server srv = getServer();
//        PluginManager maneger = srv.getPluginManager();
//        Listeners ls = new Listeners();
//        maneger.registerEvents(ls, this);
    }
    
    @Override
    public void onDisable() {
        getLogger().info("disabled.");
    }


}
