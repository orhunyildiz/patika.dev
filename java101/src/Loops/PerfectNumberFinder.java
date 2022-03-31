package Loops;

import java.util.Scanner;

public class PerfectNumberFinder {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                result += i;
        }
        if (result == number)
            System.out.println(number + " Mükemmel sayıdır.");
        else
            System.out.println(number + " Mükemmel sayı değildir.");
    }
}
