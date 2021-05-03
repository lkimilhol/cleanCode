package mineSweeper;

public class Game {
	private int[][] map;
	private Mines mines;

	public Game() {
		map = new int[Common.WIDTH][Common.HEIGHT];
		mines = new Mines();
	}

	public void progress() {
		mines.createMine();
		generateAnswer();
	}

	public int[][] getMap() {
		return map;
	}

	public void generateAnswer() {
		mines.getMineSet().forEach(this::increaseMineRound);
	}

	private void increaseMineRound(Mine mine) {
		increaseMineRound(mine.getWidth() - 1, mine.getHeight() - 1);
		increaseMineRound(mine.getWidth(), mine.getHeight() - 1);
		increaseMineRound(mine.getWidth() + 1, mine.getHeight() - 1);
		increaseMineRound(mine.getWidth() + 1, mine.getHeight());
		increaseMineRound(mine.getWidth() + 1, mine.getHeight() + 1);
		increaseMineRound(mine.getWidth(), mine.getHeight() + 1);
		increaseMineRound(mine.getWidth() - 1, mine.getHeight() + 1);
		increaseMineRound(mine.getWidth() - 1, mine.getHeight());
	}

	private void increaseMineRound(int width, int height) {
		if (isRange(width, height)) {
			increaseAnswer(width, height);
		}
	}

	private boolean isRange(int width, int height) {
		return width >= 0 && height >= 0 && width < Common.WIDTH && height < Common.HEIGHT;
	}

	private void increaseAnswer(int width, int height) {
		map[width][height]++;
	}

	public void printAnswer() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int[] height : map) {
			for (int value : height) {
				stringBuilder.append(value);
				stringBuilder.append("\t");
			}
			stringBuilder.append("\n");
		}
		System.out.println(stringBuilder);
	}
}
