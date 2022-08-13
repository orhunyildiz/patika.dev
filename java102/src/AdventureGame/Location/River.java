package AdventureGame.Location;

import AdventureGame.Enemy.Bear;
import AdventureGame.Player.Player;

public class River extends BattleLoc {
    public River(Player player) {
        super(player, "River", new Bear(), "Water", 2);
    }
}
