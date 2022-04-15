package com.company;

public class Main {

    public static void main(String[] args) {
	// Add some code to the main method to test out the sumDigits Method to determine
        // that it is working correctly for valid and invalid values passed as arguments.

        // Hint:
        // Use n % 10 to extract the least-significant digit.
        // Use n = n / 10 to discard the least-significant digit.
        // The method needs to be static like other methods so far in the course.

        System.out.println("The sum of the digits in number 125 is " + DigitSum.sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + DigitSum.sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + DigitSum.sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + DigitSum.sumDigits(32123));
    }
}
