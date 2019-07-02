package ml.loganhouston;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

public class Crops implements Listener {
	
	Perk perk = new Perk();
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if(perk.Perk.contains(p)) {
			ItemStack wheat = new ItemStack(Material.WHEAT, 6);
			ItemStack melon = new ItemStack(Material.SPECKLED_MELON, 10);
			ItemStack carrot = new ItemStack(Material.CARROT, 8);
			ItemStack potato = new ItemStack(Material.POTATO, 8);
			ItemStack sugarcane = new ItemStack(Material.SUGAR_CANE, 6);

			
			ItemStack wheat2 = new ItemStack(Material.WHEAT);
            MaterialData wd = wheat2.getData();
            if(wd.getData()== 3) {
			    if (e.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
		          if(e.getClickedBlock().getType() == Material.WHEAT) {
		              e.getItem().setType(Material.AIR);
		        	  e.getPlayer().getInventory().addItem(wheat);
		        }
		        else
		        {
		        	if (e.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
				        if(e.getClickedBlock().getType() == Material.SUGAR_CANE_BLOCK) {
				            e.getItem().setType(Material.AIR);
				        	e.getPlayer().getInventory().addItem(sugarcane);
				        }
				        else 
				        {
				        	if (e.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
						        if(e.getClickedBlock().getType() == Material.MELON_BLOCK) {
						            e.getItem().setType(Material.AIR);
						        	e.getPlayer().getInventory().addItem(melon);	
				        }
				        	}
				        	else
				        	{ 
				        		if (e.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
				    		        if(e.getClickedBlock().getType() == Material.CARROT) {
				    		            e.getItem().setType(Material.AIR);
				    		        	e.getPlayer().getInventory().addItem(carrot);
				        	}
				        		}
				        		else
				        		{
				        			if (e.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
				        		        if(e.getClickedBlock().getType() == Material.POTATO) {
				        		            e.getItem().setType(Material.AIR);
				        		        	e.getPlayer().getInventory().addItem(potato);
				        		}
		}
	}
		}
	}
		        	}
		        }
			    }
		}
		}
	}
}
