package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 10 || num1 >99 || num2 < 10 || num2 >99){
            return false;
        }
        //extract the digits
        // create digits so they can be used out of the while loop
        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        int digit4 = 0;


            //extract the least-significant digit
            digit1 = num1 % 10;
            num1 /= 10;
            digit2 = num1;

        System.out.println(digit1);
        System.out.println(digit2);


            //extract the least-significant digit
            digit3 = num2 % 10;
            num2 /= 10;
            digit4 = num2;

        System.out.println(digit3);
        System.out.println(digit4);

        if(digit1 == digit3 || digit1 == digit4 || digit2 == digit3 || digit2 == digit4){
            return true;
        }else{
            return false;
        }


    }
}
