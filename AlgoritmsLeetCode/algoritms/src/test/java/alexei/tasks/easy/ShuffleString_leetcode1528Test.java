package alexei.tasks.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ShuffleString_leetcode1528Test {
    private final ShuffleString_leetcode1528 shuffle = new ShuffleString_leetcode1528();

    @Test
    public void test1() {
        //given
        String stringInput = "codeleet";
        int[] arrayInput = {4, 5, 6, 7, 0, 2, 1, 3};
        String expected = "leetcode";
        //when
        String actual = shuffle.restoreString(stringInput, arrayInput);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        String stringInput = "abc";
        int[] arrayInput = {0, 1, 2};
        String expected = "abc";
        //when
        String actual = shuffle.restoreString(stringInput, arrayInput);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        //given
        String stringInput = "aiohn";
        int[] arrayInput = {3, 1, 4, 2, 0};
        String expected = "nihao";
        //when
        String actual = shuffle.restoreString(stringInput, arrayInput);
        //then
        Assertions.assertEquals(expected, actual);
    }
}