package ua.goit.timonov.practice.practice_3.task_03_2_longestStabilityPeriod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for LongestStabilityPeriod
 */
public class LongestStabilityPeriodTest {
    LongestStabilityPeriod longestPeriod = new LongestStabilityPeriod();

    @Test
    public void testCountNormal_1() {
        int[] gdp = {10, 9, 10, 11, 14, 15, 16, 18};
        int expected = 3;
        int actual = longestPeriod.count(gdp);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_2() {
        int[] gdp = {10, 9, 10, 14, 14, 15, 16, 16};
        int expected = 3;
        int actual = longestPeriod.count(gdp);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_3() {
        int[] gdp = {10, 9, 10, 14, 14, 15, 16, 16, 13, 14, 15, 15, 16, 15, 17};
        int expected = 4;
        int actual = longestPeriod.count(gdp);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_4() {
        int[] gdp = {10, 8, 6, 9, 12, 14};
        int expected = 1;
        int actual = longestPeriod.count(gdp);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_5() {
        int[] gdp = {900, 901, 902};
        int expected = 2;
        int actual = longestPeriod.count(gdp);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_6() {
        int[] gdp = {900, 900, 900, 901, 902, 902, 903, 903};
        int expected = 4;
        int actual = longestPeriod.count(gdp);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_7() {
        int[] gdp = {10, 9, 10, 11, 12};
        int expected = 3;
        int actual = longestPeriod.count(gdp);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountBorder_1() {
        int[] gdp = {10};
        int expected = 1;
        int actual = longestPeriod.count(gdp);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountBorder_2() {
        int[] gdp = {10, 11, 12, 11};
        int expected = 3;
        int actual = longestPeriod.count(gdp);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountAbnormal() {
        int[] gdp = {};
        int expected = 0;
        int actual = longestPeriod.count(gdp);
        assertEquals(expected, actual);
    }
}