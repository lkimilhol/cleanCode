package stockKing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Stock {
    final private List<Integer> priceList;

    private List<Integer> prevPriceList;

    public Stock() {
        this.priceList = makeStockPrice();
    }

    public List<Integer> getPriceList() {
        return priceList;
    }

    public List<Integer> getPrevPriceList() {
        return prevPriceList;
    }

    protected List<Integer> makeStockPrice() {
        Random random = new Random();
         return IntStream.generate(() -> random.nextInt(Constant.STOCK_MAX_PRICE) + 1)
                .limit(Constant.STOCK_MAX_COUNT)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}
