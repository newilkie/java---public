package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(myIntegers);
        System.out.println("Sorted");
        printArray(sorted);

        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106, 1, 26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, PrintArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        // it took me until this lecture to become stuck without referencing the source material. Because it's a
        // "complete" course I'm just going to watch the solution video. The jump in difficulty went up considerably
        // in this lecture.
    }

    public static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values. \r"); // the \r has the input on the next line.
        for(int i = 0; i < array.length;  i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }


    // my method
    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;

            // Here is an example.
            // element 0    50
            // element 1    160
            // element 2    40

            // think through it.
            // basically the if statement, if true, it stores the element i in a temporary variable.
            // it then stores the next element in the sequence to the current element in the sequence, overwritting it
            // then the temporary value is assigned to the next variable. The flag is set to true so the while function
            // runs again.


            for(int i = 0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp= sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    }
                }
            }
        return sortedArray;
        }
    }


