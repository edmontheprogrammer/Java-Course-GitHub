public class Main {

    public static void main(String[] args) {
        // String message = new String("Hello World");
        /*
         * 1. String are reference types in Java, but because we use strings
         * very often, the Java community created a shorter way to
         * create strings instead of having you use 'new' and
         * the 'String()' class. You can simply create a string in
         * Java by naming the string variable and initialize it to a
         * String literal
         * Strings Built-in methods; String has a lot of built-in method such as
         * 'toLower()' which converts the string value to all lower case letters and
         * 'trim()' which removes all the white spaces from the string. You can simply
         * explore the string methods by typing 'string_variable.' to see all of the
         * methods
         * that are avariable for the string object.
         */
        String message = "   Hello World" + "!!  ";
        System.out.println(message.trim());
        System.out.println(message);
    }
}
