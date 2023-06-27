package com.watsonllc.lobby;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryController implements Listener {
	
	boolean disableClickAllInventories = Config.getBoolean("disableClickAllInventories");
	boolean disableClickGuiInventories = Config.getBoolean("disableClickGuiInventories");
	String world = Config.getString("world");
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		
		if(player.getOpenInventory() == null || player.getWorld().getName() != world)
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
