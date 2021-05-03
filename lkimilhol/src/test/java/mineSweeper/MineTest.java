package mineSweeper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MineTest {
	@Test
	@DisplayName("음수로 생성되는 경우 테스트")
	void checkNotPositive() {
	    //given
		int width = -1;
		int height = -1;
	    //when
		assertThrows(IllegalArgumentException.class, () -> new Mine(width, height));
	    //then
	}

	@Test
	@DisplayName("값이 너무 큰 경우")
	void checkInvalidRange() {
		//given
		int width = Common.WIDTH + 1;
		int height = Common.HEIGHT + 1;
		//when
		assertThrows(IllegalArgumentException.class, () -> new Mine(width, height));
		//then
	}
}