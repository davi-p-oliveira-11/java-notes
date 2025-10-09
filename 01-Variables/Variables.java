/*
 * ===========================
 * 📘 Java Variables Overview
 * ===========================
 *
 * ➤ Definition:
 * A variable is a named storage location in memory that holds a value.
 * Every variable has:
 *   1. A data type (defines the kind of data it can hold)
 *   2. A name (used to access it)
 *   3. A value (the actual data stored)
 *
 * Syntax:
 *   dataType variableName = value;
 *
 * Example:
 *   int age = 25;
 *
 * --------------------------------------------------------------
 * There are two main categories of data types in Java:
 * --------------------------------------------------------------
 * 1️⃣ Primitive types
 * 2️⃣ Reference types
 */

// 👇 The class is just to hold our examples
public class Variables {
    public static void main(String[] args) {

        /*
         * ========================
         * 🔹 1. Primitive Variables
         * ========================
         * ➤ Definition:
         * Primitives are the most basic data types built into Java.
         * They store **actual values** directly in memory.
         *
         * There are 8 primitive types:
         * byte, short, int, long, float, double, char, boolean
         */

        byte age = 25;               // 1 byte, small integer
        short year = 2025;           // 2 bytes, short integer
        int population = 2147483647; // 4 bytes, standard integer
        long distance = 15000000000L;// 8 bytes, must end with 'L' for long
        float temperature = 36.6f;   // 4 bytes, must end with 'f'
        double pi = 3.14159;         // 8 bytes, high precision decimal
        char grade = 'A';            // 2 bytes, single Unicode character
        boolean isJavaFun = true;    // 1 bit, true or false

        /*
         * ==========================
         * 🔸 2. Reference Variables
         * ==========================
         * ➤ Definition:
         * Reference variables store **addresses (references)** of objects,
         * not the object data itself.
         *
         * When you create an object using 'new', a reference variable
         * points to its location in memory.
         */

        String name = "David";       // String is a reference type (object)
        int[] numbers = {1, 2, 3};   // arrays are reference types
        Object obj = new Object();   // every class type is a reference

        /*
         * =============================================
         * ⚖️ Difference: Primitive vs Reference Types
         * =============================================
         * ▪ Storage:
         *    - Primitive: value is stored directly in stack memory.
         *    - Reference: variable stores a reference (pointer) to the object in heap memory.
         *
         * ▪ Default Values:
         *    - Primitive: numeric → 0, boolean → false, char → '\u0000'
         *    - Reference: null
         *
         * ▪ Mutability:
         *    - Primitive: immutable (changing value replaces it)
         *    - Reference: can point to mutable objects (contents can change)
         *
         * ▪ Example:
         */
        int x = 10;          // primitive → stores value 10
        int y = x;           // copies value
        y = 20;              // changing y does NOT affect x

        String a = "Hello";  // reference → points to String object
        String b = a;        // both 'a' and 'b' point to the same object
        b = "World";         // now 'b' points to a new String, 'a' still points to "Hello"

        System.out.println("x = " + x + ", y = " + y); // x = 10, y = 20
        System.out.println("a = " + a + ", b = " + b); // a = Hello, b = World
    }
}
