package ZooManagement;

public abstract class AbstractHorse extends Animal {
    private int maxHorsepower;
    public AbstractHorse(String speciesName, double weight, int age, int maxHorsepower) {
        super(speciesName, weight, age);
        this.maxHorsepower = maxHorsepower;
    }

    public int getMaxHorsepower() {
        return maxHorsepower;
    }

    public void setMaxHorsepower(int maxHorsepower) {
        this.maxHorsepower = maxHorsepower;
    }
}
