public class StringMethods {
    public static void main(String[] args) {

        String text = "  Hello World  ";
        String word = "world";
        String name = "David";

        // length() → returns the number of characters
        System.out.println("Length: " + text.length()); // 14 (includes spaces)

        // charAt(index) → returns the character at the given index
        System.out.println("Character at index 2: " + text.charAt(2)); // 'H'

        // indexOf() → returns the first index of a character or substring
        System.out.println("Index of 'o': " + text.indexOf('o')); // 5

        // lastIndexOf() → returns the last index of a character or substring
        System.out.println("Last index of 'o': " + text.lastIndexOf('o')); // 8

        // toUpperCase() → converts all letters to uppercase
        System.out.println("Uppercase: " + text.toUpperCase()); // "  HELLO WORLD  "

        // toLowerCase() → converts all letters to lowercase
        System.out.println("Lowercase: " + text.toLowerCase()); // "  hello world  "

        // trim() → removes leading and trailing spaces
        System.out.println("Trimmed: '" + text.trim() + "'"); // "Hello World"

        // replace(old, new) → replaces all occurrences of a character or substring
        System.out.println("Replace 'l' with 'x': " + text.replace('l', 'x')); // "  Hexxo Worxd  "

        // isEmpty() → checks if string is empty (length == 0)
        String empty = "";
        System.out.println("Is empty: " + empty.isEmpty()); // true

        // contains() → checks if substring exists in the string
        System.out.println("Contains 'Hello': " + text.contains("Hello")); // true
        System.out.println("Contains 'world': " + text.contains("world")); // false (case-sensitive)

        // equals() → checks if strings are exactly the same (case-sensitive)
        System.out.println("Equals 'Hello World': " + text.trim().equals("Hello World")); // true

        // equalsIgnoreCase() → checks if strings are equal ignoring case
        System.out.println("EqualsIgnoreCase 'hello world': " + text.trim().equalsIgnoreCase("hello world")); // true

        // Example combining methods
        System.out.println("--------------------------------");
        String sentence = " Java is fun ";
        String result = sentence.trim().toUpperCase().replace("JAVA", "PYTHON");
        System.out.println(result); // "PYTHON IS FUN"
    }
}
