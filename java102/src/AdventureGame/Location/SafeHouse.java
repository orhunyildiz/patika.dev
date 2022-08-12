package AdventureGame.Location;

import AdventureGame.Player.Player;

public class SafeHouse extends SafeLocation {

    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in Safe House now.");
        System.out.println("Your health will increase as long as you stay here.");
        return true;
    }
}
