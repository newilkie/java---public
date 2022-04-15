// Youtube Video Project Euler #3 Java by Cyclic Squares : https://youtu.be/GAZMb66R8mc

// I did some basic modification to their code.

package com.company;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        // if the number is 1 or lower return -1
        if (number <= 1) {
            return -1;
        }
        int factor = 1;

        while (number > 1) {
            factor++;
            // create a prime check in variable form
            boolean primeCheck = true;
            for (int i = 2; i <= Math.sqrt(factor); i++) {
                if (factor % i == 0) {
                    primeCheck = false;
                } else {
                    primeCheck = true;
                }
            }
            // end of prime check.

            if (primeCheck == true) {
                while (number % factor == 0) {
                    number /= factor;
                }
            }
        }
        return factor;
    }
}


