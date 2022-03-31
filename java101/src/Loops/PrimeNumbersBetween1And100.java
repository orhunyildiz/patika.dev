package Loops;

public class PrimeNumbersBetween1And100 {
    public static void main(String[] args) {
        int counter;
        for (int i = 2; i < 100; i++) {
            counter = 0;
            for (int j = 2; j < i; j++)
                if (i % j == 0)
                    counter++;
            if (counter == 0)
                System.out.print(i + " ");
        }
    }
}
