package com.company;

public class EvenDigitSum {
public static int getEvenDigitSum(int number){
    if(number < 0){
        return -1;
    }
    int sum = 0;

    while(number > 0){
        //extract the least-significant digit
        int digit = number % 10;
        //this only sums if it is divisible by 2
        if(digit % 2 == 0){
            sum += digit;
        }
        //drop the least-significant digit
        number /= 10;
    }
    return sum;
}
}
