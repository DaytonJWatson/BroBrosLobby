package com.watsonllc.lobby;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.watsonllc.lobby.menus.ServerSelector;

public class Commands implements CommandExecutor {
	
	ServerSelector ss = new ServerSelector();
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("server")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                ss.openInventory(player);
                return true;
            }
        }
        return false;
    }
}
