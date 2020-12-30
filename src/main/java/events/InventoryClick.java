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
				switch (e.getCurrentItem().getType()) {
				
				case STAINED_GLASS_PANE:
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "LEGENDARY CRATE")) {
						if(plugin.cM.Legendary.get(p.getUniqueId().toString()) > 0) {
							plugin.cM.Legendary.put(p.getUniqueId().toString(), plugin.cM.Legendary.get(p.getUniqueId().toString())-1);
							p.sendMessage("USED LEGENDARY");
						}
					}
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "EXOTIC CRATE")) {
						if(plugin.cM.Exotic.get(p.getUniqueId().toString()) > 0) {
							p.sendMessage("USED EXOTIC");
						}
					}

					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "DAILY CRATE")) {
						if(plugin.cM.Daily.get(p.getUniqueId().toString()) > 0) {
							p.sendMessage("USED DAILY");
						}
					}
					
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "TYSON CRATE")) {
						if(plugin.cM.Tyson.get(p.getUniqueId().toString()) > 0) {
							p.sendMessage("USED TYSON");
						}
					}
					p.closeInventory();
					break;
				case BARRIER:	
					p.sendMessage(ChatColor.GREEN + "You have selected " + ChatColor.DARK_GREEN + "TOXIN");
					p.closeInventory();
					break;
					
					default:
						break;
					
}
			}
		}
	}
}
