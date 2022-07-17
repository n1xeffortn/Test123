package CODINGBAT.WARMUP1;
// Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

public class Lesson20 {
    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("9ix snacks")); 

    }
    public static boolean mixStart(String str) {
        if (str.length() <= 2) {
            return false;
        } else if (str.substring(1, 3).equals("ix")) {
            return true;
        } else return false;
    }
}
