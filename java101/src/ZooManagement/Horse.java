package ZooManagement;


import java.util.Calendar;

public class Horse extends AbstractHorse {
    private int horseMedicine;
    private int horseFeed;

    public Horse(String speciesName, double weight, int age, int maxHorsepower) {
        super(speciesName, weight, age, maxHorsepower);
        this.horseMedicine = 0;
        this.horseFeed = 0;
    }

    @Override
    public int getDosage() {
        return horseMedicine;
    }

    @Override
    public String getFeedSchedule() {
        return "Atlara, haftasonu 1kg yulaf, haftaiçi 1kg saman verilir. (1kg yulaf: 600 kalori, 1kg saman: 90 kalori)";
    }

    @Override
    public void feed(int amount) {
        if (amount == 1) {
            Calendar calendar = Calendar.getInstance();
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == 1 || dayOfWeek == 7) {
                System.out.println("Haftasonu olduğu için ata yulaf veriliyor.");
                horseFeed += 600;
            }
            else {
                System.out.println("Haftaiçi olduğu için ata saman veriliyor.");
                horseFeed += 90;
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
        return horseFeed;
    }

    @Override
    public void giveMedicine(int amount) {
        horseMedicine += amount;
    }
}
