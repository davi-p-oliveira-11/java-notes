public class NestedLoops {
    public static void main(String[] args) {

        // 🧠 Definition:
        // Nested loops = A loop inside another loop.
        // Used for patterns, tables, and multidimensional data.

        // ✅ Example 1: Basic nested for loops
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop: " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("   Inner loop: " + j);
            }
        }

        // ✅ Example 2: Multiplication table
        System.out.println("\nMultiplication Table:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(row * col + "\t");
            }
            System.out.println(); // new line after each row
        }

        // ✅ Example 3: Printing a rectangle of stars
        int rows = 4;
        int cols = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ✅ Example 4: Right triangle pattern
        System.out.println("\nTriangle pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ✅ Example 5: Using nested loops with arrays (2D array)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\nMatrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // ✅ Example 6: Nested loops with conditional logic
        System.out.println("\nEven numbers only:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
