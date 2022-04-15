package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in); // used create an instance of the scanner.

        System.out.println("Enter the current year:");
        int currentYear = scanner.nextInt();
        scanner.nextLine(); //handle next line character (enter key)

        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt(); //checks to see if it is an int

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = currentYear - yearOfBirth;

            if(age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            }else{
                System.out.println("Invalid year of birth.");
            }
        }else{
            System.out.println("Unable to parse year of birth.");
        }


        scanner.close(); // you should close the scanner after this is done.



    }
}
