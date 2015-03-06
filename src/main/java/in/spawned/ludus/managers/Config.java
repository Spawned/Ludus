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
    public static Config root() {
        // TODO: Config.root()
        return null;
    }

    /**
     * Gets the configuration for the given arena
     * @param s The name of the arena
     * @return An optional object containing the configuration or nothing if the arena isn't found
     */
    public static Optional<Config> arena(String s) {
        // TODO: Config.arena(s)
        return null;
    }

    /**
     * Gets the configuration for the given arena
     * @param a The arena to find the configuration for
     * @return The configuration for that arena
     */
    public static Config arena(Arena a) {
        // TODO implement here
        return null;
    }

    /**
     * Gets the configuration for the session of the arena with the name given.
     * @param s The name of the arena
     * @return An optional object containing the configuration or nothing if the arena wasn't found
     */
    public static Optional<Config> session(String s) {
        // TODO: Config.session(s)
        return null;
    }

    /**
     * Gets the configuration for the session of the arena given
     * @param a The arena
     * @return The configuration for the session of the given arena
     */
    public static Config session(Arena a) {
        // TODO implement here
        return null;
    }

    /**
     * Initialises the ConfigFactory and sets the defaults for the root config.
     */
    public static void init() {
        // TODO: Config.init()
    }

}