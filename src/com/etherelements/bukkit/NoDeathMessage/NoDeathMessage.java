package com.etherelements.bukkit.NoDeathMessage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NoDeathMessage extends JavaPlugin implements Listener{

	@Override
	public void onEnable(){
		 getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable(){
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerDeath(PlayerDeathEvent event){
		if (event.getEntity().hasPermission("nodeathmessage.nomessage")){
			event.setDeathMessage(null);
		}
	}
}