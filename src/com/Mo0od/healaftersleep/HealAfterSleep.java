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
        getCommand("HealAfterSleep reload").setExecutor(new HealAfterSleepCmds());
        getServer().getPluginManager().registerEvents(new Healevent(), this);

        this.saveDefaultConfig();
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + " _   _  " + ChatColor.GREEN + " _____  " + ChatColor.BLUE + " ____ " + ChatColor.DARK_GREEN + "|  ===============================");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "| |_| | " + ChatColor.GREEN + "|  _  | " + ChatColor.BLUE + "| ___|" + ChatColor.GREEN + "|  HealAfterSleep plugin enabled");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "|  _  | " + ChatColor.GREEN + "| |_| | " + ChatColor.BLUE + "|___ |" + ChatColor.AQUA + "|  Author: Mo0od");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "|_| |_| " + ChatColor.GREEN + "|_| |_| " + ChatColor.BLUE + "|____|" + ChatColor.DARK_BLUE + "|  Version 0.0.4");

    }
    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + " _   _  " + ChatColor.GREEN + " _____  " + ChatColor.BLUE + " ____ " + ChatColor.DARK_RED + "|  ===============================");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "| |_| | " + ChatColor.GREEN + "|  _  | " + ChatColor.BLUE + "| ___|" + ChatColor.RED + "|  HealAfterSleep plugin disabled");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "|  _  | " + ChatColor.GREEN + "| |_| | " + ChatColor.BLUE + "|___ |" + ChatColor.AQUA + "|  Author: Mo0od");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "|_| |_| " + ChatColor.GREEN + "|_| |_| " + ChatColor.BLUE + "|____|" + ChatColor.DARK_BLUE + "|  Version 0.0.4");


    }
}
