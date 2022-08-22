package PatikaStoreExample;

import java.util.Scanner;

public class PatikaStore {
    Scanner scanner = new Scanner(System.in);
    public void run() {
        System.out.println("PatikaStore Ürün Yönetim Paneli!");
        while (true) {
            boolean isExit = false;
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Notebook.makeNotebookList();
                    Notebook.printNotebooks();
                    break;
                case 2:
                    Phone.makePhoneList();
                    Phone.printPhones();
                    break;
                case 3:
                    Brand.printBrands();
                    break;
                case 0:
                    isExit = true;
                    break;
                default:
                    System.out.println("Hata!");
                    break;
            }
            if (isExit) {
                System.out.println("Mağazadan çıktınız");
                break;
            }
        }
    }
}
