package in.spawned.ludus;

import com.google.common.base.Optional;
import com.sun.istack.internal.NotNull;
import org.slf4j.Logger;
import org.spongepowered.api.Game;

import java.io.File;

public final class Ludus {

    /**
     * Stores the {@link LudusMod} Singleton.
     */
    private static LudusMod instance = null;

    /**
     * Set, instantiate, the LudusMod instance. Can only run once. 
     * @param game {@link Game} instance that Sponge is using.
     * @param logger {@link Logger} for use with Ludus.
     * @param configDir {@link File}, as a directory, which contains configurations / Ludus files.
     */
    public static void setMod(@NotNull Game game, @NotNull Logger logger, @NotNull File configDir) {
        if (Ludus.getMod().isPresent()) {
            throw new UnsupportedOperationException("Attempted to redefine LudusMod singleton more than once.");
        }
        
        Ludus.instance = new LudusMod(game, logger, configDir);
    }

    /**
     * Get the {@link LudusMod} Singleton. 
     * @return {@link LudusMod} Singleton, if any
     */
    public static Optional<LudusMod> getMod() {
        return Ludus.instance != null ? Optional.of(Ludus.instance)
                : Optional.<LudusMod>absent();
    }

    /**
     * If {@link LudusMod} has been initialized, return {@link Game}.
     * @return Game instance that Sponge is using
     */
    public static Optional<Game> getGame() {
        return Ludus.getMod().isPresent() ? Optional.of(Ludus.instance.getGame())
                : Optional.<Game>absent();
    }
    
    /**
     * If {@link LudusMod} has been initialized, return {@link Logger}.
     * @return Logger that Ludus is using
     */
    public static Optional<Logger> getLogger() {
        return Ludus.getMod().isPresent() ? Optional.of(Ludus.instance.getLogger())
                : Optional.<Logger>absent();
    }
    
    /**
     * If {@link LudusMod} has been initialized, return {@link File} which stores configurations.
     * @return File which stores configurations
     */
    public static Optional<File> getConfigDir() {
        return Ludus.getMod().isPresent() ? Optional.of(Ludus.instance.getConfigDir())
                : Optional.<File>absent();
    }
}
