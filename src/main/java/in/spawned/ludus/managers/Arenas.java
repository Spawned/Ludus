package in.spawned.ludus.managers;

import com.google.common.base.Optional;
import in.spawned.ludus.interfaces.Arena;
import in.spawned.ludus.interfaces.Session;
import org.spongepowered.api.entity.player.Player;

import java.util.HashMap;
import java.util.Map;

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
        return Optional.fromNullable(arenas.get(s));
    }

    /**
     * Gets an arena by Player
     * @param p The player to search for
     * @return An optional object with the arena the player is in if found
     */
    public static Optional<Arena> get(Player p) {
        for (Arena a : arenas.values()){
            if (a.hasPlayer(p)) return Optional.of(a);
        }
        return Optional.absent();
    }

    /**
     * Gets an arena by Session
     * @param s The session to search for
     * @return An optional object with the arena for that session if found
     */
    public static Optional<Arena> get(Session s) {
        for (Arena a : arenas.values()){
            if (a.getSession() == s) return Optional.of(a);
        }
        return Optional.absent();
    }

    /**
     * Gets the name of a given arena
     * @param a The arena
     * @return An optional object containing the name or nothing
     */
    public static Optional<String> nameOf(Arena a){
        for (Map.Entry<String, Arena> entry : arenas.entrySet()) {
            if (a.equals(entry.getValue())) {
                return Optional.of(entry.getKey());
            }
        }
        return Optional.absent();
    }
}