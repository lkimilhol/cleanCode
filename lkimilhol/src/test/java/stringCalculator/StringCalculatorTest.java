package stringCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    @DisplayName("문자열에서 문자만 추출")
    void injectOperator() {
        StringCalculator stringCalculator = new StringCalculator("1+1");
        String stringCalculation = stringCalculator.injectOperator();
        assertEquals("+", stringCalculation);
    }

    @Test
    @DisplayName("문자열에서 숫자 추출")
    void injectNumbers() {
        StringCalculator stringCalculator = new StringCalculator("1+2");
        String operator = stringCalculator.injectOperator();
        String[] numbers = stringCalculator.injectNumbers(operator);
        assertEquals(2, numbers.length);
        assertEquals("1", numbers[0]);
        assertEquals("2", numbers[1]);
    }

    @Test
    @DisplayName("+ 계산하기")
    void calcPlus() {
        StringCalculator stringCalculator = new StringCalculator("1+2");
        int result = stringCalculator.calc();
        assertEquals(3, result);
    }

    @Test
    @DisplayName("- 계산하기")
    void calcMinus() {
        StringCalculator stringCalculator = new StringCalculator("4-2");
        int result = stringCalculator.calc();
        assertEquals(2, result);
    }

    @Test
    @DisplayName("* 계산하기")
    void calcMulti() {
        StringCalculator stringCalculator = new StringCalculator("1*2");
        int result = stringCalculator.calc();
        assertEquals(2, result);
    }

    @Test
    @DisplayName("/ 계산하기")
    void calcDivision() {
        StringCalculator stringCalculator = new StringCalculator("4/2");
        int result = stringCalculator.calc();
        assertEquals(2, result);
    }
}