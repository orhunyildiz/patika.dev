package AdventureGame.Player;

import AdventureGame.Tool.Armor;
import AdventureGame.Tool.Weapon;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    public Inventory() {
        weapon = new Weapon("Fist", -1, 0, 0);
        armor = new Armor("Shirt and Pants", -1, 0, 0);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
