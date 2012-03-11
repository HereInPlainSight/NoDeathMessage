package com.etherelements.bukkit.NoDeathMessage;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class NoDeathMessage extends JavaPlugin{

	@Override
	public void onEnable() {
		 PluginManager pm = getServer().getPluginManager();
		 pm.registerEvents(new NoDeathMessageDeathListener(), this);
		 System.out.println("NoDeathMessage has been enabled.");
	}
	
	@Override
	public void onDisable() {
           System.out.println("NoDeathMessage has been disabled.");
	}

}