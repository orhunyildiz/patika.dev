package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        int min = array[0];
        int max = array[0];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        Arrays.sort(array);
        for (int j : array) {
            if (j < number)
                min = j;
            if (j > number) {
                max = j;
                break;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
