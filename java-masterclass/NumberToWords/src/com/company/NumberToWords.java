package com.company;

public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        // Step 1: Extract the last digit of the given number using the remainder operator.
        int digit = 0;
        // Step 2: Convert the value of the digit found in Step 1 into a word. There are 10
        // possible values for that digit, those being 0,1,2,3,4,5,6,7,8,9. Print the
        // corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One"
        // if the digit is 1, and so on.
        int reverse = reverse(number);

        for(int i =0; i < getDigitCount(number); i++){

            digit = reverse% 10;
            reverse /= 10;
        switch(digit){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
            // Step 3: Remove the Last Digit from the number.

        }
        // Step 4: repeat steps 2 through 4 until the number is 0. This is accomplished
        // using the while loop above.
    }

    public static int reverse(int number){
        int reverse = 0;
        int originalNumber = number;
        while(number != 0){
            // extract the least-significant digit. This will be the remainder.
            int digit = number % 10;
            // drop the least significant digit from the number.
            number /=10;
            //generate the reverse value.
            reverse = reverse * 10 + digit;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int count = 0;
        do{number /= 10;
            count ++;}
        while(number != 0);
        return count;
    }
}
