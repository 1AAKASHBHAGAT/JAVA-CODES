// Write a java program to demonstrate hierarchical inheritance using a base
// class Shape with
// private data members (length, breadth). Derive classes Rectangle and Triangle[right angle triangle] to calculate area separately.

class Shape {
    private double length;
    private double breadth;

    public Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
}

class Rectangle extends Shape {
    public Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    public double area() {
        return getLength() * getBreadth();
    }
}

 public class Triangle extends Shape {
    public Triangle(double length, double breadth) {
        super(length, breadth);
    }

    public double area() {
        return 0.5 * getLength() * getBreadth();
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Triangle triangle = new Triangle(5, 3);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
