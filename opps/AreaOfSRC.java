package opps;

public class AreaOfSRC {

    // Method to calculate area of a square
    int area(int side) {
        return side * side;
    }

    // Method to calculate area of a rectangle
    int area(int length, int breadth) {
        return length * breadth;
    }

    // Method to calculate area of a circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaOfSRC calculator = new AreaOfSRC();

        System.out.println("Area of square: " + calculator.area(5));
        System.out.println("Area of rectangle: " + calculator.area(5, 10));
        System.out.println("Area of circle: " + calculator.area(7.5));
    }
}

