package Loops;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int space = n - 1, stars = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++)
                System.out.print(" ");
            for (int j = 0; j < stars; j++)
                System.out.print("*");
            System.out.println();
            space--;
            stars += 2;
        }

        space = 1;
        stars -= 4;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < space; j++)
                System.out.print(" ");
            for (int j = 0; j < stars; j++)
                System.out.print("*");
            System.out.println();
            space++;
            stars -= 2;
        }
    }
}
