package CODINGBAT.WARMUP1;
// Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

public class Lesson5 {
    public static void main(String[] args) {
        System.out.println(makes10(1,9));
        System.out.println(makes10(9, 10));
        System.out.println(makes10(9,9));

    }
    public static boolean makes10(int a, int b) {
        if (a + b == 10) {
            return true;
        } else if (a == 10 || b == 10) {
            return true;
        } else {
            return false;
        }
    }
}
