package CODINGBAT.WARMUP1;
////Given 2 int values, return true if one is negative and one is positive.
//// Except if the parameter "negative" is true, then return true only if both are negative.

public class Lesson7 {
    public static void main(String[] args) {
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-4, -3, true));


    }
    public static boolean posNeg(int a, int b, boolean negative) {
        while (!negative) {
            if (a < 0 && b > 0) {
                return true;
            } else {
                if (a > 0 && b < 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        while (negative) {
            if (a < 0 && b < 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;


    }

}
