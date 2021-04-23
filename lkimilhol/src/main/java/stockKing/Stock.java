package stockKing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    public void selectStock(User user) {
        printStartMessage();
        int total = 0;
        List<Integer> selectedNumber = user.getStockList();
        for (int i : selectedNumber) {
            printStockNumber(i);
            printCurrentStock(i);
            printPrevStock(i);
            printDifferentStock(i);
            System.out.println();
            total += getDifferentStock(i);
            checkUserMoney(total, user.getMoney());
        }
        System.out.println("정과장님의 수익: " + total);
        selectGoodStock();
    }

    public List<Integer> getCurrentPriceList() {
        return currentPriceList;
    }

    private void printStartMessage() {
        System.out.println("정과장님의 보유 주식");
        System.out.println();
    }

    private void printStockNumber(int index) {
        System.out.println("주식 번호: \t" + index);
        System.out.println("===================");
    }

    private void printCurrentStock(int index) {
        System.out.print("현재 가격: \t");
        System.out.println(currentPriceList.get(index));
    }

    private void printPrevStock(int index) {
        System.out.print("지난 가격: \t");
        System.out.println(prevPriceList.get(index));
    }

    private void printDifferentStock(int index) {
        System.out.print("가격 차이: \t");
        System.out.println(differentPriceList.get(index));
    }

    private int getDifferentStock(int index) {
        return differentPriceList.get(index);
    }

    private void checkUserMoney(int total, int money) {
        if (total > money) {
            throw new IllegalStateException("정과장님의 지갑이 비었습니다");
        }
    }

    private void calculateDifferentPriceList() {
        for (int i = 0; i < Constant.STOCK_MAX_COUNT; i++) {
            differentPriceList.add(currentPriceList.get(i) - prevPriceList.get(i));
        }
    }

    private List<Integer> makeStockPrice() {
        Random random = new Random();
        return IntStream.generate(() -> random.nextInt(Constant.STOCK_MAX_PRICE) + 1)
                .limit(Constant.STOCK_MAX_COUNT)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    private void selectGoodStock() {
        Stream<Integer> sorted = differentPriceList.stream().sorted(Comparator.reverseOrder()).limit(Constant.SELECT_COUNT);
        sorted.forEach(i -> {
            System.out.print("주식 번호: \t");
            System.out.println(differentPriceList.indexOf(i));
        });
    }
}
