package fr.ismania.trash.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.ismania.trash.Main;

public class CommandNether implements CommandExecutor {

	private Main main;

	public CommandNether(Main main) {
		this.main = main;
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			if(sender.hasPermission("permission.nether")) {
				
				((Player) sender).teleport(main.netherLocation);
				sender.sendMessage("§aVous avez été téléporté au nether !");
				
			} else {
				
				sender.sendMessage(main.netherNotHaveAcess.replace("&", "§"));
				
			}
			
		}
		
		return true;
	
	}

}
