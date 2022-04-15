package com.company;

public class Main {

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-2);
        checkNumber(0);
    }
    public static void checkNumber(int number){
        String printStatement = "zero";
        if(number > 0){
            printStatement = "positive";
        }else if(number < 0){
            printStatement = "negative";
        }
        System.out.println(printStatement);
    }

}
