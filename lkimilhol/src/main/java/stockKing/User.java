package stockKing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {
    private final int money;
    private final List<Integer> stockList;

    public User(int money) {
        this.money = money;
        stockList = new ArrayList<>();
        selectStockList();
    }

    public int getMoney() {
        return money;
    }

    public List<Integer> getStockList() {
        return stockList;
    }

    private void selectStockList() {
        while (stockList.size() < Constant.SELECT_COUNT) {
            addNumber();
        }
    }

    private void addNumber() {
        Random random = new Random();
        int number = random.nextInt(Constant.STOCK_MAX_COUNT - 1) + 1;
        if (!stockList.contains(number)) {
            stockList.add(number);
        }
    }
}
