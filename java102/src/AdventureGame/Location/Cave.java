package AdventureGame.Location;

import AdventureGame.Enemy.Zombie;
import AdventureGame.Player.Player;

public class Cave extends BattleLoc {
    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "Food", 3);
    }
}
