package com.metaxcrew.norecipes;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;

public final class NoRecipes extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "[]=====================<" + ChatColor.of(new Color(169, 45, 81)) + ChatColor.BOLD + "MetaxCrew" + ChatColor.GRAY + ">=====================[]");
        Bukkit.getConsoleSender().sendMessage(ChatColor.of(new Color(0, 141, 183))+"");
        Bukkit.getConsoleSender().sendMessage(ChatColor.of(new Color(69, 72, 77)) + "    ・ Plugin:" + ChatColor.of(new Color(0, 141, 183)) + " NoRecipes");
        Bukkit.getConsoleSender().sendMessage(ChatColor.of(new Color(69, 72, 77)) + "    ・ Developer:" + ChatColor.of(new Color(0, 141, 183)) + " Mat");
        Bukkit.getConsoleSender().sendMessage(ChatColor.of(new Color(69, 72, 77)) + "    ・ Discord:" + ChatColor.of(new Color(0, 141, 183)) + " Mat#5000");
        Bukkit.getConsoleSender().sendMessage(ChatColor.of(new Color(0, 141, 183))+"");
        Bukkit.getConsoleSender().sendMessage(ChatColor.of(new Color(69, 72, 77)) + "    ・ Category:" + ChatColor.of(new Color(0, 141, 183)) + " Px");
        Bukkit.getConsoleSender().sendMessage(ChatColor.of(new Color(0, 141, 183))+"");
        Bukkit.getConsoleSender().sendMessage(ChatColor.of(new Color(69, 72, 77)) + "    ・ Support Discord:" + ChatColor.of(new Color(0, 141, 183)) + " https://discord.gg/gFmBdpPZJa");
        Bukkit.getConsoleSender().sendMessage(ChatColor.of(new Color(0, 141, 183))+"");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "[]====================================================[]");

        getServer().getPluginManager().registerEvents(new DisableRecipeEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
