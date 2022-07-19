package ZooManagement;

public abstract class Animal {
    private String speciesName;
    private double weight;
    private int age;

    public Animal(String speciesName, double weight, int age) {
        this.speciesName = speciesName;
        this.weight = weight;
        this.age = age;
    }

    public abstract int getDosage();
    public abstract String getFeedSchedule();
    public abstract void feed(int amount);
    public abstract int getFeed();
    public abstract void giveMedicine(int amount);

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
