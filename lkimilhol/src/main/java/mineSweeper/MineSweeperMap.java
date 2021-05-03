package mineSweeper;

public class MineSweeperMap {
	private int[][] map;

	public MineSweeperMap() {
		map = new int[Common.WIDTH][Common.HEIGHT];
	}

	public int[][] getMap() {
		return map;
	}
}
