package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // this is an overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // this is an underflow

        int myMaxIntTest = 2_147_483_647; //underscores can be used for this. If you have the literal outside or larger
        //than the max value (you can check this by adding one) it will show an issue.
        // and int has a much larger and occupies 32 bits.

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // a byte occupies 8 bits. It has a width of 8.

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        // a short can store a large range of numbers and occupies 16 bits.

        long myLongValue = 100L;
        // a long has larger range 2^63

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L; // java automatically converts an int to a long. If it is outside of the range of an int it'll cause an issue.
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteVale =(byte) (myMinByteValue / 2); //if you use this you'll have to use a casting. (byte) this means "treat this data as a byte"

        short myNewShortValue = (short) (myMinShortValue / 2); // java uses int by default.





        
    }
}
