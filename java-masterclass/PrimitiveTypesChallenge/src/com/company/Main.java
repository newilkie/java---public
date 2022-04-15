package com.company;

public class Main {

    public static void main(String[] args) {
        //Primitives Types challenge
        System.out.println("Primitive Types Challenge:");

        //create a byte variable and set it to any valid byte number.
        byte natesByteValue = 10;

        //create a short variable and set it to any valid short number.
        short natesShortValue = 20;

        //create an int variable and set it to any valid int number.
        int natesIntValue = 50;

        //create a variable of type long and make it equal to 50000 plus 10 times the sum of the byte plus the short plus the integer values.
        long natesLongValue = 50000 + 10 * (natesByteValue + natesShortValue + natesIntValue);
        System.out.println(natesLongValue);

        short shortTotal = (short) (1000 + 10 * (natesByteValue + natesShortValue + natesIntValue));

        //int is the best primitive to use for most values for whole numbers.

        //size wise it goes byte, short, int, long. Handling of byte.  Casting can be easily done using a parenthesis and the primitive type that you want it to be.
    }
}
