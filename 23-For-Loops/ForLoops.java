public class ForLoops {
    public static void main(String[] args) {

        // 🧠 Syntax:
        // for (initialization; condition; increment/decrement) {
        //     // code to repeat
        // }

        // ✅ Example 1: Basic for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // ✅ Example 2: Countdown
        for (int i = 5; i > 0; i--) {
            System.out.println("Countdown: " + i);
        }
        System.out.println("Lift off!");

        // ✅ Example 3: Loop with step increment
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even number: " + i);
        }

        // ✅ Example 4: Looping through a String
        String word = "Voltaris";
        for (int i = 0; i < word.length(); i++) {
            System.out.println("Character " + i + ": " + word.charAt(i));
        }

        // ✅ Example 5: Nested for loops
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println();
        }

        // ✅ Example 6: Using break and continue
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue; // skips 5
            if (i == 8) break;    // stops loop at 8
            System.out.println("Number: " + i);
        }

        // ✅ Example 7: Enhanced for loop (for-each)
        String[] cars = {"BMW", "Tesla", "Audi"};
        for (String car : cars) {
            System.out.println("Car: " + car);
        }
    }
}
