public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) { // range validation
            if (year % 4 == 0){  // step 1
                if(year % 100 == 0 && year % 400 == 0){
                    return true; // step 4. It is divisible by 100 and 400.
                }
                return false; // step 5. If it isn't divisible by 100 and 400 simultaniously it will be false
            }
            return true; // step 4. If it is divisible by 4 it will return true.
        }
        return false; // step 5. If it is outside of the range it will return false.
    }
}

// this isn't a great way of doing it but was considered correct.