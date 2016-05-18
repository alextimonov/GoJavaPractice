package ua.goit.timonov.practice.practice_4.doubles;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for Doubles
 */
public class DoublesTest {
    public static final double DELTA = 1E-6;
    Doubles doubles = new Doubles();

    @Test
    public void testParseNormal_1() {
        String input = "153";
        Double expected = 153d;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testParseNormal_2() {
        String input = "-4E-7";
        Double expected = -0.0000004;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testParseNormal_4() {
        String input = "314159E-5";
        Double expected = 314159E-5;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testParseNormal_5() {
        String input = "2.721E-3d";
        Double expected = 2.721E-3;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testParseNormal_6() {
        String input = "6.022E10";
        Double expected = 6.022E10;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testParseNormal_7() {
        String input = "314159E-5";
        Double expected = 3.14159;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testParseNormal_8() {
        String input = "-2.3";
        Double expected = -2.3;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testParseBorder_1() {
        String input = ".25";
        Double expected = 0.25;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testParseBorder_2() {
        String input = "-2.e10";
        Double expected = -2E10;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testParseBorder_3() {
        String input = "+.35";
        Double expected = 0.35;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testParseAbnormal_1() {
        String input = "2.721E-3d23";
        Double expected = null;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testParseAbnormal_2() {
        String input = "-";
        Double expected = null;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testParseAbnormal_3() {
        String input = "+";
        Double expected = null;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testParseAbnormal_4() {
        String input = "23q34";
        Double expected = null;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testParseAbnormal_5() {
        String input = "Fx123";
        Double expected = null;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testParseAbnormal_6() {
        String input = "-2.35we";
        Double expected = null;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testParseAbnormal_7() {
        String input = "7.23]44";
        Double expected = null;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testParseAbnormal_8() {
        String input = "-.";
        Double expected = null;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testParseBorder_4() {
        String input = "-0.";
        Double expected = 0.0;
        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }
}