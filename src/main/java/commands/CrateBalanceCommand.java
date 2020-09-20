package commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import cratesPackage.CratesMain;

public class CrateBalanceCommand implements CommandExecutor{
CratesMain plugin;	

	public CrateBalanceCommand(CratesMain plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender; 
			if(plugin.cM.Daily.get(player.getUniqueId().toString()) == null){
				plugin.cM.Daily.put(player.getUniqueId().toString(), 0);
				plugin.cM.Exotic.put(player.getUniqueId().toString(), 0);
				plugin.cM.Tyson.put(player.getUniqueId().toString(), 0);
				plugin.cM.Legendary.put(player.getUniqueId().toString(), 0);
			}
			
			player.sendMessage(ChatColor.DARK_GRAY + "-------" + ChatColor.RED + "<" + ChatColor.BLUE + "CRATE" + ChatColor.RED + "KEYS" + ChatColor.BLUE + ">" + ChatColor.DARK_GRAY + "-------");
			player.sendMessage(ChatColor.GRAY + "Daily" + ChatColor.YELLOW + "Crates" + ChatColor.GRAY + ": " + ChatColor.GOLD + plugin.cM.Daily.get(player.getUniqueId().toString()));
			player.sendMessage(ChatColor.DARK_PURPLE + "Exotic" + ChatColor.YELLOW + "Crates" + ChatColor.GRAY + ": " + ChatColor.GOLD + plugin.cM.Daily.get(player.getUniqueId().toString()));
			player.sendMessage(ChatColor.RED + "Tyson" + ChatColor.YELLOW + "Crates" + ChatColor.GRAY + ": " + ChatColor.GOLD + plugin.cM.Daily.get(player.getUniqueId().toString()));
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&L&CL&6E&EG&AE&1N&9D&5A&CR&6Y") + ChatColor.YELLOW + "Crates" + ChatColor.GRAY + ": " + ChatColor.GOLD + plugin.cM.Daily.get(player.getUniqueId().toString()));
		}
		return true;
	}

}