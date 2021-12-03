package alexei.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerToRoman_leetCode12Test {
    private final IntegerToRoman_leetCOde12 integerToRomanLeetCOde12 = new IntegerToRoman_leetCOde12();

    @Test
    public void test1() {
        //given
        int num = 3;
        String expected = "III";
        //when
        String actual = integerToRomanLeetCOde12.intToRoman(num);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        int num = 4;
        String expected = "IV";
        //when
        String actual = integerToRomanLeetCOde12.intToRoman(num);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        //given
        int num = 9;
        String expected = "IX";
        //when
        String actual = integerToRomanLeetCOde12.intToRoman(num);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        //given
        int num = 58;
        String expected = "LVIII";
        //when
        String actual = integerToRomanLeetCOde12.intToRoman(num);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        //given
        int num = 1994;
        String expected = "MCMXCIV";
        //when
        String actual = integerToRomanLeetCOde12.intToRoman(num);
        //then
        assertEquals(expected, actual);
    }
}