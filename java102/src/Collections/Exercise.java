package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        ArrayList<ArrayList<Integer>> aList = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            aList.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++) {
            int d =  scanner.nextInt();
            for (int j = 0; j < d; j++) {
                int number = scanner.nextInt();
                aList.get(i).add(number);
            }
        }
        System.out.println(aList);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            try {
                System.out.println(aList.get(a - 1).get(b - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
