package fr.ismania.trash.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

import fr.ismania.trash.Main;

public class ChangeWorldListener implements Listener {

	private Main main;
	
	public ChangeWorldListener(Main main) {
		this.main = main;
	}
	
	@EventHandler
	public void onChangeWorld(PlayerTeleportEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getTo().getWorld() == main.netherLocation.getWorld()) {
			
			p.sendMessage(main.endNotHaveAcess.replace("&", "§"));
			e.setCancelled(true);
			
		}
		
	}

}
