package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);








    public static void main(String[] args) {

















        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        myIntArray[0] = 45;
//        myIntArray[1] = 476;
//        myIntArray[5] = 50; // start counting from 0 in java.

        int[] myIntArray2 = new int[10];
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[8]);

        for (int i = 0; i < 10; i++) {
            myIntArray2[i] = i * 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("element " + i + ", value is " + myIntArray2[i]);
        }
// Alternative method is to use the built in functions of the array to determine the length of the array.
        // this is good practice because it reduces the number of possible errors and future errors by accessing those methods.
        // It's the equivalent of saying 'go to the end of the array' rather than position 10. The methods were made to make
        // it more similar to how you would give the instruction to a human.

        for (int i = 0; i < myIntArray2.length; i++) {
            myIntArray2[i] = i * 10;
        }
        for (int i = 0; i < myIntArray2.length; i++) {
            System.out.println("element " + i + ", value is " + myIntArray2[i]);
        }

        printArray(myIntArray2);
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + ", value is " + array[i]);
        }
    }


}
