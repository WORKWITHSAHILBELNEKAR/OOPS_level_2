package opps;

import java.util.Scanner;

class Rectangle {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int calculateArea() {
        return length * breadth;
    }
}

class Triangle {
    int base, height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class AreaCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        // Triangle
        System.out.print("Enter the base of the triangle: ");
        int base = scanner.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();
        Triangle triangle = new Triangle(base, height);
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}

