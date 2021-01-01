package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import cratesPackage.CratesMain;

public class CrateCheat implements CommandExecutor{
CratesMain plugin;

	public CrateCheat(CratesMain plugin) {
	this.plugin = plugin;
}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(p.hasPermission("crateplugin.cheats")) {
				if(args.length == 0) {
					p.sendMessage(ChatColor.RED + "You must enter some arguments (A player, crate)");
				} else if(args.length == 2) {
					Player target = Bukkit.getPlayer(args[0]);
					if(target != null) {
						if(args[1].equalsIgnoreCase("daily")) {
							plugin.cM.Daily.put(target.getUniqueId().toString(), plugin.cM.Daily.get(target.getUniqueId().toString())+1);
						}
						if(args[1].equalsIgnoreCase("exotic")) {
							plugin.cM.Exotic.put(target.getUniqueId().toString(), plugin.cM.Exotic.get(target.getUniqueId().toString())+1);
						}
						if(args[1].equalsIgnoreCase("tyson")) {
							plugin.cM.Tyson.put(target.getUniqueId().toString(), plugin.cM.Tyson.get(target.getUniqueId().toString())+1);
						}
						if(args[1].equalsIgnoreCase("legendary")) {
							plugin.cM.Legendary.put(target.getUniqueId().toString(), plugin.cM.Legendary.get(target.getUniqueId().toString())+1);
						}
					}
				}
			}
		}
		return true;
	}
}
