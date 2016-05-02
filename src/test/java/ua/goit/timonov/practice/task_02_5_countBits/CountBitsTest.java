package ua.goit.timonov.practice.task_02_5_countBits;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for CountBits
 */
public class CountBitsTest {
    CountBits countBits = new CountBits();

    @Test
    public void testCountNormal_1() {
        int num = 13;
        int expected = 3;
        int actual = countBits.count(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_2() {
        int num = 255;
        int expected = 8;
        int actual = countBits.count(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_3() {
        int num = 0b10101;
        int expected = 3;
        int actual = countBits.count(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_4() {
        int num = -5;
        int expected = 31;
        int actual = countBits.count(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_5() {
        int num = -15;
        int expected = 29;
        int actual = countBits.count(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_6() {
        int num = 0b11010110;
        int expected = 5;
        int actual = countBits.count(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountBorder_1() {
        int num = 0;
        int expected = 0;
        int actual = countBits.count(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountBorder_2() {
        int num = Integer.MAX_VALUE;
        int expected = 31;
        int actual = countBits.count(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountBorder_3() {
        int num = Integer.MIN_VALUE + 1;
        int expected = 2;
        int actual = countBits.count(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountBorder_4() {
        int num = Integer.MIN_VALUE;
        int expected = 1;
        int actual = countBits.count(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountBorder_5() {
        int num = -2_147_483_647;
        int expected = 2;
        int actual = countBits.count(num);
        assertEquals(expected, actual);
    }
}