package BasicConceptsAndVariables;

import java.util.Scanner;

public class KDVMain {
    public static void main(String[] args) {
        double tutar, kdvOran;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = scanner.nextDouble();

        if (tutar <= 1000)
            kdvOran = 0.18;
        else
            kdvOran = 0.8;

        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV'li Fiyat: " + kdvliTutar);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV Oranı: " + kdvOran);

    }
}
