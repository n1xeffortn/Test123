package CODINGBAT.WARMUP1;
// Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
// Otherwise, return the string unchanged.

public class Lesson19 {
    public static void main(String[] args) {
        System.out.println(delDel("gdellobal"));
        System.out.println(delDel("hdelello!"));
        System.out.println(delDel("qwedelqwe"));
        System.out.println(delDel("del"));
        System.out.println(delDel("a"));

    }
    public static String delDel(String str) {
        if(str.length() <= 3) {
            return str;
        } else if (str.substring(1, 4).equals("del")) {
            str = str.substring(0, 1) + str.substring(4, str.length());
            return str;
        } else return str;
    }

}
