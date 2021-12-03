package alexei.tasks.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryPrefixDivisibleBy5_leetCode1018Test {
    private final BinaryPrefixDivisibleBy5_leetCode1018 object = new BinaryPrefixDivisibleBy5_leetCode1018();

    @Test
    public void test1() {
        //given
        int[] input = {0, 1, 1};
        List<Boolean> expected = new ArrayList<>();
        expected.add(true);
        expected.add(false);
        expected.add(false);
        //when
        List<Boolean> actual = object.prefixesDivBy5(input);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        int[] input = {1, 1, 1};
        List<Boolean> expected = new ArrayList<>();
        expected.add(false);
        expected.add(false);
        expected.add(false);
        //when
        List<Boolean> actual = object.prefixesDivBy5(input);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        //given
        int[] input = {0, 1, 1, 1, 1, 1};
        List<Boolean> expected = new ArrayList<>();
        expected.add(true);
        expected.add(false);
        expected.add(false);
        expected.add(false);
        expected.add(true);
        expected.add(false);
        //when
        List<Boolean> actual = object.prefixesDivBy5(input);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        //given
        int[] input = {1, 1, 1, 0, 1};
        List<Boolean> expected = new ArrayList<>();
        expected.add(false);
        expected.add(false);
        expected.add(false);
        expected.add(false);
        expected.add(false);
        //when
        List<Boolean> actual = object.prefixesDivBy5(input);
        //then
        assertEquals(expected, actual);
    }
}