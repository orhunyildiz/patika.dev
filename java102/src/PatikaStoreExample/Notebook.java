package PatikaStoreExample;

import java.util.ArrayList;
import java.util.List;

public class Notebook extends Product {

    private static List<Notebook> notebooks = new ArrayList<>();

    public Notebook(int id, String productName, double price, String brandName, String storage, double inches, String ram) {
        super(id, productName, price, brandName, storage, inches, ram);
    }

    public static void makeNotebookList() {
        Notebook notebook1 = new Notebook(1, "HUAWEI Matebook 14", 7000, "Huawei", "512", 14, "16");
        Notebook notebook2 = new Notebook(2, "LENOVO V14 IGL", 3699, "Lenovo", "1024", 14, "8");
        Notebook notebook3 = new Notebook(3, "ASUS Tuf Gaming", 8199, "Asus", "2048", 15.6, "32");
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
    }

    public static void printNotebooks() {
        String leftAlignFormat = "| %-2s | %-20s | %-8s TL | %-8s | %-8s | %-8s | %-5s |%n";
        String line = "+----------------------------------------------------------------------------------+%n";
        System.out.format(line);
        System.out.format("| ID | Ürün Adı             | Fiyat       | Marka    | Depolama | Ekran    | RAM   |%n");
        System.out.format(line);
        for (Notebook notebook : notebooks) {
            System.out.format(leftAlignFormat,notebook.getId(),notebook.getProductName(),notebook.getPrice(),notebook.getBrandName(),notebook.getStorage(),notebook.getInches(),notebook.getRam());
        }
        System.out.format(line);
    }
}
