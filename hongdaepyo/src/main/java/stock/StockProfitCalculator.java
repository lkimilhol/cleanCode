package stock;

import java.util.ArrayList;
import java.util.List;

public class StockProfitCalculator {
    private List<StockProfit> stockProfitList;
    private Player player;

    public StockProfitCalculator(long seedMoney) {
        this.player = new Player(seedMoney);
        setStockProfit();
    }

    private static int compare(StockProfit o1, StockProfit o2) {
        int num1 = o1.getProfit();
        int num2 = o2.getProfit();

        if (num2 > num1) {
            return 1;
        }
        if (num2 == num1) {
            return 0;
        }

        return -1;
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

    public Player getPlayer() {
        return player;
    }

    // 상위 랭크 수익을 얻어옴
    public void printStockTopRank(int rankNumber) {
        System.out.println(player.getName() + "의 추천 주식");
        stockProfitList.stream()
                .sorted(StockProfitCalculator::compare)
                .limit(rankNumber)
                .forEach(System.out::println);
    }
}
