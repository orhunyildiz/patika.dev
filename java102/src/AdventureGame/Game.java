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

        Location location = null;
        while(true) {
            player.printInfo();
            System.out.println("Locations");
            System.out.println("1. Safe House - You are safe here.\n2. Tool Store - You can buy weapons or armors here.\n3. Cave - There are zombies here. Award is food.\n4. Forest - There are vampires here. Award is a firewood.\n5. River - There are bears here. Award is some water.\n0. Exit the Game - Return to Desktop.");
            System.out.print("Please select where you want to go: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    location = null;
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
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
            }
            if (location == null) {
                System.out.println("You are exiting the Game.");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("You Died! Game Over!");
                break;
            }
        }
    }
}
