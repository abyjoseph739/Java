class Shape {
    protected String name;

    Shape(String name) {
        this.name = name;
    }

    void describe() {
        System.out.println("Shape: " + name);
    }
}

class Circle extends Shape {
    double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void describe() {
        super.describe();

        double area = Math.PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

public class Q2ShapePerimeter {
    public static void main(String[] args) {

        Circle circle = new Circle("Circle", 5);

        circle.describe();
    }
}