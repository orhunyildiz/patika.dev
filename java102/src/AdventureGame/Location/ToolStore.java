package AdventureGame.Location;

import AdventureGame.Player.Player;
import AdventureGame.Tool.Weapon;

public class ToolStore extends SafeLocation {

    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the Tool Store, " + getPlayer().getClassName() + " " + getPlayer().getCharName());
        System.out.println("1- Weapons\n2- Armors\n3- Exit");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        while (choice < 1 || choice > 3) {
            System.out.print("Wrong choice! Please try again: ");
            choice = scanner.nextInt();
        }
        switch (choice) {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("You are exiting.");
                return true;

        }
        return true;
    }

    public void printWeapon() {
        System.out.println("Weapons");
        for (Weapon weapon : Weapon.weapons()) {
            System.out.println(weapon.getId() + ". " + weapon.getName() + " <Price: " + weapon.getPrice() + ", Damage: " + weapon.getDamage() + ">");
        }
    }

    public void buyWeapon() {
        System.out.print("Select a weapon: ");
        int selectedWeaponId = scanner.nextInt();
        while (selectedWeaponId < 1 || selectedWeaponId > Weapon.weapons().length) {
            System.out.print("Wrong choice. Please try again: ");
            selectedWeaponId = scanner.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponById(selectedWeaponId);
        if (selectedWeapon != null) {
            if (selectedWeapon.getPrice() > getPlayer().getMoney()) {
                System.out.println("Not enough money!");
            }
            else {
                System.out.println("You bought " + selectedWeapon.getName() + ".");
                int balance = getPlayer().getMoney() - selectedWeapon.getPrice();
                getPlayer().setMoney(balance);
                System.out.println("Your remaining money: " + getPlayer().getMoney());
                System.out.println("Your previous weapon: " + getPlayer().getInventory().getWeapon().getName());
                getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Your new weapon: " + getPlayer().getInventory().getWeapon().getName());
            }
        }
    }

    public void printArmor() {
        System.out.println("Armors");
    }
}
