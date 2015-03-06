package in.spawned.ludus.interfaces;

/**
 * Represents a session.
 */
public interface Session {

    /**
     * The arena this session is for. For convienience.
     */
    Arena a = null;

    /**
     * Initialise/Start this session, returns whether or not the initialisation was successful.
     *
     * @return Whether or not the session was initialised/started successfully
     */
    public boolean init();

    /**
     * Stop this session.
     */
    public void destroy();

}