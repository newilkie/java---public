package com.company;

public class Main {

    public static void main(String[] args) {
	// Floating point numbers have fractional parts. These are also known real numbers. Floating point numbers are used for when you have a requirement for more precision.
        //Precision refers to the format and amount of space occupied by the type called "float". Single precision occupies 32 bits (so has a width of 32)
        // and double precision occupies 64 bits ( and thus has a width of 64).

        //a float has a range from 1.4 E -45 to 3.4028235 E 38
        // a double is much more prcise and has a rnage from 4.9E-324 to 1.7986931348623157E+308

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = "  + myMinFloatValue);
        System.out.println("Float maximum value = "  + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = "  + myMinDoubleValue);
        System.out.println("Double maximum value = "  + myMaxDoubleValue);

        int myIntValue = 5 /3 ;
        float myFloatValue = 5f / 3f; //you can use f to declare float can also be cast. Java defaults to double.
        double myDoubleValue = 5d / 3d;  // you can use d to declare double. Double is often faster than float. Double is used as the default when adding a floating point.
        System.out.println("MyIntValue =" + myIntValue);
        System.out.println("MyFloatValue =" + myFloatValue);
        System.out.println("MyDoubleValue =" + myDoubleValue); //doubles have more precision

        double numberOfPounds = 200d;
        double convertedKilograms = 0.45359237 * numberOfPounds;
        System.out.println("Pounds= " + numberOfPounds);
        System.out.println("Kilograms= " + convertedKilograms);

        double pi = 3.1415927;
        double anotherNumber = 3_000_000.4_467_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        // In general float and double are great for general floating point operations. But both are not great to use where
        // precise calculations are required - this is due to a limitation with how floating point numbers are stored, and not a Java problem as such.

        // Java has a class called BigDecimal that overcomes this. We will talk more about that later in the course.
        // for now just keep in the back of your mind that when precise calculations are necessary, such as when performing currency calculations,
        // floating-points should not be used.

        // But for general calculations float and double are fine. Again, we will discuss it later in the course.


    }
}
