package mineSweeper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class MinesTest {
	Mines mines;

	@BeforeEach
	void beforeEach() {
		mines = new Mines();
	}

	@Test
	@DisplayName("마인 생성 개수 체크")
	void createMine() {
	    //given
	    //when
		mines.createMine();
	    //then
		assertEquals(Mines.MINE_COUNT, mines.getMinesSize());
	}

	@RepeatedTest(50)
	@DisplayName("랜덤 발생 - WIDTH")
	void createWidth() {
	    //given
	    //when
		int width = mines.generateMineRandom(Common.WIDTH);
	    //then
		assertTrue(width < Common.WIDTH);
		assertFalse(width < 0);
	}

	@RepeatedTest(50)
	@DisplayName("랜덤 발생 - HEIGHT")
	void createHeight() {
		//given
		//when
		int height = mines.generateMineRandom(Common.HEIGHT);
		//then
		assertTrue(height < Common.HEIGHT);
		assertFalse(height < 0);
	}

	@Test
	@DisplayName("중복 값 찾기")
	void findDuplicate() {
	    //given
		Mine mine1 = new Mine(1, 1);
		Mine mine2 = new Mine(1, 1);
	    //when
		mines.addMine(mine1);
	    //then
		assertTrue(mines.isContain(mine2));
	}
}