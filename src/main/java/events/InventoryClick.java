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
								 if(!plugin.api.puM.powerUps.get("NINJA").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &0NINJA"));
									 plugin.api.puM.powerUps.get("NINJA").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &0NINJA&6, &1200xp &Lhas been credited in replacement!"));
									 plugin.api2.lM.addXp(p, 200);
								 }
							 } else if(rando > 45 && rando <= 90) {
								 if(!plugin.api.puM.powerUps.get("TANK").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &2TANK"));
									 plugin.api.puM.powerUps.get("TANK").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &2TANK&6, &1200xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 200);
								 }
							 } else if(rando > 90 && rando <= 93) {
								 if(!plugin.api.puM.powerUps.get("GRENADIER").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &AGRENADIER"));
									 plugin.api.puM.powerUps.get("GRENADIER").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &AGRENADIER&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 93 && rando <= 96) {
								 if(!plugin.api.puM.powerUps.get("GHOST").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &7GHOST"));
									 plugin.api.puM.powerUps.get("GHOST").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &7GHOST&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 96 && rando <= 100) {
								 if(!plugin.api.puM.powerUps.get("FREEZE").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &1FREEZE"));
									 plugin.api.puM.powerUps.get("FREEZE").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &1FREEZE&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 }
						}
					}
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "EXOTIC CRATE")) {
						if(plugin.cM.Exotic.get(p.getUniqueId().toString()) > 0) {
							plugin.cM.Exotic.put(p.getUniqueId().toString(), plugin.cM.Exotic.get(p.getUniqueId().toString())-1);
							p.sendMessage("USED EXOTIC");
							int rando = ((int) ((Math.random()*(100 - 1))) + 1);
							 if(rando <= 1) {
								 if(!plugin.api.puM.powerUps.get("NURSE").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &CNURSE"));
									 plugin.api.puM.powerUps.get("NURSE").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &CNURSE&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 1 && rando <= 2) {
								 if(!plugin.api.puM.powerUps.get("HULK").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &2HULK"));
									 plugin.api.puM.powerUps.get("HULK").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &2HULK&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 2 && rando <= 3) {
								 if(!plugin.api.puM.powerUps.get("CHEMIST").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &5CHEMIST"));
									 plugin.api.puM.powerUps.get("CHEMIST").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &5CHEMIST&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 3 && rando <= 5) {
								 if(!plugin.api.puM.powerUps.get("ARCHER").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &8ARCHER"));
									 plugin.api.puM.powerUps.get("ARCHER").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &8ARCHER&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 5 && rando <= 10) {
								 if(!plugin.api.puM.powerUps.get("GRENADIER").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &AGRENADIER"));
									 plugin.api.puM.powerUps.get("GRENADIER").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &AGRENADIER&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 10 && rando <= 15) {
								 if(!plugin.api.puM.powerUps.get("GHOST").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &7GHOST"));
									 plugin.api.puM.powerUps.get("GHOST").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &7GHOST&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 15 && rando <= 20) {
								 if(!plugin.api.puM.powerUps.get("FREEZE").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &1FREEZE"));
									 plugin.api.puM.powerUps.get("FREEZE").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &1FREEZE&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 20 && rando <= 40) {
								 if(!plugin.api.puM.powerUps.get("FIREBALL").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &4FIREBALL"));
									 plugin.api.puM.powerUps.get("FIREBALL").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &4FIREBALL&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 } else if(rando > 40 && rando <= 60) {
								 if(!plugin.api.puM.powerUps.get("SNOWMAN").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &1SNOWMAN"));
									 plugin.api.puM.powerUps.get("SNOWMAN").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &1SNOWMAN&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 } else if(rando > 60 && rando <= 80) {
								 if(!plugin.api.puM.powerUps.get("FLASH").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &EFLASH"));
									 plugin.api.puM.powerUps.get("FLASH").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &EFLASH&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 } else if(rando > 80 && rando <= 100) {
								 if(!plugin.api.puM.powerUps.get("TOXIN").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &ATOXIN"));
									 plugin.api.puM.powerUps.get("TOXIN").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &ATOXIN&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 }
						}
					}

					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "DAILY CRATE")) {
						if(plugin.cM.Daily.get(p.getUniqueId().toString()) > 0) {
							plugin.cM.Daily.put(p.getUniqueId().toString(), plugin.cM.Daily.get(p.getUniqueId().toString())-1);
							p.sendMessage("USED DAILY");
							int rando = ((int) ((Math.random()*(100 - 1))) + 1);
							 if(rando <= 20) {
								 if(!plugin.api.puM.powerUps.get("NURSE").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &CNURSE"));
									 plugin.api.puM.powerUps.get("NURSE").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &CNURSE&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 20 && rando <= 40) {
								 if(!plugin.api.puM.powerUps.get("CHEMIST").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &5CHEMIST"));
									 plugin.api.puM.powerUps.get("CHEMIST").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &5CHEMIST&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 40 && rando <= 60) {
								 if(!plugin.api.puM.powerUps.get("ARCHER").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &8ARCHER"));
									 plugin.api.puM.powerUps.get("ARCHER").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &8ARCHER&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 60 && rando <= 80) {
								 if(!plugin.api.puM.powerUps.get("HULK").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &2HULK"));
									 plugin.api.puM.powerUps.get("HULK").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &2HULK&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 80 && rando <= 85) {
								 if(!plugin.api.puM.powerUps.get("FIREBALL").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &4FIREBALL"));
									 plugin.api.puM.powerUps.get("FIREBALL").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &4FIREBALL&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 } else if(rando > 85 && rando <= 90) {
								 if(!plugin.api.puM.powerUps.get("TOXIN").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &ATOXIN"));
									 plugin.api.puM.powerUps.get("TOXIN").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &ATOXIN&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 } else if(rando > 90 && rando <= 95) {
								 if(!plugin.api.puM.powerUps.get("SNOWMAN").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &1SNOWMAN"));
									 plugin.api.puM.powerUps.get("SNOWMAN").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &1SNOWMAN&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 } else if(rando > 95 && rando <= 100) {
								 if(!plugin.api.puM.powerUps.get("FLASH").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &EFLASH"));
									 plugin.api.puM.powerUps.get("FLASH").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &EFLASH&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 }
						}
					}
					
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "TYSON CRATE")) {
						if(plugin.cM.Tyson.get(p.getUniqueId().toString()) > 0) {
							plugin.cM.Tyson.put(p.getUniqueId().toString(), plugin.cM.Tyson.get(p.getUniqueId().toString())-1);
							p.sendMessage("USED TYSON");
							int rando = ((int) ((Math.random()*(100 - 1))) + 1);
							 if(rando <= 30) {
								 if(!plugin.api.puM.powerUps.get("GRENADIER").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &AGRENADIER"));
									 plugin.api.puM.powerUps.get("GRENADIER").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &AGRENADIER&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 30 && rando <= 60) {
								 if(!plugin.api.puM.powerUps.get("GHOST").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &7GHOST"));
									 plugin.api.puM.powerUps.get("GHOST").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &7GHOST&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 60 && rando <= 90) {
								 if(!plugin.api.puM.powerUps.get("FREEZE").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &1FREEZE"));
									 plugin.api.puM.powerUps.get("FREEZE").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &1FREEZE&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 90 && rando <= 95) {
								 if(!plugin.api.puM.powerUps.get("NINJA").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &0NINJA"));
									 plugin.api.puM.powerUps.get("NINJA").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &0NINJA&6, &1200xp &Lhas been credited in replacement!"));
									 plugin.api2.lM.addXp(p, 200);
								 }
							 } else if(rando > 95 && rando <= 100) {
								 if(!plugin.api.puM.powerUps.get("TANK").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6 YOU HAVE RECEIVED &2TANK"));
									 plugin.api.puM.powerUps.get("TANK").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&6You already have &2TANK&6, &1200xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 200);
								 }
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
