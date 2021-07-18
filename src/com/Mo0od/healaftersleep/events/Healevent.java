package com.Mo0od.healaftersleep.events;



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
    //must be able to sleep
    if ((result == PlayerBedEnterEvent.BedEnterResult.OK) && ((!(player.hasPermission("HAS.use"))) || (player.isOp()))){
//adding effects
    player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 150,1));
    player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 150,1));
        }

    }
    //clearing effects
    @EventHandler
    public static void PlayerLeft (PlayerBedLeaveEvent ev){
        Player player = ev.getPlayer();
            player.removePotionEffect(PotionEffectType.HEAL);
            player.removePotionEffect(PotionEffectType.SATURATION);



        }}

