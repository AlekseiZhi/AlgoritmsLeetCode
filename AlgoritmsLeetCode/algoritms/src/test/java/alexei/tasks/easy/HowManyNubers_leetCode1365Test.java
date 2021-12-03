package alexei.tasks.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class HowManyNubers_leetCode1365Test {
    private final HowManyNubers_leetCode1365 how = new HowManyNubers_leetCode1365();

    @Test
    public void test1() {
        //given
        int[] numbers = {8, 1, 2, 2, 3};
        int[] expected = {4, 0, 1, 1, 3};
        //when
        int[] actual = how.smallerNumberThanCurrent(numbers);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        int[] numbers = {6, 5, 4, 8};
        int[] expected = {2, 1, 0, 3};
        //when
        int[] actual = how.smallerNumberThanCurrent(numbers);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        //given
        int[] numbers = {7, 7, 7, 7};
        int[] expected = {0, 0, 0, 0};
        //when
        int[] actual = how.smallerNumberThanCurrent(numbers);
        //then
        assertArrayEquals(expected, actual);
    }

}