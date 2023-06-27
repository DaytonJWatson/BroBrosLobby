package com.watsonllc.lobby;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Lobby extends JavaPlugin implements CommandExecutor {
	
	public static Lobby instance;
	
	@Override
	public void onEnable() {
		instance = this;
		
		//commands
		getCommand("server").setExecutor(new Commands());
		//events
		getServer().getPluginManager().registerEvents(new InventoryController(), this);
	}
}
