import java.util.ArrayList;
import java.util.Collections;

public class ExceptionHandling {
    public static void main(String[] args) {

        // ArrayList = A resizeable array that stores objects (autoboxing)
        //                     Arrays are fixed in size, but ArrayLists can change

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        //fruits.remove(0);
        //fruits.set(0, "Pineapple");

        Collections.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}