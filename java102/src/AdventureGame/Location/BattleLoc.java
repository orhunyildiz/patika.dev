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
        String choice = scanner.next();
        choice = choice.toUpperCase();
        if (choice.equals("F")) {
            //asdasd
        }
        return true;
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
