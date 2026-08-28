class Shape {

    final String SHAPE_TYPE = "2D";

    double area() {
        return 0;
    }
}

class Polygon extends Shape {

    @Override
    double area() {
        return -1;
    }
}

class Rectangle extends Polygon {

    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

public class Q8ShapeArea {
    public static void main(String[] args) {

        Shape shape = new Shape();
        Polygon polygon = new Polygon();
        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println("Shape Type: " +
                           rectangle.SHAPE_TYPE);

        System.out.println("Shape Area: " +
                           shape.area());

        System.out.println("Polygon Area: " +
                           polygon.area());

        System.out.println("Rectangle Area: " +
                           rectangle.area());
    }
}