package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0; //initializing reverse
        int originalNumber = number;

        while(number != 0){
            // extract the least-significant digit. This will be the remainder.
            int digit = number % 10;
            // drop the least significant digit from number.
            number /= 10;
            // generate the reverse value.
            reverse = reverse * 10 + digit;
            System.out.println(reverse);
            }
        if( reverse == originalNumber){
            return true;
        }
        return false;

    }
}
