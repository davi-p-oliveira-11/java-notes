public class NestedIfs {

    public static void main(String[] args) {

        // Example 1: Checking if a person can enter a restricted club
        int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Access granted. Welcome!");
            } else {
                System.out.println("Access denied. You must show an ID.");
            }
        } else {
            System.out.println("Access denied. You must be at least 18 years old.");
        }

        System.out.println("--------------------------------");

        // Example 2: Checking grades
        double grade = 8.5;

        if (grade >= 7) {
            if (grade >= 9) {
                System.out.println("Excellent student!");
            } else {
                System.out.println("Good job, you passed!");
            }
        } else {
            if (grade >= 5) {
                System.out.println("You barely passed.");
            } else {
                System.out.println("You failed. Try again!");
            }
        }

        System.out.println("--------------------------------");

        // Example 3: Simple login validation
        String username = "admin";
        String password = "12345";

        if (username.equals("admin")) {
            if (password.equals("12345")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Username not found.");
        }

        System.out.println("--------------------------------");

        // Example 4: Weather and clothing suggestion
        boolean isRaining = true;
        int temperature = 15;

        if (isRaining) {
            if (temperature < 20) {
                System.out.println("Wear a raincoat and a sweater.");
            } else {
                System.out.println("Take an umbrella.");
            }
        } else {
            if (temperature < 20) {
                System.out.println("It's cold, wear a jacket.");
            } else {
                System.out.println("Nice weather! Just go out.");
            }
        }
    }
}
