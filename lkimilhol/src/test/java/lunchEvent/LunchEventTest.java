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
        assertTrue(lunchEvent.isBotanist());
    }
}