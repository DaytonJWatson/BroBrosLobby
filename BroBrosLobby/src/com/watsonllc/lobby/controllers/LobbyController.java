package com.watsonllc.lobby.controllers;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.watsonllc.lobby.Config;
import com.watsonllc.lobby.Utils;

public class LobbyController implements Listener {

	String worldName = Config.getString("world");
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		// Lobby world check
		if(!player.getWorld().getName().equals(worldName))
			return;
		
		// Do the thing
		setLobbyInv(player);
	}
	
	// Creates the lobby inventory
	private void setLobbyInv(Player player) {
		ItemStack compass = Utils.createItemStack(Material.COMPASS, "Servers");
		ItemStack grayDye = Utils.createItemStack(Material.GRAY_DYE, "Hide Players");
		//ItemStack greenDye = createItemStack(Material.GREEN_DYE, "Show Players");
		ItemStack chest = Utils.createItemStack(Material.CHEST, "Gadgets");
		
		Inventory inv = player.getInventory();
		inv.clear();
		inv.setItem(4, grayDye);
		inv.setItem(5, compass);
		inv.setItem(6, chest);
	}
}
