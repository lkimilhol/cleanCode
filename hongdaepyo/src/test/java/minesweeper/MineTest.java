package minesweeper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertNotEquals(new Mine(), new Mine());
    }
}