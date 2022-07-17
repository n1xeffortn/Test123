package CODINGBAT.WARMUP1;
//Given an int n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21.

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println(Diff21(19));
        System.out.println(Diff21(10));
        System.out.println(Diff21(25));

    }
    public static int Diff21(int n) {
        int result = 21;
        if (result < n) {
            return (n - result) * 2;
        } else if (result > n) {
            return result = result - n;
        } else {
            return result = 0;
        }
    }
}
