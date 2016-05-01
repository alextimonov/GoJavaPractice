package ua.goit.timonov.practice.practice_1.task_01_3_firstOddNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for FirstOddNumber
 */
public class FirstOddNumberTest {
    FirstOddNumber firstOddNumber = new FirstOddNumberValidator(new FirstOddNumber());

    @Test
    public void testFindNormal_1() {
        int[] array = {2, 3, 4, 5};
        int expected = 1;
        int actual = firstOddNumber.find(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindNormal_2() {
        int[] array = {4, 8, 10, 12, 5};
        int expected = 4;
        int actual = firstOddNumber.find(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindNormal_3() {
        int[] array = {1, 3, 5, 7};
        int expected = 0;
        int actual = firstOddNumber.find(array);
        assertEquals(expected, actual);
    }



    @Test
    public void testFindNormal_4() {
        int[] array = {-2, -6, -3, 0, -4};
        int expected = 2;
        int actual = firstOddNumber.find(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBorder_1() {
        int[] array = {2, 4, 6, 8, 10};
        int expected = -1;
        int actual = firstOddNumber.find(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBorder_2() {
        int[] array = {-10, -4, -6, -8};
        int expected = -1;
        int actual = firstOddNumber.find(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBorder_3() {
        int[] array = {5};
        int expected = 0;
        int actual = firstOddNumber.find(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBorder_4() {
        int[] array = {-8};
        int expected = -1;
        int actual = firstOddNumber.find(array);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAbnormal_1() {
        int[] array = {};
        firstOddNumber.find(array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAbnormal_2() {
        int[] array = null;
        firstOddNumber.find(array);
    }
}