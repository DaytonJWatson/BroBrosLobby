package com.watsonllc.lobby;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.watsonllc.lobby.menus.ServerSelector;

public class Commands implements CommandExecutor {

	ServerSelector serverSelector = new ServerSelector();

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("server")) {

			String permission = "brobroslobby.server";

			// Player check
			if (!(sender instanceof Player))
				return false;

			// Permission check
			if (!sender.hasPermission(permission))
				return false;

			// Do the thing
			Player player = (Player) sender;
			serverSelector.openInventory(player);
			return true;
		}
		return false;
	}
}
