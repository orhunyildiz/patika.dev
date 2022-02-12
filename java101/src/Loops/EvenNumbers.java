package Loops;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        int counter = 0;
        double sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int numberToDivide = scanner.nextInt();

        for (int i = 1; i <= numberToDivide; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                counter++;
            }
        }

        if (counter == 0)
            counter = 1;

        double result = sum / counter;
        System.out.print("Result: " + result);
    }
}
