package ml.loganhouston;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;

public class Perk implements Listener {
   public ArrayList<Player> Perk = new ArrayList<Player>();

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if(player.hasPermission("farmer.perk")) {
        	Perk.add(player);
        }


    }

}
