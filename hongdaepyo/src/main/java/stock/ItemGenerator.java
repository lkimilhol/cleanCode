package stock;

import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ItemGenerator {
    private static SecureRandom random = new SecureRandom();
    private List<Integer> randomNumberList;

    ItemGenerator() {
        randomNumberList = IntStream.generate(random::nextInt)
                .boxed()
                .limit(100)
                .collect(Collectors.toList());
    }

    public List<Integer> getRandomNumberList() {
        return randomNumberList;
    }
}
