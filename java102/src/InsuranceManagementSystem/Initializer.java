package InsuranceManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Initializer {
    Scanner scanner = new Scanner(System.in);
    public void run() {
        Address firstHomeAddress = new HomeAddress("Türkiye", "İzmir", "Reşadiye Mahallesi, İzzet Sancak Caddesi");
        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(firstHomeAddress);
        User user1 = new User("Orhun", "YILDIZ", "orhunyildiz@gmail.com", "123456", "Yazılım Mühendisi", 24, addresses);
        ArrayList<Insurance> insurances = new ArrayList<>();
        HealthInsurance healthInsurance = new HealthInsurance("Sağlık Sigortası");
        insurances.add(healthInsurance);
        Individual individual = new Individual(user1, insurances);
        healthInsurance.calculate(individual);
        AccountManager.getAccounts().add(individual);
        System.out.println("*** Sigorta Yönetim Sistemi'ne Hoş Geldiniz! ***");
        System.out.println("Giriş yapmak için email ve şifrenizi giriniz.");
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Şifre: ");
        String password = scanner.nextLine();
        try {
            AccountManager.login(email, password);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return;
        }
        boolean isExit = false;
        System.out.println("Hoş Geldiniz, " + individual.getUser().getFirstName() + ".");
        System.out.println("Ne yapmak istersiniz?");
        while (true) {
            System.out.println("1- Bilgileri Görüntüle\n2- Adres Ekle\n3- Sigorta Ekle\n4- Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    individual.showUserInfo();
                    break;
                case 2:
                    AddressManager.addAddress(individual.getUser());
                    break;
                case 3:
                    System.out.println("Eklemek istediğiniz sigortayı seçin: ");
                    System.out.println("1- Sağlık Sigortası\n2- Konut\n3- Seyahat\n4- Araba");
                    int choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        HealthInsurance healthInsurance1 = new HealthInsurance("Sağlık Sigortası");
                        healthInsurance1.calculate(individual);
                        individual.addInsurancePolicy(healthInsurance1);
                    }
                    else if (choice2 == 2) {
                        ResidenceInsurance residenceInsurance = new ResidenceInsurance("Konut Sigortası");
                        residenceInsurance.calculate(individual);
                        individual.addInsurancePolicy(residenceInsurance);
                    }
                    else if (choice2 == 3) {
                        TravelInsurance travelInsurance = new TravelInsurance("Seyahat Sigortası");
                        travelInsurance.calculate(individual);
                        individual.addInsurancePolicy(travelInsurance);
                    }
                    else if (choice2 == 4) {
                        CarInsurance carInsurance = new CarInsurance("Araba Sigortası");
                        carInsurance.calculate(individual);
                        individual.addInsurancePolicy(carInsurance);
                    }
                    else
                        System.out.println("Hata");
                    break;
                case 4:
                    isExit = true;
                    break;
            }
            if (isExit)
                break;
        }
    }
}
