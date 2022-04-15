package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        //check that all of the values are valid.
        if(isValid(num1) && isValid(num2) && isValid(num3)){
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int digit3 = num3 % 10;
            if(digit1 == digit2 || digit1 == digit3 || digit2 == digit3){
            return true;}
            return false;
        }else{
            return false;}


    }

    public static boolean isValid(int num){
        if(num < 10 || num > 1000){
            return false;
        }
        return true;
    }
}
