public class TernaryOperator {
    public static void main(String[] args) {

        // 🧩 Syntax:
        // variable = (condition) ? valueIfTrue : valueIfFalse;

        int age = 20;
        String category = (age >= 18) ? "Adult" : "Minor";
        System.out.println("You are an: " + category);

        // ✅ Example 1: Even or Odd
        int number = 7;
        String type = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + type);

        // ✅ Example 2: Positive, Negative or Zero (nested ternary)
        int x = -3;
        String result = (x > 0) ? "Positive" : (x < 0) ? "Negative" : "Zero";
        System.out.println("The number is: " + result);

        // ✅ Example 3: Shorter alternative to if-else for simple checks
        int marks = 75;
        String grade = (marks >= 60) ? "Pass" : "Fail";
        System.out.println("Grade: " + grade);

        // ✅ Example 4: Inline assignment
        boolean loggedIn = true;
        String message = loggedIn ? "Welcome back!" : "Please log in.";
        System.out.println(message);

        // ✅ Example 5: Nested use to simulate multiple conditions
        int time = 14;
        String greeting = (time < 12) ? "Good morning" :
                (time < 18) ? "Good afternoon" :
                        "Good evening";
        System.out.println(greeting);
    }
}
