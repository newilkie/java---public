package com.company;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        //initialize sum outside of the while loop.
        int sum = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5

        if(number > 10){
            firstDigit += number % 10;
        }else if(number < 10){
            firstDigit += number % 10;
            lastDigit += number % 10;
        }
        while(number > 0){
            // extract the least-significant digit
            int digit = number % 10;
            lastDigit = digit;
            // drop the least-significant digit
            number /= 10; // same as number = number / 10;
        }
        sum = firstDigit + lastDigit;
        return sum;
    }
}


