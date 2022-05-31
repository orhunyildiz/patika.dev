package Arrays;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        int[][] original = new int[2][3];
        int[][] transpose = new int[3][2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Matris: ");

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                original[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = original[j][i];
            }
        }

        System.out.println("Transpoze: ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
