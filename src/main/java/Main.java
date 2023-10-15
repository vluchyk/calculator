public class Main {
    public static void main(String[] args) {
        double first = Double.parseDouble(args[0]);
        double second = Double.parseDouble(args[1]);
        String action = args[2];

        CalculatorService calculatorService = new CalculatorService();
        Calculator calculator = calculatorService.calculate(first, second, action);

        System.out.println(calculator);
    }
}
