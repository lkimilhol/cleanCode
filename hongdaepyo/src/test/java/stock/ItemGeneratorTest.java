package stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class ItemGeneratorTest {

    @Test
    public void itemGeneratorTest() {
        ItemGenerator itemGenerator = new ItemGenerator();
        List<Integer> randomNumberList = itemGenerator.getRandomNumberList();

        Assertions.assertEquals(100, randomNumberList.size());

        int minNumber = randomNumberList.stream().min(Comparator.comparingInt(o -> o)).get();
        Assertions.assertTrue(minNumber > 0);
    }
}
