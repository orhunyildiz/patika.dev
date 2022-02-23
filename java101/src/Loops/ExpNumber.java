package Loops;

import java.util.Scanner;

public class ExpNumber {
    // n^k = n * n ... (k times)
    public static void main(String[] args) {
        int n, k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        n = scanner.nextInt();
        System.out.print("k: ");
        k = scanner.nextInt();

        int total = 1;
        for (int i = 1; i <= k; i++)
            total *= n;
        System.out.println("Result: " + total);
    }
}
