package stockKing;

import com.sun.nio.sctp.SctpStandardSocketOptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {
    @Test
    @DisplayName("주식 생성 개수 테스트")
    void stockListCount() {
        Stock stock = new Stock();
        assertEquals(Constant.STOCK_MAX_COUNT, stock.getCurrentPriceList().size());
    }

    @Test
    @DisplayName("주식 가격 테스트")
    void stockListPrice() {
        Stock stock = new Stock();
        stock.getCurrentPriceList().forEach(i -> {
            assertTrue(i <= Constant.STOCK_MAX_PRICE);
            assertTrue(i > 0);
        });
    }

    @Test
    @DisplayName("주식을 구입 할 수 없는 경우")
    void selectInvalidStock() {
        Stock stock = new Stock();
        User user = new User(10);
        assertThrows(IllegalStateException.class, () -> stock.selectStock(user));
    }

    @Test
    @DisplayName("랜덤 값 생성 최대 값 비교")
    void generateRandMaxNumber() {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        assertTrue(number < 11);
    }

    @Test
    @DisplayName("랜덤 값 생성 최소 값 비교")
    void generateRandMinNumber() {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        assertTrue(number > 0);
    }

    @Test
    @DisplayName("주식 시작")
    void startStock() {
        Stock stock = new Stock();
        User user = new User(100000000);
        stock.selectStock(user);
        assertTrue(true);
    }

    @Test
    @DisplayName("선택 한 주식 개수")
    void checkUserStockCount() {
        User user = new User(100000000);
        assertEquals(Constant.SELECT_COUNT, user.getStockList().size());
    }

    @Test
    @DisplayName("스트림을 이용한 랜덤 값 생성")
    void generateRandStream() {
        Random random = new Random();
        List<Integer> list = IntStream.generate(() -> random.nextInt(Constant.STOCK_MAX_PRICE) + 1)
                .limit(Constant.STOCK_MAX_COUNT)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        assertEquals(Constant.STOCK_MAX_COUNT, list.size());
    }

    @Test
    @DisplayName("스트림을 이용한 랜덤 값 생성 - 최대 값 비교")
    void checkStreamRandMaxNumber() {
        Random random = new Random();
        List<Integer> list = IntStream.generate(() -> random.nextInt(Constant.STOCK_MAX_PRICE) + 1)
                .limit(Constant.STOCK_MAX_COUNT)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        list.forEach(i -> {
            assertTrue(i <= Constant.STOCK_MAX_PRICE);
        });
    }

    @Test
    @DisplayName("스트림을 이용한 랜덤 값 생성 - 최소 값 비교")
    void checkStreamRandMinNumber() {
        Random random = new Random();
        List<Integer> list = IntStream.generate(() -> random.nextInt(Constant.STOCK_MAX_PRICE) + 1)
                .limit(Constant.STOCK_MAX_COUNT)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        assertEquals(Constant.STOCK_MAX_COUNT, list.size());

        list.forEach(i -> {
            assertTrue(i > 0);
        });
    }
}