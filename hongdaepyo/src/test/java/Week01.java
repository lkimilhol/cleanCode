import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Week01 {

    @Test
    public void split() {
        String input = "1,2,3";
        String[] output = input.split(",");

        Assertions.assertNotNull(output);
        Assertions.assertEquals(output.length, 3);
        Assertions.assertTrue(output[0].length() == 1);
    }

    @Test
    public void subString() {
        String input = "abcdefg";
        String output = input.substring(0, 3);

        Assertions.assertEquals(output.length(), 3);
    }

    @Test
    public void listTest() {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Assertions.assertEquals(list.size(), 4);
        Assertions.assertFalse(list.get(0) == 0);
    }

    @Test
    public void maxTest() {
        int input_1 = 55;
        int input_2 = 33;

        Assertions.assertEquals(Math.max(input_1, input_2), input_2);
    }

    @Test
    public void priorityQueueTest() {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.offer(3);
        queue.offer(5);
        queue.offer(-1);

        Assertions.assertEquals(queue.poll(), 5);
    }

    @Test
    public void stringCompareTest() {
        String input1 = "test";
        String input2 = "time";

        Assertions.assertTrue(input1.compareTo(input2) < 0);
    }

    @Test
    public void hashSetTest() {
        Set set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(1);

        Assertions.assertEquals(set1.size(), 3);
    }
}
