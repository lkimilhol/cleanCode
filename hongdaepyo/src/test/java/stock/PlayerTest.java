package stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stock.Player;

public class PlayerTest {

    @Test
    public void playerGenerateTest() {
        long seedMoney = 10_000_000_000L;

        Player player = new Player(seedMoney, "홍대리");

        Assertions.assertEquals(player.getSeedMoney(), seedMoney);
        Assertions.assertEquals(player.getName(), "홍대리");
        Assertions.assertNotNull(player.getStockList());
    }
}
