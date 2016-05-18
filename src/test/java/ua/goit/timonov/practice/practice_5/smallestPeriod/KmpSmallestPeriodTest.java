package ua.goit.timonov.practice.practice_5.smallestPeriod;

import org.junit.Test;
import ua.goit.timonov.practice.practice_5.KmpSmallestPeriod;

import static org.junit.Assert.*;

/**
 * Testing class for KmpSmallestPeriod
 */
public class KmpSmallestPeriodTest {
    KmpSmallestPeriod kmp = new KmpSmallestPeriod();

    @Test
    public void testFindSmalletstPeriodNormal_1() {
        String input = "abcabcabcabc";
        String expected = "abc";
        String actual = kmp.findSmalletstPeriod(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindSmalletstPeriodNormal_2() {
        String input = "meoumeoumeou";
        String expected = "meou";
        String actual = kmp.findSmalletstPeriod(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindSmalletstPeriodNormal_3() {
        String input = "There's two repetition.There's two repetition.";
        String expected = "There's two repetition.";
        String actual = kmp.findSmalletstPeriod(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindSmalletstPeriodNormal_4() {
        String input = "qweqweqweqweqw";
        String expected = "qweqweqweqweqw";
        String actual = kmp.findSmalletstPeriod(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindSmalletstPeriodBorder_1() {
        String input = "There's no repetition";
        String expected = "There's no repetition";
        String actual = kmp.findSmalletstPeriod(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindSmalletstPeriodBorder_2() {
        String input = "qqqqqq";
        String expected = "q";
        String actual = kmp.findSmalletstPeriod(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindSmalletstPeriodAbnormal_1() {
        String input = "";
        String expected = "";
        String actual = kmp.findSmalletstPeriod(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindSmalletstPeriodAbnormal_2() {
        String input = null;
        String expected = null;
        String actual = kmp.findSmalletstPeriod(input);
        assertEquals(expected, actual);
    }
}