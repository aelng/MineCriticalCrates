package cratesPackage;

import org.bukkit.plugin.java.JavaPlugin;

import commands.CrateBalanceCommand;
import commands.SpawnCrate;
import events.InventoryClick;
import events.OpenChest;

public class CratesMain extends JavaPlugin{
	public CratesManager cM;
	
	public void onEnable() {
		cM = new CratesManager(this);
		getCommand("crates").setExecutor(new CrateBalanceCommand(this));
		getCommand("cspawn").setExecutor(new SpawnCrate(this));
		getServer().getPluginManager().registerEvents(new OpenChest(this), this);
		getServer().getPluginManager().registerEvents(new InventoryClick(this), this);
		
	}
}
