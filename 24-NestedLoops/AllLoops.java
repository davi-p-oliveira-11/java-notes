public class AllLoops {
    public static void main(String[] args) {

        System.out.println("=== WHILE LOOP ===");
        int count = 1;
        while (count <= 3) {
            System.out.println("Count: " + count);
            count++;
        }

        System.out.println("\n=== DO-WHILE LOOP ===");
        int number = 5;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number < 5); // runs at least once

        System.out.println("\n=== FOR LOOP ===");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Iteration: " + i);
        }

        System.out.println("\n=== NESTED FOR LOOPS ===");
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("Outer: " + i + ", Inner: " + j);
            }
        }

        System.out.println("\n=== TRIPLE NESTED FOR LOOPS ===");
        for (int x = 1; x <= 2; x++) {
            for (int y = 1; y <= 2; y++) {
                for (int z = 1; z <= 2; z++) {
                    System.out.println("Coordinates: (" + x + "," + y + "," + z + ")");
                }
            }
        }
    }
}
