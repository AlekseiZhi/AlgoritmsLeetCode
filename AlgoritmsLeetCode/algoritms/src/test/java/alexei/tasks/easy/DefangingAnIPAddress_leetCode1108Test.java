package alexei.tasks.easy;

import junit.framework.TestCase;
import org.junit.Test;

public class DefangingAnIPAddress_leetCode1108Test extends TestCase {
    private final DefangingAnIPAddress_leetCode1108 code1108 = new DefangingAnIPAddress_leetCode1108();

    @Test
    public void test1() {
        //given
        String str = "1.1.1.1";
        String expected = "1[.]1[.]1[.]1";
        //when
        String actual = code1108.iPAddress(str);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        String str = "255.100.50.0";
        String expected = "255[.]100[.]50[.]0";
        //when
        String actual = code1108.iPAddress(str);
        //then
        assertEquals(expected, actual);
    }
}