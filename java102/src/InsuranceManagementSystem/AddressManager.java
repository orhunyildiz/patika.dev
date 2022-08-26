package InsuranceManagementSystem;

import java.util.Scanner;

public class AddressManager {
    public static Scanner scanner = new Scanner(System.in);

    public static void addAddress(User user) {
        System.out.print("Eklemek istediğiniz adres türü:\n1- Ev Adresi\n2- İş Adresi\nSeçiminiz: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Ülke: ");
                String country = scanner.next();
                scanner.nextLine();
                System.out.print("Şehir: ");
                String city = scanner.nextLine();
                System.out.print("Adres: ");
                String openAddress = scanner.nextLine();
                Address homeAddress = new HomeAddress(country, city, openAddress);
                user.getAddresses().add(homeAddress);
            }
            case 2 -> {
                System.out.print("Ülke: ");
                String country = scanner.nextLine();
                System.out.print("Şehir: ");
                String city = scanner.nextLine();
                System.out.print("Adres: ");
                String openAddress = scanner.nextLine();
                Address businessAddress = new BusinessAddress(country, city, openAddress);
                user.getAddresses().add(businessAddress);
            }
            default -> System.out.println("Hata!");
        }
    }

    public static Address removeAddress(User user) {
        System.out.println("Silmek istediğiniz adresi seçin: ");
        int i = 0;
        for (Address address : user.getAddresses())
            System.out.println(++i + " - " + address.getAddress());
        System.out.println("Silmek istediğiniz adres bulunamadı.");
        return null;
    }
}
