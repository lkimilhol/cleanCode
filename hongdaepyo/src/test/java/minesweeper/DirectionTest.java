package minesweeper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DirectionTest {
    @Test
    public void getDirection() {
        Assertions.assertEquals(8, Direction.values().length);
        Assertions.assertEquals(1, Direction.UP.row);
        Assertions.assertEquals(-1, Direction.DOWN.row);
        Assertions.assertEquals(1, Direction.RIGHT.col);
        Assertions.assertEquals(-1, Direction.LEFT.col);
    }
}