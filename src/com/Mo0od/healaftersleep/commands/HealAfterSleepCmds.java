package com.Mo0od.healaftersleep.commands;

import com.Mo0od.healaftersleep.HealAfterSleep;
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
            String perm = HealAfterSleep.plugin.getConfig().getString("permission");
            if (arg.length > 0){
                //reloading the config
                if ((arg[0].equalsIgnoreCase("reload")) && (player.hasPermission("HAS.reload"))) {
                    HealAfterSleep.plugin.reloadConfig();
                    player.sendMessage(ChatColor.GREEN + "HealAfterSleep config has been reloaded");

                }}
        if (arg.length == 0){
            if ((perm == "false") && player.hasPermission("HAS.reload")){
                player.sendMessage(ChatColor.GREEN + "===================================");
                player.sendMessage(ChatColor.AQUA + "- HealAfterSleep: " + ChatColor.WHITE + "shows this menu");
                player.sendMessage(ChatColor.AQUA + "- HealAfterSleep reload: " + ChatColor.WHITE + "reloads the config file");
                player.sendMessage("");
                player.sendMessage(ChatColor.AQUA + "This plugin activates healing and saturation whenever you sleep if you have a healing or saturation potion effect it will be reset");
                player.sendMessage(ChatColor.GREEN + "===================================");

        }
            else if (perm == "false"){
                player.sendMessage(ChatColor.GREEN + "===================================");
                player.sendMessage(ChatColor.AQUA + "- HealAfterSleep: " + ChatColor.WHITE + "shows this menu");
                player.sendMessage("");
                player.sendMessage(ChatColor.AQUA + "This plugin activates healing and saturation whenever you sleep if you have a healing or saturation potion effect it will be reset");
                player.sendMessage(ChatColor.GREEN + "===================================");
            }
            //if true
            else if ((perm == "true") && (player.hasPermission("HAS.use"))) {
                player.sendMessage(ChatColor.GREEN + "===================================");
                player.sendMessage(ChatColor.AQUA + "- HealAfterSleep: " + ChatColor.WHITE + "shows this menu");
                player.sendMessage("");
                player.sendMessage(ChatColor.AQUA + "This plugin activates healing and saturation whenever you sleep if you have a healing or saturation potion effect it will be reset");
                player.sendMessage(ChatColor.GREEN + "===================================");
            }
                else if ((perm == "true") && (!player.hasPermission("HAS.use"))){
            player.sendMessage(ChatColor.RED + "you don't have permission to run this command");
        }

        }}


//stopping the command
        return true;
    }}