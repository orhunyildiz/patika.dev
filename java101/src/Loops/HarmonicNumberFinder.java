package Loops;

import java.util.Scanner;

public class HarmonicNumberFinder {
    // Harmonic Serial: 1 + (1/2) + (1/3) + (1/4) + ... + (1/n)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        double total = 0;
        for (int i = 1; i <= n; i++) {
            double result = 1.0 / i;
            total += result;
        }
        System.out.println("Result: " + total);
    }
}
