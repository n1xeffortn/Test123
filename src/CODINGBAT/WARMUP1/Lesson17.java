package CODINGBAT.WARMUP1;
//We'll say that a number is "teen" if it is in the range 13..19 inclusive.
// Given 3 int values, return true if 1 or more of them are teen.



public class Lesson17 {
    public static void main(String[] args) {
        System.out.println(hasTeen(10, 13, 21));
        System.out.println(hasTeen(13, 14,22));
        System.out.println(hasTeen(22, 22,55));

    }
    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <=19) || (b >= 13 && b <= 19) || (c >= 13 && c <=19)) {
            return true;
        } else return false;
    }
}
