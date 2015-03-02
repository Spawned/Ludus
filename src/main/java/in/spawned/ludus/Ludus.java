package in.spawned.ludus;

public class Ludus {
    /*

	So basically there will be something like this:
	A session interface will contain 2 methods, init(), destroy() however it will also extend/implement Runnable or SpongeRunnable whatever so people can add a run() method or whatever	
	We will then have an Arena interface/abstract class (not sure yet) which will be the bridge to the configuration files
	There will be some sort of hashmap or something like this
	
	HashMap<Arena, Session> sessions;

	So then people could implement/extend Arena to create their own custom arenas
	So something like
	{
	
		class SurvivalGamesArena extends Arena {}
	
		and the same for sessions

		class SurvivalGamesSession extends Session {}

		so then we can just do stuff like
		{

			Ludus.setSession(Arena, Session); // Will call the init() method

			Ludus.isActive(Ludus.getArenas()[0]);
			if ( Ludus.getArenas()[0] instanceof SurvivalGamesArena) {
				do stuff
			}

			Ludus.setSession(Arena, null); // Will call the destroy() method for a session and remove it from the hashmap
		}
	}

	
    */
}
