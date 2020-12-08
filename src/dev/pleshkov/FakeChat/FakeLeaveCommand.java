package dev.pleshkov.FakeChat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class FakeLeaveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length > 0){
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), String.format("tellraw @a {\"text\":\"%s left the game\", \"color\":\"yellow\"}", args[0]));
            return true;
        }
        return false;
    }
}
