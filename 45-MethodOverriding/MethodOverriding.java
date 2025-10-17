public class MethodOverriding {
    public static void main(String[] args) {

        // Method overriding = When a subclass provides its own
        //                     implementation of a method that is already defined.
        //                     Allows for code reusability and gives specific implementations.

        Dog2 dog = new Dog2();
        Cat2 cat = new Cat2();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

    }
}



