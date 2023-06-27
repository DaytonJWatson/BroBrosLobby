package com.watsonllc.lobby;

public class Config {
	
	public static void create() {
		Lobby.instance.getConfig().options().copyDefaults(true);
		Lobby.instance.saveDefaultConfig();
	}
	
	public static void save() {
		Lobby.instance.saveConfig();
	}
	
	public static String getString(String path) {
		return Lobby.instance.getConfig().getString(path);
	}
	
	public static boolean getBoolean(String path) {
		return Lobby.instance.getConfig().getBoolean(path);
	}
	
}
