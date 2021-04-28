package stock;

import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Collectors;

public class ItemGenerator {
    private static SecureRandom random = new SecureRandom();
    private List<Integer> randomNumberList;

    ItemGenerator() {
        randomNumberList = random.ints()
                .boxed()
                .limit(100)
                .map(Math::abs)
                .collect(Collectors.toList());
    }

    public List<Integer> getRandomNumberList() {
        return randomNumberList;
    }
}
