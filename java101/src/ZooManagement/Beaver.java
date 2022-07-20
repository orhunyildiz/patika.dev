package ZooManagement;

public class Beaver extends Rodent {
    private int beaverMedicine;
    private int beaverFeed;

    public Beaver(String speciesName, double weight, int age, int teethNumber) {
        super(speciesName, weight, age, teethNumber);
        this.beaverMedicine = 0;
        this.beaverFeed = 0;
    }

    @Override
    public int getDosage() {
        return beaverMedicine;
    }

    @Override
    public String getFeedSchedule() {
        return "Kunduzlara günde 1kg ağaç kabuğu verilir. (1kg ağaç kabuğu 4000 kalori)";
    }

    @Override
    public void feed(int amount) {
        if (amount == 1) {
            System.out.println("Kunduzlara ağaç kabuğu veriliyor.");
            beaverFeed += 4000;
            if (getFeed() % 7400 == 0)
                setWeight(getWeight() + 1);

        }
        else
            System.out.println("Günde 1kg dan fazla veya az yem verilemez.");
    }

    @Override
    public int getFeed() {
        return beaverFeed;
    }

    @Override
    public void giveMedicine(int amount) {
        beaverMedicine += amount;
    }
}
