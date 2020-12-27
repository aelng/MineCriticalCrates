package cratesPackage;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CratesManager {
	public HashMap<String, Integer> Daily = new HashMap<String, Integer>();
	public HashMap<String, Integer> Exotic = new HashMap<String, Integer>();
	public HashMap<String, Integer> Tyson = new HashMap<String, Integer>();
	public HashMap<String, Integer> Legendary = new HashMap<String, Integer>();
	CratesMain plugin;
	public CratesManager(CratesMain plugin) {
		this.plugin = plugin;
	}
	
	public void selectCrate(Player p) {
        ItemStack CANCEL = new ItemStack(Material.BARRIER, 1);
        ItemMeta CANCEL_meta = CANCEL.getItemMeta();
        ArrayList<String> CANCEL_lore = new ArrayList<>();
        CANCEL_meta.setDisplayName(ChatColor.RED + "CANCEL");
		CANCEL_lore.add(ChatColor.GRAY + "Exit");
		CANCEL_meta.setLore(CANCEL_lore);
        CANCEL.setItemMeta(CANCEL_meta);
        
        ItemStack LEGENDARY = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 4);
        ItemMeta LEGENDARY_meta = LEGENDARY.getItemMeta();
        ArrayList<String> LEGENDARY_lore = new ArrayList<>();
        LEGENDARY_meta.setDisplayName(ChatColor.GOLD + "LEGENDARY CRATE");
		LEGENDARY_lore.add(ChatColor.GOLD + "You have: " + Legendary.get(p.getUniqueId().toString()));
		LEGENDARY_meta.setLore(LEGENDARY_lore);
        LEGENDARY.setItemMeta(LEGENDARY_meta);
        
        ItemStack EXOTIC = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10);
        ItemMeta EXOTIC_meta = EXOTIC.getItemMeta();
        ArrayList<String> EXOTIC_lore = new ArrayList<>();
        EXOTIC_meta.setDisplayName(ChatColor.DARK_PURPLE + "EXOTIC CRATE");
		EXOTIC_lore.add(ChatColor.GOLD + "You have: " + Exotic.get(p.getUniqueId().toString()));
		EXOTIC_meta.setLore(EXOTIC_lore);
        EXOTIC.setItemMeta(EXOTIC_meta);
        
        ItemStack DAILY = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 8);
        ItemMeta DAILY_meta = DAILY.getItemMeta();
        ArrayList<String> DAILY_lore = new ArrayList<>();
        DAILY_meta.setDisplayName(ChatColor.GRAY + "DAILY CRATE");
		DAILY_lore.add(ChatColor.GOLD + "You have: " + Daily.get(p.getUniqueId().toString()));
		DAILY_meta.setLore(DAILY_lore);
        DAILY.setItemMeta(DAILY_meta);
        
        ItemStack TYSON = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14);
        ItemMeta TYSON_meta = TYSON.getItemMeta();
        ArrayList<String> TYSON_lore = new ArrayList<>();
		TYSON_meta.setDisplayName(ChatColor.DARK_RED + "TYSON CRATE");
		TYSON_lore.add(ChatColor.GOLD + "You have: " + Tyson.get(p.getUniqueId().toString()));
		TYSON_meta.setLore(TYSON_lore);
        TYSON.setItemMeta(TYSON_meta);
        
		Inventory cratesGUI = Bukkit.createInventory(p, 9, ChatColor.GOLD + "Open " + "Crates");
		
		cratesGUI.addItem(DAILY);
		cratesGUI.addItem(TYSON);
		cratesGUI.addItem(EXOTIC);
		cratesGUI.addItem(LEGENDARY);
		cratesGUI.setItem(8, CANCEL);
		
		p.openInventory(cratesGUI);
	}
}
