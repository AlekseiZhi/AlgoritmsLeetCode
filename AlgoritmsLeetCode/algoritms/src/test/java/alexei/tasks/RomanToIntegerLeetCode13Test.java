package alexei.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerLeetCode13Test {

    private final RomanToInteger_leetCode13 romanToIntegerLeetCode13 = new RomanToInteger_leetCode13();

    @Test
    public void test1() {
        //given
        String str = "III";
        int expected = 3;
        //when
        int actual = romanToIntegerLeetCode13.romanToInt(str);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        String str = "IV";
        int expected = 4;
        //when
        int actual = romanToIntegerLeetCode13.romanToInt(str);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        //given
        String str = "IX";
        int expected = 9;
        //when
        int actual = romanToIntegerLeetCode13.romanToInt(str);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        //given
        String str = "LVIII";
        int expected = 58;
        //when
        int actual = romanToIntegerLeetCode13.romanToInt(str);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        //given
        String str = "MCMXCIV";
        int expected = 1994;
        //when
        int actual = romanToIntegerLeetCode13.romanToInt(str);
        //then
        assertEquals(expected, actual);
    }
}