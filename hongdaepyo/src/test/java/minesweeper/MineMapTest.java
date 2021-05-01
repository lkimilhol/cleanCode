package minesweeper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MineMapTest {
    private MineMap mineMap;

    @BeforeEach
    public void setUp() {
        mineMap = new MineMap(Constant.DEFAULT_WIDTH, Constant.DEFAULT_HEIGHT);
    }

    @Test
    public void getWidth() {
        Assertions.assertEquals(10, mineMap.getWidth());
    }

    @Test
    public void getHeight() {
        mineMap = new MineMap(10, 8);
        Assertions.assertEquals(8, mineMap.getHeight());
    }

    @Test
    public void mineGenerateAndGetMineList() {
        int count = 10;
        mineMap = new MineMap(10, 8);
        mineMap.mineGenerate(count);

        Assertions.assertFalse(mineMap.getMineList().isEmpty());
        Assertions.assertEquals(count, mineMap.getMineList().size());
    }

    @Test
    public void mineSetIntoMap() {
        int count = 10;
        mineMap = new MineMap(10, 8);
        mineMap.mineGenerate(count);

        Assertions.assertDoesNotThrow(mineMap::mineSetIntoMap);
    }

    @Test
    public void printMineMap() {
        int count = 10;
        mineMap = new MineMap(10, 8);
        mineMap.mineGenerate(count);

        Assertions.assertDoesNotThrow(mineMap::mineSetIntoMap);
        Assertions.assertDoesNotThrow(mineMap::printMineMap);
    }
}
