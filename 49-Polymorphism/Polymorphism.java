public class Polymorphism {
    public static void main(String[] args) {

        // Polymorphism = "POLY-" = "MANY"
        //                               "-MORPH" = "SHAPE"
        //                               Objects can identify as other objects.
        //                               Objects can be treated as objects of a common superclass.

        Car4 car = new Car4();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle2[] vehicles = {car, bike, boat};

        for(Vehicle2 vehicle : vehicles){
            vehicle.go();
        }
    }
}



