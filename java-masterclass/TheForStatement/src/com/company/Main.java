package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 5.0));
            // it is typical to start things at 0 because arrays start at 0.
        for(int i = 0 ; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        for(int i = 2; i <= 8; i++){
            System.out.println("10,000 at " + i + "% interest rate = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("***********************************");

        //How would you modify th for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        for(int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + "% interest rate = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int count = 0;
        for(int i = 10; i<50; i++)
        if(isPrime(i)){
            count++;
            System.out.println("Number " + i + " is a prime number");
            if(count == 10){
                System.out.println("Exiting for loop");
                break;
            }
        }

    }

    // create a for statement using any range of numbers
    // determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out and increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop
    // hint: Use the break; statement to exit

    public static boolean isPrime(int n) {
        if(n == 1){
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(n); i++){ // optimization can be done on this line for the upper limit. n/2. in this case the square root can be used. I'm not quite sure how this works and hopefully Tim goes into it later. But essentially this reduces the size of the loop and reduces the cycles used on the processor.
            System.out.println("Looping" + i);
            if(n % i == 0){
                return false;
            }
        }
        return true;

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
