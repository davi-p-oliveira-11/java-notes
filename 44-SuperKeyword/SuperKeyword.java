
public class SuperKeyword {
    public static void main(String[] args) {

        // super = Refers to the parent class
        //               Used in constructors and method overriding
        //               Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", 20, 3.25);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

    }
}

