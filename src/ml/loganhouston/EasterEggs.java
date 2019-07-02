package ml.loganhouston;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class EasterEggs implements Listener, CommandExecutor {

    @EventHandler
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player p = (Player) sender;

        switch (cmd.getName().toLowerCase()) {
            case "peel":
                p.setHealth(20);
                p.setFoodLevel(20);
                p.setSaturation(20);
                break;
            case "bean":
                ItemStack bean = new ItemStack(Material.COCOA, 1);
                ItemMeta beanMeta = bean.getItemMeta();
                beanMeta.setDisplayName("§Beans");
                bean.setItemMeta(beanMeta);
                p.getInventory().addItem(bean);
                break;
        }
        return false;
    }

}
