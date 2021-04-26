package stock;

public class StockProfit {
    private int itemIndex;
    private int profit;

    public StockProfit(int itemIndex, int profit) {
        this.itemIndex = itemIndex;
        this.profit = profit;
    }

    public int getItemIndex() {
        return itemIndex;
    }

    public int getProfit() {
        return profit;
    }
}
