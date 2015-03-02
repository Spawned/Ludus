package in.spawned.ludus;

import com.google.inject.Inject;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.state.InitializationEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;
import org.spongepowered.api.service.config.DefaultConfig;
import org.spongepowered.api.util.event.Subscribe;

import java.io.File;

@Plugin(id="ludus", name="Ludus", version="0.1-SNAPSHOT")
public class LudusPlugin {
    
    @Inject
    private PluginContainer container;
    
    @Inject
    private Game game;
    
    @Inject
    private Logger logger;
    
    @Inject
    @DefaultConfig(sharedRoot = false)
    private File config;
    
    
    @Inject
    @DefaultConfig(sharedRoot = false)
    private ConfigurationLoader<CommentedConfigurationNode> configManager;
    
    @Subscribe
    public void onInitialization(InitializationEvent init) {
        Ludus.setMod(this.container, this.game, this.logger, this.configManager, this.config);
    }
}
