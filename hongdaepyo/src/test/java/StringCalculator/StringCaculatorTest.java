package StringCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCaculatorTest {
    private final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void plusTest() {
        Assertions.assertEquals(3, stringCalculator.calculate("1+2"));
    }

    @Test
    public void minusTest() {
        Assertions.assertEquals(1, stringCalculator.calculate("3-2"));
    }

    @Test
    public void multiplyTest() {
        Assertions.assertEquals(4, stringCalculator.calculate("2*2"));
    }

    @Test
    public void divideTest() {
        Assertions.assertEquals(3, stringCalculator.calculate("6/2"));
    }
}
