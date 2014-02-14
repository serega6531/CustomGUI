package ru.serega6531.CustomGUI;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomGUI extends JavaPlugin {
	
	private Logger logger;

	@Override
	public void onEnable(){
		logger = getLogger();
		Bukkit.getPluginManager().registerEvents(new EventListener(), this);
		logger.info("CustomGUI loaded!");
	}
	
	@Override
	public void onDisable(){
		GUIList.clearList();
		logger.info("CustomGUI unloaded!");
	}

}
