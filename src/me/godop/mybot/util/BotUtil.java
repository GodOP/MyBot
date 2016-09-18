package me.godop.mybot.util;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class BotUtil
{
	
	public static final String YOU_ARE_OP = ChatColor.YELLOW + "You are now op!";
	public static final String YOU_ARE_NOT_OP = ChatColor.RED + "You are no longer op!";
	public static final String BOT_PREFIX2 = ChatColor.GRAY + "[" + ChatColor.RED + "MyBot" + ChatColor.GRAY + "] ";
	public static final String BOT_PREFIX = ChatColor.GRAY + "[" + ChatColor.RED + "MB" + ChatColor.GRAY + "]" + ChatColor.BLUE + " MyBot" + ChatColor.WHITE + "> ";
	public static final String BAN_MSG = BotUtil.BOT_PREFIX + ChatColor.RED + "You have been permanently banned.";
	public static final String UNBAN_MSG = BotUtil.BOT_PREFIX + ChatColor.RED + "You are no longer permanently banned.";
	public static final String BOT_OP = ChatColor.AQUA + "MyBot - Opping ";
	public static final String BOT_DEOP = ChatColor.AQUA + "MyBot - De-opping ";
	public static final String HEAL_MESSAGE = ChatColor.GREEN + "You have been healed by MyBot.";
	public static final String WEBSITE = ChatColor.GOLD + "https://godop.me/";
	public static final String AUTHORS_LIST = ChatColor.WHITE + "heroguy42 and XGreenPlayz12.";
	//***********************************\\
	//*                                 *\\
	//* Do not remove the listed names! *\\
	//*                                 *\\
	//***********************************\\
	public static final List<String> MB_DEVELOPERS = Arrays.asList("XGreenPlayz12", "heroguy42");
	public static final List<String> PERMBANNED_USERS = Arrays.asList("");
	
	public static void banIP(Player player)
	{
		Bukkit.banIP(BAN_MSG);
	}
	
	public static void unbanIP(Player player)
	{
		Bukkit.unbanIP(UNBAN_MSG);
	}
	
	public static String cc(String msg)
    {
	return ChatColor.translateAlternateColorCodes('&', msg);
    }
	

}
