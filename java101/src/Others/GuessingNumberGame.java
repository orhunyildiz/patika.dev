package Others;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = scanner.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz!");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız! Kalan hak: " + (5 - right));
                }
                else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir!");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı: " + number);
                isWin = true;
                break;
            }
            else {
                System.out.print("Hatalı bir sayı girdiniz! ");
                if (selected > number)
                    System.out.println(selected + " sayısı, gizli sayıdan büyük.");
                else
                    System.out.println(selected + " sayısı, gizli sayıdan küçük.");
                wrong[right++] = selected;
                System.out.println("Kalan hakkınız: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz!");
            if (!isWrong) {
                System.out.print("Tahminleriniz: ");
                for (int i : wrong) {
                    if (i != 0)
                        System.out.print(i + " ");
                }
            }
        }
    }
}
