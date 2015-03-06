package in.spawned.ludus.interfaces;

import org.spongepowered.api.entity.player.Player;

import java.util.Optional;

/**
 * Represents an Arena where a session can take place.
 */
public interface Arena {

    /**
     * The session currently taking place in this arena.
     */
    Session session = null;

    /**
     * The players currently in this arena.
     */
    Player[] players = null;

    /**
     * Returns the reason the given player cannot join or null.
     * @param p The player requesting to join
     * @return An optional object returning the reason the player can't join or nothing
     */
    public Optional<String> canJoin(Player p);

    /**
     * Adds the player specified to the arena: This should not be called before checking the player can join.
     * @param p The player to add
     */
    public void addPlayer(Player p);

    /**
     * Removes the given player from this arena: Check the player is in the arena first.
     * @param p The player to remove
     */
    public void removePlayer(Player p);

    /**
     * Returns the current session in this arena.
     * @return The current Session
     * @see in.spawned.ludus.interfaces.Session
     */
    public Session getSession();

    /**
     * Gets the players currently in this arena.
     * @return The players currently in this arena
     */
    public Player[] getPlayers();

    /**
     * Sets the session in this arena. Should call session.destroy
     * @param s The new session
     */
    public void setSession(Session s);

    /**
     * Returns whether or not the given player is in this arena.
     *
     * @param p The player to check for
     * @return Whether or not the player is in this arena
     */
    public boolean hasPlayer(Player p);

}