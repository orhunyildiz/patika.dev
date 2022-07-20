package ZooManagement;

public abstract class Rodent extends Animal {

    private int teethNumber;

    public Rodent(String speciesName, double weight, int age, int teethNumber) {
        super(speciesName, weight, age);
        this.teethNumber = teethNumber;
    }

    public int getTeethNumber() {
        return teethNumber;
    }

    public void setTeethNumber(int teethNumber) {
        this.teethNumber = teethNumber;
    }
}
