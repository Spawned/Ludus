package in.spawned.ludus;

import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.plugin.PluginContainer;

import java.io.File;

public class LudusMod {
    
    private final PluginContainer container;
    private final Game game;
    private final Logger logger;
    private final File configDir;
    
    public LudusMod(PluginContainer container, Game game, Logger logger, File configDir) {
        this.container = container;
        this.game = game;
        this.logger = logger;
        this.configDir = configDir;
    }

    public PluginContainer getContainer() {
        return this.container;
    }

    public Game getGame() {
        return this.game;
    }

    public Logger getLogger() {
        return this.logger;
    }

    public File getConfigDir() {
        return configDir;
    }
}
