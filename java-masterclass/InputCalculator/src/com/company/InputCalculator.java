package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long avg = 0;
        int count = 0;
        boolean first = true;


        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Input a number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                count++;

                sum = number + sum;
                avg = (long)Math.round((double)sum / (double)count);
            }else{
                break;
            }

        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }

}
