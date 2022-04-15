package com.company;

public class Main {

    public static void main(String[] args) {
        //these are the primitive types and they are used for different purposes.
        //byte range -128 to 127 -- uncommon
        //short --uncommon
        //int -- common
        //long
        //float
        //double -- common
        //char
        //boolean -- common

        //you can create classes which can contain more than one type.

        // The String is a datatype in Java, which is not a primitive type. It's actually a Class, but it enjoys
        // a bit of favoritism in Java to make it easier to use than a regular class.

        // What is a string?
        // A String is a sequence of characters. In the case of the char which you can see above which we
        // discussed in the previous video, it could contain a single character only (regular character or
        // Unicode character).

        // A String can contain a sequence of characters. A large number of character. Technically it's limited
        // by memory or the MAX_VALUE of an int which ws 2.14 billon. That's a lot of characters.

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; //java is smart enough to know that you are trying to do is convert an int to a string.
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

        // Strings in Java are Immutable

        // when I said you can delete characters out of a String, that's not strictly true. Because Strings
        // in Java are immutable. That means you can't change a string after it's created. Instead, what
        // happens is a new String is created.

        // There is a better way to append strings. That method is called a StringBuffer.

        // The String class has been made easy within the Java language.





    }
}
