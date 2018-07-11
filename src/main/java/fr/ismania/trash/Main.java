package fr.ismania.trash;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import fr.ismania.trash.commands.CommandEnd;
import fr.ismania.trash.commands.CommandNether;
import fr.ismania.trash.commands.TrashCommand;
import fr.ismania.trash.listeners.ChangeWorldListener;

public class Main extends JavaPlugin {

	public String netherNotHaveAcess;
	public String endNotHaveAcess;
	public Location netherLocation;
	public Location endLocation;
	
	@Override
	public void onEnable() {
		
		Bukkit.getLogger().info("[Trash] Plugin activé !");
		
		saveDefaultConfig();
		
		netherNotHaveAcess = getConfig().getString("nether.messages.not_acess");
		endNotHaveAcess = getConfig().getString("end.messages.not_acess");
		
		netherLocation = new Location(Bukkit.getWorld(getConfig().getString("nether.location.world")), getConfig().getDouble("nether.location.x"), getConfig().getDouble("nether.location.y"), getConfig().getDouble("nether.location.z"));
		endLocation = new Location(Bukkit.getWorld(getConfig().getString("end.location.world")), getConfig().getDouble("end.location.x"), getConfig().getDouble("end.location.y"), getConfig().getDouble("end.location.z"));
		
		getCommand("trash").setExecutor(new TrashCommand());
		getCommand("nether").setExecutor(new CommandNether(this));
		getCommand("end").setExecutor(new CommandEnd(this));
		
		getServer().getPluginManager().registerEvents(new ChangeWorldListener(this), this);
		
	}
	
	@Override
	public void onDisable() {
		
		Bukkit.getLogger().info("[Trash] Plugin désactivé !");
		
	}
	
}
