package ZooManagement;

import java.util.Calendar;

public class Zebra extends AbstractHorse {
    private int zebraMedicine;
    private int zebraFeed;

    public Zebra(String speciesName, double weight, int age, int maxHorsepower) {
        super(speciesName, weight, age, maxHorsepower);
        this.zebraMedicine = 0;
        this.zebraFeed = 0;
    }

    @Override
    public int getDosage() {
        return zebraMedicine;
    }

    @Override
    public String getFeedSchedule() {
        return "Zebralara, haftasonu 1kg yulaf, haftaiçi 1kg saman verilir. (1kg yulaf: 600 kalori, 1kg saman: 90 kalori)";
    }

    @Override
    public void feed(int amount) {
        if (amount == 1) {
            Calendar calendar = Calendar.getInstance();
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == 1 || dayOfWeek == 7) {
                System.out.println("Haftasonu olduğu için zebraya yulaf veriliyor.");
                zebraFeed += 600;
            }
            else {
                System.out.println("Haftaiçi olduğu için zebraya saman veriliyor.");
                zebraFeed += 90;
            }
            if (getFeed() % 7400 == 0)
                setWeight(getWeight() + 1);
        }
        else {
            System.out.println("Planlamaya göre 1kg'dan fazla veya az veremezsiniz!");
        }
    }

    @Override
    public int getFeed() {
        return zebraFeed;
    }

    @Override
    public void giveMedicine(int amount) {
        zebraMedicine += amount;
    }
}
