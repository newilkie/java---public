public class Main {
    public static void main(String[] args) {
        System.out.println("This tests to see if the range is too low or too high.");
        System.out.println("These cases are tested to be outside of the range");
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(10000));

        System.out.println("The Following are not leap years");
        System.out.println("This is because they are divisible by 100 but not 400.");
        System.out.println(LeapYear.isLeapYear(1700));
        System.out.println(LeapYear.isLeapYear(1800));
        System.out.println(LeapYear.isLeapYear(1900));
        System.out.println(LeapYear.isLeapYear(2100));
        System.out.println(LeapYear.isLeapYear(2200));
        System.out.println(LeapYear.isLeapYear(2300));
        System.out.println(LeapYear.isLeapYear(2500));

        System.out.println("The following are leap years because they are divisible by 100 and by 400");
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(2400));

        System.out.println("The following are leap years because they are divisible by 4 with no remainder");
        System.out.println(LeapYear.isLeapYear(2020));
        System.out.println(LeapYear.isLeapYear(2024));
        System.out.println(LeapYear.isLeapYear(2028));



    }
}
