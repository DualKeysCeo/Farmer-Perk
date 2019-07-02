package ml.loganhouston;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class EasterEggs implements Listener, CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		 Player p = (Player) sender;
		 
		 if (cmd.getName().equalsIgnoreCase("peel")) { 
			 if(p.hasPermission("farmer.heal")) {
				 p.setHealth(20);
				 p.setFoodLevel(20);
             } 
		}
		return false;
	}

}
