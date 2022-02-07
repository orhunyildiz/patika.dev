package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class SignInExample {
    public static void main(String[] args) {
        String username, password, choice, newPassword;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        username = scanner.nextLine();

        System.out.print("Password: ");
        password = scanner.nextLine();

        if (!password.equals("java123") && username.equals("patika")) {
            System.out.print("Wrong password! Do you want to reset your password? (Type Yes or No): ");
            choice = scanner.nextLine();
            if (choice.equals("Yes")) {
                System.out.print("Please enter your new password: ");
                newPassword = scanner.nextLine();
                if (newPassword.equals("java123"))
                    System.out.println("Could not create password, please enter another password!");
                else
                    System.out.println("Password created!");
            }
            else if (!choice.equals("No"))
                System.out.println("Invalid command!");
        }
        else if (password.equals("java123") && username.equals("patika"))
            System.out.println("Successful!");
        else
            System.out.println("Wrong username! Please try again!");
    }
}
