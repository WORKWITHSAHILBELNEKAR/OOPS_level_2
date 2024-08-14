package opps;

import java.util.Scanner;

public class SumOfByte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first byte value: ");
        byte num1 = scanner.nextByte();
        System.out.print("Enter the second byte value: ");
        byte num2 = scanner.nextByte();

        // Type casting byte to int
        int sum = (int) num1 + (int) num2;

        System.out.println("Sum of the two byte values: " + sum);
    }
}
