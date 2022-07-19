package ZooManagement;

public abstract class Felines extends Animal {
    private boolean isBaby;
    public Felines(String speciesName, double weight, int age, boolean isBaby) {
        super(speciesName, weight, age);
        this.isBaby = isBaby;
    }

    public boolean isBaby() {
        return isBaby;
    }

    public void setBaby(boolean baby) {
        isBaby = baby;
    }
}
