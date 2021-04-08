package stringCalculator;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS("+", (a, b) -> a + b)
    , MINUS("-", (a, b) -> a - b)
    , TIMES("*", (a, b) -> a * b)
    , DIVIDE("/", (a, b) -> a / b)
    ,;

    String operator;
    BiFunction<Integer, Integer, Integer> expression;

    Operator(String operator, BiFunction<Integer, Integer, Integer> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static int calculate(String operator, int num1, int num2) {
        return getOperator(operator).expression.apply(num1, num2);
    }

    private static Operator getOperator(String operator) {
        return Arrays.stream(values())
                .filter(o -> o.operator.equals(operator))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
    }
}
