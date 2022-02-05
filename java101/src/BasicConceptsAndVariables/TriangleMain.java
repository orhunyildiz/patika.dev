package BasicConceptsAndVariables;

import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz: ");
        a = scanner.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        b = scanner.nextInt();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hipotenüs: " + c);
        System.out.println("Üçgenin Çevresi: " + (a + b + c));
        System.out.println("Üçgenin Alanı: " + (a * b / 2));
    }
}
