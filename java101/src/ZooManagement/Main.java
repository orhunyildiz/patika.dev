package ZooManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Horse horse1 = new Horse("Equus Caballus", 400, 6, 88);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hayvanat Bahçesi Yönetimi Sistemi'ne Hoş Geldiniz!");
        System.out.println("Lütfen ilgilenmek istediğiniz hayvanı seçin: ");
        System.out.println("1- Atlar\n2- Zebralar\n3- Eşekler");
        System.out.print("Seçim: ");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Atlara ne yapmak istiyorsunuz: ");
            System.out.println("1- Yem Planlamasını Gör\n2- Yem Ver\n3- İlaç Dozajını Gör\n4- İlaç Ver\n5- Ne Kadar Yem Verildiğini Gör");
            System.out.print("Seçim: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println(horse1.getFeedSchedule());
                case 2 -> horse1.feed(1);
                case 3 -> System.out.println(horse1.getDosage());
                case 4 -> horse1.giveMedicine(10);
                case 5 -> System.out.println(horse1.getFeed());
                default -> System.out.println("Yanlış Seçim");
            }
        }
    }
}
