package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class LeapYearFinder {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 == 0)
                System.out.println(year + " bir artık yıldır!");
            else if (year % 100 == 0)
                System.out.println(year + " bir artık yıl değildir!");
            else
                System.out.println(year + " bir artık yıldır!");
        }
        else
            System.out.println(year + " bir artık yıl değildir!");
    }
}
