package com.Mo0od.healaftersleep.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealAfterSleepCmds implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] arg) {
        //making sure the sender is a player
        if (!(Sender instanceof Player)) {
            Sender.sendMessage(ChatColor.RED + "Only Players can use this plugin commands");
            return true;
        }
        Player player = (Player) Sender;
        //commands and reply
        if (cmd.getName().equalsIgnoreCase("HealAfterSleep")) {
            player.sendMessage(ChatColor.GREEN + "===================================");
            player.sendMessage(ChatColor.AQUA + "- HealAfterSleep: " + ChatColor.WHITE + "shows this menu");
            player.sendMessage("");
            player.sendMessage(ChatColor.AQUA + "This plugin activates healing and saturation whenever you sleep if you have a healing or saturation potion effect it will be reset");
            player.sendMessage(ChatColor.GREEN + "===================================");
        }

//stopping the command
        return true;
    }}