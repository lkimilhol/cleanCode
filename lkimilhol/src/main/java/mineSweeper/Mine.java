package mineSweeper;

public class Mine {
	int width;
	int height;

	public Mine(int width, int height) {
		checkValidRange(width, height);
		this.width = width;
		this.height = height;
	}

	private void checkValidRange(int width, int height) {
		if (isInvalidRange(width, height)) {
			throw new IllegalArgumentException("좌표를 벗어났습니다.");
		}
	}

	private boolean isInvalidRange(int width, int height) {
		return width < 0 || height < 0 || width > Common.WIDTH || height > Common.HEIGHT;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
