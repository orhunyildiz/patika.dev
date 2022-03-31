package Loops;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        int height = scanner.nextInt();
        int stars = height * 2 - 1;
        int space = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < space; j++)
                System.out.print(" ");
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            stars -= 2;
            space++;
        }
    }
}
