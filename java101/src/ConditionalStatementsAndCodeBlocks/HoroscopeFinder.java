package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        int month, day;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Month: ");
        month = scanner.nextInt();

        System.out.print("Day: ");
        day = scanner.nextInt();

        String horoscope = "";

        if (month == 1) {
            if (day >= 1 && day <= 31)
                if (day < 22) {
                    horoscope = "Capricorn";
                } else
                    horoscope = "Aquarius";
        }


        if (month == 2) {
            if (day >= 1 && day <= 28)
                if (day < 20) {
                    horoscope = "Aquarius";
                } else
                    horoscope = "Pisces";
        }

        if (month == 3) {
            if (day >= 1 && day <= 31)
                if (day < 21) {
                    horoscope = "Pisces";
                } else horoscope = "Aries";
        }

        if (month == 4) {
            if (day >= 1 && day <= 30)
                if (day < 21) {
                    horoscope = "Aries";
                } else horoscope = "Taurus";
        }

        if (month == 5) {
            if (day >= 1 && day <= 31)
                if (day < 22) {
                    horoscope = "Taurus";
                } else horoscope = "Gemini";
        }

        if (month == 6) {
            if (day >= 1 && day <= 30)
                if (day < 23) {
                    horoscope = "Gemini";
                } else horoscope = "Cancer";
        }

        if (month == 7) {
            if (day >= 1 && day <= 31)
                if (day < 23) {
                    horoscope = "Cancer";
                } else horoscope = "Leo";
        }

        if (month == 8) {
            if (day >= 1 && day <= 30)
                if (day < 23) {
                    horoscope = "Leo";
                } else horoscope = "Virgo";
        }

        if (month == 9) {
            if (day >= 1 && day <= 31)
                if (day < 23) {
                    horoscope = "Virgo";
                } else horoscope = "Libra";
        }

        if (month == 10) {
            if (day >= 1 && day <= 30)
                if (day < 23) {
                    horoscope = "Libra";
                } else horoscope = "Scorpio";
        }

        if (month == 11) {
            if (day >= 1 && day <= 31)
                if (day < 22) {
                    horoscope = "Scorpio";
                } else horoscope = "Sagittarius";
        }

        if (month == 12) {
            if (day >= 1 && day <= 30)
                if (day < 22) {
                    horoscope = "Sagittarius";
                } else horoscope = "Sagittarius";
        } else

            System.out.print("Your horoscope : " + horoscope);
    }
}
