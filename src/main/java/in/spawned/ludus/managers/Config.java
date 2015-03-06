package in.spawned.ludus.managers;

import com.google.common.base.Optional;
import com.typesafe.config.ConfigFactory;
import in.spawned.ludus.interfaces.Arena;

/**
 * Manages the configurations for ludus. Uses TypeSafe configurations.
 */
public class Config {

    /**
     * Stores the Config objects. Used statically
     *
     * @see com.typesafe.config.ConfigFactory
     */
    private static ConfigFactory configFactory;

    /**
     * Gets the root configuration for Ludus
     * @return The Configuration for Ludus
     */
    public static com.typesafe.config.Config root() {
        return ConfigFactory.load("ludus.root");
    }

    /**
     * Gets the configuration for the given arena
     * @param s The name of the arena
     * @return An optional object containing the configuration or nothing if the arena isn't found
     */
    public static Optional<com.typesafe.config.Config> arena(String s) {
        if (Arenas.get(s).isPresent()) return Optional.of(configFactory.load("ludus.arenas." + s));
        return Optional.absent();
    }

    /**
     * Gets the configuration for the given arena
     * @param a The arena to find the configuration for
     * @return The configuration for that arena
     */
    public static com.typesafe.config.Config arena(Arena a) {
        return configFactory.load("ludus.arenas." + Arenas.nameOf(a).get());
    }

    /**
     * Gets the configuration for the session of the arena with the name given.
     * @param s The name of the arena
     * @return An optional object containing the configuration or nothing if the arena wasn't found
     */
    public static Optional<com.typesafe.config.Config> session(String s) {
        if (Arenas.get(s).isPresent()) return Optional.of(configFactory.load("ludus.sessions." + s));
        return Optional.absent();
    }

    /**
     * Gets the configuration for the session of the arena given
     * @param a The arena
     * @return The configuration for the session of the given arena
     */
    public static com.typesafe.config.Config session(Arena a) {
        return configFactory.load("ludus.sessions." + Arenas.nameOf(a).get());
    }

    /**
     * Initialises the ConfigFactory and sets the defaults for the root config.
     */
    public static void init() {
        // Not yet needed
    }

}