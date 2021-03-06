package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75); // this is valid now
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        if(centimeters < 0.0){
            System.out.println("Invalid Parameters");
        }
        calcFeetAndInchesToCentimeters(157);

    }

    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters.
    // feet is the first parameter, inches is the 2nd parameter
    //
    // You should validate that the first parameter feet is >= 0
    // You should validate that the 2nd parameter inches >=0 and <=12
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimetres
    // comprise the feet and inches passed to this method and return that value.
    // Create a 2nd method of the same name but only one parameter
    // inches is the parameter
    // validate that its >=0
    // return -1 if it is not true
    // But if its valid, then calculate how many feet are in the inches
    // and then here is the tricky part
    // call the other overloaded method passing the correct feet and inches
    // calculated so that it can calculate correctly.
    // hints: use double for your number datatypes is probably a good idea
    // 1 inch = 2.54cm and one foot = 12 inches
    // use the link I give you to confirm your code is calculating correctly.
    // Calling another overloaded method just requires you use the
    // right number of parameters.

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches parameter.");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm." );
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            System.out.println("Invalid inches parameter.");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches. ");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);


    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // Overloading methods allows you to use different parameters.
    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    // Tim mentions that they are changing the signature. The signiture is the method(parameters).
    // they have to be unique. Just changing the return value will not work. For instance if you were to
    // return void instead of int you'd have to add a parameter or something to differentiate the method.
    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }


}
