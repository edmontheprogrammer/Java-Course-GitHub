import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // creating a reference variable to the Scanner object,
        // 'Scanner(System.in)', in memory
        // 'System.in' allows us to work with the terminal window
        // the 'Scanner' class has a lot of built-in method for reading
        // different data types such as 'nextInt()' and 'nextByte()'
        // and 'nextLine()' which can be used to read specific data
        // from the user input via terminal
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}