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
        String[] number = injectNumbers(operator);
        if (number.length != 2) {
            throw new IllegalArgumentException();
        }
        switch (operator) {
            case "+":
                return parseInt(number[0]) + parseInt(number[1]);
            case "-":
                return parseInt(number[0]) - parseInt(number[1]);
            case "*":
                return parseInt(number[0]) * parseInt(number[1]);
            case "/":
                return parseInt(number[0]) / parseInt(number[1]);
            default:
                throw new IllegalArgumentException();
        }
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
}
