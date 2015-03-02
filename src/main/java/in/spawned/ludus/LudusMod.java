package in.spawned.ludus;

import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.plugin.PluginContainer;

import java.io.File;

public class LudusMod {
    
    private final PluginContainer container;
    private final Game game;
    private final Logger logger;
    private final ConfigurationLoader<CommentedConfigurationNode> configManager;
    private final File configFile;
    
    public LudusMod(PluginContainer container, Game game, Logger logger,
                    ConfigurationLoader<CommentedConfigurationNode> configManager, File configFile) {
        this.container = container;
        this.game = game;
        this.logger = logger;
        this.configManager = configManager;
        this.configFile = configFile;
    }

    public PluginContainer getContainer() {
        return container;
    }

    public Game getGame() {
        return game;
    }

    public Logger getLogger() {
        return logger;
    }

    public ConfigurationLoader<CommentedConfigurationNode> getConfigManager() {
        return configManager;
    }

    public File getConfigFile() {
        return configFile;
    }
}
