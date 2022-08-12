import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
         * We use Arrays to store a list of items, numbers, strings
         * and other values
         * Arrays are reference types, so we have to use the 'new' operator to create
         * an array object in memory.
         * In this example, the number 5 is the size of the array.
         */
        int[] numbers = new int[5];
        // We access values of indivisual items stored in the array using the array
        // subscript notation and the array index
        numbers[0] = 1;
        numbers[1] = 2;
        // this will return the string repersentation of the array
        System.out.println(Arrays.toString(numbers));

        /*
         * This is another way to create arrays in Java if you know the
         * array items ahead of time.
         * The length of this array is 5.
         */
        int[] numbers2 = { 2, 3, 5, 1, 4 };
        // this returns the numbers of items in this array
        System.out.println(numbers2.length);

        /*
         * You can sort items in the array using the 'sort' method
         * 
         */
        System.out.println("Sorted version of the numbers2 list: ");
        System.out.println(Arrays.toString(numbers2));

        /*
         * In Java arrays have fixed size, meaning once you create an array, you cannot
         * add or remove additional items from an array. But you can change values of
         * the items in the array indexes.
         * 
         * If you want to be able to add or remove additional items from an array, you
         * should use one of the collection classes.
         */

        /*
         * Remeber that array is a reference data type or complex data type like
         * meaning it does not hold the actual values. "new int[5]" creates an array
         * object
         * in memory, "numbers" is just a label or a reference to "int[5]" object ...
         * not the
         * values of the array, so when try to print 'numbers', Java will give you the
         * memory
         * address labelled 'numbers' which is just numnbers from the computer's memory
         * like
         * I@4dc63996 this is a space in memory.
         * System.out.println(numbers);
         * 
         * If you want to print the values of the array object that 'numbers' is
         * referencing, you hav to use the "Arrays" class which is a built-in class
         * in Java. We have to import it from the java.util.Arrays
         */

        // System.out.println(numbers);

        // This line gives array index out of bound, an Exception error
        // numbers[10] = 3;
    }
}