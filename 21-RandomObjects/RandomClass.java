import java.util.Random;
import java.util.Scanner;

public class RandomClass {
    public static void main(String[] args) {
        // Number Guessing Game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts;
        int randomNumber = random.nextInt(1, 11);

        System.out.println(randomNumber);
    }

}
