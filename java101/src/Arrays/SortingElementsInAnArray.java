package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingElementsInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.print("Sıralama: " + Arrays.toString(array));
    }
}
