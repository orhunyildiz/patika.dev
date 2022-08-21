package Collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Zonguldak");
        vector.add("Sinop");
        vector.add("Trabzon");
        vector.add("Rize");
        vector.add("İzmit");

        vector.add(3, "Bafra");
        System.out.println("Vector size: " + vector.size());
        for (String s : vector) {
            System.out.println(s);
        }
    }
}
