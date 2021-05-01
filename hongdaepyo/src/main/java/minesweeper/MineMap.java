package minesweeper;

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
        mineList.forEach(mine -> map[mine.getRow()][mine.getCol()] = -1);

        mineList.forEach(mine -> {
            int row = mine.getRow();
            int col = mine.getCol();

            int[] dx = {0, 0, 1, -1};
            int[] dy = {1, -1, 0, 0};

            for (int i = 0; i < dx.length; i++) {
                int tempRow = row + dy[i];
                int tempCol = col + dx[i];

                if (tempRow >= 0 && tempRow < 8 && tempCol >= 0 && tempCol < 10) {
                    if (map[tempRow][tempCol] > -1) {
                        map[tempRow][tempCol]++;
                    }
                }
            }
        });
    }

    public void printMineMap() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (map[i][j] == -1) {
                    sb.append("M").append(" ");
                } else {
                    sb.append(map[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

}
