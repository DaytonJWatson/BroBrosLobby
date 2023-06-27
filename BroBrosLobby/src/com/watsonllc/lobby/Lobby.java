package com.watsonllc.lobby;



import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import com.watsonllc.lobby.controllers.InventoryController;
import com.watsonllc.lobby.controllers.LobbyController;

public class Lobby extends JavaPlugin implements CommandExecutor {
	
	public static Lobby instance;
	
	@Override
	public void onEnable() {
		instance = this;
		
		Config.create();
		
		//commands
		getCommand("server").setExecutor(new Commands());
		//events
		getServer().getPluginManager().registerEvents(new InventoryController(), this);
		getServer().getPluginManager().registerEvents(new LobbyController(), this);
	}
}
