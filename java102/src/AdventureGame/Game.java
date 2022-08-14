package AdventureGame;

import AdventureGame.Location.*;
import AdventureGame.Player.Player;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("Welcome to Adventure Game!");
        System.out.print("Please write your hero's name: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
        System.out.println("Please select your hero's class.");
        player.selectChar();

        Location location;
        while(true) {
            player.printInfo();
            System.out.println("Locations");
            System.out.println("1. Safe House - You are safe here.\n2. Tool Store - You can buy weapons or armors here.\n3. Cave - There are zombies here. Money award: 4. Item award: Food.\n4. Forest - There are vampires here. Money award: 7. Item award: Firewood.\n5. River - There are bears here. Money award: 12. Item award: Water.\n0. Exit the Game - Return to Desktop.");
            System.out.print("Please select where you want to go: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if (player.getInventory().isFood()) {
                        System.out.println("You've got already food. You don't need to enter this cave. Please select another territory.");
                        continue;
                    }
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Please enter an available territory!");
                    continue;
            }
            if (location == null) {
                System.out.println("You are exiting the Game.");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("You Died! Game Over!");
                break;
            }
            if (player.getInventory().isFood() && player.getInventory().isFirewood() && player.getInventory().isWater()) {
                System.out.println("You've finished the game! Congratulations. The End!");
                break;
            }
        }
    }
}
