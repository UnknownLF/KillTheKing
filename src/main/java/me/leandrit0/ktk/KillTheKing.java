package me.leandrit0.ktk;

import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import me.leandrit0.ktk.listeners.KingListener;
import me.leandrit0.ktk.manager.KingManager;
import me.leandrit0.ktk.utils.command.CommandRegistrer;

@Getter
@Setter
public class KillTheKing extends JavaPlugin {

	@Getter private static KillTheKing instance;
	private KingManager kingManager;

	@Override
	public void onEnable() {
		instance = this;
        new CommandRegistrer();
        Bukkit.getPluginManager().registerEvents(new KingListener(), this);
	}

	@Override
	public void onDisable() {
		instance = null;
	}
	
}