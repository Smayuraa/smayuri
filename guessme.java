import java.util.Random;
import java.util.Scanner;

public class guessme {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

        while (!hasWon) {
            System.out.print("Enter your guess (1-100): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                hasWon = true;
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempt" + (attempts > 1 ? "s" : "") + ".");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Thank you for playing the Number Guessing Game!");
    }
}
