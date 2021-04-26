package stock;

import java.util.ArrayList;
import java.util.List;

public class StockProfitCalculator {
    private List<StockProfit> stockProfitList;
    private Player player = new Player(1_234_567_890);

    public StockProfitCalculator(long seedMoney) {
        setStockProfit();
    }

    public void setStockProfit() {
        Stock originalStock = player.getStockList().get(0);
        Stock newStock = player.getStockList().get(1);

        stockProfitList = stockProfitCalculate(originalStock, newStock);
    }

    private List<StockProfit> stockProfitCalculate(Stock originalStock, Stock newStock) {
        List<StockProfit> tempList = new ArrayList<>();

        List<Integer> originalItemList = originalStock.getItemList();
        List<Integer> newItemList = newStock.getItemList();

        for (int i = 0; i < originalItemList.size(); i++) {
            int originItem = originalItemList.get(i);
            int newItem = newItemList.get(i);

            tempList.add(new StockProfit(i, newItem - originItem));
        }

        return tempList;
    }

    public List<StockProfit> getStockProfitList() {
        return stockProfitList;
    }

    // 상위 랭크 수익을 얻어옴
    public void printStockTopRank(int rankNumber) {
//        stockProfitList.
    }
}
