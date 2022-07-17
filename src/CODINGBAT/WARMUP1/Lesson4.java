package CODINGBAT.WARMUP1;
// We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
// We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(true, 3));

    }
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (!talking) {
            return false;
        } else if (hour > 20 || hour < 7) {
            return true;
        }
        return false;
    }
}
