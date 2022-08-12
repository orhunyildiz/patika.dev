package AdventureGame.Player;

import AdventureGame.Tool.Weapon;

public class Inventory {
    private Weapon weapon;

    public Inventory() {
        weapon = new Weapon("Fist", 0, 0, 0);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
