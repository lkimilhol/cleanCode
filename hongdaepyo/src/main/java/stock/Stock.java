package stock;

import java.util.List;

public class Stock {

    private List<Integer> itemList;

    Stock() {
        makeStockItemList();
    }

    private void makeStockItemList() {
        ItemGenerator itemGenerator = new ItemGenerator();
        this.itemList = itemGenerator.getRandomNumberList();
    }

    public List<Integer> getItemList() {
        return itemList;
    }
}
