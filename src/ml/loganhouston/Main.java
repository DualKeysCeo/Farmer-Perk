package ml.loganhouston;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {

<<<<<<< HEAD
=======
    public static Main plugin;



>>>>>>> 32b58b652272831367a59cfa2920ff0d29f7d0f4
    @Override
    public void onEnable() {
        Bukkit.broadcastMessage("Starting up...");

        getServer().getPluginManager().registerEvents(this, this);
        Bukkit.broadcastMessage("Farmer Perk starting!");
        Bukkit.broadcastMessage("88                                             \n" +
                "88                                             \n" +
                "88                                             \n" +
                "88,dPPYba,   ,adPPYba, ,adPPYYba, 8b,dPPYba,   \n" +
                "88P'    \"8a a8P_____88 \"\"     `Y8 88P'   `\"8a  \n" +
                "88       d8 8PP\"\"\"\"\"\"\" ,adPPPPP88 88       88  \n" +
                "88b,   ,a8\" \"8b,   ,aa 88,    ,88 88       88  \n" +
                "8Y\"Ybbd8\"'   `\"Ybbd8\"' `\"8bbdP\"Y8 88       88\n");
        plugin = this;
    }

    @Override
    public void onDisable() {
        Bukkit.broadcastMessage("Shutting down...");
    }

    public static Main getPlugin() {
        return plugin;
    }
}