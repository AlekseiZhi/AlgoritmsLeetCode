package alexei.tasks.easy;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RunningSumOf1dArray_leetCode1480Test {
    RunningSumOf1dArray_leetCode1480 sum = new RunningSumOf1dArray_leetCode1480();

    @Test
    public void test1() {
        //given
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};
        //when
        int[] actual = sum.runningSum(nums);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        int[] nums = {1, 1, 1, 1, 1};
        int[] expected = {1, 2, 3, 4, 5};
        //when
        int[] actual = sum.runningSum(nums);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        //given
        int[] nums = {3, 1, 2, 10, 1};
        int[] expected = {3, 4, 6, 16, 17};
        //when
        int[] actual = sum.runningSum(nums);
        //then
        assertArrayEquals(expected, actual);
    }
}