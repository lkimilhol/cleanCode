import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ApiUnitTest {
    @Test
    @DisplayName("특정 델리미터로 문자열을 문자 배열로")
    public void split() {
        String[] values = "1,2,3".split(",");
        Assertions.assertEquals(3, values.length);
        Assertions.assertEquals("1", values[0]);
        Assertions.assertEquals("2", values[1]);
        Assertions.assertEquals("3", values[2]);
    }

    @Test
    @DisplayName("문자열 자르기")
    public void substring() {
        String value = "1,2,3";
        String result = value.substring(1, value.length() - 1);
        Assertions.assertEquals(",2,", result);
    }

    @Test
    @DisplayName("리스트 추가 후 개수 체크")
    public void addList() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");

        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");

        list1.addAll(list2);

        Assertions.assertEquals(10, list1.size());
    }

    @Test
    @DisplayName("문자열 찾기")
    public void indexOf() {
        String s1 = "123";
        Assertions.assertEquals(0, s1.indexOf("1"));
    }

    @Test
    public void parseInt() {
        String s = "123";
        Assertions.assertEquals(123, Integer.parseInt(s));
    }
}
