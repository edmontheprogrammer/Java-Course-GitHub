package com.edmontheprogrammer;

/*
    * How Java Code Gets Exectued? (Completion & Execution)
    * The source code (*java) file --> gets compiled
    * by the Java compiler (Java Compiler). Then the
    * Java Complier converts the source code into byte code
    * or something that a computer can understand
    * --> (*.class). The computer runs the .class file
    * or byte code.
    * The Java Compiler comes with the JDK, Java Development Kit
    * that we downloaded.
    * The Java byte code file ('Main.class' or 'Main') is platform
    * independent meaning you can run it on Mac, Windows, Linux, or
    * any other operating system that has a Java runtime enviornment.
    * You can download Java runtime envoriment for various operating
    * systems from Oracle's website. The Java runtime enviorment has
    * a software called "Java Virtual Machine or JVM". JVM takes the
    * Byte code (*.class) file and translates it for the native code
    * that you want to execute (Windows, Mac, Linux). For example,
    * currently, your on Mac OS, the JVM takes the Byte code "*.class"
    * into a native code that the Mac OS X can understand.
    * This is the reason why Java programs are portable and platform
    * independent. We can write a Java program on WIndows machine and
    * run it on a Mac using the JVM and Java Run Time Enviorment.
    * C# and Python are also platform independent
    *
 */
public class Main {

    public static void main (String[] args) {
        System.out.println("Hello World");
    }

}
