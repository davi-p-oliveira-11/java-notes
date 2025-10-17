public class ToString {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car3 car1 = new Car3("Ford", "Mustang", 2025, "Red");
        Car3 car2 = new Car3("Chevrolet", "Corvette", 2026, "Blue");

        System.out.println(car1);
        System.out.println(car2);
    }
}

