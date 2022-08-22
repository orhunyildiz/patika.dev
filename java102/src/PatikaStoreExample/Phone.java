package PatikaStoreExample;

import java.util.ArrayList;
import java.util.List;

public class Phone extends Product {

    private static String camera;
    private static double battery;
    private static String color;
    private static List<Phone> phones = new ArrayList<>();

    public Phone(int id, String productName, double price, String brandName, String storage, double inches, String ram, String camera, double battery, String color) {
        super(id, productName, price, brandName, storage, inches, ram);
        Phone.camera = camera;
        Phone.battery = battery;
        Phone.color = color;
    }

    public static void makePhoneList() {
        Phone phone1 = new Phone(1, "SAMSUNG GALAXY A51", 3199, "Samsung", "128", 6.5, "6", "32", 4000, "Siyah");
        Phone phone2 = new Phone(2, "iPhone 11 64 GB", 7379, "Apple", "64", 6.1, "6", "5", 3046, "Mavi");
        Phone phone3 = new Phone(3, "Redmi Note 10 Pro 8GB", 4012, "Xiaomi", "128", 6.5, "12", "35", 4000, "Beyaz");
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
    }

    public static void printPhones() {
        String leftAlignFormat = "| %-2s | %-22s | %-8s TL | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s |%n";
        String line = "+------------------------------------------------------------------------------------------------------------------------+%n";
        System.out.format(line);
        System.out.format("| ID | Ürün Adı               | Fiyat       | Marka    | Depolama | Ekran    | Kamera   | Pil      | RAM      | Renk     |%n");
        System.out.format(line);
        for (Phone phone : phones) {
            System.out.format(leftAlignFormat,phone.getId(),phone.getProductName(),phone.getPrice(),phone.getBrandName(),phone.getStorage(),phone.getInches(), getCamera(), getBattery(), phone.getRam(), getColor());
        }
        System.out.format(line);
    }

    public static String getCamera() {
        return camera;
    }

    public static void setCamera(String camera) {
        Phone.camera = camera;
    }

    public static double getBattery() {
        return battery;
    }

    public static void setBattery(double battery) {
        Phone.battery = battery;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Phone.color = color;
    }
}
