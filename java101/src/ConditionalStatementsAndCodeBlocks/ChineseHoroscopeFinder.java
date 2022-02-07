package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class ChineseHoroscopeFinder {
    public static void main(String[] args) {
        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        year = scanner.nextInt();

        int remainder = year % 12;

        String chineseHoroscope;

        switch (remainder) {
            case 0 -> chineseHoroscope = "Maymun";
            case 1 -> chineseHoroscope = "Horoz";
            case 2 -> chineseHoroscope = "Köpek";
            case 3 -> chineseHoroscope = "Domuz";
            case 4 -> chineseHoroscope = "Fare";
            case 5 -> chineseHoroscope = "Öküz";
            case 6 -> chineseHoroscope = "Kaplan";
            case 7 -> chineseHoroscope = "Tavşan";
            case 8 -> chineseHoroscope = "Ejderha";
            case 9 -> chineseHoroscope = "Yılan";
            case 10 -> chineseHoroscope = "At";
            case 11 -> chineseHoroscope = "Koyun";
            default -> chineseHoroscope = "Hata!";
        }

        System.out.println("Çin Zodyağı Burcunuz: " + chineseHoroscope);
    }
}
