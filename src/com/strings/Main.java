// Java program to replace letter 'l' with 's'

package com.strings;

// Main class
public class Main {

    // Main method
    public static void main(String[] args) {

        // Creating string
        String str = new String("A string with abcdefghijklmnopqrstuvwxyz.");

        // Converting str to upper case and printing to console
        System.out.println(str.replace('l', 's')); // Output: A string with abcdefghijksmnopqrstuvwxyz.

    }
}
