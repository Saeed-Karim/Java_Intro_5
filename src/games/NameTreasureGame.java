package games;

import java.util.Scanner;

public class NameTreasureGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the game! Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello, " + name + "! Let's begin. You are in a dark cave. There are two paths you can take. One path leads to treasure, the other leads to certain death. Which path do you take? Enter 1 for the left path or 2 for the right path.");
        int path = input.nextInt();

        if (path == 1) {
            System.out.println("You have chosen the left path. You follow the path and eventually come across a treasure chest. You open the chest and find a pile of gold coins. You win!");
        } else if (path == 2) {
            System.out.println("You have chosen the right path. As you follow the path, the floor suddenly gives way and you fall into a pit of venomous snakes. You lose.");
        } else {
            System.out.println("Invalid input. Please try again.");
        }
    }
}
