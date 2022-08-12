package AdventureGame.Location;

import AdventureGame.Player.Player;

public abstract class SafeLocation extends Location {

    public SafeLocation(Player player, String locationName) {
        super(player, locationName);
    }
}
