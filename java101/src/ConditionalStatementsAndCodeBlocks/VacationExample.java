package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class VacationExample {
    public static void main(String[] args) {
        double mesafe, yas, tip;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = scanner.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        yas = scanner.nextDouble();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = scanner.nextDouble();

        if (mesafe < 0 || yas < 0 || (tip != 1 && tip != 2))
            System.out.println("Hatalı Veri Girdiniz!");
        else {
            double normalTutar = mesafe * 0.10;
            double yasIndirimOrani;
            if (yas < 12)
                yasIndirimOrani = 0.50;
            else if (yas >= 12 && yas <= 24)
                yasIndirimOrani = 0.10;
            else if (yas > 65)
                yasIndirimOrani = 0.30;
            else
                yasIndirimOrani = 0;

            double yasIndirimi = normalTutar * yasIndirimOrani;
            double indirimliTutar = normalTutar - yasIndirimi;

            double toplamTutar;

            if (tip == 2) {
                double gidisDonusBiletIndirimOrani = 0.20;
                double gidisDonusBiletIndirimi = indirimliTutar * gidisDonusBiletIndirimOrani;
                toplamTutar = (indirimliTutar - gidisDonusBiletIndirimi) * 2;
                System.out.println("Toplam Tutar: " + toplamTutar + " TL");
            }
            else
                System.out.println("Toplam Tutar: " + indirimliTutar + " TL");
        }
    }
}
