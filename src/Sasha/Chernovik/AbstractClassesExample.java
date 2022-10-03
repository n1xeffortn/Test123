package Sasha.Chernovik;


import java.util.Arrays;
import java.util.Comparator;

public class AbstractClassesExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Square(10);


        System.out.println(rectangle.calcSquare() == 100);


        System.out.println(rectangle.calcSquare() == 150);

        GeometricShape shape = new Rectangle(1, 2);

        System.out.println(shape.point2D);



        Square square = new Square(10);
        Rectangle square1 = new Square(10);
        System.out.println(square.calcPerimeter());
        GeometricShape square2 = new Square(1);
        GeometricShape rectangle5 = new Square(5);
        System.out.println(square2.point2D);
        GeometricShape rectangle2 = new Rectangle(1,4);
        Movable square3 = new Square(1);
        Movable2 rectangle4 = new Rectangle(1,7);

        Square sqr = new Square(4);
        Rectangle rec = new Rectangle(1,2);

        System.out.println(sqr.compareTo(rec));

        GeometricShape[] shapes = {sqr, rec, new Square(20)};
        System.out.println(Arrays.toString(shapes));

        Arrays.sort(shapes);

        System.out.println(Arrays.toString(shapes));

        class ShapeComparator implements Comparator<GeometricShape> {

            int field;

            @Override
           public int compare(GeometricShape a, GeometricShape b) {
                return Double.compare(a.calcPerimeter(), b.calcPerimeter());
            }
        }


        Arrays.sort(shapes,  new ShapeComparator());
        System.out.println(Arrays.toString(shapes));
    }
}


    class Point2D {
        int x;
        int y;

        @Override
        public String toString() {
            return "Point2D{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }





abstract class GeometricShape implements Movable, Movable2, Comparable {
    protected Point2D point2D;
    public GeometricShape(Point2D point2D) {
        this.point2D = point2D;
    }
    public GeometricShape() {
        this.point2D = new Point2D();
    }
    public abstract Number calcSquare();
    public abstract double calcPerimeter();
    public Point2D getPoint2D() {
        return point2D;


    }
}

class Rectangle extends GeometricShape {
    private final int a;
    private final int b;

    public Rectangle(Point2D point, int a, int b) {
        super(point);
        this.a = a;
        this.b = b;
    }
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }

    public Integer calcSquare() {
         return a * b;
    }
    @Override
    public double calcPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public Point2D move(Point2D point) {
        return null;
    }

    @Override
    public Point2D move1(Point2D point) {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        GeometricShape other = (GeometricShape) o;

        return Double.compare(this.calcSquare().doubleValue(), other.calcSquare().doubleValue());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
class Square extends Rectangle {
    public Square(Point2D point, int a) {
        super(point, a, a);
    }
    public Square(int a) {
        super(a, a);
    }
    @Override
    public double calcPerimeter() {
        return getA() * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "point2D=" + point2D + "," +
                "side=" + getA() +
                '}';
    }
}
