public class EnhancedSwitches {
    public static void main(String[] args) {
        // 🧠 Syntax:
        // switch (variable) {
        //     case value1 -> statement;
        //     case value2 -> statement;
        //     default -> statement;
        // }

        String day = "Monday";

        // ✅ Example 1: Simple enhanced switch
        switch (day) {
            case "Monday" -> System.out.println("Start of the week!");
            case "Friday" -> System.out.println("Almost weekend!");
            case "Saturday", "Sunday" -> System.out.println("It's weekend!");
            default -> System.out.println("Midweek days are for productivity!");
        }

        // ✅ Example 2: Assigning a value from a switch expression
        int dayNumber = 3;
        String dayName = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println("Day: " + dayName);

        // ✅ Example 3: Multi-line block using `yield`
        int score = 85;
        String grade = switch (score / 10) {
            case 10, 9 -> {
                yield "A";
            }
            case 8 -> {
                yield "B";
            }
            case 7 -> {
                yield "C";
            }
            case 6 -> {
                yield "D";
            }
            default -> {
                yield "F";
            }
        };
        System.out.println("Grade: " + grade);

        // ✅ Example 4: Using enhanced switch instead of nested if-else
        String role = "admin";
        String permissions = switch (role) {
            case "admin" -> "Full access";
            case "editor" -> "Edit access";
            case "viewer" -> "Read-only access";
            default -> "No access";
        };
        System.out.println("Permissions: " + permissions);
    }
}
