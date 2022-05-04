package Methods;

import java.util.Scanner;

public class RecursiveByPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı: ");
        int number = scanner.nextInt();
        System.out.print(recursiveByPattern(number, number, true));
    }

    static int recursiveByPattern(int number, int staticNumber, boolean state) {
        System.out.print(number + " ");
        if (number > 0 && state)
            number -= 5;
        else {
            state = false;
            number += 5;
        }
        if (number == staticNumber)
            return number;
        return recursiveByPattern(number, staticNumber, state);
    }
}
