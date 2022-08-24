package com.edmontheprogrammer;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // creating an instance of the TextBox class
        var textBox1 = new TextBox();

        // getting the value of the attribute 'text'
        // outputs null because the value of 'text' attribute
        // in the 'TextBox' class was not initialized to a value, so it 
        // defaults to null value
        // String is a reference data type in Java, meaning when you create
        // a string variable it creates a reference variable to the string object,
        // and the string object separately in memory.
        System.out.println(textBox1.text.toUpperCase());
    }
}
