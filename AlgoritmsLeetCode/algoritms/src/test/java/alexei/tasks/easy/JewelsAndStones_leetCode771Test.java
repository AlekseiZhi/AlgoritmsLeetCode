package alexei.tasks.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class JewelsAndStones_leetCode771Test {
    private final JewelsAndStones_leetCode771 jewelsAndStones = new JewelsAndStones_leetCode771();

    @Test
    public void test1() {
        //given
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        //when
        int actual = jewelsAndStones.numJewelsInStones(jewels, stones);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        String jewels = "z";
        String stones = "ZZ";
        int expected = 0;
        //when
        int actual = jewelsAndStones.numJewelsInStones(jewels, stones);
        //then
        assertEquals(expected, actual);
    }
}