import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {
        // ArrayList = A resizable array that stores objects (autoboxing)
        //             Arrays are fixed in size, but ArrayLists can change
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++) {
            System.out.println("Enter food # " + i);
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.print(foods);


        scanner.close();
    }
}
