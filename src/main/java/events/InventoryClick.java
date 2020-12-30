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
							int rando = ((int) ((Math.random()*(100 - 1))) + 1);
							 if(rando <= 45) {
								 p.sendMessage("YOU GOT NINJA");
							 } else if(rando > 45 && rando <= 90) {
								 p.sendMessage("YOU GOT TANK");
							 } else if(rando > 90 && rando <= 93) {
								 p.sendMessage("YOU GOT GRENADIER");
							 } else if(rando > 93 && rando <= 96) {
								 p.sendMessage("YOU GOT GHOST");
							 } else if(rando > 96 && rando <= 100) {
								 p.sendMessage("YOU GOT FREEZE");
							 }
						}
					}
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "EXOTIC CRATE")) {
						if(plugin.cM.Exotic.get(p.getUniqueId().toString()) > 0) {
							plugin.cM.Exotic.put(p.getUniqueId().toString(), plugin.cM.Exotic.get(p.getUniqueId().toString())-1);
							p.sendMessage("USED EXOTIC");
							int rando = ((int) ((Math.random()*(100 - 1))) + 1);
							 if(rando <= 1) {
								 p.sendMessage("YOU GOT NURSE");
							 } else if(rando > 1 && rando <= 2) {
								 p.sendMessage("YOU GOT HULK");
							 } else if(rando > 2 && rando <= 3) {
								 p.sendMessage("YOU GOT CHEMIST");
							 } else if(rando > 3 && rando <= 5) {
								 p.sendMessage("YOU GOT ARCHER");
							 } else if(rando > 5 && rando <= 10) {
								 p.sendMessage("YOU GOT GRENADIER");
							 } else if(rando > 10 && rando <= 15) {
								 p.sendMessage("YOU GOT GHOST");
							 } else if(rando > 15 && rando <= 20) {
								 p.sendMessage("YOU GOT FREEZE");
							 } else if(rando > 20 && rando <= 40) {
								 p.sendMessage("YOU GOT FIREBALL");
							 } else if(rando > 40 && rando <= 60) {
								 p.sendMessage("YOU GOT SNOWMAN");
							 } else if(rando > 60 && rando <= 80) {
								 p.sendMessage("YOU GOT FLASH");
							 } else if(rando > 80 && rando <= 100) {
								 p.sendMessage("YOU GOT TOXIN");
							 }
						}
					}

					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "DAILY CRATE")) {
						if(plugin.cM.Daily.get(p.getUniqueId().toString()) > 0) {
							plugin.cM.Daily.put(p.getUniqueId().toString(), plugin.cM.Daily.get(p.getUniqueId().toString())-1);
							p.sendMessage("USED DAILY");
							int rando = ((int) ((Math.random()*(100 - 1))) + 1);
							 if(rando <= 20) {
								 p.sendMessage("YOU GOT NURSE");
							 } else if(rando > 20 && rando <= 40) {
								 p.sendMessage("YOU GOT CHEMIST");
							 } else if(rando > 40 && rando <= 60) {
								 p.sendMessage("YOU GOT ARCHER");
							 } else if(rando > 60 && rando <= 80) {
								 p.sendMessage("YOU GOT HULK");
							 } else if(rando > 80 && rando <= 85) {
								 p.sendMessage("YOU GOT FIREBALL");
							 } else if(rando > 85 && rando <= 90) {
								 p.sendMessage("YOU GOT TOXIN");
							 } else if(rando > 90 && rando <= 95) {
								 p.sendMessage("YOU GOT SNOWMAN");
							 } else if(rando > 95 && rando <= 100) {
								 p.sendMessage("YOU GOT FLASH");
							 }
						}
					}
					
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "TYSON CRATE")) {
						if(plugin.cM.Tyson.get(p.getUniqueId().toString()) > 0) {
							plugin.cM.Tyson.put(p.getUniqueId().toString(), plugin.cM.Tyson.get(p.getUniqueId().toString())-1);
							p.sendMessage("USED TYSON");
							int rando = ((int) ((Math.random()*(100 - 1))) + 1);
							 if(rando <= 30) {
								 p.sendMessage("YOU GOT GRENADIER");
							 } else if(rando > 30 && rando <= 60) {
								 p.sendMessage("YOU GOT GHOST");
							 } else if(rando > 60 && rando <= 90) {
								 p.sendMessage("YOU GOT FREEZE");
							 } else if(rando > 90 && rando <= 95) {
								 p.sendMessage("YOU GOT NINJA");
							 } else if(rando > 95 && rando <= 100) {
								 p.sendMessage("YOU GOT TANK");
							 }
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
