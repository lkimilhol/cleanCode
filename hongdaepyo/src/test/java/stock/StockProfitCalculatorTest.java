package stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StockProfitCalculatorTest {
    private StockProfitCalculator stockProfitCalculator = new StockProfitCalculator(1_234_567_890);

    @Test
    void getStockProfitList() {
        List<StockProfit> stockProfitList = stockProfitCalculator.getStockProfitList();

        Assertions.assertEquals(100, stockProfitList.size());
    }

    @Test
    void printStockTopRank() {
        stockProfitCalculator.printStockTopRank(50);
    }
}