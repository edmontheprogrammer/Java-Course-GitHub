import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Exercise: FizzBuzz
        /*
         * Write a program that behaves like this
         * Number:
         * if number is divisable by 5 print: "Fizz"
         * if number is divisable by 3 print: "Buzz"
         * if number is divisable by both 3 and 5; print "Fizz Buzz"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}