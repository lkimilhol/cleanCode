package stockKing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {
    @Test
    @DisplayName("주식 생성 개수 테스트")
    void stockListCount() {
        Stock stock = new Stock();
        Assertions.assertEquals(Constant.STOCK_MAX_COUNT, stock.getPriceList().size());
    }

    @Test
    @DisplayName("주식 가격 테스트")
    void stockListPrice() {
        Stock stock = new Stock();
        stock.getPriceList().forEach(i -> {
            Assertions.assertTrue(i <= Constant.STOCK_MAX_PRICE);
            Assertions.assertTrue(i > 0);
        });
    }
}