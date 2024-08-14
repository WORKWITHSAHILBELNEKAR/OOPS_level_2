package opps;

public class ArithmeticSum {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        ArithmeticSum arithmeticSum = new ArithmeticSum();

        System.out.println("Sum of 2 numbers: " + arithmeticSum.sum(10, 20));
        System.out.println("Sum of 3 numbers: " + arithmeticSum.sum(10, 20, 30));
        System.out.println("Sum of 4 numbers: " + arithmeticSum.sum(10, 20, 30, 40));
    }
}

