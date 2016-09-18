package me.godop.mybot;

import java.util.logging.Logger;

import org.bukkit.Server;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.godop.mybot.cmds.Cmd_mybot;
import me.godop.mybot.listener.BotListener;

public class MyBot extends JavaPlugin
{
	public static MyBot plugin;
	public static Server server;
	
	
	public void onLoad()
	{
		plugin = this;
	}
	
	@Override
	public void onEnable()
	{
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		final PluginManager pm = plugin.getServer().getPluginManager();
        pm.registerEvents(new BotListener(), plugin);
		
		this.getCommand("mybot").setExecutor(new Cmd_mybot());

		logger.info(pdfFile.getName() + " has been enabled (V." + pdfFile.getVersion() + ")");
	}

	@Override
	public void onDisable()
	{
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		logger.info(pdfFile.getName() + "has been disabled (V." + pdfFile.getVersion() + ")");
	}

}
