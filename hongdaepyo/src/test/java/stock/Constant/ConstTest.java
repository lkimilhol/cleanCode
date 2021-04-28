package stock.Constant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstTest {

    @Test
    public void StockListSizeTest() {
        Assertions.assertEquals(2, Const.STOCK_LIST_SIZE);
    }
}
