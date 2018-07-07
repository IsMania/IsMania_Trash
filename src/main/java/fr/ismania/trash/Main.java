package fr.ismania.trash;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import fr.ismania.trash.commands.TrashCommand;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		
		Bukkit.getLogger().info("[Trash] Plugin activé !");
		
		getCommand("trash").setExecutor(new TrashCommand());
		
	}
	
	@Override
	public void onDisable() {
		
		Bukkit.getLogger().info("[Trash] Plugin désactivé !");
		
	}
	
}
