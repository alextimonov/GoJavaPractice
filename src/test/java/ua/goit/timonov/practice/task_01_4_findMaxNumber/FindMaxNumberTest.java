package ua.goit.timonov.practice.task_01_4_findMaxNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for FindMaxNumber
 */
public class FindMaxNumberTest {
    FindMaxNumber findMaxNumber = new FindMaxNumber();

    @Test
    public void testMaxNormal_1() throws Exception {
        int[] array = {3, 5, 2, 9, 5, 6};
        int expected = 9;
        int actual = findMaxNumber.max(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxNormal_2() throws Exception {
        int[] array = {2, 5, 7, 3, 7, 6};
        int expected = 7;
        int actual = findMaxNumber.max(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxNormal_3() throws Exception {
        int[] array = {3, 5, 2, 9, 5, 6};
        int expected = 9;
        int actual = findMaxNumber.max(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxNormal_4() throws Exception {
        int[] array = {3, 5, 2, 9, 5, 6};
        int expected = 9;
        int actual = findMaxNumber.max(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxNormal_5() throws Exception {
        int[] array = {-7, -5, -3, -8, -10};
        int expected = -3;
        int actual = findMaxNumber.max(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxBorder_1() throws Exception {
        int[] array = {1, 2, 3, 4, 5, 6};
        int expected = 6;
        int actual = findMaxNumber.max(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxBorder_2() throws Exception {
        int[] array = {5, 4, 3, 2, 1, 0};
        int expected = 5;
        int actual = findMaxNumber.max(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxBorder_3() throws Exception {
        int[] array = {0, 0, 0, 0, 0};
        int expected = 0;
        int actual = findMaxNumber.max(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxBorder_4() throws Exception {
        int[] array = {0, -1000, 1100, Integer.MAX_VALUE, Integer.MIN_VALUE};
        int expected = Integer.MAX_VALUE;
        int actual = findMaxNumber.max(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxBorder_5() throws Exception {
        int[] array = {Integer.MIN_VALUE};
        int expected = Integer.MIN_VALUE;
        int actual = findMaxNumber.max(array);
        assertEquals(expected, actual);
    }
}