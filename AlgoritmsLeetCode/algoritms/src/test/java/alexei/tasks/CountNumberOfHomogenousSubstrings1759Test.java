package alexei.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountNumberOfHomogenousSubstrings1759Test {
    private final CountNumberOfHomogenousSubstrings1759 count = new CountNumberOfHomogenousSubstrings1759();

    @Test
    public void test1() {
        //given
        String input = "abbcccaa";
        int expected = 13;
        //when
        int actual = count.countHomogenous(input);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        String input = "xy";
        int expected = 2;
        //when
        int actual = count.countHomogenous(input);
        //then
        assertEquals(expected, actual);
    }
}