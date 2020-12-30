package commands;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
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
			
			World w = p.getWorld();
            Location chestLoc = new Location(w, p.getLocation().getX(), p.getLocation().getY(), p.getLocation().getZ());
            chestLoc.getBlock().setType(Material.CHEST);
			ArmorStand hologram  = (ArmorStand) p.getWorld().spawnEntity(p.getLocation().add(0, -1, 0), EntityType.ARMOR_STAND);
			hologram.setVisible(false);
			hologram.setCustomNameVisible(true);
			hologram.setCustomName(ChatColor.BLUE + "<" + ChatColor.RED + "CRATES" + ChatColor.BLUE + ">");
			hologram.setGravity(false);
			
		}
		return true;
	}

}
