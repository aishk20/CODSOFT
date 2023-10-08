import java.util.Random;
import java.util.Scanner;

public class cod1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total=5;
        int lb = 1;
        int ub = 100;
        int score = 0;

        System.out.println("Welcome to my World of Number Guessing Game");
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(ub - lb + 1) + lb;
            int attempts = 0;

            System.out.println("I've selected a number between " + lb + " and " + ub + ". Guess it!");

            while (attempts < total) {
                System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Wowwwww! You are right.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("LOW");
                } else {
                    System.out.println("HIGH");
                }

                attempts++;
            }

            if (attempts == total) {
                System.out.println("Ops, reached the maximum number of attempts. The answer is " + targetNumber + ".");
            }

            System.out.print("Want to contine the game? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();

            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing this amazing game! Your score is: " + score);
        scanner.close();
    }
}