package Calculator;

public class CalculatorTest implements Calculator {


    @Override
    public double calculate(double a, char c, double b) {
        double result = 0;
        if(c == '+'){
            result = a + b;
        }
        if(c == '-') {
            result = a - b;
        }
        if(c == '*') {
            result = a * b;
        }
        if(c == '/') {
            result = a / b;
        }
        return result;
    }
}
