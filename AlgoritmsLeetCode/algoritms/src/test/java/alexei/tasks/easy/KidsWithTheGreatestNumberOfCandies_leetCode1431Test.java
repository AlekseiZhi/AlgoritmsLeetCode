package alexei.tasks.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class KidsWithTheGreatestNumberOfCandies_leetCode1431Test {
    private final KidsWithTheGreatestNumberOfCandies_leetCode1431 kids = new KidsWithTheGreatestNumberOfCandies_leetCode1431();

    @Test
    public void test1() {
        //given
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> expected = new ArrayList<>();
        List<Boolean> actual = new ArrayList<>();

        actual.add(true);
        actual.add(false);
        actual.add(false);
        actual.add(false);
        actual.add(false);
        //when
        expected = kids.kidsWithCandies(candies, extraCandies);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> expected = new ArrayList<>();
        List<Boolean> actual = new ArrayList<>();

        actual.add(true);
        actual.add(false);
        actual.add(false);
        actual.add(false);
        actual.add(false);
        //when
        expected = kids.kidsWithCandies(candies, extraCandies);
        //then
        assertEquals(expected, actual);
    }
}