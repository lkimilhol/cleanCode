package mineSweeper;

public class MineSweeperMap {
	public static final int WIDTH = 10;
	public static final int HEIGHT = 8;

	private int[][] map;

	public MineSweeperMap() {
		map = new int[WIDTH][HEIGHT];
	}

	public int[][] getMap() {
		return map;
	}
}
