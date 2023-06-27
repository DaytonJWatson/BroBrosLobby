package com.watsonllc.lobby;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Utils {
	
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
