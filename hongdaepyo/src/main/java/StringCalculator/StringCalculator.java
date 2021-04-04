package StringCalculator;

public class StringCalculator {
    private final String REG_EXP_OPERATORS = "[+\\-*/]";
    private final String REG_EXP_NUMBER = "[\\d]";

    private String[] numbers;
    private String operator;

    private void setInitData(String input) {
        this.numbers = input.split(REG_EXP_OPERATORS);
        this.operator = input.replaceAll(REG_EXP_NUMBER, "");
    }

    public int calculate(String input) {
        setInitData(input);

        int result = 0;
        int firstNumber = Integer.parseInt(numbers[0]);
        int secondNumber = Integer.parseInt(numbers[1]);

        switch (operator) {
            case "+": result = firstNumber + secondNumber; break;
            case "-": result = firstNumber - secondNumber; break;
            case "*": result = firstNumber * secondNumber; break;
            case "/": result = firstNumber / secondNumber; break;
        }

        return result;
    }
}
