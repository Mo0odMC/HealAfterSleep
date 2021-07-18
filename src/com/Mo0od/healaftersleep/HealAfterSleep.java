package com.Mo0od.healaftersleep;

import com.Mo0od.healaftersleep.commands.HealAfterSleepCmds;
import com.Mo0od.healaftersleep.events.Healevent;

import org.bukkit.ChatColor;

import org.bukkit.plugin.java.JavaPlugin;



public class HealAfterSleep extends JavaPlugin {


    public static HealAfterSleep plugin;
    @Override
    public void onEnable(){
        plugin = this;
        getCommand("HealAfterSleep").setExecutor(new HealAfterSleepCmds());
        getServer().getPluginManager().registerEvents(new Healevent(), this);

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "===============================");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "HealAfterSleep plugin enabled");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Author: Mo0od");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_BLUE + "Version 0.0.1");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "===============================");
    }
    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "===============================");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "HealAfterSleep plugin disabled");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Author: Mo0od");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_BLUE + "Version 0.0.1");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "===============================");

    }
}
