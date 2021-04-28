package stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StockTest {

    @Test
    public void makeStockItemList() {
        Stock stock = new Stock();

        List<Integer> stockList = stock.getItemList();

        Assertions.assertEquals(100, stockList.size());
    }
}
