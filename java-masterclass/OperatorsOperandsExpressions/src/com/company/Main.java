package com.company;

public class Main {

    public static void main(String[] args) {
        // What are operators?
        // Operators in Java are special symbols that perform specific operations on one, two, or
        // three operands, and then return a result. As an example, we used the + (addition) operator
        // to sum the value of two variables in a previous video.

        // There are many other operators in Java.

        // What is an Operand?
        // An operand is a term used to describe any object that is manipulated by an operator.
        // If we consider this statement: int myVar = 15 + 12;
        // Then + in the operator, and 15 and 12 are the operands. Variables used instead of literals
        // are also operands.

        // double mySalary = hoursWorked * hourlyRate;
        // In the above line hoursWorked and hourlyRate are operands, and * (multiplication) is the operator.

        // What is an Expression?
        // An expression is formed by combining variables, literals, method return values (which we haven't
        // covered yet) and operators.

        // In the line below, 15 + 12 is the expression which has (or returns) 27 in this case.

        // int myValue = 15 + 12;

        // In the statement below, hoursWorked * hourlyRate is the expression. If hoursWorked was 10.00 and
        // hourlyRate was 20.00 then the expression would return 200.00;

        // double my Salary = hoursWorked * hourlyRate;

        // Lets explore Operators in more detail.

        int result = 1 + 2; // 1 + 2 = 3

        // Comments are ignored by the computer and are added to a program to help describe something.
        // Comments are there for humans.

        // we use // in front of any code, or on a blank line. Anything after the // right through to
        // the end of the line is ignored by the computer.

        // Aside from describing something about a program, comments can be used to temporarily disable code.

        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("Previous result " + previousResult);

        result = result - 1; // 3 - 1 = 2

        System.out.println("3 - 1 = " + result);

        System.out.println("Previous result " + previousResult); // Notice that previousResult hasn't been updated.

        result = result * 10; // 2 * 10 = 20

        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4;

        System.out.println("20 / 5 = " + result);

        //Modulus operator

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //abbreviations

        // result = result + 1;
        result++; // 1 + 1 = 2;
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1;
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 =" + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3;
        result /= 3; //30 / 3 = 10;
        System.out.println("30 / 3 = " + result);

        // result = result -2;
        result -= 2; //10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        // if-then statements in Java
        // The if-then statement is the most basic of all the control flow statements. It tells your
        // program to execute a certain section of code only if a particular test evaluates to true.

        //This is known as conditional logic.

        // Conditional Logic
        // Conditional logic uses specific statements in Java to allow us to check a condition and
        // execute certain code based on whether that condition (the expression) is true or false.

        // Let's see how this works in practice.

        boolean isAlien = false; // this is an assignment using a single =
        if (isAlien == false) // this is a boolean operator it uses == to compare the expressions.
            System.out.println("It is not an alien!");

        // Instead of using the if-statement as we see here we should instead use a code block.
        // A code block allows more than one statement to be executed - a block of code.

        if(isAlien == false){
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        // Using code blocks allows us to have multiple statements inside of our if statement be evaluated.
        // Additionally it makes it easier to understand.

        // Logical and Operators ==, != (not), >, <, >=, <=
        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        // AND has to have both conditions be true.

        // Logical OR operator
        // only one of the conditions has to be true.
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

            // Logical AND and logical OR
            // The AND operator comes in two flavors in Java, as does the OR operator.
            // && is the Logical AND which operates on boolean operands - Checking if a
            // given condition is true or false.

            // You will almost always want to be doing this. The & is a bitwise operator
            // working at the bit level. This is an advanced concept we won't get into here.

            // Likewise || is the Logical OR what again operates on boolean operands - checking
            // if a given condition is true or false.

            // Again, you will almost always want to be doing this. The | is a bitwise operator
            // working at the bit level.


        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        // Difference between the assignment and equal operators.

        // a single = is an assignment.  a double == is a boolean.

        boolean isCar = true;
        if(isCar){
            System.out.println("This is not supposed to happen.");
        }

        boolean wasCar = isCar ? true : false; // this is called a tertinary operator. First operand "isCar" condition we are testing.
        //second operand "true" if true third operand "false" if false.

        if(wasCar){
            System.out.println("wasCar is true");
        }

        // if statements require a variable. If you use a isCar = true it will assign the boolean isCar to
        // an accepted data type boolean.

        // The NOT Operator
        // The ! or NOT Operator is also known as the Logical Complement Operator.

        // For use with booleans it tests the alternate value - we saw (isCar) test for true, by adding a !
        // operator before the value we can check the opposite - false in this case.

        // boolean isCar = false;

        // We can use either of these statements:

        // if(isCar == false)

        // if(!isCar)

        // to check if the boolean isCar is false.

        // recommendation to use the not operator so that you eliminate the potential to accidently use
        // the assignment operator instead of the boolean as it can be tough to check the logic problems.

        // We can use either of these statements:
        // if(isCar == false)
        // if(!isCar)
        // to check if the boolean isCar is false.

        // I'd generally recommend using the abbreviated form of both for two reasons. One to avoid the
        // potential for error by accidentally using an assignment operator, and second, the code is more
        // concise.

        // Ternary operator?:
        // The ternary operator is a shortcut to assigning one of two values to a variable depending on a
        // given condition.

        // It's a shortcut of the if-then-else statement (else we will be discussing later).

        // int ageOfClient = 20;
        // boolean isEighteenOrOver = ageOfClient == 20 ? true: false;

        // Operand one - ageOfClient == 20 in this case the condition we are checking. It needs to return
        // true or false.

        // Operand two - true here is the value to assign to the variable isEighteenOrOver if the condition
        // above is true

        // Operand three - false here is the value to assign to the variable isEighteenOrOver if the
        // condition above was false.

        // It can be a good idea to use parenteses like this to make the code more readable.

        // boolean isEighteenOrOver = (ageOfClient == 20) ? true: false;

        // OPERATOR CHALLENGE

        // Lets test what you have learned about Operators.
        // 1. Create a double variable with a value of 20.00.
        double myDoubleVariable1 = 20.00d;
        System.out.println(myDoubleVariable1);


        // 2. Create a second variable of type double with the value 80.00.
        double myDoubleVariable2 = 80.00d;
        System.out.println(myDoubleVariable2);

        // 3. Add both numbers together and multiply by 100.00.
        double myOutput1 = 100.00d * (myDoubleVariable1 + myDoubleVariable2);
        System.out.println(myOutput1);

        // 4. Use the remainder operator to figure out what the remainder from the result of the operation
        // in step 3 and 40.00. We used the modulus or remainder operator on ints in the course, but we
        // can also use it on a double.

        double theRemainder = myOutput1 % 40.00d;
        System.out.println("theRemainder = " +theRemainder);

        // 5. Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false
        // if it is not zero

        boolean isNoRemainder = (theRemainder == 0)? true : false;

        // 6. Output the boolean variable.

        System.out.println("isNoRemainder = " + isNoRemainder);

        // 7. Write an if-then statement that displays a message "Got some remainder" if the boolean in
        // step 5 is not true. Don't be suprised if you see output for this step, where you might expect
        // it not to show. I'll explain it in my solution.

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }









    }
}
