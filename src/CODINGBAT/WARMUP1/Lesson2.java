package CODINGBAT.WARMUP1;

//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
// We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));



    }

    public static int sumDouble(int a, int b) {
        int result = 0;
        if (a != b) {
            return result = a + b;
        } else {
            return result = (a + b) * 2;
        }
    }
}
