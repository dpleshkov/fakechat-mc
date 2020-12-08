package dev.pleshkov.FakeChat;

import org.bukkit.plugin.java.JavaPlugin;

public class FakeChat extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("fakejoin").setExecutor(new FakeJoinCommand());
        this.getCommand("fakeleave").setExecutor(new FakeLeaveCommand());
        this.getCommand("fakechat").setExecutor(new FakeChatCommand());
    }
    @Override
    public void onDisable() {

    }
}
