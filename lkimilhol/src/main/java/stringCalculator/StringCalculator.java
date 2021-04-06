package stringCalculator;

import java.util.*;

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
        Queue<Integer> numbers = injectNumbers();

        checkNumberCount(numbers);
        return calculate(operator, numbers);
    }

    public String injectOperator() {
        return this.getStringCalculation().replaceAll("[0-9]", "");
    }

    public Queue<Integer> injectNumbers() {
        String[] arr = this.getStringCalculation().split("[+/*-]");
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(Integer.parseInt(arr[0]));
        numbers.add(Integer.parseInt(arr[1]));
        return numbers;
    }

    private void checkNumberCount(Queue<Integer> numbers) {
        if (numbers.size() != 2) {
            throw new IllegalArgumentException();
        }
    }

    private int calculate(String operator, Queue<Integer> numbers) {
        return Operator.calculate(operator, numbers.poll(), numbers.poll());
    }
}
