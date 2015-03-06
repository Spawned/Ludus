package in.spawned.ludus.managers;

import com.google.common.base.Optional;
import in.spawned.ludus.interfaces.Session;
import org.spongepowered.api.entity.player.Player;

/**
 * Manages the basic registering and getting of sessions. All methods are static.
 */
public class Sessions {
    /**
     * Gets the session for the arena with the name given
     * @param s The name of the arena
     * @return An optional object containing the arena's session if found
     */
    public static Optional<Session> get(String s) {
        // TODO: Sessions.get(s)
        return null;
    }

    /**
     * Gets the session for the arena that the player is in
     * @param p The player
     * @return An optional object containing the arena's session if found
     */
    public static Optional<Session> get(Player p) {
        // TODO: Sessions.get(p)
        return null;
    }
}