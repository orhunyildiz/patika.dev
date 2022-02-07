package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class TempAndActivityExample {
    public static void main(String[] args) {
        int temperature;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        temperature = scanner.nextInt();

        if (temperature < 5)
            System.out.println("You can ski!");
        else if (temperature <= 25) {
            if (temperature <= 15)
                System.out.println("You can go to the cinema!");
            if (temperature >= 10)
                System.out.println("You can go on a picnic!");
        }
        else
            System.out.println("You can swim!");
    }
}
