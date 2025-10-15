/*
# 🧠 Java Methods Cheatsheet

## 🔹 Definition
A **method** is a block of reusable code that executes when called.
It helps organize programs, avoid repetition, and improve readability.

🧩 Syntax:
returnType methodName(parameters) {
    // code
    return value; // optional
}

---

## 🔹 Types of Methods

| Type | Description | Example |
|------|--------------|----------|
| **Void Method** | Executes code without returning a value | void greet() { ... } |
| **Return Method** | Returns a value | int add(int a, int b) { return a + b; } |
| **Static Method** | Can be called without an object | static void sayHi() { ... } |
| **Instance Method** | Requires an object | obj.display(); |

---

## 🔹 Example 1 – Basic Method
public class Methods {
    public static void main(String[] args) {
        greet(); // method call
    }

    static void greet() {
        System.out.println("Hello, Java!");
    }
}

---

## 🔹 Example 2 – Method with Parameters
public class Methods {
    public static void main(String[] args) {
        printSum(5, 7);
    }

    static void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

---

## 🔹 Example 3 – Method with Return Value
public class Methods {
    public static void main(String[] args) {
        int result = multiply(4, 6);
        System.out.println("Product: " + result);
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

---

## 🔹 Example 4 – Instance vs Static Methods
public class Methods {
    public static void main(String[] args) {
        displayStatic(); // static call

        Methods obj = new Methods();
        obj.displayInstance(); // instance call
    }

    static void displayStatic() {
        System.out.println("Called a static method!");
    }

    void displayInstance() {
        System.out.println("Called an instance method!");
    }
}

---

## 🔹 Example 5 – Method Overloading
public class Methods {
    public static void main(String[] args) {
        sayHello();
        sayHello("David");
    }

    static void sayHello() {
        System.out.println("Hello!");
    }

    static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

✅ Practical Uses:
- Avoid code duplication
- Improve modularity
- Simplify debugging and testing
- Support method overloading for flexibility
*/
