package ua.goit.timonov.practice.practice_2.task_02_6_setZero;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for SetZero
 */
public class SetZeroTest {
    SetZero setZero = new SetZeroValidator(new SetZero());

    @Test
    public void testSetNormal_1() {
        int num = 6;
        int i = 2;
        int expected = 4;
        int actual = setZero.set(num, i);
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNormal_2() {
        int num = 0b10110;
        int i = 3;
        int expected = 0b10010;
        int actual = setZero.set(num, i);
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNormal_3() {
        int num = 15;
        int i = 4;
        int expected = 7;
        int actual = setZero.set(num, i);
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNormal_4() {
        int num = 0;
        int i = 5;
        int expected = 0;
        int actual = setZero.set(num, i);
        assertEquals(expected, actual);
    }

    @Test
    public void testSetBorder_1() {
        int num = 0xff;
        int i = 1;
        int expected = 0xfe;
        int actual = setZero.set(num, i);
        assertEquals(expected, actual);
    }

    @Test
    public void testSetBorder_2() {
        int num = 0xff;
        int i = 32;
        int expected = 0xff;
        int actual = setZero.set(num, i);
        assertEquals(expected, actual);
    }

    @Test
    public void testSetBorder_3() {
        int num = Integer.MIN_VALUE;
        int i = 32;
        int expected = 0;
        int actual = setZero.set(num, i);
        assertEquals(expected, actual);
    }

    @Test
    public void testSetBorder_4() {
        int num = Integer.MAX_VALUE;
        int i = 31;
        int expected = 0x3fffffff;
        int actual = setZero.set(num, i);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAbNormal_1() {
        int num = 0xff;
        int i = 0;
        setZero.set(num, i);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAbNormal_2() {
        int num = 0xff;
        int i = 33;
        setZero.set(num, i);
    }
}