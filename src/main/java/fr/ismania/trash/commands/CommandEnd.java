package fr.ismania.trash.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.ismania.trash.Main;

public class CommandEnd implements CommandExecutor {

	private Main main;

	public CommandEnd(Main main) {
		this.main = main;
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(sender instanceof Player) {

			if(sender.hasPermission("permission.end")) {

				((Player) sender).teleport(main.endLocation);
				sender.sendMessage("§aVous avez été téléporté dans l'end !");

			} else {

				sender.sendMessage(main.endNotHaveAcess.replace("&", "§"));

			}

		}

		return true;

	}

}
