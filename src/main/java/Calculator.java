import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Calculator {
    private final double first;
    private final double second;
    private final String action;
    private final double result;

    @Override
    public String toString() {
        return first + " " + action + " " + second + " = " + result;
    }
}
