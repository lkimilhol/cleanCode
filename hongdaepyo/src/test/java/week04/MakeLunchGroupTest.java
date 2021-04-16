package week04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MakeLunchGroupTest {

    @Test
    public void getMemberMaxCountTest() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new MakeLunchGroup(31);
        });

        String expectedMessage = "직원 수는 30명 이하여야 합니다.";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getMemberMinCountTest() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new MakeLunchGroup(-1);
        });

        String expectedMessage = "직원 수는 1명 이상이어야 합니다.";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void shuffleMemberListTest() {
        int memberCount = 28;

        MakeLunchGroup makeLunchGroup = new MakeLunchGroup(memberCount);
        List<String> firstShuffleMemberList = makeLunchGroup.shuffleMemberList();
        List<String> secondShuffleMemberList = makeLunchGroup.shuffleMemberList();

        boolean result = Arrays.equals(firstShuffleMemberList.toArray(), secondShuffleMemberList.toArray());
        Assertions.assertFalse(result);
    }

    @Test
    public void groupCountTest() {
        int input = 21;
        MakeLunchGroup makeLunchGroup = new MakeLunchGroup(input);

        Assertions.assertAll(() -> {
            Assertions.assertEquals(5, makeLunchGroup.getGroupCount());
            Assertions.assertEquals(1, makeLunchGroup.getGardeningMemberCount());
        });
    }

    @Test
    public void printGroup() {
        MakeLunchGroup makeLunchGroup = new MakeLunchGroup(21);
        makeLunchGroup.printGroup();
    }
}
