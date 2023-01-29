package Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number");
        int a = input.nextInt();
        System.out.println("Input sign of the operation (+, -, *, /)");
        char c = input.next().charAt(0);
        System.out.println("Input second number");
        double b = input.nextDouble();
        CalculatorTest calculatorTest = new CalculatorTest();
        System.out.println("Result this operation is " + calculatorTest.calculate(a, c, b));



    }
}