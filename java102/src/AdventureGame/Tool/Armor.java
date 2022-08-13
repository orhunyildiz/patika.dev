package AdventureGame.Tool;

public class Armor {
    private String name;
    private int id;
    private int blockRate;
    private int price;

    public Armor(String name, int id, int blockRate, int price) {
        this.name = name;
        this.id = id;
        this.blockRate = blockRate;
        this.price = price;
    }

    public static Armor[] armors() {
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor("Leather Armor", 1, 1, 15);
        armorList[1] = new Armor("Iron Armor", 2, 3, 25);
        armorList[2] = new Armor("Platinum Armor", 3, 5, 40);
        return armorList;
    }

    public static Armor getArmorById(int id) {
        for (Armor armor : Armor.armors()) {
            if (armor.id == id) {
                return armor;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlockRate() {
        return blockRate;
    }

    public void setBlockRate(int blockRate) {
        this.blockRate = blockRate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
