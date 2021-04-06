package stringCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Queue;

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
        Queue<Integer> numbers = stringCalculator.injectNumbers();
        assertEquals(2, numbers.size());
        assertEquals(1, numbers.poll());
        assertEquals(2, numbers.poll());
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

    @Test
    @DisplayName("정규식으로 연산자 추출")
    void injectOperatorTest() {
        StringCalculator stringCalculator = new StringCalculator("1+2");
        String s = stringCalculator.injectOperator();
        assertEquals("+", s);
    }

    @Test
    @DisplayName("정규식으로 숫자 추출")
    void injectNumberTest() {
        StringCalculator stringCalculator = new StringCalculator("1+2");
        Queue<Integer> numbers = stringCalculator.injectNumbers();
        assertEquals(1, numbers.poll());
        assertEquals(2, numbers.poll());
    }
}