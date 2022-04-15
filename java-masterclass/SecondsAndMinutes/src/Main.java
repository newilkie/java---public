public class Main {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(SecondsAndMinutes.getDurationString(65L,45L));
        System.out.println(SecondsAndMinutes.getDurationString(3945L));
        System.out.println(SecondsAndMinutes.getDurationString(-41));
        System.out.println(SecondsAndMinutes.getDurationString(65, 9));
    }
}
