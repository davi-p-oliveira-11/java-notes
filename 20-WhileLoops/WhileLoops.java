public class WhileLoops {
    public static void main(String[] args) {

        // 🧠 Syntax:
        // while (condition) {
        //     // code to repeat while condition is true
        // }

        int count = 1;

        // ✅ Example 1: Basic while loop
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++; // increment to avoid infinite loop
        }

        // ✅ Example 2: Countdown
        int countdown = 5;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }
        System.out.println("Lift off!");

        // ✅ Example 3: Sentinel-controlled loop
        int number = 0;
        while (number != -1) {
            // pretend this came from user input
            number++;
            if (number == 5) number = -1; // simulate exit condition
        }
        System.out.println("Loop terminated when number = -1");

        // ✅ Example 4: Loop with a boolean flag
        boolean running = true;
        int i = 0;

        while (running) {
            System.out.println("Running iteration: " + i);
            i++;
            if (i >= 3) {
                running = false; // manually stop
            }
        }

        // ✅ Example 5: Infinite loop (⚠️ Be careful!)
        // while (true) {
        //     System.out.println("This will run forever!");
        // }

    }
}
