package CODINGBAT.WARMUP1;
// Given a string, return a new string where the first and last chars have been exchanged.

public class Lesson10 {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ae"));

    }
    public static String frontBack(String str) {
        if (str.length() > 1) {
            String letter1 = str.substring(0, 1);
            String letter2 = str.substring((str.length() - 1), (str.length()));
            str = letter2 + str.substring(1, str.length() - 1) + letter1;
            return str;
        } else return str;
}
    }
