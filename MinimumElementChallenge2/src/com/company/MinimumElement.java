package com.company;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();

        return numElements;
    }

    private static int[] readElements(int count) {
        int[] array = new int[count];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
