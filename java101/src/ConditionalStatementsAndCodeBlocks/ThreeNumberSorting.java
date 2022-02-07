package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class ThreeNumberSorting {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        a = scanner.nextInt();

        System.out.print("Second number: ");
        b = scanner.nextInt();

        System.out.print("Third number: ");
        c = scanner.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c)
                System.out.println("a < b < c");
            else
                System.out.println("a < c < b");
        }

        else if ((b < a) && (b < c)) {
            if (a < c)
                System.out.println("b < a < c");
            else
                System.out.println("b < c < a");
        }

        else {
            if (b < a)
                System.out.println("c < b < a");
            else
                System.out.println("c < a < b");
        }
    }
}
