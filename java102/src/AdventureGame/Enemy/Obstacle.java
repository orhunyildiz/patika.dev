package AdventureGame.Enemy;

public abstract class Obstacle {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int moneyAward;
    private int originalHealth;

    public Obstacle(int id, String name, int damage, int health, int moneyAward) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.moneyAward = moneyAward;
        this.originalHealth = health;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0)
            health = 0;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoneyAward() {
        return moneyAward;
    }

    public void setMoneyAward(int moneyAward) {
        this.moneyAward = moneyAward;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
