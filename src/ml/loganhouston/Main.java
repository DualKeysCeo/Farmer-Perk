package ml.loganhouston;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;


public class Main extends JavaPlugin implements Listener {

    public static Plugin plugin;
    public Logger logger = getLogger();

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        logger.info("[Farmer Perk] Commencing bean.\n"+
                "88" +
                "                                             \n" +
                "88                                             \n" +
                "88                                             \n" +
                "88,dPPYba,   ,adPPYba, ,adPPYYba, 8b,dPPYba,   \n" +
                "88P'    \"8a a8P_____88 \"\"     `Y8 88P'   `\"8a  \n" +
                "88       d8 8PP\"\"\"\"\"\"\" ,adPPPPP88 88       88  \n" +
                "88b,   ,a8\" \"8b,   ,aa 88,    ,88 88       88  \n" +
                "8Y\"Ybbd8\"'   `\"Ybbd8\"' `\"8bbdP\"Y8 88       88\n");
        logger.info("vvv Farmer Perk Startup vvv");

        logger.info("Initializing Classes");
        registerEvents(this,
                new CropHarvesting(),
                new EasterEggs(),
                new PlayerArr()
        );
        logger.info("Classes initialized");

        logger.info("Initializing Commands");
        getCommand("peel").setExecutor(new EasterEggs());
        getCommand("bean").setExecutor(new EasterEggs());
        logger.info("Commands initialized");
        logger.info("^^^ Farmer Perk Startup ^^^");

        plugin = this;
    }

    public static void registerEvents(Plugin plugin, Listener... listeners) {
        for (Listener listener: listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }

    @Override
    public void onDisable() {
        logger.warning("[Farmer Perk] Shutting down...");
        plugin = null;
    }

    public static Plugin getPlugin() {
        return plugin;
    }
}
