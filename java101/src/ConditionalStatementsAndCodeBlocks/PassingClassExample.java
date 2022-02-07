package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class PassingClassExample {
    public static void main(String[] args) {
        double math, phys, eng, chem, music;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Math: ");
        math = scanner.nextInt();

        if (math < 0 || math > 100)
            math = 0;

        System.out.print("Physics: ");
        phys = scanner.nextInt();

        if (phys < 0 || phys > 100)
            phys = 0;

        System.out.print("English: ");
        eng = scanner.nextInt();

        if (eng < 0 || eng > 100)
            eng = 0;

        System.out.print("Chemistry: ");
        chem = scanner.nextInt();

        if (chem < 0 || chem > 100)
            chem = 0;

        System.out.print("Music: ");
        music = scanner.nextInt();

        if (music < 0 || music > 100)
            music = 0;

        double average = (math + phys + eng + chem + music) / 5;

        if (average <= 55)
            System.out.println("Sorry you could not pass the class!");
        else
            System.out.println("Congratulations! You passed the class!");

        System.out.println("Your average: " + average);

    }
}
