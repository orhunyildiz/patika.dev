package ZooManagement;

public class Rat extends Rodent {

    private int ratMedicine;
    private int ratFeed;

    public Rat(String speciesName, double weight, int age, int teethNumber) {
        super(speciesName, weight, age, teethNumber);
        this.ratMedicine = 0;
        this.ratFeed = 0;
    }

    @Override
    public int getDosage() {
        return ratMedicine;
    }

    @Override
    public String getFeedSchedule() {
        return "Sıçanlara günde 1kg elma verilir. (1kg elma 500 kalori)";
    }

    @Override
    public void feed(int amount) {
        if (amount == 1) {
            System.out.println("Sıçanlara elma veriliyor.");
            ratFeed += 500;
            if (getFeed() % 7400 == 0)
                setWeight(getWeight() + 1);
        }
        else
            System.out.println("Planlamaya göre 1kg'dan az veya fazla yem veremezsiniz.");
    }

    @Override
    public int getFeed() {
        return ratFeed;
    }

    @Override
    public void giveMedicine(int amount) {
        ratMedicine += amount;
    }
}
