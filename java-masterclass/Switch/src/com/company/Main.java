package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // If else statements are useful, but things can get confusing if you have a lot of values.
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }


        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was  a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }
        // More code here. Keep in mind that you need to use breaks within switch statements.

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // add a default which displays a message saying not found.

        char charValue = 'G';
        switch (charValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Was a C, or a D, or a E");
                System.out.println("Actually it was  a " + charValue);
                break;
            default:
                System.out.println("Was not A, B, C, D, or E");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "jebruary":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("Mar");
                break;
            case "april":
                System.out.println("Apr");
                break;
            case "may":
                System.out.println("May");
                break;
            case "june":
                System.out.println("Jun");
                break;
            case "july":
                System.out.println("Jul");
                break;
            case "august":
                System.out.println("Aug");
                break;
            case "september":
                System.out.println("Sep");
                break;
            case "october":
                System.out.println("Oct");
                break;
            case "november":
                System.out.println("Nov");
                break;
            case "december":
                System.out.println("Dec");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
