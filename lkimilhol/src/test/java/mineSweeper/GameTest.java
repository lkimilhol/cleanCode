package mineSweeper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GameTest {
	Game game;

	@BeforeEach
	void beforeEach() {
		game = new Game();
	}

	@Test
	@DisplayName("맵 생성 후 사이즈 테스트")
	void createMap() {
	    //given
	    //when
		int[][] map = game.getMap();
	    //then
		Assertions.assertEquals(Common.WIDTH, map.length);
		Assertions.assertEquals(Common.HEIGHT, map[0].length);
	}

	@Test
	@DisplayName("맵 생성 후 값이 0으로 초기화 되었는지")
	void checkMapValue() {
	    //given
	    //when
		int[][] map = game.getMap();
	    //then
		Assertions.assertEquals(0, map[0][0]);
	}

	@Test
	@DisplayName("지뢰 주변의 값을 1씩 증가시키는 로직")
	void progressMine() {
		//given
		//when
		game.generateAnswer();
		//then
	}
}