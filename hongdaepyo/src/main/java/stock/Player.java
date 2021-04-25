package stock;

import stock.Constant.Const;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Player {
    private List<Stock> stockList;
    private long seedMoney;
    private String name;

    Player(long seedMoney) {
        this.seedMoney = seedMoney;
        this.stockList = getStockList();
    }

    private List<Stock> getStockList() {
        return Stream.generate(Stock::new)
                .limit(Const.STOCK_LIST_SIZE)
                .collect(Collectors.toList());
    }
}
