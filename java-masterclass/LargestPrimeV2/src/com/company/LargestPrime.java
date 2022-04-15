package com.company;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        // if the number is 1 or lower return -1
        if(number <= 1){
            return -1;
        }
        int factor = 1;

        while (number > 1) {
            factor++;
            if (primeCheck(factor) == true) {
                while (number % factor == 0) {
                    number /= factor;
                }
            }
        }
        return factor;
    }


    //
    public static boolean primeCheck(int x){
        for(int div = 2; div <= Math.sqrt(x); div++){
            if(x % div == 0){
                return false;
            }
        }
        return true;
    }
}
