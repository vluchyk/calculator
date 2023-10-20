public class CalculatorService {
    public Calculator addition(double value, double addend) {
        return new Calculator(value, addend, "+", value + addend);
    }

    public Calculator subtraction(double value, double subtractor) {
        return new Calculator(value, subtractor, "-", value - subtractor);
    }

    public Calculator multiplication(double value, double multiplier) {
        return new Calculator(value, multiplier, "x", value * multiplier);
    }

    public Calculator division(double value, double divider) throws CalculatorException {
        if (divider == 0) {
            throw new CalculatorException("Division by zero.");
        }
        return new Calculator(value, divider, "/", value / divider);
    }

    public Calculator calculate(double first, double second, String action) throws CalculatorException {
        if ("+".equals(action))
            return addition(first, second);
        else if ("-".equals(action))
            return subtraction(first, second);
        else if ("x".equals(action))
            return multiplication(first, second);
        else if ("/".equals(action))
            return division(first, second);
        else
            throw new CalculatorException("Unknown action.");
    }
}
