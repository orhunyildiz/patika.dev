package AdventureGame.Location;

import AdventureGame.Enemy.Vampire;
import AdventureGame.Player.Player;

public class Forest extends BattleLoc {
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "Firewood", 3);
    }
}
