import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = { 2, 3, 5, 1, 4 };
        System.out.println(numbers2.length);

        System.out.println("Sorted version of the numbers2 list: ");
        System.out.println(Arrays.toString(numbers2));

    }
}