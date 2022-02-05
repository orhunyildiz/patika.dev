package BasicConceptsAndVariables;

import java.util.Scanner;

public class VKIMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double height = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        int kg = scanner.nextInt();

        double result = kg / Math.pow(height, 2);
        System.out.println("Vücut Kitle İndeksiniz: " + result);
    }
}
