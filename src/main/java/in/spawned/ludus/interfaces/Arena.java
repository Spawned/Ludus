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
     * @param p
     * @return
     */
    public Optional<String> canJoin(Player p);

    /**
     * Adds the player specified to the arena: This should not be called before checking the player can join.
     *
     * @param p
     * @return
     */
    public void addPlayer(Player p);

    /**
     * Removes the given player from this arena: Check the player is in the arena first.
     *
     * @param p
     * @return
     */
    public void removePlayer(Player p);

    /**
     * Returns the current session in this arena.
     *
     * @return
     */
    public Session getSession();

    /**
     * Gets the players currently in this arena.
     * @return
     */
    public Player[] getPlayers();

    /**
     * Sets the session in this arena. Should call session.destroy
     *
     * @param s
     */
    public void setSession(Session s);

    /**
     * Returns whether or not the given player is in this arena.
     *
     * @param p
     * @return
     */
    public boolean hasPlayer(Player p);

}