import java.util.Scanner;

public class InputArray {

    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.println("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++) {
            System.out.println("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods) {
            System.out.println(food);
        }


    }
}
