import java.awt.*;

/*
 * Primitive Types Vs Reference Types: 
 * 1. We use primitive types to store simple values, int, float, char
 * 2. We use reference types to store complex objects, Date
 * 3. But there a big difference between primitive types and 
 *    reference types in terms of memory managment. 
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Primitive vs Reference Types");
        // 'x' and 'y' are primitive variables stored at different
        // locations in memory. 'x' and 'y' are indepdent of each others
        // even though both 'x' and 'y' have values of '1'.
        byte x = 1;
        byte y = x;
        // changing the value of x to 2 doesn't affect the y value because they
        // are independent of each other and each variable hold its own value of '1'
        // so when we change x to 2 ... y value is still 1
        x = 2;
        System.out.println(y);
        System.out.println(x);
        /*
         * But the behavior is different when using a reference type.
         * // creating a point object named 'point1' using the built-in 'Point' class
         * in Java. 'Point()' class can take input parameters
         */
        /*
         * Creating an instance of the 'Point()' class named 'point1' and initializing
         * it with values (1,1) lablled 'x = 1, y = 1'
         * 'point1' is a reference or a label to the 'Point(1, 1)' object in memory
         */
        Point point1 = new Point(1, 1);
        // Creating another reference to the Point(1, 1) object in memory named 'point2'
        Point point2 = point1;
        // 'Point(1, 1)' object now has two references that points to it, 'point1' and
        // 'point2'

        // Now because 'point1' and 'point2' are referencing the same object,
        // when we print 'point2' the value also changes
        point1.x = 2;
        System.out.println(point2);
        /*
         * 1. Point(1, 1); Java creates an object in memory named Point(1, 1) that sits
         * in its own
         * space in memory.
         * 2. point1; Java creates a label or a reference named 'point1' in memory
         * that sits in its own independent locaiton in memory. This label, 'point1'
         * points to the 'Point(1, 1)' object, which is in another location in memory.
         * Java reference types and objects relationships in memory is similar to
         * 'Pointer' and 'variables' relationships in the C language. But Java doesn't
         * use the concept of 'Pointer' instead it uses 'Reference Types'.
         * 3. point2; Java creates another label or a reference named 'point2' in
         * memory that references or points to the 'Point(1, 1)' object in memory.
         * 4. Now 'Point()' has two varaibels that points to it, 'Point()' has
         * two references named 'point1' and 'point2'. We can use either label
         * 'point1' or 'point2' to access the same 'Point(1, 1)' object in memory.
         * 5. Remeber that 'point1' and 'point2' don't hold the actual object
         * 'Point(1, 1)' or make copies of the point object 'Point(1, 1)'. They only
         * have references, or address to find the 'Point(1, 1)' object in memory.
         * These addresses are 'point1' and 'point2'
         * 6. Because 'point1' and 'point2' are referencing the same object 'Point(1,
         * 1)'
         * they are not indepdent of each other ... meanining whenever you update the
         * values
         * of 'Point(1, 2)' object the changes became visiable to 'point1' and 'point2'.
         * Unlike primitive data types, they are indepdent of each others.
         * 7. Remember that reference types are copied by their reference, and primitive
         * types are copied by their values, and values of primitive types are
         * completely indenpdent of each other.
         * 
         * 
         */

    }
}
