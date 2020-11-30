package me.xemu.advanceddiscord.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Utils
{

    public static String chat(String s)
    {
        return ChatColor.translateAlternateColorCodes('&', s);
    };

    public static void sendEx(Player player, String ex)
    {
        player.sendMessage(chat("&cAn error occured:&r &c&l" + ex));
    }

};