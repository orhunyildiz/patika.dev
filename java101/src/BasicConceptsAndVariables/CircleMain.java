package BasicConceptsAndVariables;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        int r, a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = scanner.nextInt();

        double area = Math.PI * Math.pow(r, 2);
        double perimeter = 2 * Math.PI * r;

        System.out.println("Dairenin alanı: " + area);
        System.out.println("Dairenin çevresi: " + perimeter);

        System.out.print("Merkez açıyı giriniz: ");
        a = scanner.nextInt();

        double alphaArea = (Math.PI * Math.pow(r, 2) * a) / 360;
        System.out.println("Girilen merkez açıya göre daire diliminin alanı: " + alphaArea);
    }
}
