package com.company;

public class FactorPrinter {
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        int i = 1;
        while(i <= number + 1){
            if(number % i == 0){
                System.out.println(i);
                i++;
            }else{
                i++;
            }

        }

    }
}
