package ml.loganhouston;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;

public class PlayerArr implements Listener {
   public ArrayList<Player> playerList = new ArrayList<>();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if(player.hasPermission("farmer.perk")) {
            playerList.add(player);
        }
    }

    public ArrayList<Player> getPlayers() {
        return playerList;
    }
}
