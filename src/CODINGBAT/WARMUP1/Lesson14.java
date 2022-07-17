package CODINGBAT.WARMUP1;
// Given a string, return true if the string starts with "hi" and false otherwise.

public class Lesson14 {
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));

    }
    public static boolean startHi(String str) {
        if (str. length() >= 2 && str.substring(0, 2).equals("hi")) {
            return true;
        } else return false;
    }

}
