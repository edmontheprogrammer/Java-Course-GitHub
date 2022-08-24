package com.edmontheprogrammer;

public class Main {

    public static void main(String[] args) {
        /*
            * Understanding Procedural Programming at High Level:
            * (Based on Function Calls)
        */
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
