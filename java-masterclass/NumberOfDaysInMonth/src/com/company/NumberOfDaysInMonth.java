package com.company;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) { // range validation
            if (year % 4 == 0) {  // step 1
                if (year % 100 == 0) { // step 2
                    if (year % 400 == 0) { // step 3
                        return true; // step 4
                    }
                    return false; // step 5
                }
                return true; // step 4
            }
        }
        return false; // step 5
    }

    public static int getDaysInMonth(int month, int year){
        int numDays;
        if(year <= 1 || year >= 9999){
            month = -1;
        }
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDays= 31;
                break;
            case 4: case 6: case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if(isLeapYear(year) == true){
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;

            default:
                numDays = -1;
                break;
        }
        return numDays;

    }
}
