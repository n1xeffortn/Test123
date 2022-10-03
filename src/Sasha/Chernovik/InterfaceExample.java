package Sasha.Chernovik;

public class InterfaceExample {

    public static void main(String[] args) {

    }
}

interface Movable {

    int DELTA = 10;

    Point2D move(Point2D point);

}

interface Movable2 {

    Point2D move1(Point2D point);


}