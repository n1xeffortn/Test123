package Sasha.Chernovik;

public class Checkout {
    public static void main(String[] args) {

        Head head1 = new Head();
        head1.sayHello();
        head1.sayGoodbye();

        Head head2 = new daughter();
        head2.sayHello();
        head2.sayGoodbye();

        daughter head3 = new daughter();
        head3.sayHello();
        head3.sayGoodbye();

        Head.Value(1);
       head3.Value(2.2d);
       head3.Value(2.2f);

       daughter head4 = (daughter) head2;
       head4.Value(2.2f);
       head4.Value(2.2d);
       head4.Value(2);
       head4.Value(2L);
     Object obj = new Object();

    }
}

class Head {
    public static void sayHello() {
        System.out.println("Hello from head!");


    }

    static public void sayGoodbye() {
        System.out.println("GoodBye from Head!");
    }

   static void Value(int value) {
        System.out.println("My intvalue from head = " + value);
    }





    void Value(long value) {
        System.out.println("My long value form head = " + value);
    }
}

class daughter extends Head {

    public static void sayHello() {
        System.out.println("Hello from daughter!");
    }


   static public void sayGoodbye() {
        System.out.println("Goodbye from daughter!");
    }

   protected void Value(float value) {
        System.out.println("float value form daughter = " + value);
    }

    static void Value(double value) {
        System.out.println("My double value = " + value);


    }

    static void Value(int value) {
        System.out.println("m");

    }
}

