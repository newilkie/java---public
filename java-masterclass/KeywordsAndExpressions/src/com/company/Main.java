package com.company;

public class Main {

    public static void main(String[] args) {
        int int2 = 5; // make sure you aren't using a reserved word such as false, int, etc.
        // you'll see most of the keywords throughout the course. https://en.wikipedia.org/wiki/List_of_Java_keywords

        //expressions are building blocks of programs. What we have covered so far.
        // a mile is equal to 1.609344 kilometers
        //variables values and operators are components of expressions.

        // each one of these lines is an expression.
        // we'll be talking about control flow statments and others.
        double kilometres = (100 * 1.609344);
        int highscore = 50;
        if (highscore == 50) {
            System.out.println("This is an expression");
        }

        // In the following code that I will type below,  write down what parts of the code
        // are expression.s
        int score = 100; // in is the type, score is the variable = is the operator, 100 is the value ; is the end
        if ( score > 99) { // if is the control statement, score is the variable, > is the operator, the evaluation of score > 99 is the control statement
            System.out.println("you got the high score!"); // this is the method call from system.out to print the statement when the if statement is evaluated to be true.
            score = 0; // score is the variable = is the operator, 0 is the value. This creates the expression.
        }

        // a data type and ; are not part of the expression.
        // the if() are not part of the expression.

        // expressions are the building blocks of all programs.
        // variables values and operators are the expressions. This is the syntax of the language.

        // keywords and braces aren't a part of the expression.

        // methods aren't expressions but what is within the paraentheseiss are typically an expression.

    }
}
