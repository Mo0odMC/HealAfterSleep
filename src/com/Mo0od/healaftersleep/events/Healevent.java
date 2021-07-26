package com.Mo0od.healaftersleep.events;



import com.Mo0od.healaftersleep.HealAfterSleep;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;




public class Healevent implements Listener {


    @EventHandler
    public static void PlayerEnter (PlayerBedEnterEvent e){

    Player player = e.getPlayer();
    PlayerBedEnterEvent.BedEnterResult result = e.getBedEnterResult();
    String perm = HealAfterSleep.plugin.getConfig().getString("permission");
    //no permissions and permissions disabled
    if ((perm == "false") && (result == PlayerBedEnterEvent.BedEnterResult.OK)) {
        player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 150,1));
        player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 150,1));
    }
    // permissions and permissions enabled
    else if ((perm == "true") && (result == PlayerBedEnterEvent.BedEnterResult.OK) && player.hasPermission("HAS.use")){
            player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 150,1));
            player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 150,1));
        }
else {
    return;
    }
        }


    //clearing effects
    @EventHandler
    public static void PlayerLeft (PlayerBedLeaveEvent ev){
        Player player = ev.getPlayer();
        String perm = HealAfterSleep.plugin.getConfig().getString("permission");
        //no permissions and permissions disabled
        if (perm == "false") {
            player.removePotionEffect(PotionEffectType.HEAL);
            player.removePotionEffect(PotionEffectType.SATURATION);
        }
        else if ((perm == "true") && player.hasPermission("HAS.use")){
            player.removePotionEffect(PotionEffectType.HEAL);
            player.removePotionEffect(PotionEffectType.SATURATION);
        }
        else {
            return;
        }
        }}

