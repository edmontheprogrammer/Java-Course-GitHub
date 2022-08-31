package edmontheprogrammer;

public class Main {

    public static void main(String[] args) {
        /*
         * The first principle of Object-Oriented Programming is Encapsulation:
         * Encapsulation:
         * Encapsulation means that we should bundle the data and methods that
         * operate on the data in a single unit or object.
         *
         * Getters and Setters:
         *
         * The second principle of Object-Oriented Programming is Abstraction:
         * Abstraction:
         * Abstraction means we should reduce complexity by hiding unnecessary details
         * in our classes. Unfortunately this is one of the most misunderstood concepts.
         *
         * The third principle of Object-Oriented Programming is Coupling:
         * Coupling:
         * Coupling is about how much a class is dependent upon or coupled to another
         * class. We want to reduce coupling between classes or how much a class is
         * dependent on another classes (and or classes). Now, there is no such thing
         * as no coupling, or zero coupling, there is always coupling because all these
         * these classes that we create they should work together to perform some tasks.
         * We just want to aim to reduce the coupling.
        * Define coupling point: Coupling point is how much a class is dependent on another
        * class when we break the coupling one by one.
        * The "Main" class is dependent on the "Employee" class,
        *  so there's a coupling between them.
         * Here is a list of coupling points between "Employee" class and the "Main" class.
        * A. new Employee();
        * B. employee.setBaseSalary(50_000);
        * C. employee.setHourlyRate(20);
        * D. int wage = employee.calculateWage(10);
        * In this program, we have four coupling points to the "Employee" class: A, B, C, D
        * */
//        var employee = new Employee();
//        employee.setBaseSalary(50_000);
//        employee.setHourlyRate(20);
//        int wage = employee.calculateWage(10);
//        System.out.println(wage);

        /*
            * Object-Oriented programming has a bunch of techniques, it's not just
            * about features like fields and methods, it's a way of thinking and building
            * software.
         */
//        var browser = new Browser();
//        browser.findIpAddress("...");

        /*
         * Constructor:
         * A constructor is a special method that is called when we create a
         * new object. This is the method "Employee();" we call a constructor.
         * We didn't create this method, or constructor,
         * but the Java compiler automatically creates this method , and
         * a constructor is used to constructor or create a new employee object.
         *
         * The job of this default constructor is to initialize our fields or
         * class attributes to our default values. The numbers will get initialized to
         * "0s", booleans are going to be initialized to "false" and reference types
         * or reference variables are going to be initialized to "null" value.
         *
         * Note 1: If you don't specifically create a constructor in your class, the
         *  Java compiler will automatically create a constructor for the class.
         *
         * We use constructors to initialize our objects. If you don't create the
         * constructor, the Java compiler will automatically create one for us,
         * this is called the "default constructor" and it will initialize all the
         * fields and their values.
         *
         * Constructor Overloading:
         *  We can overload constructors because technically constructors are also methods.
         *  But constructors are special methods.
         *
         * Static Members:
         *  In Object-Oriented programming a class can have two types of members: instance members
         *  and static members. Instance members belong to instances or objects.
         *  In contrast we have static or class members, these are the fields and methods that belong
         *  to a class, not an object.
         *  Example of accessing static members in "Main", System.out.println(Employee.numberOfEmployees);
         *
         * What's the purpose of static members and when do we use them?
         *  We use static members in situations where we present a concept that should be in a
         *  single place. In other words, we use static fields in situations where a value is
         *  independent of objects. And we want to share this value across all objects or instances
         *  of the class.
         *
         * We can also create static methods.
         *
         * Note A: Static members can only see other static members (static fields, static methods) in the
         *       Employee class.
         *
         * Note B: The "main()" method is declared as "static" because it enable the Java runtime to directly
         *  call it (or call 'main()' ) without having to create a new object. So that's why the "main" method
            is always declared as "static". 
         */

        var employee = new Employee(
                50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage(10);
        System.out.println(wage);

    }

}
