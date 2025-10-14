public class LogicalOperators {
    public static void main(String[] args) {

        // && = AND → returns true if BOTH conditions are true
        // || = OR  → returns true if AT LEAST ONE condition is true
        // !  = NOT → reverses the boolean value

        int age = 25;
        boolean hasLicense = true;

        // ✅ Example 1: AND operator (&&)
        if (age >= 18 && hasLicense) {
            System.out.println("You can drive!");
        } else {
            System.out.println("You cannot drive yet.");
        }

        // ✅ Example 2: OR operator (||)
        boolean hasTicket = false;
        boolean isVIP = true;

        if (hasTicket || isVIP) {
            System.out.println("You can enter the concert!");
        } else {
            System.out.println("Access denied.");
        }

        // ✅ Example 3: NOT operator (!)
        boolean isRaining = false;

        if (!isRaining) {
            System.out.println("Let's go for a walk!");
        } else {
            System.out.println("Better stay inside.");
        }

        // ✅ Example 4: Combining operators
        int temperature = 22;
        boolean sunny = true;

        if ((temperature > 20 && temperature < 30) && sunny) {
            System.out.println("Perfect weather!");
        } else {
            System.out.println("Not ideal weather today.");
        }

        // ✅ Example 5: Negating complex conditions
        boolean isWeekend = false;
        boolean hasWork = true;

        if (!(isWeekend || !hasWork)) {
            System.out.println("It's a weekday, back to work!");
        } else {
            System.out.println("Enjoy your free time!");
        }
    }
}
