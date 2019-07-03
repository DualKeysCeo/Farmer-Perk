package ml.loganhouston;

import org.bukkit.CropState;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

import java.util.Arrays;
import java.util.Random;

public class CropHarvesting implements Listener {

    private ItemStack wheat = new ItemStack(Material.WHEAT, 6);
    private ItemStack melon = new ItemStack(Material.MELON, 10);
    private ItemStack carrot = new ItemStack(Material.CARROT_ITEM, 8);
    private ItemStack potato = new ItemStack(Material.POTATO_ITEM, 8);
    private ItemStack sugarcane = new ItemStack(Material.SUGAR_CANE, 6);
    private ItemStack[] drops = {wheat, melon, carrot, potato, sugarcane};
    private Material[] crops = {Material.CROPS, Material.MELON_BLOCK, Material.CARROT, Material.POTATO, Material.SUGAR_CANE_BLOCK};
    private String[] ripeCrops = {"RIPE CROPS(7)", "CARROT(7)", "SUGAR_CANE_BLOCK(5)", "POTATO(7)", "MELON(5)"};

    private Main plugin;
    public CropHarvesting(Main instance) {
        plugin = instance;
    }

    @EventHandler
    public void blockDamageEvent(BlockDamageEvent e) {
        Block block = e.getBlock();
        Player player = e.getPlayer();
        if (Arrays.asList(crops).contains(block.getType())) {
            MaterialData cropBroken = block.getState().getData();
            if (Arrays.asList(ripeCrops).contains(block.getState().getData().toString())) {
                for (int i = 0; i < crops.length; i++) {
                    if (block.getType() == crops[i]) player.getInventory().addItem(drops[i]);
                    if (block.getType() == crops[0]) player.getInventory().addItem(new ItemStack(Material.SEEDS, (int)Math.round(Math.random()+1)));
                }
            } else if (cropBroken.toString() == "SUGAR_CANE_BLOCK(0)") {
                player.getInventory().addItem(sugarcane);
            } else {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void blockBreakEvent(BlockBreakEvent e) {
        Block block = e.getBlock();
        if (block.getState().getData().toString().equals("MELON_BLOCK(0)")) e.getPlayer().getInventory().addItem(melon);
        if (Arrays.asList(crops).contains(block.getType())) {
            e.setCancelled(true);
            block.setType(Material.AIR);
        }
    }
}
