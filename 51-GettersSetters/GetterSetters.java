public class GetterSetters {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car5 car = new Car5("Charger", "Yellow", 10000);

        car.setColor("Blue");
        car.setPrice(5000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}

