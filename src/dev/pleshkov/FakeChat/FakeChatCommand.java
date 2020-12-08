package dev.pleshkov.FakeChat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

public class FakeChatCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length >= 2) {
            String player = args[0];
            String message = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), String.format("tellraw @a {\"text\":\"<%s> %s\"}", player, message));
            return true;
        }
        return false;
    }
}
