package ZooManagement;

public class Tiger extends Felines {
    private int tigerMedicine;
    private int tigerFeed;

    public Tiger(String speciesName, double weight, int age, boolean isBaby) {
        super(speciesName, weight, age, isBaby);
        this.tigerMedicine = 0;
        this.tigerFeed = 0;
    }

    @Override
    public int getDosage() {
        return tigerMedicine;
    }

    @Override
    public String getFeedSchedule() {
        return "Yavru kaplanlara yemek verilmez. Yavru olmayan kaplanlara günde 1kg et verilir.(1kg et 1400 kalori)";
    }

    @Override
    public void feed(int amount) {
        if (amount == 1) {
            if (!isBaby()) {
                System.out.println("Yetişkin aslana 1k et veriliyor.");
                tigerFeed += 1400;
            }
            if (getFeed() % 7400 == 0)
                setWeight(getWeight() + 1);
        }
        else
            System.out.println("Planlamaya göre 1 kg'dan az veya fazla yem veremezsiniz.");
    }

    @Override
    public int getFeed() {
        return tigerFeed;
    }

    @Override
    public void giveMedicine(int amount) {
        tigerMedicine += amount;
    }
}
