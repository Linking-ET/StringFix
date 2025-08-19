package catx.feitu.StringFix;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class StringFix extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // 怎么会有光启用不注册的）））
        Bukkit.getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void onBlockFromToEvent(BlockFromToEvent event) {
        if (event.getToBlock().getType() == Material.TRIPWIRE) {
            event.setCancelled(true);
        }
    }
}
