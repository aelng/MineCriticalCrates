package cratesPackage;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import commands.CrateBalanceCommand;
import commands.SpawnCrate;
import events.InventoryClick;
import events.OpenChest;
import mainPackage.PowerUpsMain;

public class CratesMain extends JavaPlugin{
	public CratesManager cM;
	public PowerUpsMain api = (PowerUpsMain) Bukkit.getServer().getPluginManager().getPlugin("PowerUpsPL");
	
	public void onEnable() {
		cM = new CratesManager(this);
		getCommand("crates").setExecutor(new CrateBalanceCommand(this));
		getCommand("cspawn").setExecutor(new SpawnCrate(this));
		getServer().getPluginManager().registerEvents(new OpenChest(this), this);
		getServer().getPluginManager().registerEvents(new InventoryClick(this), this);
		
	}
}
