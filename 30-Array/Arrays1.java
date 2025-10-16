import java.util.Arrays;

public class Arrays1 {

    public static void main(String[] args) {

        // array = a collection of values of the same data type
        //       * think of it as a variable that can store more than 1 value

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        // fruits[0] = "ṕineapple";
        // int numOfFruits = fruits.length;
        // Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        for(int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i] + " ");
        }

        //  improved array
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
