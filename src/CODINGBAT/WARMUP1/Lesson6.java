package CODINGBAT.WARMUP1;
// Given an int n, return true if it is within 10 of 100 or 200.
// Note: Math.abs(num) computes the absolute value of a number.

public class Lesson6 {

    public static boolean nearHundred(int a) {
        if (a >= 90 && a <= 110) {
            return true;
        } else if (a >= 190 && a <= 210) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(110));
        System.out.println(nearHundred(121));
}
    }





