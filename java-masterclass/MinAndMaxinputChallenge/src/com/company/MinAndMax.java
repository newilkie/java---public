package com.company;

import java.util.Scanner;

public class MinAndMax {
    public static void minAndMax(){
        Scanner scanner = new Scanner(System.in);



        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean first = true; // this is a flag which will determine if the user has input anything.

        while(true) {

            System.out.println("Enter Number");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                if(first){
                    first = false; // the other way to solve this is to use the maximum value for ints as the min, and minimum value available in java for the maximum.
                    min = number;
                    max = number;
                }
                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }
            }else{
               break;
            }

            scanner.nextLine();
        }
        System.out.println("Min = " + min + ", max = " + max);
        scanner.close();
    }
}
