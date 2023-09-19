package org.phantam.waterdamageplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class WaterDamagePlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable(){
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if (player.hasPermission("water.into")) {
            if (player.getLocation().getBlock().isLiquid()) {
                player.damage(10.0);
                player.sendMessage(ChatColor.RED+"Hệ Thống"+ChatColor.WHITE+" Bạn không thể xuống nước vì đã ăn trái ác quỷ");
            }
        }
    }
}
