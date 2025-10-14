public class Substrings {
    public static void main(String[] args) {
        // substring() → extracts part of a string
        // syntax: string.substring(startIndex, endIndex)
        // note: endIndex is *exclusive* (it’s not included in the result)

        String text = "Hello World";

        // Example 1: Extracting from index to end
        String part1 = text.substring(6); // from index 6 to the end
        System.out.println("Substring from index 6: " + part1); // "World"

        // Example 2: Extracting between indexes
        String part2 = text.substring(0, 5); // from index 0 to 4
        System.out.println("Substring (0,5): " + part2); // "Hello"

        // Example 3: Extracting last few characters
        String last3 = text.substring(text.length() - 3);
        System.out.println("Last 3 characters: " + last3); // "rld"

        System.out.println("--------------------------------");

        // Example 4: Using substring with indexOf
        String email = "user@example.com";
        int atIndex = email.indexOf('@');
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);
        System.out.println("Username: " + username); // "user"
        System.out.println("Domain: " + domain);     // "example.com"

        System.out.println("--------------------------------");

        // Example 5: Extracting file extension
        String fileName = "photo.png";
        int dotIndex = fileName.lastIndexOf('.');
        String extension = fileName.substring(dotIndex + 1);
        System.out.println("File extension: " + extension); // "png"

        System.out.println("--------------------------------");

        // Example 6: Extracting initials
        String fullName = "David Waldstein";
        String firstInitial = fullName.substring(0, 1);
        int spaceIndex = fullName.indexOf(' ');
        String lastInitial = fullName.substring(spaceIndex + 1, spaceIndex + 2);
        System.out.println("Initials: " + firstInitial + lastInitial); // "DW"

        System.out.println("--------------------------------");

        // Example 7: Masking part of a string (like hiding credit card digits)
        String cardNumber = "1234 5678 9012 3456";
        String lastDigits = cardNumber.substring(cardNumber.length() - 4);
        String masked = "**** **** **** " + lastDigits;
        System.out.println("Masked card: " + masked); // "**** **** **** 3456"
    }
}
