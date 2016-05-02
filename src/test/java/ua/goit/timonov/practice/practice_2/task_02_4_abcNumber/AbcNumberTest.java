package ua.goit.timonov.practice.practice_2.task_02_4_abcNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for AbcNumber
 */
public class AbcNumberTest {
    AbcNumber converter = new AbcNumberValidator(new AbcNumber());

    @Test
    public void testConvertNormal_1() {
        String num = "bcd";
        int expected = 123;
        int actual = converter.convert(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNormal_2() {
        String num = "abcdefghij";
        int expected = 123456789;
        int actual = converter.convert(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNormal_3() {
        String num = "faaf";
        int expected = 5005;
        int actual = converter.convert(num);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertBorder_2() {
        String num = "xyz";
        converter.convert(num);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertBorder_3() {
        String num = "ABC";
        converter.convert(num);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertAbnormal_1() {
        String num = null;
        converter.convert(num);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertAbnormal_2() {
        String num = "";
        int expected = 0;
        int actual = converter.convert(num);
        assertEquals(expected, actual);
    }
}