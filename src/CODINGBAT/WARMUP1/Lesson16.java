package CODINGBAT.WARMUP1;
// Given 2 int values, return true if either of them is in the range 10..20 inclusive.

public class Lesson16 {
    public static void main(String[] args) {
        System.out.println(in1020(12, 99));
        System.out.println(in1020(22, 9));
        System.out.println(in1020(8,99));



    }
    public static boolean in1020(int a, int b) {
        if ((a <= 20 && a >= 10) || (b <= 20 && b >=10)) {
            return true;
        } else return false;
    }
}
