package Arrays;

import java.util.Arrays;

public class Frequency {

    public static void countFreq(int[] arr, int n) {
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        System.out.println("Dizi: " + Arrays.toString(arr));
        countFreq(arr, n);
    }
}
