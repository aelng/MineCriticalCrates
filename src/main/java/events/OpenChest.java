package events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import cratesPackage.CratesMain;

public class OpenChest implements Listener{
CratesMain plugin;

	public OpenChest(CratesMain plugin) {
		this.plugin = plugin;
	}

	@EventHandler
    public void catchChestOpen(PlayerInteractEvent e) {
		Player p = e.getPlayer();
            if(e.getAction() == Action.RIGHT_CLICK_BLOCK && e.getClickedBlock().getType() == Material.ENDER_CHEST) {
            	if(plugin.cM.Daily.get(p.getUniqueId().toString()) == null || plugin.cM.Legendary.get(p.getUniqueId().toString()) == null 
                		|| plugin.cM.Exotic.get(p.getUniqueId().toString()) == null || plugin.cM.Tyson.get(p.getUniqueId().toString()) == null){
    				plugin.cM.Daily.put(p.getUniqueId().toString(), 0);
    				plugin.cM.Exotic.put(p.getUniqueId().toString(), 0);
    				plugin.cM.Tyson.put(p.getUniqueId().toString(), 0);
    				plugin.cM.Legendary.put(p.getUniqueId().toString(), 0);
    			}
                e.setCancelled(true);
                plugin.cM.selectCrate(p);
            }
       
    }
}
