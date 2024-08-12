import java.util.Scanner;

public class Calculator {
    double input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the first number");
    double num1 = sc.nextDouble();
    System.out.print("enter the Second number ");
    double num2 = sc.nextDouble();
    return add(num1, num2);
    }

    double add (double a ,  double b ){
        return a + b ;
    }
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("result is :" + obj.input() );
    }
    }

