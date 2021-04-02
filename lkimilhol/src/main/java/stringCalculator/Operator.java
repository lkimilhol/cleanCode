package stringCalculator;

public enum Operator {
    PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/"),;

    String operator;

    Operator(String s) {
        this.operator = s;
    }

    public String getOperator() {
        return operator;
    }
}
