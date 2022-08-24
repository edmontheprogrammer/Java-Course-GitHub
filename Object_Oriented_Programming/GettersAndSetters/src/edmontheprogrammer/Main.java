package edmontheprogrammer;

public class Main {

    public static void main(String[] args) {
        /*
         * Encapsulation:
         * Encapsulation means that we should bundle the data and methods that
         * operate on the data in a single unit or object.
         *
         * Getters and Setters:
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
