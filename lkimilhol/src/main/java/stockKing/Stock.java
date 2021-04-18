package stockKing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Stock {
    final private List<Integer> currentPriceList;
    final private List<Integer> prevPriceList;
    final private List<Integer> differentPriceList;

    public Stock() {
        this.currentPriceList = makeStockPrice();
        this.prevPriceList = makeStockPrice();
        this.differentPriceList = new ArrayList<>();
        calculateDifferentPriceList();
    }

    private void calculateDifferentPriceList() {
        for (int i = 0; i < Constant.STOCK_MAX_COUNT; i++) {
            differentPriceList.add(currentPriceList.get(i) - prevPriceList.get(i));
        }
    }

    public List<Integer> getCurrentPriceList() {
        return currentPriceList;
    }

    protected List<Integer> makeStockPrice() {
        Random random = new Random();
        return IntStream.generate(() -> random.nextInt(Constant.STOCK_MAX_PRICE) + 1)
                .limit(Constant.STOCK_MAX_COUNT)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}
