package minesweeper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class MineTest {
    @Test
    public void createMine() {
        Mine mine = new Mine();

        Assertions.assertNotNull(mine);
    }

    @Test
    public void getRow() {
        Mine mine = new Mine();

        Assertions.assertTrue(mine.getRow() >= 0);
        Assertions.assertTrue(mine.getRow() < Constant.DEFAULT_HEIGHT);
    }

    @Test
    public void getCol() {
        Mine mine = new Mine();

        Assertions.assertTrue(mine.getCol() >= 0);
        Assertions.assertTrue(mine.getCol() < Constant.DEFAULT_WIDTH);
    }

    @Test
    public void equals() {
        Assertions.assertEquals(new Mine(3, 3), new Mine(3, 3));
        Assertions.assertNotEquals(new Mine(6, 3), new Mine(5, 5));
        Assertions.assertTrue(new Mine(5, 3).equals(new Mine(5, 5)));

        Set<Mine> mineSet = new HashSet<>();
        mineSet.add(new Mine(1, 1));
        mineSet.add(new Mine(1, 1));

        Assertions.assertEquals(1, mineSet.size());

        mineSet.add(new Mine(1, 10));
        mineSet.add(new Mine(2, 0));

        Assertions.assertEquals(3, mineSet.size());
    }

    @Test
    public void hashCodeTest() {
        Mine mine1 = new Mine(3, 3);
        Mine mine2 = new Mine(3, 4);
        Mine mine3 = new Mine(3, 3);

        Assertions.assertNotEquals(mine1.hashCode(), mine2.hashCode());
        Assertions.assertEquals(mine1.hashCode(), mine3.hashCode());
    }
}