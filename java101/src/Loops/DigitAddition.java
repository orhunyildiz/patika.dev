package Loops;

import java.util.Scanner;

public class DigitAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        while (n != 0) {
            int k = n % 10;
            result += k;
            System.out.println(n);
            n /= 10;
        }
        System.out.print("Result: " + result);
    }
}
