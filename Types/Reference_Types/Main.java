import java.util.Date;

/*
 * We use primitve types to store simple values like numbers, characters
 * and booleans. 
 * 
 * In Java, we have eight primitive types. All of the other types are
 * reference types.  
 * 
 * We use reference types to store complex data like mail message.
 */
public class Main {
    public static void main(String[] args) {

        // Example of primitive type:
        byte age = 30;

        /*
         * Example of reference type, complex type:
         * When we declare primitive types, we don't ned to allocate
         * memory. Memories are allocated and release by the Java run
         * time enviornments. But when dealing with reference types,
         * we should alway allocate memory. We don't have to release the
         * memory, the Java runtime environment will automatically take care
         * of that,
         * In java, we use the 'new' operator to allocate memoy for
         * variables. In this example we are using the 'new' operator to
         * allocate memory for the 'now' variable.
         * 
         * The difference between declaring primitve type and reference type
         * is we don't have to allocate memory for primitive types. On the
         * other hand, we have to allocate memory for reference types or
         * complex types.
         * The 'now' variable is now an instance of the 'Date()' class
         * or an object of the Date().
         * These classes such as 'Date()' provide templates or blueprints
         * for creating new objects, new instances of the class.
         * 
         * 
         */
        Date now = new Date();
        /*
         * The objects of the class have members (attributes and methods)
         * that we can access using the dot operator (.).
         * The following example shows the 'now' object accessing the
         * 'getTime()' method which is a member of the 'now' object.
         * 'getTime()' is a built-lin method in Java that allow us to
         * get the time.
         * 
         * This is another difference between primitive types and reference types
         * primitive types don't have built-in members (attributes and methods).
         * But reference types have built-in members (attributes and methods)
         */
        // now.getTime();

        System.out.println(now);
    }
}