package CODINGBAT.WARMUP1;
//Simple warmup problems to get started (solutions available).
// New videos: String Introduction, String Substring, If Boolean Logic 1, If Boolean Logic 2
public class Lesson21 {
    public static void main(String[] args) {
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));

    }
    public static String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        } else {
            str = str.substring(0, 3);
            return str + str + str;
        }
    }

}
