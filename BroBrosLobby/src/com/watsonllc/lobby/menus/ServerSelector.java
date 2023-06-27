package com.watsonllc.lobby.menus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import com.watsonllc.lobby.Utils;

public class ServerSelector implements Listener {
	private Inventory inv;

	public ServerSelector() {
		inv = Bukkit.createInventory(null, 9, "Example");

		initializeItems();
	}

	public void initializeItems() {
		Utils.addButton(inv, 3, Material.DIAMOND, "Server 1");
		Utils.addButton(inv, 4, Material.EMERALD, "Server 2");
		Utils.addButton(inv, 5, Material.GOLD_INGOT, "Server 3", "This one has lore");
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
