package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import cratesPackage.CratesMain;
import net.md_5.bungee.api.ChatColor;

public class SpawnCrate implements CommandExecutor{
CratesMain plugin;
	public SpawnCrate(CratesMain plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			
			ArmorStand hologram  = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
			hologram.setVisible(false);
			hologram.setCustomNameVisible(true);
			hologram.setGravity(false);
			hologram.setCustomName(ChatColor.translateAlternateColorCodes('&',"&L&1<&CMINE&1CRITICAL &CCRATES&1>"));
		}
		return true;
	}

}
