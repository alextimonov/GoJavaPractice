package ua.goit.timonov.practice.practice_2.task_02_1_addNumberBase36;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for CharIntConverterTest
 */
public class CharIntConverterTest {
    CharIntConverter converter = new CharIntConverter();
    public static final int RADIX = 36;

    @Test
    public void testCharRadixToIntNormal_1() {
        char ch = '0';
        int expected = 0;
        int actual = converter.charToInt(RADIX, ch);
        assertEquals(expected, actual);
    }

    @Test
    public void testCharRadixToIntNormal_2() {
        char ch = '9';
        int expected = 9;
        int actual = converter.charToInt(RADIX, ch);
        assertEquals(expected, actual);
    }

    @Test
    public void testCharRadixToIntNormal_3() {
        char ch = 'a';
        int expected = 10;
        int actual = converter.charToInt(RADIX, ch);
        assertEquals(expected, actual);
    }

    @Test
    public void testCharRadixToIntNormal_4() {
        char ch = 'z';
        int expected = 35;
        int actual = converter.charToInt(RADIX, ch);
        assertEquals(expected, actual);
    }

    @Test
    public void testCharRadixToIntNormal_5() {
        char ch = 'f';
        int expected = 15;
        int actual = converter.charToInt(RADIX, ch);
        assertEquals(expected, actual);
    }

    @Test
    public void testCharRadixToIntNormal_6() {
        char ch = 'f';
        int expected = 15;
        int actual = converter.charToInt(16, ch);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCharRadixToIntBorder_1() {
        char ch = 'A';
        converter.charToInt(RADIX, ch);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCharRadixToIntBorder_2() {
        char ch = 'Z';
        converter.charToInt(RADIX, ch);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCharRadixToIntBorder_3() {
        char ch = 'F';
        converter.charToInt(RADIX, ch);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCharRadixToIntAbnormal_1() {
        char ch = '+';
        converter.charToInt(RADIX, ch);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCharRadixToIntAbnormal_2() {
        char ch = '\\';
        converter.charToInt(RADIX, ch);
    }

    @Test
    public void testIntToCharRadixNormal_1() {
        int value = 0;
        char expected = '0';
        int actual = converter.intToChar(RADIX, value);
        assertEquals(expected, actual);
    }

    @Test
    public void testIntToCharRadixNormal_2() {
        int value = 9;
        char expected = '9';
        int actual = converter.intToChar(RADIX, value);
        assertEquals(expected, actual);
    }

    @Test
    public void testIntToCharRadixNormal_3() {
        int value = 10;
        char expected = 'a';
        int actual = converter.intToChar(RADIX, value);
        assertEquals(expected, actual);
    }

    @Test
    public void testIntToCharRadixNormal_4() {
        int value = 35;
        char expected = 'z';
        int actual = converter.intToChar(RADIX, value);
        assertEquals(expected, actual);
    }

    @Test
    public void testIntToCharRadixNormal_5() {
        int value = 15;
        char expected = 'f';
        int actual = converter.intToChar(RADIX, value);
        assertEquals(expected, actual);
    }

    @Test
    public void testIntToCharRadixNormal_6() {
        int value = 15;
        char expected = 'f';
        int actual = converter.intToChar(16, value);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIntToCharRadixAbnormal_1() {
        int value = -1;
        converter.intToChar(RADIX, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIntToCharRadixAbnormal_2() {
        int value = 36;
        converter.intToChar(RADIX, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIntToCharRadixAbnormal_3() {
        int value = 100;
        converter.intToChar(RADIX, value);
    }
}