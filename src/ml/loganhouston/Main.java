package ml.loganhouston;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {

    public static Main plugin;


    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        Bukkit.getLogger().info("[Farmer Perk] Commencing bean.\n"+
                "88" +
                "                                             \n" +
                "88                                             \n" +
                "88                                             \n" +
                "88,dPPYba,   ,adPPYba, ,adPPYYba, 8b,dPPYba,   \n" +
                "88P'    \"8a a8P_____88 \"\"     `Y8 88P'   `\"8a  \n" +
                "88       d8 8PP\"\"\"\"\"\"\" ,adPPPPP88 88       88  \n" +
                "88b,   ,a8\" \"8b,   ,aa 88,    ,88 88       88  \n" +
                "8Y\"Ybbd8\"'   `\"Ybbd8\"' `\"8bbdP\"Y8 88       88\n");
        Bukkit.broadcastMessage("Farmer Perk starting!");
        plugin = this;
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().warning("[Farmer Perk] Shutting down...");
    }

    public static Main getPlugin() {
        return plugin;
    }
}
