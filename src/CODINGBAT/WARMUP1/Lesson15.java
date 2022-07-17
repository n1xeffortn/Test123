package CODINGBAT.WARMUP1;
// Given two temperatures, return true if one is less than 0 and the other is greater than 100.

public class Lesson15 {
    public static void main(String[] args) {
        System.out.println(icyHot(-1,120));
        System.out.println(icyHot(120, -1));
        System.out.println(icyHot(120, 2));

    }
    public static boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100) {
            return true;
        } else if(temp1 > 100 && temp2 < 0) {
            return true;
        } else
            return false;
    }
}
