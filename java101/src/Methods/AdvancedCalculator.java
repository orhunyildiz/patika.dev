package Methods;

import java.util.Scanner;

public class AdvancedCalculator {

    static void plus() {
        Scanner scanner = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = scanner.nextInt();
            if (number == 0)
                break;
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scanner.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scanner.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void times() {
        Scanner scanner = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = scanner.nextInt();
            if (number == 1)
                break;
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void divided() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scanner.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scanner.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz!");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int exponent = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++)
            result *= base;
        System.out.print("Sonuç: " + result);
    }

    static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        System.out.println("Sonuç: " + result);
    }

    static void mode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Modu alınacak sayı: ");
        int a = scanner.nextInt();
        System.out.print("Mod: ");
        int b = scanner.nextInt();
        int result = a % b;
        System.out.println("Sonuç: " + result);
    }

    static void rectangleAreaAndPerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzun kenar: ");
        int longSide = scanner.nextInt();
        System.out.print("Kısa kenar: ");
        int shortSide = scanner.nextInt();
        System.out.println("Alan: " + shortSide * longSide);
        System.out.println("Çevre: " + 2 * (shortSide + longSide));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap""";

        do {
            System.out.print("Bir işlem seçiniz: ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangleAreaAndPerimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
