package BasicConceptsAndVariables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat, fizik, kimya, turkce, tarih, muzik;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = scanner.nextDouble();

        System.out.print("Fizik notunuz: ");
        fizik = scanner.nextDouble();

        System.out.print("Kimya notunuz: ");
        kimya = scanner.nextDouble();

        System.out.print("Türkçe notunuz: ");
        turkce = scanner.nextDouble();

        System.out.print("Tarih notunuz: ");
        tarih = scanner.nextDouble();

        System.out.print("Müzik notunuz: ");
        muzik = scanner.nextDouble();

        double sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalamanız: " + sonuc);

        System.out.println(sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
