public class LeapYear {
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
}

// this isn't a great way of doing it but was considered correct.