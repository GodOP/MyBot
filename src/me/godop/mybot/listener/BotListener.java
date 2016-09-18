package me.godop.mybot.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerLoginEvent;

import me.godop.mybot.util.BotUtil;

public class BotListener implements Listener
{
	
	@EventHandler
	private void handleChatEvent(AsyncPlayerChatEvent event)
	{
		Player player = event.getPlayer();
        String message = event.getMessage();
		
		if (message.toLowerCase().contains(">mybot op me") || message.toLowerCase().contains("op please") || message.toLowerCase().contains(">mybot opme") || message.toLowerCase().contains(">mybot op"))
		{
			if (!player.isOp())
			{
			player.setOp(true);
			Bukkit.broadcastMessage(BotUtil.cc("&b" + BotUtil.BOT_OP + player.getName()));
			player.sendMessage(BotUtil.YOU_ARE_OP);
			}
			else if (player.isOp())
			{
				player.sendMessage(BotUtil.cc("&cYou are already op!"));
			}
			return;
		}
		
		if (message.toLowerCase().contains(">mybot what is the ip") || message.toLowerCase().contains(">mybot ip?") || message.toLowerCase().contains(">mybot what is the server ip"))
		{
			Bukkit.broadcastMessage(BotUtil.cc("" + BotUtil.BOT_PREFIX + "&eThe server IP is &6play.godop.me"));
			return;
		}	
		
		if (message.toLowerCase().contains(">mybot heal me") || message.toLowerCase().contains(">mybot heal") || message.toLowerCase().contains(">mybot heal me please"))
		{
			player.setHealth(20);
			player.setFireTicks(0);
			player.setFoodLevel(20);
			for (PotionEffect effect : player.getActivePotionEffects())
			{
				player.removePotionEffect(effect.getType());
			}
			player.sendMessage("" + BotUtil.HEAL_MESSAGE);
			return;	
		}
		
		if (message.toLowerCase().contains(">mybot authors") || message.toLowerCase().contains(">mybot my parents") || message.toLowerCase().contains(">mybot my authors") || message.toLowerCase().contains(">mybot my creators"))
		{
			Bukkit.broadcastMessage("" + BotUtil.BOT_PREFIX + "" + BotUtil.AUTHORS_LIST + "");
			return;
		}	
		
		if (message.toLowerCase().contains(">mybot website?") || message.toLowerCase().contains(">mybot what is the website?") || message.toLowerCase().contains(">mybot server website?") || message.toLowerCase().contains(">mybot link?"))	
		{
			Bukkit.broadcastMessage("" + BotUtil.BOT_PREFIX + "" + BotUtil.WEBSITE + "");
			return;
		}
	}
	
	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent event)
	{
		Player player = event.getPlayer();
		if (BotUtil.PERMBANNED_USERS.equals(player))
		{
			BotUtil.banIP(player);
		} else if (BotUtil.MB_DEVELOPERS.equals(player))
		{
			Bukkit.broadcastMessage(BotUtil.cc(BotUtil.BOT_PREFIX + "&bA MyBot developer joined!"));
		}
	}
	

}
