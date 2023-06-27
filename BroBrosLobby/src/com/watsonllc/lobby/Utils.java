package com.watsonllc.lobby;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class Utils {
	
	public static void setLobbyInv(Player player) {
		ItemStack compass = createItemStack(Material.COMPASS, "Servers");
		ItemStack grayDye = createItemStack(Material.GRAY_DYE, "Hide Players");
		//ItemStack greenDye = createItemStack(Material.GREEN_DYE, "Show Players");
		ItemStack chest = createItemStack(Material.CHEST, "Gadgets");
		
		Inventory inv = player.getInventory();
		inv.clear();
		inv.setItem(4, grayDye);
		inv.setItem(5, compass);
		inv.setItem(6, chest);
	}
	
	public static ItemStack createItemStack(Material material, String name, String... lore) {
		ItemStack newItem = new ItemStack(material);
		ItemMeta itemMeta = newItem.getItemMeta();
		itemMeta.setDisplayName(name);
		itemMeta.setLore(Arrays.asList(lore));
		newItem.setItemMeta(itemMeta);
		return newItem;
	}
	
	public static String color(String string) {
		return ChatColor.translateAlternateColorCodes('&', string);
	}
	
	public static void addButton(Inventory inv, int slot, Material material, String displayName, String... lore) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(displayName);
        meta.setLore(Arrays.asList(lore));
        item.setItemMeta(meta);

        inv.setItem(slot, item);
    }

}
