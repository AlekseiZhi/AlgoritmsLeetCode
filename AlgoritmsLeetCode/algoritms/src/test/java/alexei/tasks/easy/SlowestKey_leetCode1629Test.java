package alexei.tasks.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SlowestKey_leetCode1629Test {
    private final SlowestKey_leetCode1629 slowestKey_leetCode1629 = new SlowestKey_leetCode1629();

    @Test
    public void test1() {
        //given
        int[] releaseTimes = {9, 29, 49, 50};
        String keysPressed = "cbcd";
        String expected = "c";
        //when
        String actual = slowestKey_leetCode1629.slowestKey(releaseTimes, keysPressed);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        int[] releaseTimes = {12, 23, 36, 46, 62};
        String keysPressed = "spuda";
        String expected = "a";
        //when
        String actual = slowestKey_leetCode1629.slowestKey(releaseTimes, keysPressed);
        //then
        assertEquals(expected, actual);
    }
}