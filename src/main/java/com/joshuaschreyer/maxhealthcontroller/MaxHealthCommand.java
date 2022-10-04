package com.joshuaschreyer.maxhealthcontroller;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class MaxHealthCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        String target = args[0];
        String value = args[1];
        Player p = (Player) sender;

        if (p.isOp()) {
            if (Integer.valueOf(value) != null) {
                if (Bukkit.getPlayer(target) != null) {
                        Bukkit.getPlayer(target).getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(Double.valueOf(value));
                } else {p.sendMessage(ChatColor.RED + "Invalid target!");}
            } else {p.sendMessage(ChatColor.RED + "Invalid max health value!");}
        } else {p.sendMessage(ChatColor.RED + "Insufficient permissions!");}
        return true;
    }
}
