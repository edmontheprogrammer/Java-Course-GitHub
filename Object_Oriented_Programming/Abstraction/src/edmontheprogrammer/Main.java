package edmontheprogrammer;

public class Main {

    public static void main(String[] args) {
        /*
         * The first principle of Object Oriented Programming is Encapsulation:
         * Encapsulation:
         * Encapsulation means that we should bundle the data and methods that
         * operate on the data in a single unit or object.
         *
         * Getters and Setters:
         *
         * The second principle of Object Oriented Programming is Abstraction:
         * Abstraction:
         * Abstraction means we should reduce complexity by hiding unnecessary details
         * in our classes. Unfortunately this is one of the most misunderstood concepts.
         *
         */

        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.getBaseSalary();
        employee.setHourlyRate(20);
        employee.getHourlyRate();
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }

}
