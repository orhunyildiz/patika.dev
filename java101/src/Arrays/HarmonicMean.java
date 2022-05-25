package Arrays;

public class HarmonicMean {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Ortalama: " + sum / numbers.length);

        double harmonicSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += 1.0 / (i + 1);
        }
        System.out.println("Harmonik Ortalama: " + numbers.length / harmonicSum);
    }
}
