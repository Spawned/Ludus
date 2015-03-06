package in.spawned.ludus;

import com.google.common.base.Optional;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.plugin.PluginContainer;

import java.io.File;

public final class Ludus {
    
    private static LudusMod instance = null;
    
    public static void setMod(PluginContainer container, Game game, Logger logger, File configDir) {
        if (Ludus.getMod().isPresent()) {
            throw new UnsupportedOperationException("Attempted to redefine LudusMod singleton more than once.");
        }
        
        Ludus.instance = new LudusMod(container, game, logger, configDir);
    }
    
    public static Optional<LudusMod> getMod() {
        return Ludus.instance != null ? Optional.of(Ludus.instance)
                : Optional.<LudusMod>absent();
    }
    
    public static Optional<PluginContainer> getContainer() {
        return Ludus.getMod().isPresent() ? Optional.of(Ludus.instance.getContainer())
                : Optional.<PluginContainer>absent();
    }
    
    public static Optional<Game> getGame() {
        return Ludus.getMod().isPresent() ? Optional.of(Ludus.instance.getGame())
                : Optional.<Game>absent();
    }
    
    public static Optional<Logger> getLogger() {
        return Ludus.getMod().isPresent() ? Optional.of(Ludus.instance.getLogger())
                : Optional.<Logger>absent();
    }
    
    public static Optional<File> getConfigDir() {
        return Ludus.getMod().isPresent() ? Optional.of(Ludus.instance.getConfigDir())
                : Optional.<File>absent();
    }
}
