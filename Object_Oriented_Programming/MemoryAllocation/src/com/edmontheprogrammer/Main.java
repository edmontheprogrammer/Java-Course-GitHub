package com.edmontheprogrammer;

public class Main {

    public static void main(String[] args) {
        /*
            * Memory Allocation: When you create a new object in Java.
            *
            * Java manages two different areas of the memory, one is called the
            * Head (this is where java stores it's objects) the other area is called
            * the Stack (this is where java stores short-lived variables like
            * all the primitive data types, as well as the variables that store
            * references). In other words, Java stores objects like arrays, collections
            * and hash tables in an area called Head. Java also, stores
            * primitive data types like integers and doubles in an area called
            * a Stack. In addition, java stores reference variables that we create
            * in memory also in the Stack. Remember that reference variables are
            * variables that stores addresses of objects in memory, they contain the
            * memory locations of objects like arrays in memory.
            *  They are references to objects that are stored in the heap. For example,
            * "textBox1" is referencing an object on the heap. That's why we refer
            * to  these variables as reference type, because these variables don't
            * store the actual values.
            *
            * Primitive types on the other hand, are different. When we declare an
            * intger, that integer is stored on the stack, and the value that we
            * have in that variable will be stored in that memory location.
            *
            * textBox1 and TextBox2 are referencing the same object in memory.
            * We have two variables in the Stack that are referencing the same
            * object in the Heap.
            * textBox1 contains an address like "100" of the TextBox() object in memory.
            * textBox1 doesn't store the actual value of the object.
            *
            * Modifying the value of textBox1 also changes the value of textBox2 since
            * both are reference variables and pointing to the same object in memory.
            *
            * Unlike C++ we don't have to worry about memory management. Java will
            * automatically take of that. This is how it works, when we exit, a method,
            * java runtime will immediately remove all the variables that are stored in
            * the stack. For example, textBox1 and textBox2 are stored in the Stack,
            * and they will be immediately removed after we finish executing the
            * main() method. Now we end up with an object that is on the Heap, new TextBox(),
            * and there are no references to this object, so if there is another process
            * in the background that's watching these objects on the Heap, if an object
            * becomes unused for a certain period of time, that process is going to
            * automatically remove that object on the heap. This is called "garbage collection"
            * Java runtime has this component called garbage collector which will
            * automatically remove unused objects on the heap.
            *
         */
         var textBox1 = new TextBox();
         var textBox2 = textBox1;
         textBox2.setText("Hello World");
        System.out.println(textBox1.text);


    }
}
