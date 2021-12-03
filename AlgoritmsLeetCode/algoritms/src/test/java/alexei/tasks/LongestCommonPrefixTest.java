package alexei.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void test1() {
        //given
        String[] str = {"flower", "flow", "flight"};
        String expected = "fl";
        //when
        String actual = longestCommonPrefix.longestCommonPrefix(str);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        String[] str = {"dog", "racecar", "car"};
        String expected = "";
        //when
        String actual = longestCommonPrefix.longestCommonPrefix(str);
        //then
        assertEquals(expected, actual);
    }
}