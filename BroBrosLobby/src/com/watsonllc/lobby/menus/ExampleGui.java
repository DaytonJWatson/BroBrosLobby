package com.watsonllc.lobby.menus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import com.watsonllc.lobby.Utils;

public class ExampleGui implements Listener {
	private Inventory inv;

	public ExampleGui() {
		inv = Bukkit.createInventory(null, 9, "Example");

		initializeItems();
	}

	public void initializeItems() {
		Utils.addButton(inv, 4, Material.DIAMOND, "Example Button");
	}

	public void openInventory(Player player) {
		player.openInventory(inv);
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		
		if(player.getOpenInventory() == inv) 
			return;
		
		event.setCancelled(true);
	}
}