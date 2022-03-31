package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 1, number2 = 1;
        int result = 0;
        System.out.print("Fibonacci eleman sayısı: ");
        int element = scanner.nextInt();
        System.out.print(element + " Elemanlı Fibonacci Serisi: " + "0 " + number1 + " " + number2 + " ");
        for (int i = 2; i < element; i++) {
            result = number1 + number2;
            number1 = number2;
            number2 = result;
            System.out.print(result + " ");
        }
    }
}
