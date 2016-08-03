package realisticSwimming.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Created by Janne on 01.08.2016.
 */
public class PlayerStopSwimmingEvent extends Event{

    private static final HandlerList handlerList = new HandlerList();
    private Player p;

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList(){
        return handlerList;
    }

    public PlayerStopSwimmingEvent(Player player){
        p = player;
    }

    public Player getPlayer(){
        return p;
    }
}