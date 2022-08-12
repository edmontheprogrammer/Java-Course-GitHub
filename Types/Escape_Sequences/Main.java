public class Main {

    public static void main(String[] args) {
        /*
         * Escape Sequences; there are times we want to include special
         * like characters 'tab', 'newline', 'backslash' or 'double quotes'
         * like in our strings ... we use escape sequences to add
         * them in our Strings.
         */

        // we can also add a tab into our string using the '\t'
        // escape sequence. It bascially adds spaces between our
        // string
        String insertNewTab = "c:\tWindow\\...";
        System.out.println(insertNewTab);

        // inserting a newline
        // '\n'breaks the string into a newline or inserts a newline
        // in the string
        String insertNewLine = "c:\nWindow\\...";
        System.out.println(insertNewLine);

        // c:\Windows\...
        String windows = "c:\\Windows\\...";
        System.out.println(windows);

        String message = "Hello \"Edmon\"";
        System.out.println(message);

        // These are the most common escape sequences that are used.
    }

}