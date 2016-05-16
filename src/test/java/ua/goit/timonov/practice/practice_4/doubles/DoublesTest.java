package ua.goit.timonov.practice.practice_4.doubles;

import org.junit.Test;
import sun.security.x509.DeltaCRLIndicatorExtension;

import static org.junit.Assert.*;

/**
 * Created by Alex on 16.05.2016.
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

    /*@Test
    public void testBuildDoubleNumberNormal_1() {
        doubles.setIntegerPart(153);
        doubles.setFractionalPart(24);
        doubles.setLengthOfFractionalPart(2);
        double expected = 153.24;
        double actual = doubles.buildDoubleNumber();
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testBuildDoubleNumberNormal_2() {
        doubles.setIntegerPart(12);
        double expected = 12;
        double actual = doubles.buildDoubleNumber();
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testBuildDoubleNumberNormal_3() {
        doubles.setIntegerPart(2);
        doubles.setFractionalPart(5);
        doubles.setLengthOfFractionalPart(1);
        doubles.setExponentPart(6);
        double expected = 2_500_000;
        double actual = doubles.buildDoubleNumber();
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testBuildDoubleNumberNormal_4() {
        doubles.setIntegerPart(4);
        doubles.setExponentPart(-3);
        double expected = 0.004;
        double actual = doubles.buildDoubleNumber();
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testBuildDoubleNumberNormal_5() {
        doubles.setIntegerPart(5);
        doubles.setExponentPart(-7);
        double expected = 0.0000004;
        double actual = doubles.buildDoubleNumber();
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testParseIntegerNormal_2() {
        char[] input = "314159E-5".toCharArray();
        int expected = 6;
        int actual = doubles.parseInteger(0, input);
        assertEquals(expected, actual);
        int expectedNumber = 314159;
        assertEquals(expectedNumber, doubles.getIntegerPart());
    }

    @Test
    public void testParseIntegerNormal_3() {
        char[] input = "2e+10".toCharArray();
        int expected = 1;
        int actual = doubles.parseInteger(0, input);
        assertEquals(expected, actual);
        int expectedNumber = 2;
        assertEquals(expectedNumber, doubles.getIntegerPart());
    }

    @Test
    public void testParseIntegerBorder_1() {
        char[] input = "12500".toCharArray();
        int expected = 5;
        int actual = doubles.parseInteger(0, input);
        assertEquals(expected, actual);
        int expectedNumber = 12500;
        assertEquals(expectedNumber, doubles.getIntegerPart());
    }

    @Test
    public void testParseIntegerBorder_2() {
        char[] input = ".25".toCharArray();
        int expected = 0;
        int actual = doubles.parseInteger(0, input);
        assertEquals(expected, actual);
        int expectedNumber = 0;
        assertEquals(expectedNumber, doubles.getIntegerPart());
    }

    @Test
    public void testParseIntegerBorder_3() {
        char[] input = "0".toCharArray();
        int expected = 1;
        int actual = doubles.parseInteger(0, input);
        assertEquals(expected, actual);
        int expectedNumber = 0;
        assertEquals(expectedNumber, doubles.getIntegerPart());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseIntegerAbnormal_1() {
        char[] input = "-".toCharArray();
        doubles.parseInteger(0, input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseIntegerAbnormal_1_5() {
        char[] input = "+".toCharArray();
        doubles.parseInteger(0, input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseIntegerAbnormal_2() {
        char[] input = "23q34".toCharArray();
        doubles.parseInteger(0, input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseIntegerAbnormal_3() {
        char[] input = "FX123".toCharArray();
        doubles.parseInteger(0, input);
    }

    @Test
    public void testParseFractionalNormal_1() {
        char[] input = "16.125".toCharArray();
        int expected = 6;
        int actual = doubles.parseFractional(2, input);
        assertEquals(expected, actual);
        int expectedNumber = 125;
        assertEquals(expectedNumber, doubles.getFractionalPart());
    }

    @Test
    public void testParseFractionalNormal_2() {
        char[] input = "3.271E-10".toCharArray();
        int expected = 5;
        int actual = doubles.parseFractional(1, input);
        assertEquals(expected, actual);
        int expectedNumber = 271;
        assertEquals(expectedNumber, doubles.getFractionalPart());
    }

    @Test
    public void testParseFractionalNormal_3() {
        char[] input = "+.25".toCharArray();
        int expected = 4;
        int actual = doubles.parseFractional(1, input);
        assertEquals(expected, actual);
        int expectedNumber = 25;
        assertEquals(expectedNumber, doubles.getFractionalPart());
    }

    @Test
    public void testParseFractionalBorder_1() {
        char[] input = "77.".toCharArray();
        int expected = 3;
        int actual = doubles.parseFractional(2, input);
        assertEquals(expected, actual);
        int expectedNumber = 0;
        assertEquals(expectedNumber, doubles.getFractionalPart());
    }

    @Test
    public void testParseFractionalBorder_2() {
        char[] input = "-2.e10".toCharArray();
        int expected = 3;
        int actual = doubles.parseFractional(2, input);
        assertEquals(expected, actual);
        int expectedNumber = 0;
        assertEquals(expectedNumber, doubles.getFractionalPart());
    }

    @Test
    public void testParseFractionalBorder_3() {
        char[] input = "+.35".toCharArray();
        int expected = 4;
        int actual = doubles.parseFractional(1, input);
        assertEquals(expected, actual);
        int expectedNumber = 35;
        assertEquals(expectedNumber, doubles.getFractionalPart());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFractionalAbnormal_1() {
        char[] input = "-2.35we".toCharArray();
        doubles.parseFractional(2, input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFractionalAbnormal_2() {
        char[] input = "7.23]44".toCharArray();
        doubles.parseFractional(1, input);
    }*/
}