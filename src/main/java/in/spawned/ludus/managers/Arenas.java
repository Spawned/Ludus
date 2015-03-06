package in.spawned.ludus.managers;

import com.google.common.base.Optional;
import in.spawned.ludus.interfaces.Arena;
import in.spawned.ludus.interfaces.Session;
import org.spongepowered.api.entity.player.Player;

import java.util.HashMap;

/**
 * Manages the registering and getting of arenas. All methods are static.
 */
public class Arenas {

    /**
     * The currently registered arenas.
     */
    private static HashMap<String, Arena> arenas;

    /**
     * Gets an arena by name
     * @param s The name of the arena
     * @return An optional object with the arena if found
     */
    public static Optional<Arena> get(String s) {
        // TODO: Arenas.get(s)
        return null;
    }

    /**
     * Gets an arena by Player
     * @param p The player to search for
     * @return An optional object with the arena the player is in if found
     */
    public static Optional<Arena> get(Player p) {
        // TODO: Arenas.get(p)
        return null;
    }

    /**
     * Gets an arena by Session
     * @param s The session to search for
     * @return An optional object with the arena for that session if found
     */
    public static Optional<Arena> get(Session s) {
        // TODO: Arenas.get(s)
        return null;
    }

}