package BasicConceptsAndVariables;

import java.util.Scanner;

public class GroceryMain {
    public static void main(String[] args) {
        /*
            Armut : 2,14 TL
            Elma : 3,67 TL
            Domates : 1,11 TL
            Muz: 0,95 TL
            Patlıcan : 5,00 TL
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        int pear = scanner.nextInt();
        System.out.print("Elma Kaç Kilo ? :");
        int apple = scanner.nextInt();
        System.out.print("Domates Kaç Kilo ? :");
        int tomato = scanner.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        int banana = scanner.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? :");
        int eggplant = scanner.nextInt();

        double total = pear * 2.14 + apple * 3.67 + tomato * 1.11 + banana * 0.95 + eggplant * 5;
        System.out.println("Toplam Tutar : " + total + " TL");
    }
}
