package opps;

class AreaCalculator {

    // Method to find the area of a square
    double area(double side) {
        return side * side;
    }

    // Method to find the area of a rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Method to find the area of a circle
    double area(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        // Calling area methods with different arguments
        System.out.println("Area of Square: " + obj.area(5)); // Side of square
        System.out.println("Area of Rectangle: " + obj.area(5, 10)); // Length and width of rectangle
        System.out.println("Area of Circle: " + obj.area(7, true)); // Radius of circle
    }
}

