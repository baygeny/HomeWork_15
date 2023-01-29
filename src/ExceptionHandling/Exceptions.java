package ExceptionHandling;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number");


        double a, result1 = 10, result3;
        int b;
        try {
            a = input.nextDouble();
        } catch (Exception e) {
            System.out.println("It is not a number");
            return;

        }
        System.out.println("Input second number. It must be an integer");
        try {
            b = input.nextInt();
        } catch (Exception e) {
            System.out.println("It is not an integer");
            return;
        }
        try {
            if (a <= 0) {
                throw new Exception();
            }
            result1 = Math.log(a);
            System.out.println("Natural logarithm of " + a + " is " + result1);
        } catch (Exception e) {
            System.out.println("Negative logarithm error");
        }

        double result2 = result1 / (a - b);
        try {
            if (a == b) {
                throw new Exception("Division by zero error");
            }

            if (a < b || result1 < 0) {
                throw new Exception("Negative root error");
            }

            result3 = Math.sqrt(result2);
            System.out.println("Square root of " + result2 + " is " + result3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
