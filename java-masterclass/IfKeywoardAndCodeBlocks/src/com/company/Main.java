package com.company;

public class Main {

    public static void main(String[] args) {
        // starting with if
        boolean gameOver = true;
        int score = 800;
        int levelCompleted =5;
        int bonus = 100;

//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//            // you can run this without the curley braces if you are only planning on using one line.
//        }else if(score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else{
//            System.out.println("Got Here");
//        }
        // the use of code blocks makes it clearer, you don't necessarily need to use it if you are only executing one
        // statement, however it seems that it is best practice to use the code block even with a single statement for clarity.

        if(gameOver){// you can use gameOver to use a shortcut in java to replace gameOver == true
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        // you can't access code that was made inside of a code block outside of a codeblock.

        // Print Out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well.

        // you could use a new set of variables, or reuse the variables inside of the code, or before the code.

        if(gameOver){// you can use gameOver to use a shortcut in java to replace gameOver == true
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // another method could be something different. He's stating throughout that it's important to reuse code
        // he's stating that you can use methods to reduce the copy, paste reusing of code.




    }
}
