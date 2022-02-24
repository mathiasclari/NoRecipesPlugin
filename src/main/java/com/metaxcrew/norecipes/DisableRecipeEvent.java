package com.metaxcrew.norecipes;

import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class DisableRecipeEvent implements Listener {

    @EventHandler
    private void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.getPlayer().getWorld().setGameRule(GameRule.DO_LIMITED_CRAFTING, true);
        Bukkit.clearRecipes();
    }

}
