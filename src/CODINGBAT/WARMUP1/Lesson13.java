package CODINGBAT.WARMUP1;
// Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
// If the string length is less than 2, use whatever chars are there.

public class Lesson13 {

    public static void main(String[] args) {
        System.out.println(front22("Chocolate"));
        System.out.println(front22("Java"));
        System.out.println(front22("J"));

    }
    public static String front22(String str) {
        String newStr = " ";
        if (str.length() <= 2) {
            return str + str + str;
        } else
            newStr = str.substring(0, 2);
        return newStr + str + newStr;
    }
}

