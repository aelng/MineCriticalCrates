package cratesPackage;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import commands.CrateBalanceCommand;
import commands.CrateCheat;
import commands.SpawnCrate;
import events.InventoryClick;
import events.OpenChest;
import mainPackage.LevelMain;
import mainPackage.PowerUpsMain;

public class CratesMain extends JavaPlugin{
	public CratesManager cM;
	public PowerUpsMain api = (PowerUpsMain) Bukkit.getServer().getPluginManager().getPlugin("PowerUpsPL");
	public LevelMain api2 = (LevelMain) Bukkit.getServer().getPluginManager().getPlugin("LevelsPlugin");
	
	public void onEnable() {
		cM = new CratesManager(this);
		getCommand("crates").setExecutor(new CrateBalanceCommand(this));
		getCommand("cspawn").setExecutor(new SpawnCrate(this));
		getCommand("cgive").setExecutor(new CrateCheat(this));
		getServer().getPluginManager().registerEvents(new OpenChest(this), this);
		getServer().getPluginManager().registerEvents(new InventoryClick(this), this);
		
		getConfig().options().copyDefaults();
		saveDefaultConfig();
		getConfig().getConfigurationSection("daily").getKeys(false).forEach(string -> cM.Daily.put(string, getConfig().getInt("daily." + string)));
		getConfig().getConfigurationSection("tyson").getKeys(false).forEach(string -> cM.Tyson.put(string, getConfig().getInt("tyson." + string)));
		getConfig().getConfigurationSection("legendary").getKeys(false).forEach(string -> cM.Legendary.put(string, getConfig().getInt("legendary." + string)));
		getConfig().getConfigurationSection("exotic").getKeys(false).forEach(string -> cM.Exotic.put(string, getConfig().getInt("exotic." + string)));
	}
	
	public void onDisable() {
		cM.Daily.keySet().forEach(string -> getConfig().set("daily." + string, cM.Daily.get(string)));
		cM.Tyson.keySet().forEach(string -> getConfig().set("tyson." + string, cM.Tyson.get(string)));
		cM.Exotic.keySet().forEach(string -> getConfig().set("exotic." + string, cM.Exotic.get(string)));
		cM.Legendary.keySet().forEach(string -> getConfig().set("legendary." + string, cM.Legendary.get(string)));
		saveConfig();
	}
}
