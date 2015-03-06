package in.spawned.ludus;

import org.slf4j.Logger;
import org.spongepowered.api.Game;

import java.io.File;

public class LudusMod {

    private final Game game;
    private final Logger logger;
    private final File configDir;
    
    public LudusMod(Game game, Logger logger, File configDir) {
        this.game = game;
        this.logger = logger;
        this.configDir = configDir;
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
