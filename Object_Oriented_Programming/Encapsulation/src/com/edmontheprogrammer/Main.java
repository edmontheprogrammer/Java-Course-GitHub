package com.edmontheprogrammer;

public class Main {

    public static void main(String[] args) {
        /*
         * Encapsulation:
         * Encapsulation means that we should bundle the data and methods that
         * operate on the data in a single unit or object.
         */

        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }

}
