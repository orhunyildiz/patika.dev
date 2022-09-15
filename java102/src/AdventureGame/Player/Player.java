package AdventureGame.Player;


import AdventureGame.GameCharacter.Archer;
import AdventureGame.GameCharacter.GameCharacter;
import AdventureGame.GameCharacter.Knight;
import AdventureGame.GameCharacter.Samurai;

import java.util.Scanner;

public class Player {
    private int health;
    private int originalHealth;
    private int damage;
    private int money;
    private String charName;
    private String className;
    private Inventory inventory;
    private Scanner scanner = new Scanner(System.in);

    public Player(String charName) {
        this.charName = charName;
        inventory = new Inventory();
    }

    public void selectChar() {
        System.out.print("1. Samurai");
        System.out.printf("%15s", "Damage: 5"); System.out.printf("%15s", "Health: 21"); System.out.printf("%15s %n", "Money: 15");
        System.out.print("2. Archer");
        System.out.printf("%16s", "Damage: 7"); System.out.printf("%15s", "Health: 18"); System.out.printf("%15s %n", "Money: 20");
        System.out.print("3. Knight");
        System.out.printf("%16s", "Damage: 8"); System.out.printf("%15s", "Health: 24"); System.out.printf("%14s %n", "Money: 5");
        System.out.print("Choice: ");
        int selectChar = scanner.nextInt();
        switch (selectChar) {
            case 2 -> {
                initPlayer(new Archer(getCharName()));
                setClassName("Archer");
            }
            case 3 -> {
                initPlayer(new Knight(getCharName()));
                setClassName("Knight");
            }
            default -> {
                initPlayer(new Samurai(getCharName()));
                setClassName("Samurai");
            }
        }
        System.out.println("Your character: " + getCharName() + "\nDamage: " + getDamage() + "\nHealth: " + getHealth() + "\nMoney: " + getMoney() + "\nClass: " + getClassName());
    }

    public void initPlayer(GameCharacter gameCharacter) {
        setDamage(gameCharacter.getDamage());
        setHealth(gameCharacter.getHealth());
        setOriginalHealth(gameCharacter.getHealth());
        setMoney(gameCharacter.getMoney());
        setCharName(gameCharacter.getName());
    }

    public void printInfo() {
        System.out.println("Weapon: " + getInventory().getWeapon().getName() + " - Armor: " + getInventory().getArmor().getName() + " - Damage: " + getTotalDamage() + " - Block Rate: " + getInventory().getArmor().getBlockRate() + " - Health: " + getHealth() + " - Money: " + getMoney() + " - Class: " + getClassName());
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getTotalDamage() {
        return damage + getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}