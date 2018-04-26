/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bor.spleg;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 *
 * @author User
 */
public class Listeners implements Listener {

    @EventHandler
    public void greeting(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("Привет, " + player.getName() + "!");
    }

    @EventHandler
    public void onPlayerIneract(PlayerInteractEvent event) {
        if (event==null || event.getPlayer()==null){
            return;
        }
        if (event.getClickedBlock()==null){
            event.getPlayer().sendMessage("Товарищь, Харе жмакать воздух!");
       
        }else {
            event.setCancelled(true);
            event.getPlayer().sendMessage("Неудачное взаемодействие");
        }
    }
}
