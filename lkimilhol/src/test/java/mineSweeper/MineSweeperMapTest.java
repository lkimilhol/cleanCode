package mineSweeper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MineSweeperMapTest {
	MineSweeperMap mineSweeperMap;

	@BeforeEach
	void beforeEach() {
		mineSweeperMap = new MineSweeperMap();
	}

	@Test
	@DisplayName("맵 생성 후 사이즈 테스트")
	void createMap() {
	    //given
	    //when
		int[][] map = mineSweeperMap.getMap();
	    //then
		Assertions.assertEquals(MineSweeperMap.WIDTH, map.length);
		Assertions.assertEquals(MineSweeperMap.HEIGHT, map[0].length);
	}

	@Test
	@DisplayName("맵 생성 후 값이 0으로 초기화 되었는지")
	void checkMapValue() {
	    //given
	    //when
		int[][] map = mineSweeperMap.getMap();
	    //then
		Assertions.assertEquals(0, map[0][0]);
	}
}