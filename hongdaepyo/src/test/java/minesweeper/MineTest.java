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
        Assertions.assertTrue(mine.getRow() < 8);
    }

    @Test
    public void getCol() {
        Mine mine = new Mine();

        Assertions.assertTrue(mine.getCol() >= 0);
        Assertions.assertTrue(mine.getCol() < 10);
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
    }
}