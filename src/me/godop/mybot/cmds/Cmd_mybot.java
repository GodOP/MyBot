package me.godop.mybot.cmds;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.godop.mybot.util.BotUtil;
import net.md_5.bungee.api.ChatColor;

public class Cmd_mybot implements CommandExecutor
{
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
	{
		if (args.length == 0)
		{
			sender.sendMessage("");
			sender.sendMessage(BotUtil.cc("&8- { &a+&8 }&7&m--&cMyBot&7&m-- &8{ &a+&8 } -"));
			sender.sendMessage(BotUtil.cc("&a/mybot information &8-&7 View the information about the bot and authors."));
			sender.sendMessage(BotUtil.cc("&a/mybot commands &8-&7 View the MyBot commands."));
			sender.sendMessage(BotUtil.cc("&8- { &a+&8 }&7&m--&cMyBot&7&m-- &8{ &a+&8 } -"));
		}
		else if (args.length == 1)
		{
			if (null != args[0])
			{
				switch (args[0])
				{
				case "information":
					sender.sendMessage("");
					sender.sendMessage(BotUtil.cc("&8{ &a+&8 }&7&m--&cMyBot &9Info&7&m-- &8{ &a+&8 }"));
		            sender.sendMessage(BotUtil.cc("&7This plugin was created by&8:"));
		            sender.sendMessage(BotUtil.cc("&eheroguy42, XGreenPlayz12."));
		            sender.sendMessage(BotUtil.cc("&7This is version&8: &ev1.0"));
		            sender.sendMessage(BotUtil.cc("&8{ &a+&8 }&7&m--&cMyBot &9Info&7&m-- &8{ &a+&8 }"));
		            return true;
				case "commands":
					sender.sendMessage("");
					sender.sendMessage(BotUtil.cc("&8{ &a+&8 }&7&m--&cMyBot &9Cmds&7&m-- &8{ &a+&8 }"));
					sender.sendMessage(BotUtil.cc("&a>mybot <op me | op please | opme | op> &8-&7 OP yourself"));
					sender.sendMessage(BotUtil.cc("&a>mybot <what is the ip | ip? | what is the server ip> &8-&7 Replies with the server's IP."));
					sender.sendMessage(BotUtil.cc("&a>mybot <heal me | heal | heal me please> &8-&7 Heals yourself."));
					sender.sendMessage(BotUtil.cc("&a>mybot <website? | what is the website? | server website? | link?> &8-&7 Heals yourself."));
					sender.sendMessage(BotUtil.cc("&a>mybot <authors | my parents | my authors | my creators> &8-&7 Shows the creators of MyBot."));
					sender.sendMessage(BotUtil.cc("&8{ &a+&8 }&7&m--&cMyBot &9Cmds&7&m-- &8{ &a+&8 }"));
					
					return true;
				}
			}
		}
		      
		
		
		
		return false;
	}
	
}
