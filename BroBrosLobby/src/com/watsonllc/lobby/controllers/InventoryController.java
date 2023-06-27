package com.watsonllc.lobby.controllers;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.watsonllc.lobby.Config;

public class InventoryController implements Listener {
	
	boolean disableClickAllInventories = Config.getBoolean("disableClickAllInventories");
	boolean disableClickGuiInventories = Config.getBoolean("disableClickGuiInventories");
	String worldName = Config.getString("world");
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		
		// Null check
		if(player.getOpenInventory() == null)
			return;
		
		// Lobby world check
		if(player.getWorld().getName() != worldName)
			return;
		
		// disableClickGuiInventories isnt finished
		if(disableClickAllInventories || disableClickGuiInventories	)
			event.setCancelled(true);
		
		/**
		 * example for individual inventories
		if(player.getOpenInventory().getTitle() != "ExampleGui")
			return;*/
	}
}
