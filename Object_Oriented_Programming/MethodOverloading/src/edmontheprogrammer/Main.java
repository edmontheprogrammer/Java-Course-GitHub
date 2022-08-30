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

        var employee = new Employee();
        int wage = employee.calculateWage(0);
        System.out.println(wage);

    }

}
