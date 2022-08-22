package PatikaStoreExample;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Brand {
    private static TreeMap<Integer, String> brands = new TreeMap<>();

    static {
        brands.put(1, "Samsung");
        brands.put(2, "Lenovo");
        brands.put(3, "Apple");
        brands.put(4, "Huawei");
        brands.put(5, "Casper");
        brands.put(6, "Asus");
        brands.put(7, "HP");
        brands.put(8, "Xiaomi");
        brands.put(9, "Monster");
    }

    public static void printBrands() {
        Map<Integer, String> sortedMap = BrandNameComparator.valueSort(brands);
        Set<Map.Entry<Integer, String>> set = sortedMap.entrySet();

        System.out.println("Markalarımız");
        System.out.println("--------------");
        for (Map.Entry<Integer, String> mp : set) {
            System.out.println("- " + mp.getValue());
        }
        System.out.println();
    }

    public static int addBrand(int id, String name) {
        int count = 0;
        for (int i = 1; i <= brands.size(); i++) {
            if (id == i) {
                count++;
                break;
            }
        }
        if (count != 0) {
            System.out.println("Lütfen benzersiz bir id giriniz");
            return count;
        }
        else
            brands.put(id, name);
        return count;
    }

    public static TreeMap<Integer, String> getBrands() {
        return brands;
    }
}
