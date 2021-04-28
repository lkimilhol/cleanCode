package stock;

import stock.Constant.Const;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Player {
    private List<Stock> stockList;
    private long seedMoney;
    private String name = "정과장";

    public Player(long seedMoney) {
        this.seedMoney = seedMoney;
        setStockList();
    }

    public Player(long seedMoney, String name) {
        this.seedMoney = seedMoney;
        setStockList();
        this.name = name;
    }

    private void setStockList() {
        this.stockList = Stream.generate(Stock::new)
                .limit(Const.STOCK_LIST_SIZE)
                .collect(Collectors.toList());
    }

    public List<Stock> getStockList() {
        return stockList;
    }

    public long getSeedMoney() {
        return seedMoney;
    }

    public String getName() {
        return name;
    }
}
