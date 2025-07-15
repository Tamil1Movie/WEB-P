//Create classes for different shapes like Circle, Rectangle, and Triangle.Each class should have necessary attributes and methods to calculate area and perimeter.
//Create objects of different shapes and perform calculations.

import java.util.Scanner;

// Circle class
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class
class Rectangle {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Triangle class
class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double s = getPerimeter() / 2; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron’s formula
    }
}

// Main class
public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.printf("Circle Area: %.2f\n", circle.getArea());
        System.out.printf("Circle Perimeter: %.2f\n\n", circle.getPerimeter());

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.printf("Rectangle Area: %.2f\n", rectangle.getArea());
        System.out.printf("Rectangle Perimeter: %.2f\n\n", rectangle.getPerimeter());

        // Triangle
        System.out.print("Enter side A of triangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter side B of triangle: ");
        double b = scanner.nextDouble();
        System.out.print("Enter side C of triangle: ");
        double c = scanner.nextDouble();
        Triangle triangle = new Triangle(a, b, c);
        System.out.printf("Triangle Area: %.2f\n", triangle.getArea());
        System.out.printf("Triangle Perimeter: %.2f\n", triangle.getPerimeter());

        scanner.close();
    }
}


