package AdventureGame.Location;

import AdventureGame.Enemy.Obstacle;
import AdventureGame.Player.Player;

import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLoc(Player player, String locationName, Obstacle obstacle, String award, int maxObstacle) {
        super(player, locationName);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    public boolean onLocation() {
        int obsNumber = randomObstacleNumber();
        System.out.println("You are here now: " + getLocationName());
        System.out.println("Be careful! " + obsNumber + " " + getObstacle().getName() + "(s) are living here!");
        System.out.println("(F)ight or (R)un");
        System.out.print("Make your choice: ");
        String choice = scanner.next().toUpperCase();
        if (choice.equals("F") && combat(obsNumber)) {
            System.out.println("You've beat all of the enemies!");
            String wherePlayer = getLocationName();
            switch (wherePlayer) {
                case "Cave":
                    System.out.println("You've got some food now.");
                    getPlayer().getInventory().setFood(true);
                    break;
                case "Forest":
                    System.out.println("You've got some firewood now.");
                    getPlayer().getInventory().setFirewood(true);
                    break;
                case "River":
                    System.out.println("You've got some water now.");
                    getPlayer().getInventory().setWater(true);
                    break;
                default:
                    System.out.println("Something Wrong!");
                    break;
            }
            return true;
        }
        if (getPlayer().getHealth() <= 0) {
            System.out.println("You Died!");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            getObstacle().setHealth(getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);
            while (getPlayer().getHealth() > 0 & getObstacle().getHealth() > 0) {
                System.out.println("(H)it or (R)un");
                System.out.print("Make your choice: ");
                String choice = scanner.next().toUpperCase();
                if (choice.equals("H")) {
                    System.out.println("You've hit!");
                    getObstacle().setHealth(getObstacle().getHealth() - getPlayer().getTotalDamage());
                    afterHit();
                    if (getObstacle().getHealth() > 0) {
                        System.out.println(getObstacle().getName() + "'s hit you!");
                        int obstacleDamage = getObstacle().getDamage() - getPlayer().getInventory().getArmor().getBlockRate();
                        if (obstacleDamage < 0)
                            obstacleDamage = 0;
                        getPlayer().setHealth(getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                }
                else {
                    return false;
                }
            }
            if (getObstacle().getHealth() < getPlayer().getHealth()) {
                System.out.println("You've beat the enemy!");
                System.out.println("You've earned " + getObstacle().getMoneyAward() + " money.");
                getPlayer().setMoney(getPlayer().getMoney() + getObstacle().getMoneyAward());
                System.out.println("Your current money: " + getPlayer().getMoney());
            }
            else {
                return false;
            }
        }
        return true;
    }

    public void afterHit() {
        System.out.println("Your health: " + getPlayer().getHealth());
        System.out.println(getObstacle().getName() + "'s health: " + getObstacle().getHealth());
        System.out.println("--------------------");
    }

    public void playerStats() {
        System.out.println("*** Player Stats ***");
        System.out.println("Health: " + getPlayer().getHealth());
        System.out.println("Weapon: " + getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage: " + getPlayer().getTotalDamage());
        System.out.println("Armor: " + getPlayer().getInventory().getArmor().getName());
        System.out.println("Block Rate: " + getPlayer().getInventory().getArmor().getBlockRate());
        System.out.println("Money: " + getPlayer().getMoney());
    }

    public void obstacleStats(int i) {
        System.out.println("*** " + i + ". " + getObstacle().getName() + " Stats ***");
        System.out.println("Health: " + getObstacle().getHealth());
        System.out.println("Damage: " + getObstacle().getDamage());
        System.out.println("Money Award: " + getObstacle().getMoneyAward());
    }

    public int randomObstacleNumber() {
        Random random = new Random();
        return random.nextInt(getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
