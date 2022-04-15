package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D'; //this is different than a string. Char can only add a single character.

        // A char occupies two bytes of memory, or 16 bits and thus has a width of 16. The reason it's not
        // just a single byte is that it allows youto store Unicode characters.

        // Unicode is an international encoding standard for use with different languages and scripts, by
        // which each letter, digit, or symbol is assigned a unique numeric value that applies across
        // different platforms and programs.

        // In the English alphabet, we have the letters A through Z. Meaning only 26 characters are needed
        // in total to represent the entire English alphabet. But other languages need more characters, and
        // often a lot more.

        // Unicode allows us to represent these languages and the way it works is that by using a combination
        // of two bytes that a char takes up in memory it can represent one of 65535 different types of characters.

        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        // A boolean value allows for two choices True or False, Yes or No, 1 or 0. In Java terms we have a
        // boolean primitive type and it can be set to two values only. true or false. They are actually pretty
        // useful and you will use them a lot when programming.

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true; //the variable name is the question.




    }
}
