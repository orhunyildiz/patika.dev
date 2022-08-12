package AdventureGame;

import AdventureGame.Location.Location;
import AdventureGame.Location.SafeHouse;
import AdventureGame.Location.ToolStore;
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
            System.out.println("1. Safe House - You are safe here.\n2. Tool Store - You can buy weapons or armors here.");
            System.out.print("Please select where you want to go: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (!location.onLocation()) {
                System.out.println("You Died! Game Over!");
                break;
            }
        }
    }
}
