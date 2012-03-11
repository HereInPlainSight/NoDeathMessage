package com.etherelements.bukkit.NoDeathMessage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public class NoDeathMessageDeathListener implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void onEntityDeath(EntityDeathEvent event) {
		  if (event instanceof PlayerDeathEvent) {
	            PlayerDeathEvent e = (PlayerDeathEvent) event;
	            e.setDeathMessage(null);
	        }
  }
}
