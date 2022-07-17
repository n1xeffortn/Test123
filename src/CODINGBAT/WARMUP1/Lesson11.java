package CODINGBAT.WARMUP1;
// Given a string, we'll say that the front is the first 3 chars of the string.
// If the string length is less than 3, the front is whatever is there.
// Return a new string which is 3 copies of the front.

public class Lesson11 {
    public static void main(String[] args) {
        System.out.println(backAround("Java"));
        System.out.println(backAround("Chocolate"));
        System.out.println(backAround("abc"));


    }
    public static String backAround(String str) {
        String lastChar = str.substring(str.length() - 1, str.length());
        if (str.length() <= 1) {
            return str + str + str;
        } else return lastChar + str + lastChar;
    }
}
