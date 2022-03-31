package Loops;

import java.util.Scanner;

public class MinAndMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int number1 = scanner.nextInt();
        int max = 0, min = 0;
        for (int i = 0; i < number1; i++) {
            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            int number2 = scanner.nextInt();
            if (number2 > max)
                max = number2;
            if (number2 < min)
                min = number2;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
