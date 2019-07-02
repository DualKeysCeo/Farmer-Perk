package ml.loganhouston;

import com.sun.scenario.effect.Crop;
import org.bukkit.CropState;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Crops;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.logging.Logger;

public class CropHarvesting implements Listener {
	
	ArrayList<Player> playerArr = new PlayerArr().getPlayers();

	@EventHandler
	public void cropBreak(BlockDamageEvent e) {
		Block block = e.getBlock();
		Player player = e.getPlayer();
		if(playerArr.contains(player)) {
			ItemStack wheat = new ItemStack(Material.WHEAT, 6);
			ItemStack melon = new ItemStack(Material.SPECKLED_MELON, 10);
			ItemStack carrot = new ItemStack(Material.CARROT, 8);
			ItemStack potato = new ItemStack(Material.POTATO, 8);
			ItemStack sugarcane = new ItemStack(Material.SUGAR_CANE, 6);
			ItemStack crops[] = {wheat, melon, carrot, potato, sugarcane};

			Crops cropBroken = (Crops) block.getState().getData();
			if (block.getType() == Material.CROPS && cropBroken.getState() == CropState.RIPE) {
				for (int i = 0; i < crops.length; i++) {
					if (block.getType() == crops[i].getType()) {
						block.setType(Material.AIR);
						player.getInventory().addItem(crops[i]);
					}
				}
			}
		}
	}
}