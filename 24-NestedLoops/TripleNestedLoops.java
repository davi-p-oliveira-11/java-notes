public class TripleNestedLoops {
    public static void main(String[] args) {
        for (int x = 1; x <= 2; x++) {         // Outer loop
            for (int y = 1; y <= 3; y++) {     // Middle loop
                for (int z = 1; z <= 2; z++) { // Inner loop
                    System.out.println("Coordinates: (" + x + "," + y + "," + z + ")");
                }
            }
        }
    }
}
