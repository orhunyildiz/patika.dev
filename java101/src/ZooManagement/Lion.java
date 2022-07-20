package ZooManagement;

public class Lion extends Feline {

    private int lionMedicine;
    private int lionFeed;

    public Lion(String speciesName, double weight, int age, boolean isBaby) {
        super(speciesName, weight, age, isBaby);
        this.lionMedicine = 0;
        this.lionFeed = 0;
    }

    @Override
    public int getDosage() {
        return lionMedicine;
    }

    @Override
    public String getFeedSchedule() {
        return "Yavru aslanlara yemek verilmez. Yavru olmayan aslanlara günde 1kg et verilir.(1kg et 1400 kalori)";
    }

    @Override
    public void feed(int amount) {
        if (amount == 1) {
            if (!isBaby()) {
                System.out.println("Yetişkin aslana 1k et veriliyor.");
                lionFeed += 1400;
            }
            if (getFeed() % 7400 == 0)
                setWeight(getWeight() + 1);
        }
        else
            System.out.println("Planlamaya göre 1 kg'dan az veya fazla yem veremezsiniz.");
    }

    @Override
    public int getFeed() {
        return lionFeed;
    }

    @Override
    public void giveMedicine(int amount) {
        lionMedicine += amount;
    }
}
