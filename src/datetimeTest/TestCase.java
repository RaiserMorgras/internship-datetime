package datetimeTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void testCase1() {
        String date = "02 05 2020";
        String expected = "WEDNESDAY";
        String actualResult = DateDayParser.getDay(date);
        assertEquals(expected, actualResult);
    }

    @Test
    public void testCase2() {
        String date = "02 05 2019";
        String expected = "TUESDAY";
        String actualResult = DateDayParser.getDay(date);
        assertEquals(expected, actualResult);
    }
}
