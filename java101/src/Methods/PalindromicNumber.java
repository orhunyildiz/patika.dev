package Methods;

import java.util.Scanner;

public class PalindromicNumber {
    static boolean isPalindrome(int number) {
        String reverseNumber = "";
        int temp;
        temp = number;
        while (temp != 0) {
            reverseNumber += String.valueOf(temp % 10);
            temp /= 10;
        }
        return number == Integer.parseInt(reverseNumber);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        if (isPalindrome(number))
            System.out.println("Girilen sayı palindrom.");
        else
            System.out.println("Girilen sayı palindrom değil.");
    }
}
