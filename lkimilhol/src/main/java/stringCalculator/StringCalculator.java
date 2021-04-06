package stringCalculator;

public class StringCalculator {
    String stringCalculation;

    public StringCalculator(String stringCalculation) {
        this.stringCalculation = stringCalculation;
    }

    public String getStringCalculation() {
        return stringCalculation;
    }

    public int calc() {
        String operator = injectOperator();
        String[] numbers = injectNumbers();

        checkNumberCount(numbers);
        return calculate(operator, numbers);
    }

    public String injectOperator() {
        return this.getStringCalculation().replaceAll("[0-9]", "");
    }

    public String[] injectNumbers() {
        return this.getStringCalculation().split("[+/*-]");
    }

    private int parseInt(String s) {
        return Integer.parseInt(s);
    }

    private void checkNumberCount(String[] numbers) {
        if (numbers.length != 2) {
            throw new IllegalArgumentException();
        }
    }

    private int calculate(String operator, String[] numbers) {
        return Operator.calculate(operator, parseInt(numbers[0]), parseInt(numbers[1]));
    }
}
