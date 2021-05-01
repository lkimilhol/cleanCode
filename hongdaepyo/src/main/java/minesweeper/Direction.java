package minesweeper;

public enum Direction {
      UP(0, 1)
    , DOWN(0, -1)
    , LEFT(-1, 0)
    , RIGHT(1, 0)
    , UP_LEFT(-1, 1)
    , UP_RIGHT(1, 1)
    , DOWN_LEFT(-1, -1)
    , DOWN_RIGHT(1, -1)
    ;

    public int col;
    public int row;

    Direction(int col, int row) {
        this.col = col;
        this.row = row;
    }
}
