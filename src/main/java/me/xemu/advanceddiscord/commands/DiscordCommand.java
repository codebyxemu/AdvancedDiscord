package me.xemu.advanceddiscord.commands;

import me.xemu.advanceddiscord.AdvancedDiscord;
import me.xemu.advanceddiscord.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor
{

    final AdvancedDiscord plugin;
    public DiscordCommand()
    {
        this.plugin = new AdvancedDiscord();
    };

    String link = "";

    @Override public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if(sender instanceof Player)
        {
            final Player player = (Player) sender;

            if(plugin.getConfig().getString("Links.Discord") == null || plugin.getConfig().getString("Links.Discord") == "")
            {
                Utils.sendEx(player, "'Links.Discord' is not defined in the config. Please contact an administrator.");
                return true;
            };

            link = plugin.getConfig().getString("Links.Discord");
            player.sendMessage(Utils.chat(plugin.getConfig().getString("DiscordCommand.Output").replaceAll("<link>", link)));

            return true;
        };
        return true;
    };
};