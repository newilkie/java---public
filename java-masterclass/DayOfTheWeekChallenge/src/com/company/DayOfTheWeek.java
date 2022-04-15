package com.company;

public class DayOfTheWeek {
    public static void printDayOfTheWeek(int day){
        String dayString;
        switch (day){
            case 1: dayString = "Monday";
                    break;
            case 2: dayString = "Tuesday";
                    break;
            case 3: dayString = "Wednesday";
                    break;
            case 4: dayString = "Thursday";
                    break;
            case 5: dayString = "Friday";
                    break;
            case 6: dayString = "Saturday";
                    break;
            case 7: dayString = "Sunday";
                    break;

            default: dayString = "Invalid Day";
                    break;
        }
        System.out.println(dayString);
    }

    public static void printDayIf(int day){
        if(day == 1){
            System.out.println("Monday");
        }else if (day == 2){
            System.out.println("Tuesday");
        }else if (day == 3){
            System.out.println("Wednesday");
        }else if (day == 4){
            System.out.println("Thursday");
        }else if (day == 5){
            System.out.println("Friday");
        }else if (day == 6){
            System.out.println("Saturday");
        }else if (day == 7){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid day");
        }
    }
}
