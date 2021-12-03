package alexei.tasks.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShuffleTheArray_leetCode1470Test {
    private final ShuffleTheArray_leetCode1470 shuffle = new ShuffleTheArray_leetCode1470();

    @Test
    public void test1() {
        //given
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] expected = {2, 3, 5, 4, 1, 7};
        //when
        int[] actual = shuffle.shuffle(nums, n);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] expected = {1, 4, 2, 3, 3, 2, 4, 1};
        //when
        int[] actual = shuffle.shuffle(nums, n);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        //given
        int[] nums = {1, 1, 2, 2};
        int n = 2;
        int[] expected = {1, 2, 1, 2};
        //when
        int[] actual = shuffle.shuffle(nums, n);
        //then
        assertArrayEquals(expected, actual);
    }
}