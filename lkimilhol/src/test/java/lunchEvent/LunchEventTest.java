package lunchEvent;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LunchEventTest {

    @Test
    @DisplayName("랜덤 추출한 회원의 수가 의도한 수인지 체크")
    void memberListCnt() {
        final int groupSize = 20;
        LunchEvent lunchEvent = new LunchEvent(groupSize);
        List<Member> group = lunchEvent.choiceLunchGroup();
        Assertions.assertEquals(groupSize, group.size());
    }

    @Test
    @DisplayName("식물학자 체크")
    void choiceBotanist() {
        final int groupSize = 4;
        LunchEvent lunchEvent = new LunchEvent(groupSize);
        assertFalse(lunchEvent.hasBotanist());
    }

    @Test
    @DisplayName("전체 인원이 1인 경우 식물 학자 체크")
    void selectMember() {
        final int groupSize = 1;
        LunchEvent lunchEvent = new LunchEvent(groupSize);
        assertFalse(lunchEvent.hasBotanist());
    }

    @Test
    @DisplayName("그룹 넘버 가져와보기")
    void getCurrentGroupCnt() {
        final int groupSize = 10;
        LunchEvent lunchEvent = new LunchEvent(groupSize);
        lunchEvent.choiceLunchGroup();
        assertEquals(3, lunchEvent.getCurrentGroupCnt());
    }

    @Test
    @DisplayName("잘못된 멤버 수")
    void checkMemberCnt() {
        final int groupSize = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> new LunchEvent(groupSize));
    }
}