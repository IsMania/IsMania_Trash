package fr.ismania.trash.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class TrashCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		
		if(sender instanceof Player) {
			
			Player p = (Player) sender;
			
			Inventory inv = Bukkit.createInventory(null, 54, "§aIs§2M§5Trash");
			
			p.openInventory(inv);
			
		}
		
		return true;
	}

}
