package Loops;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Number2: ");
        int number2 = scanner.nextInt();

        int tempNumber1 = number1;
        int tempNumber2 = number2;

        int gcd = 1;
        int divisor = 2;
        while (tempNumber1 != 1 && tempNumber2 != 1) {
            if (tempNumber1 % divisor == 0 && tempNumber2 % divisor == 0) {
                gcd *= divisor;
                tempNumber1 /= divisor;
                tempNumber2 /= divisor;
            }
            else if (tempNumber1 % divisor != 0 && tempNumber2 % divisor != 0)
                divisor++;
            else {
                if (tempNumber1 % divisor == 0)
                    tempNumber1 /= divisor;
                else
                    tempNumber2 /= divisor;
            }
        }
        System.out.println("GCD: " + gcd);

        int lcm = (number1 * number2) / gcd;
        System.out.println("LCM: " + lcm);
    }
}
