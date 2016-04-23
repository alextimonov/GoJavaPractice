package ua.goit.timonov.practice.task_01_2_sumDigits;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for class SumDigits
 */
public class SumDigitsTest {
    private SumDigits sumDigits = new SumDigits();

    @Test
    public void testSumNormal_1() {
        int input = 123;
        int expected = 6;
        int actual = sumDigits.sum(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumNormal_2() {
        int input = 96541;
        int expected = 25;
        int actual = sumDigits.sum(input);
        assertEquals(expected, actual);
    }


    @Test
    public void testSumNormal_3() {
        int input = -157;
        int expected = 13;
        int actual = sumDigits.sum(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumNormal_4() {
        int input = 5;
        int expected = 5;
        int actual = sumDigits.sum(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumBorder_1() {
        int input = 0;
        int expected = 0;
        int actual = sumDigits.sum(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumBorder_2() {
        int input = Integer.MAX_VALUE;
        int expected = 46;
        int actual = sumDigits.sum(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumBorder_3() {
        int input = Integer.MIN_VALUE;
        int expected = 47;
        int actual = sumDigits.sum(input);
        assertEquals(expected, actual);
    }
}