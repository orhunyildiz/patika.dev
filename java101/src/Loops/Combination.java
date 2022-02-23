package Loops;

import java.util.Scanner;

public class Combination {
    // C(n,r) = n! / (r! * (n-r)!)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r, result;
        System.out.print("n: ");
        n = scanner.nextInt();
        System.out.print("r: ");
        r = scanner.nextInt();

        result = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("Result: " + result);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 0; i--)
            result *= i;
        return result;
    }
}
