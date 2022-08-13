package AdventureGame.Location;

import AdventureGame.Player.Player;
import AdventureGame.Tool.Armor;
import AdventureGame.Tool.Weapon;

public class ToolStore extends SafeLocation {

    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the Tool Store, " + getPlayer().getClassName() + " " + getPlayer().getCharName());
        boolean showMenu = true;
        while (showMenu) {
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
                    buyArmor();
                    break;
                case 3:
                    System.out.println("You are exiting.");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("*** Weapons ***");
        for (Weapon weapon : Weapon.weapons()) {
            System.out.println(weapon.getId() + ". " + weapon.getName() + " <Price: " + weapon.getPrice() + ", Damage: " + weapon.getDamage() + ">");
        }
        System.out.println("0- Exit");
    }

    public void buyWeapon() {
        System.out.print("Select a weapon: ");
        int selectedWeaponId = scanner.nextInt();
        while (selectedWeaponId < 0 || selectedWeaponId > Weapon.weapons().length) {
            System.out.print("Wrong choice. Please try again: ");
            selectedWeaponId = scanner.nextInt();
        }
        if (selectedWeaponId != 0) {
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
    }

    public void printArmor() {
        System.out.println("*** Armors ***");
        for (Armor armor : Armor.armors()) {
            System.out.println(armor.getId() + ". " + armor.getName() + " <Price: " + armor.getPrice() + ", Block Rate: " + armor.getBlockRate() + ">");
        }
        System.out.println("0- Exit");
    }

    public void buyArmor() {
        System.out.print("Select an armor: ");
        int selectedArmorId = scanner.nextInt();
        while (selectedArmorId < 0 || selectedArmorId > Armor.armors().length) {
            System.out.print("Wrong choice. Please try again: ");
            selectedArmorId = scanner.nextInt();
        }
        if (selectedArmorId != 0) {
            Armor selectedArmor = Armor.getArmorById(selectedArmorId);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > getPlayer().getMoney()) {
                    System.out.println("Not enough money!");
                }
                else {
                    System.out.println("You bought " + selectedArmor.getName() + ".");
                    int balance = getPlayer().getMoney() - selectedArmor.getPrice();
                    getPlayer().setMoney(balance);
                    System.out.println("Your remaining money: " + getPlayer().getMoney());
                    System.out.println("Your previous armor: " + getPlayer().getInventory().getArmor().getName());
                    getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Your new armor: " + getPlayer().getInventory().getArmor().getName());
                }
            }
        }
    }
}
