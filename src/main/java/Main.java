public class Main {
    public static void main(String[] args) {
        if (args.length == 3) {
            double first = Double.parseDouble(args[0]);
            double second = Double.parseDouble(args[1]);
            String action = args[2];

            CalculatorService calculatorService = new CalculatorService();
            Calculator calculator;
            try {
                calculator = calculatorService.calculate(first, second, action);
                System.out.println(calculator);
            } catch (CalculatorException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Incorrect number of the input parameters. Should be value, value and action.");
        }
    }
}