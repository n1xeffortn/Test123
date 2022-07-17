package CODINGBAT.WARMUP1;
// Given a string, return a new string where "not " has been added to the front.
// However, if the string already begins with "not", return the string unchanged.
// Note: use .equals() to compare 2 strings.



public class Lesson8 {
    public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not candy"));

    }
    public static String notString(String str) {
        if (str.length() >=3 && str.substring(0, 3).equals("not")) {
            return str;
        } else return "not " + str;
    }
}
