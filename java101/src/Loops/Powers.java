package Loops;

import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        int limitNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Limit Number: ");
        limitNumber = scanner.nextInt();

        System.out.println("4'ün kuvvetleri: ");
        for (int i = 1; i <= limitNumber; i*=4)
            System.out.println(i);

        System.out.println("5'in kuvvetleri: ");
        for (int i = 1; i <= limitNumber; i*=5)
            System.out.println(i);
    }
}
