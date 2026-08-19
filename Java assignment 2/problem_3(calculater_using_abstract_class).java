abstract class Shape {

    abstract void calculateArea();

    abstract void calculatePerimeter();
}


class Circle extends Shape {

    double r;

    Circle(double r) {
        this.r = r;
    }

    void calculateArea() {
        System.out.println("Circle Area = " + 3.14 * r * r);
    }

    void calculatePerimeter() {
        System.out.println("Circle Perimeter = " + 2 * 3.14 * r);
    }
}


class Rectangle extends Shape {

    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void calculateArea() {
        System.out.println("Rectangle Area = " + length * breadth);
    }

    void calculatePerimeter() {
        System.out.println(
            "Rectangle Perimeter = " + 2 * (length + breadth)
        );
    }
}


class Triangle extends Shape {

    double base, height;
    double side1, side2, side3;

    Triangle(double b, double h, double s1, double s2, double s3) {
        base = b;
        height = h;
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    void calculateArea() {
        System.out.println("Triangle Area = " + 0.5 * base * height);
    }

    void calculatePerimeter() {
        System.out.println(
            "Triangle Perimeter = " + (side1 + side2 + side3)
        );
    }
}


public class ShapeCalculator {

    public static void main(String[] args) {

        Shape c = new Circle(5);
        Shape r = new Rectangle(10, 5);
        Shape t = new Triangle(6, 4, 5, 5, 6);

        c.calculateArea();
        c.calculatePerimeter();

        r.calculateArea();
        r.calculatePerimeter();

        t.calculateArea();
        t.calculatePerimeter();
    }
}