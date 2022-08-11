package AdventureGame;

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
    }
}
