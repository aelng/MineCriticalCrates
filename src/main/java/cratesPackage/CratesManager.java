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
		LEGENDARY_lore.add(ChatColor.GOLD + "Contains multiple rare powerups");
		LEGENDARY_meta.setLore(LEGENDARY_lore);
        LEGENDARY.setItemMeta(LEGENDARY_meta);
        
        ItemStack Exotic = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10);
        ItemMeta Exotic_meta = Exotic.getItemMeta();
        ArrayList<String> Exotic_lore = new ArrayList<>();
        Exotic_meta.setDisplayName(ChatColor.DARK_PURPLE + "EXOTIC CRATE");
		Exotic_lore.add(ChatColor.GOLD + "Contains multiple rare powerups");
		Exotic_meta.setLore(Exotic_lore);
        Exotic.setItemMeta(Exotic_meta);
        
        ItemStack Daily = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 8);
        ItemMeta Daily_meta = Daily.getItemMeta();
        ArrayList<String> Daily_lore = new ArrayList<>();
        Daily_meta.setDisplayName(ChatColor.GRAY + "DAILY CRATE");
		Daily_lore.add(ChatColor.GOLD + "Contains multiple rare powerups");
		Daily_meta.setLore(Daily_lore);
        Daily.setItemMeta(Daily_meta);
        
        ItemStack Tyson = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14);
        ItemMeta Tyson_meta = Tyson.getItemMeta();
        ArrayList<String> Tyson_lore = new ArrayList<>();
		Tyson_meta.setDisplayName(ChatColor.DARK_RED + "TYSON CRATE");
		Tyson_lore.add(ChatColor.GOLD + "Contains multiple rare powerups");
		Tyson_meta.setLore(Tyson_lore);
        Tyson.setItemMeta(Tyson_meta);
        
		Inventory cratesGUI = Bukkit.createInventory(p, 9, ChatColor.GOLD + "Open " + "Crates");
		
		cratesGUI.addItem(Daily);
		cratesGUI.addItem(Tyson);
		cratesGUI.addItem(Exotic);
		cratesGUI.addItem(LEGENDARY);
		cratesGUI.setItem(8, CANCEL);
		
		p.openInventory(cratesGUI);
	}
}
