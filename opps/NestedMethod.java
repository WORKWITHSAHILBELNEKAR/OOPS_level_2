package opps;

import java.util.Scanner;

class Cuboid {
    int length, breadth, height;

    Cuboid(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    int perimeter() {
        return 2 * (length + breadth + height);
    }

    int area() {
        return length * breadth;
    }

    int volume() {
        return area() * height;
    }
}

public class NestedMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the cuboid: ");
        int length = scanner.nextInt();
        System.out.print("Enter the breadth of the cuboid: ");
        int breadth = scanner.nextInt();
        System.out.print("Enter the height of the cuboid: ");
        int height = scanner.nextInt();

        Cuboid cuboid = new Cuboid(length, breadth, height);
        System.out.println("Perimeter: " + cuboid.perimeter());
        System.out.println("Area: " + cuboid.area());
        System.out.println("Volume: " + cuboid.volume());
    }
}
