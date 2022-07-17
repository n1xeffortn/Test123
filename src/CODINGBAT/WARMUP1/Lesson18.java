package CODINGBAT.WARMUP1;
// We'll say that a number is "teen" if it is in the range 13..19 inclusive.
// Given 2 int values, return true if one or the other is teen, but not both.


public class Lesson18 {
    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13,13));
        System.out.println(loneTeen(16,17));

    }
    public static boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
            return false;
        } else if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return true;
        } else if (a == b) {
            return false;
        }
        return true;
    }
}
