package alexei.tasks.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RichestCustomerWealth_leetCode1672Test {
  private final   RichestCustomerWealth_leetCode1672 rich = new RichestCustomerWealth_leetCode1672();

    @Test
    public void test1() {
        //given
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        int expected = 6;
        //when
        int actual = rich.maximumWealth(accounts);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        int expected = 10;
        //when
        int actual = rich.maximumWealth(accounts);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        //given
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int expected = 17;
        //when
        int actual = rich.maximumWealth(accounts);
        //then
        assertEquals(expected, actual);
    }
}