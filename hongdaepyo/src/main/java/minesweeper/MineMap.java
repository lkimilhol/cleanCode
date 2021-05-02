package minesweeper;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MineMap {

    private int width;
    private int height;
    private int[][] map;
    private Set<Mine> mineList;

    public MineMap(int width, int height) {
        this.width = width;
        this.height = height;
        this.map = new int[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void mineGenerate(int count) {
        mineList = new HashSet<>();
        while (mineList.size() < count) {
            this.mineList.add(new Mine());
        }
    }

    public Set<Mine> getMineList() {
        return mineList;
    }

    public void mineSetIntoMap() {
        /* 지뢰가 있는 셀을 -1로 세팅 */
        mineList.forEach(mine -> map[mine.getRow()][mine.getCol()] = -1);

        /* 지뢰 주위 셀의 숫자를 증가시킴 */
        mineList.forEach(mine -> {
            int row = mine.getRow();
            int col = mine.getCol();

            increaseNumberAroundMine(row, col);
        });
    }

    public void printMineMap() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                appendCellText(builder, i, j);
            }
            builder.append(Constant.NEW_LINE);
        }

        System.out.println(builder);
    }

    private void appendCellText(StringBuilder builder, int row, int col) {
        if (isNotMineCell(row, col)) {
            builder.append(map[row][col]).append(Constant.A_SPACE);
        }

        if (isMineCell(row, col)){
            builder.append(Constant.MINE_SYMBOL).append(Constant.A_SPACE);
        }
    }

    private boolean isNotMapBoundary(int row, int col) {
        return row >= 0 && row < height && col >= 0 && col < width;
    }

    private boolean isMineCell(int row, int col) {
        return map[row][col] == -1;
    }

    private boolean isNotMineCell(int row, int col) {
        return map[row][col] > -1;
    }

    private void increaseNumberAroundMine(int row, int col) {
        Arrays.stream(Direction.values()).forEach(direction -> {
            int tempRow = row + direction.row;
            int tempCol = col + direction.col;

            if (isNotMapBoundary(tempRow, tempCol) && isNotMineCell(tempRow, tempCol)) {
                map[tempRow][tempCol]++;
            }
        });
    }
}
