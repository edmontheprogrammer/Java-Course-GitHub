import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
         * In Java we can also create two dimensional array to store a
         * matrix or three dimensional array.
         * 
         * Creating a two ddimensional array requires two square brackets
         * 
         * [2][3]; creates a two dimensional array with two rows and three
         * columns.
         * 
         * accessing array items; if you want to access indiviual items
         * in a two dimensional array, you need to provide two indexes,
         * [row index number][column index number], first index of the
         * row number and the index of the column
         */
        int[][] numbers = new int[2][3];
        /*
         * Printing Values from Multi-dimensional Arrays;
         * 'System.out.println(Arrays.toString(numbers));' outputs
         * Remember that Arrays are reference types or complex data
         * type, so printing 'numbers' doesn't give us values stores
         * stored in the multidimensional array, instead we'll recieve
         * two memory addressses in the out like [I@4dc63996, [I@d716361]
         * that are referring to the memory locaitons of the row and
         * column value.
         * 
         * Instead, you have to use the "deepToString()" function to
         * print multi-dimenstional arrays like this
         * "Arrays.deepToString(numbers)"
         */
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        /*
         * We can also create three dimensional array by adding
         * a thid square brackets
         */
        int[][][] number3 = new int[2][3][5];

        /*
         * You can also create multi-dimensional arrays using the curly
         * braces
         */
        int[][] number4 = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(number4));

    }
}