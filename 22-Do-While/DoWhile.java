public class DoWhile{
    public static void main(String[] args) {

        // 🧠 Syntax:
        // do {
        //     // code to execute
        // } while (condition);

        // ✅ Example 1: Basic do-while loop
        int count = 1;
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);

        // ✅ Example 2: Ensures at least one execution
        int number = 10;
        do {
            System.out.println("Number is: " + number);
            number++;
        } while (number < 10); // condition is false from the start
        System.out.println("Loop ran once anyway!");

        // ✅ Example 3: User input simulation
        String input = "";
        int tries = 0;
        do {
            input = "password"; // imagine we got this from the user
            tries++;
        } while (!input.equals("password") && tries < 3);
        System.out.println("Access granted!");

        // ✅ Example 4: Using boolean flag
        boolean running = true;
        int i = 0;
        do {
            System.out.println("Running iteration: " + i);
            i++;
            if (i >= 3) {
                running = false;
            }
        } while (running);

        // ✅ Example 5: Infinite do-while loop (⚠️ Be careful!)
        // do {
        //     System.out.println("This will run forever!");
        // } while (true);
    }
}
