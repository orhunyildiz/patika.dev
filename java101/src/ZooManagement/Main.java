package ZooManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Animal[] animals = createInstances();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hayvanat Bahçesi Yönetimi Sistemi'ne Hoş Geldiniz!");
        System.out.println("Yapmak istediğiniz işlemi seçin: ");
        while (true) {
            System.out.println("1- Hayvanların Yem Planlamasını Gör\n2- Hayvanlara Yem Ver\n3- Hayvanların İlaç Dozajını Gör\n4- Hayvanlara İlaç Ver\n5- Hayvanlara Ne Kadar Yem Verildiğini Gör\n6- Hayvanların Ağırlıklarını Gör\n7- Çıkış");
            System.out.print("Seçim: ");
            choice = scanner.nextInt();
            if (choice == 7)
                break;
            for (Animal animal : animals) {
                switch (choice) {
                    case 1 -> System.out.println(animal.getFeedSchedule());
                    case 2 -> animal.feed(1);
                    case 3 -> System.out.println(animal.getDosage());
                    case 4 -> animal.giveMedicine(10);
                    case 5 -> System.out.println(animal.getFeed());
                    case 6 -> System.out.println(animal.getWeight());
                    default -> System.out.println("Hata");
                }
            }
        }
    }

    public static Animal[] createInstances() {
        Animal[] animals;
        Horse horse1 = new Horse("Equus Caballus", 400, 6, 88);
        Horse horse2 = new Horse("Equus Ferus Caballus", 500, 4, 95);
        Horse horse3 = new Horse("Friesian", 780, 5, 85);
        Zebra zebra1 = new Zebra("Equus Grevyi", 450, 8, 80);
        Zebra zebra2 = new Zebra("Equus Zebra", 450, 9, 50);
        Donkey donkey1 = new Donkey("Equus Asinus", 150, 20, 40);
        Lion lion1 = new Lion("Panthera Leo", 100, 5, false);
        Lion lion2 = new Lion("Panthera Leo", 25, 1, true);
        Tiger tiger1 = new Tiger("Panthera Tigris", 150, 7, false);

        animals = new Animal[]{horse1, horse2, horse3, zebra1, zebra2, donkey1, lion1, lion2, tiger1};
        return animals;
    }
}
