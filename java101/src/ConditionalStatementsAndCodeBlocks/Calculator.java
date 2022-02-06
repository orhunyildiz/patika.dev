package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int number1, number2, choice;
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        number1 = scanner.nextInt();

        System.out.print("Second number: ");
        number2 = scanner.nextInt();

        System.out.println("1-Add\n2-Sub\n3-Multi\n4-Divide");
        System.out.print("Your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result: " + (number1 * number2));
                break;
            case 4:
                switch (number2) {
                    case 0:
                        System.out.println("Divisor cannot be 0");
                        break;
                    default:
                        System.out.println("Result: " + (number1 / number2));
                        break;
                }
                break;
            default:
                System.out.println("Wrong choice! Please try again!");
        }
    }
}
