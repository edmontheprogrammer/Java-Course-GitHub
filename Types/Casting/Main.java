public class Main {
    public static void main(String[] args) {
        // Implicit casting
        // byte > shot > int > long > float > double
        String x = "1.1";
        // Integer wrapper class for int primitive types
        Double y = Double.parseDouble(x) + 2;
        System.out.println(y);

    }
}