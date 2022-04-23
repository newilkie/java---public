package com.company;

import java.util.Scanner;

// One of the major things that happens that I hate about programming videos is the regression they use where they'll
// Get rid of something on the screen that they were working on and didn't just start a new file, or make it into a
// cohesive project.
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i = 0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r"); // the \r has the input on the next line.
        int[] values = new int[number];

        for(int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i< array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
