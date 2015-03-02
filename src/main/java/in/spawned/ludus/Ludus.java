package in.spawned.ludus;

import com.google.common.base.Optional;
import com.sun.istack.internal.NotNull;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.plugin.PluginContainer;

import java.io.File;

public final class Ludus {
    
    public static final String CNT_REDEFINE = "Attempted to redefine LudusMod singleton more than once.";
    
    private static LudusMod instance = null;
    
    public static void setMod(PluginContainer container, Game game, Logger logger,
                              ConfigurationLoader<CommentedConfigurationNode> configManager, File configFile) {
        if (Ludus.instance != null) {
            throw new UnsupportedOperationException(Ludus.CNT_REDEFINE);
        }
        
        Ludus.instance = new LudusMod(container, game, logger, configManager, configFile);
    }
    
    public static Optional<LudusMod> getMod() {
        if (Ludus.instance == null) {
            return Optional.absent();
        }
        
        return Optional.of(Ludus.instance);
    }
    
    private static boolean check() {
        return Ludus.getMod().isPresent();
    }
    
    public static Optional<PluginContainer> getContainer() {
        return Ludus.check() ? Optional.of(Ludus.instance.getContainer())
                : Optional.<PluginContainer>absent();
    }
    
    public static Optional<Game> getGame() {
        return Ludus.check() ? Optional.of(Ludus.instance.getGame())
                : Optional.<Game>absent();
    }
    
    public static Optional<Logger> getLogger() {
        return Ludus.check() ? Optional.of(Ludus.instance.getLogger())
                : Optional.<Logger>absent();
    }
    
    public static Optional<ConfigurationLoader<CommentedConfigurationNode>> getConfigManager() {
        return Ludus.check() ? Optional.of(Ludus.instance.getConfigManager())
                : Optional.<ConfigurationLoader<CommentedConfigurationNode>>absent();
        
    }
    
    public static Optional<File> getConfigFile() {
        return Ludus.check() ? Optional.of(Ludus.instance.getConfigFile())
                : Optional.<File>absent();
        
    }
}
