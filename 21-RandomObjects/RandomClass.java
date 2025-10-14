import java.util.Random;
import java.util.Scanner;

public class RandomClass {
    public static void main(String[] args) {
        // Number Guessing Game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number guessing game: ");
        System.out.printf("Guess a number between %d-%d\n: ", min, max);

        do {
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber) {
                System.out.println("Too Low ! try again");
            } else if (guess > randomNumber) {
                System.out.println("Too High ! Try Again");
            } else {
                System.out.println("Correct ! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }
        } while(guess != randomNumber);

        scanner.close();
    }
}
