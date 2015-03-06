package in.spawned.ludus;

import org.slf4j.Logger;
import org.spongepowered.api.Game;

import java.io.File;

public class LudusMod {

    private final Game game;
    private final Logger logger;
    private final File configDir;

    /**
     * Constructs and initializes the LudusMod singleton. 
     * @param game {@link Game} instance that Sponge is using.
     * @param logger {@link Logger} for use with Ludus.
     * @param configDir {@link File}, as a directory, which contains configurations / Ludus files.
     */
    public LudusMod(Game game, Logger logger, File configDir) {
        this.game = game;
        this.logger = logger;
        this.configDir = configDir;
    }

    /**
     * Get the {@link Game} instance that Sponge is using.
     * @return {@link Game} instance that Sponge is using.
     */
    public Game getGame() {
        return this.game;
    }

    /**
     * Get the {@link Logger} instance that LudusMod is using.
     * @return {@link Logger} instance that LudusMod is using.
     */
    public Logger getLogger() {
        return this.logger;
    }

    /**
     * Get the {@link File} that is storing configurations and files.
     * @return {@link File} that is storing configurations and files.
     */
    public File getConfigDir() {
        return configDir;
    }
}
