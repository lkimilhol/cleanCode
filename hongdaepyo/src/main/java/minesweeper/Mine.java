package minesweeper;

import java.security.SecureRandom;

public class Mine {
    private static final SecureRandom random = new SecureRandom();

    private int row;
    private int col;

    public Mine() {
        this.row = Math.abs(random.nextInt(8));
        this.col = Math.abs(random.nextInt(10));
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public boolean equals(Object obj) {
        Mine otherMine = (Mine) obj;

        if (this.getCol() == otherMine.getCol()) {
            return true;
        }

        if (this.getRow() == otherMine.getRow()) {
            return true;
        }

        return false;
    }
}
