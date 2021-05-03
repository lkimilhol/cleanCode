package mineSweeper;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Mines {
	public static final int MINE_COUNT = 10;
	private final Set<Mine> mineSet;

	public Mines() {
		mineSet = new HashSet<>();
	}

	public void createMine() {
		while (mineSet.size() < MINE_COUNT) {
			Mine mine = new Mine(generateMineRandom(Common.WIDTH), generateMineRandom(Common.HEIGHT));
			addMine(mine);
		}
	}

	protected int generateMineRandom(int range) {
		Random random = new Random();
		return random.nextInt(range);
	}

	protected void addMine(Mine mine) {
		if (!isContain(mine)) {
			mineSet.add(mine);
		}
	}

	protected boolean isContain (Mine mine) {
		return mineSet.stream().anyMatch(addedMine -> equals(addedMine, mine));
	}

	private boolean equals(Mine addedMine, Mine newMine) {
		return addedMine.getWidth() == newMine.getWidth()
			&& addedMine.getHeight() == newMine.getHeight();
	}

	public int getMinesSize() {
		return mineSet.size();
	}
}
