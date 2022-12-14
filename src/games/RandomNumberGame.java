package games;

import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        int secret = (int) (Math.random() * 10) + 1; // generate a random number between 1 and 10
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number between 1 and 10:");
            int guess = input.nextInt();

            if (guess == secret) {
                System.out.println("Congratulations! You guessed the correct number!");
                break;
            } else {
                System.out.println("Sorry, try again.");
            }
        }
    }
}
