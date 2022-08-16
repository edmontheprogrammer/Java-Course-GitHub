import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // For-Each Loop
        String[] fruits = { "Apple", "Mango", "Orange" };

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}