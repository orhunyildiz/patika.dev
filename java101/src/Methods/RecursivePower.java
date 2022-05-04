package Methods;

import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int power = scanner.nextInt();
        System.out.println("Sonuç: " + recursivePow(base, power));
    }

    static int recursivePow(int base, int power) {
        if (power == 0)
            return 1;
        return base * recursivePow(base, power - 1);
    }
}
