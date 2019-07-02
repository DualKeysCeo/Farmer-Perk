package ml.loganhouston;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class EasterEggs implements Listener, CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player p = (Player) sender;

        if (sender instanceof Player) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Command Executor Works"));
        } else {
            sender.sendMessage("You cant use any Farmer-Perk commands in the terminal!");
        }

        if (cmd.getName().equalsIgnoreCase("peel")) {
            p.setHealth(20);
            p.setFoodLevel(20);
            p.setSaturation(20);
        } else if (cmd.getName().equalsIgnoreCase("bean")) {
            ItemStack bean = new ItemStack(Material.COCOA, 1);
            ItemMeta beanMeta = bean.getItemMeta();
            beanMeta.setDisplayName("§Beans");
            bean.setItemMeta(beanMeta);
            p.getInventory().addItem(bean);
        }
        return false;
    }

}
