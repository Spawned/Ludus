package in.spawned.ludus;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.state.InitializationEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.service.config.ConfigDir;
import org.spongepowered.api.service.config.DefaultConfig;
import org.spongepowered.api.util.event.Subscribe;

import java.io.File;

@Plugin(id="ludus", name="Ludus", version="0.1-SNAPSHOT")
public class LudusPlugin {
    
    @Inject private Game game;
    
    @Inject private Logger logger;
    
    @Inject @ConfigDir(sharedRoot = false) private File configDir;
    
    @Subscribe public void onInitialization(InitializationEvent init) {
        Ludus.setMod(this.game, this.logger, this.configDir);
    }
}
