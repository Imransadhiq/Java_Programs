import java.util.Scanner;
import java.lang.Math;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int)(Math.random() * 100) + 1;
        int attempts = 0;
        System.out.println("Welcome! Try to guess the secret number between 1 to 100");

        while(true) {
            System.out.println("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You guessed it right in " + attempts + " attempts.");
                break;
            } else if (userGuess > secretNumber) {
                System.out.println("Try a smaller number.");
            } else {
                System.out.println("Try a greater number.");
            }
        }
        scanner.close();
    }
}
