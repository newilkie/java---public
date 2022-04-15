package com.company;

public class Main {

    public static void main(String[] args) {

    //Using a while loop
    int count = 1;
    while(count != 6) {
        System.out.println("Count value is " + count);
        count++;
    }

    // FOR LOOP BELOW IS NOT IDENTICAL TO THE ABOVE WHILE LOOP
//    for( int i = 1; i < 7; i++){
//        System.out.println("Count value is " + count);
//    }

        //Using a for loop

        System.out.println("same output using for loop");
        for(count = 1; count !=6; count++){
            System.out.println("Count value is " + count);
        }

    // Another way of doing the same while loop.
        count = 1;

        System.out.println("Another way of doing the while loop");
    while(true){
        if(count == 6) {
            break;
        }
        System.out.println("Count value is "+ count);
        count ++;
    }

    // the same loop using a do-while loop.

        System.out.println("Another way of doing the same loop using the do while loop");
    count = 1;
    do{
        System.out.println("Count value was " + count);
        count++;
    }while(count != 6);

        System.out.println("Challenge Section:");

        // Modify the while code below.
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found.

//    int number = 4;
//    int finishNumber = 20;
//    while(number <= finishNumber){
//        number++;
//        if(!isEvenNumber(number)){
//            continue; //continue bypasses the print statement, instead it goes up to the beginning of the while loop.
//        }
//        System.out.println("Even number " + number);
//    }
//    }
// Here is the modified code:
    int number = 4;
    int finishNumber = 20;
    int evenNumbersFound = 0;

    while(number <= finishNumber){
        number++;
        if(!isEvenNumber(number)){
            continue; //continue bypasses the print statement, instead it goes up to the beginning of the while loop.
        }

        System.out.println("Even number " + number);

        evenNumbersFound++;
        if(evenNumbersFound >= 5){
            System.out.println("Total number of even numbers found = " + evenNumbersFound);
            break;
        }
    }
}

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else{
            return false;
        }
    }
}
