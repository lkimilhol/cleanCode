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
        String[] numbers = injectNumbers(operator);

        checkNumberCount(numbers);
        return calculate(operator, numbers);
    }

    public String injectOperator() {
        String s = this.getStringCalculation();
        return s.replaceAll("[0-9]", "");
    }

    public String[] injectNumbers(String operator) {
        String s = this.getStringCalculation();
        String newOp;
        switch (operator) {
            case "+":
                newOp = "\\+";
                break;
            case "-":
                newOp = "-";
                break;
            case "*":
                newOp = "\\*";
                break;
            case "/":
                newOp = "/";
                break;
            default:
                throw new IllegalArgumentException();
        }
        return s.split(newOp);
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
        switch (operator) {
            case "+":
                return parseInt(numbers[0]) + parseInt(numbers[1]);
            case "-":
                return parseInt(numbers[0]) - parseInt(numbers[1]);
            case "*":
                return parseInt(numbers[0]) * parseInt(numbers[1]);
            case "/":
                return parseInt(numbers[0]) / parseInt(numbers[1]);
            default:
                throw new IllegalArgumentException();
        }
    }
}
