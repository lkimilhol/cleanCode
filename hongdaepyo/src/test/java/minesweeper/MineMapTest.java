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
        Assertions.assertEquals(Constant.DEFAULT_WIDTH, mineMap.getWidth());
    }

    @Test
    public void getHeight() {
        Assertions.assertEquals(Constant.DEFAULT_HEIGHT, mineMap.getHeight());
    }

    @Test
    public void mineGenerateAndGetMineList() {
        mineMap = new MineMap(Constant.DEFAULT_WIDTH, Constant.DEFAULT_HEIGHT);
        mineMap.mineGenerate(Constant.DEFAULT_MINE_COUNT);

        Assertions.assertFalse(mineMap.getMineList().isEmpty());
        Assertions.assertEquals(Constant.DEFAULT_MINE_COUNT, mineMap.getMineList().size());
    }

    @Test
    public void mineSetIntoMap() {
        mineMap = new MineMap(Constant.DEFAULT_WIDTH, Constant.DEFAULT_HEIGHT);
        mineMap.mineGenerate(Constant.DEFAULT_MINE_COUNT);

        Assertions.assertDoesNotThrow(mineMap::mineSetIntoMap);
    }

    @Test
    public void printMineMap() {
        mineMap = new MineMap(Constant.DEFAULT_WIDTH, Constant.DEFAULT_HEIGHT);
        mineMap.mineGenerate(Constant.DEFAULT_MINE_COUNT);

        Assertions.assertDoesNotThrow(mineMap::mineSetIntoMap);
        Assertions.assertDoesNotThrow(mineMap::printMineMap);
    }
}
