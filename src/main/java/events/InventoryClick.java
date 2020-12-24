package events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import cratesPackage.CratesMain;

public class InventoryClick implements Listener{
	CratesMain plugin;
	public InventoryClick(CratesMain plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onMenuClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getClickedInventory() != null) {
			if(e.getClickedInventory().getTitle().equalsIgnoreCase(ChatColor.GOLD + "Open " + "Crates")) {
				e.setCancelled(true);
			}
		}
	}
}
