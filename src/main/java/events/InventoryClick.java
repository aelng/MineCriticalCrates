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
							p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LUSED &6&LLEGENDARY"));
							int rando = ((int) ((Math.random()*(100 - 1))) + 1);
							 if(rando <= 45) {
								 if(!plugin.api.puM.powerUps.get("NINJA").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &0&LNINJA"));
									 plugin.api.puM.powerUps.get("NINJA").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &0&LNINJA&6, &1200xp &Lhas been credited in replacement!"));
									 plugin.api2.lM.addXp(p, 200);
								 }
							 } else if(rando > 45 && rando <= 90) {
								 if(!plugin.api.puM.powerUps.get("TANK").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &2&LTANK"));
									 plugin.api.puM.powerUps.get("TANK").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &2&LTANK&6, &1200xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 200);
								 }
							 } else if(rando > 90 && rando <= 93) {
								 if(!plugin.api.puM.powerUps.get("GRENADIER").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &A&LGRENADIER"));
									 plugin.api.puM.powerUps.get("GRENADIER").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &A&LGRENADIER&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 93 && rando <= 96) {
								 if(!plugin.api.puM.powerUps.get("GHOST").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &7&LGHOST"));
									 plugin.api.puM.powerUps.get("GHOST").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &7&LGHOST&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 96 && rando <= 100) {
								 if(!plugin.api.puM.powerUps.get("FREEZE").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &1&LFREEZE"));
									 plugin.api.puM.powerUps.get("FREEZE").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &1&LFREEZE&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 }
						}
					}
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "EXOTIC CRATE")) {
						if(plugin.cM.Exotic.get(p.getUniqueId().toString()) > 0) {
							plugin.cM.Exotic.put(p.getUniqueId().toString(), plugin.cM.Exotic.get(p.getUniqueId().toString())-1);
							p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LUSED &5&LEXOTIC"));
							int rando = ((int) ((Math.random()*(100 - 1))) + 1);
							 if(rando <= 1) {
								 if(!plugin.api.puM.powerUps.get("NURSE").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &C&LNURSE"));
									 plugin.api.puM.powerUps.get("NURSE").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &C&LNURSE&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 1 && rando <= 2) {
								 if(!plugin.api.puM.powerUps.get("HULK").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &2&LHULK"));
									 plugin.api.puM.powerUps.get("HULK").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &2&LHULK&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 2 && rando <= 3) {
								 if(!plugin.api.puM.powerUps.get("CHEMIST").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &5&LCHEMIST"));
									 plugin.api.puM.powerUps.get("CHEMIST").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &5&LCHEMIST&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 3 && rando <= 5) {
								 if(!plugin.api.puM.powerUps.get("ARCHER").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &8&LARCHER"));
									 plugin.api.puM.powerUps.get("ARCHER").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &8&LARCHER&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 5 && rando <= 10) {
								 if(!plugin.api.puM.powerUps.get("GRENADIER").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &A&LGRENADIER"));
									 plugin.api.puM.powerUps.get("GRENADIER").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &A&LGRENADIER&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 10 && rando <= 15) {
								 if(!plugin.api.puM.powerUps.get("GHOST").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &7&LGHOST"));
									 plugin.api.puM.powerUps.get("GHOST").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &7&LGHOST&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 15 && rando <= 20) {
								 if(!plugin.api.puM.powerUps.get("FREEZE").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &1&LFREEZE"));
									 plugin.api.puM.powerUps.get("FREEZE").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &1&LFREEZE&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 20 && rando <= 40) {
								 if(!plugin.api.puM.powerUps.get("FIREBALL").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &4&LFIREBALL"));
									 plugin.api.puM.powerUps.get("FIREBALL").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &4&LFIREBALL&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 } else if(rando > 40 && rando <= 60) {
								 if(!plugin.api.puM.powerUps.get("SNOWMAN").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &1&LSNOWMAN"));
									 plugin.api.puM.powerUps.get("SNOWMAN").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &1&LSNOWMAN&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 } else if(rando > 60 && rando <= 80) {
								 if(!plugin.api.puM.powerUps.get("FLASH").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &E&LFLASH"));
									 plugin.api.puM.powerUps.get("FLASH").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &E&LFLASH&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 } else if(rando > 80 && rando <= 100) {
								 if(!plugin.api.puM.powerUps.get("TOXIN").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &A&LTOXIN"));
									 plugin.api.puM.powerUps.get("TOXIN").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &A&LTOXIN&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 }
						}
					}

					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "DAILY CRATE")) {
						if(plugin.cM.Daily.get(p.getUniqueId().toString()) > 0) {
							plugin.cM.Daily.put(p.getUniqueId().toString(), plugin.cM.Daily.get(p.getUniqueId().toString())-1);
							p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LUSED &7&LDAILY"));
							int rando = ((int) ((Math.random()*(100 - 1))) + 1);
							 if(rando <= 20) {
								 if(!plugin.api.puM.powerUps.get("NURSE").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &C&LNURSE"));
									 plugin.api.puM.powerUps.get("NURSE").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &C&LNURSE&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 20 && rando <= 40) {
								 if(!plugin.api.puM.powerUps.get("CHEMIST").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &5&LCHEMIST"));
									 plugin.api.puM.powerUps.get("CHEMIST").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &5&LCHEMIST&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 40 && rando <= 60) {
								 if(!plugin.api.puM.powerUps.get("ARCHER").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &8&LARCHER"));
									 plugin.api.puM.powerUps.get("ARCHER").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &8&LARCHER&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 60 && rando <= 80) {
								 if(!plugin.api.puM.powerUps.get("HULK").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &2&LHULK"));
									 plugin.api.puM.powerUps.get("HULK").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &2&LHULK&6, &120xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 20);
								 }
							 } else if(rando > 80 && rando <= 85) {
								 if(!plugin.api.puM.powerUps.get("FIREBALL").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &4&LFIREBALL"));
									 plugin.api.puM.powerUps.get("FIREBALL").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &4&LFIREBALL&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 } else if(rando > 85 && rando <= 90) {
								 if(!plugin.api.puM.powerUps.get("TOXIN").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &A&LTOXIN"));
									 plugin.api.puM.powerUps.get("TOXIN").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &A&LTOXIN&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 } else if(rando > 90 && rando <= 95) {
								 if(!plugin.api.puM.powerUps.get("SNOWMAN").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &1&LSNOWMAN"));
									 plugin.api.puM.powerUps.get("SNOWMAN").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &1&LSNOWMAN&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 } else if(rando > 95 && rando <= 100) {
								 if(!plugin.api.puM.powerUps.get("FLASH").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &E&LFLASH"));
									 plugin.api.puM.powerUps.get("FLASH").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &E&LFLASH&6, &150xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 50);
								 }
							 }
						}
					}
					
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "TYSON CRATE")) {
						if(plugin.cM.Tyson.get(p.getUniqueId().toString()) > 0) {
							plugin.cM.Tyson.put(p.getUniqueId().toString(), plugin.cM.Tyson.get(p.getUniqueId().toString())-1);
							p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LUSED &4&LTYSON"));
							int rando = ((int) ((Math.random()*(100 - 1))) + 1);
							 if(rando <= 30) {
								 if(!plugin.api.puM.powerUps.get("GRENADIER").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &A&LGRENADIER"));
									 plugin.api.puM.powerUps.get("GRENADIER").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &A&LGRENADIER&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 30 && rando <= 60) {
								 if(!plugin.api.puM.powerUps.get("GHOST").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &7&LGHOST"));
									 plugin.api.puM.powerUps.get("GHOST").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &7&LGHOST&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 60 && rando <= 90) {
								 if(!plugin.api.puM.powerUps.get("FREEZE").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &1&LFREEZE"));
									 plugin.api.puM.powerUps.get("FREEZE").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &1&LFREEZE&6, &1100xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 100);
								 }
							 } else if(rando > 90 && rando <= 95) {
								 if(!plugin.api.puM.powerUps.get("NINJA").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &0&LNINJA"));
									 plugin.api.puM.powerUps.get("NINJA").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &0&LNINJA&6, &1200xp &Lhas been credited in replacement!"));
									 plugin.api2.lM.addXp(p, 200);
								 }
							 } else if(rando > 95 && rando <= 100) {
								 if(!plugin.api.puM.powerUps.get("TANK").contains(p)) {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&L YOU HAVE RECEIVED &2&LTANK"));
									 plugin.api.puM.powerUps.get("TANK").add(p);
								 } else {
									 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&LYou already have &2&LTANK&6, &1200xp &Lhas been credited to you in replacement!"));
									 plugin.api2.lM.addXp(p, 200);
								 }
							 }
						}
					}
					p.closeInventory();
					break;
				case BARRIER:	
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&LEXITED"));
					p.closeInventory();
					break;
					
					default:
						break;
					
}
		while(true) {
			if(plugin.api2.lM.PlayerXp.get(p.getUniqueId().toString()) >= 50) {
				plugin.api2.lM.levelUp(p);
			} else {
				break;
			}
		}
			}
		}
	}
}
