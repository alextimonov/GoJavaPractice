package ua.goit.timonov.practice.practice_3.task_03_3_reversePolishNotation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for ReversePolishNotation
 */
public class ReversePolishNotationTest {
    ReversePolishNotation notation = new ReversePolishNotation();

    @Test
    public void testEvaluateNormal_1() {
        String expression = "1 2 +";
        int expected = 3;
        int actual = notation.evaluate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateNormal_2() {
        String expression = "7 2 3 * -";
        int expected = 1;
        int actual = notation.evaluate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateNormal_3() {
        String expression = "1 2 + 4 * 3 +";
        int expected = 15;
        int actual = notation.evaluate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateNormal_4() {
        String expression = "10 15 - 3 *";
        int expected = -15;
        int actual = notation.evaluate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateNormal_5() {
        String expression = "3 10 15 - *";
        int expected = -15;
        int actual = notation.evaluate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateNormal_6() {
        String expression = "12 2 3 4 * 10 5 / + * +";
        int expected = 40;
        int actual = notation.evaluate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateBorder_1() {
        String expression = "0 0 +";
        int expected = 0;
        int actual = notation.evaluate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateBorder_2() {
        String expression = "4 2 1 +";
        int expected = 3;
        int actual = notation.evaluate(expression);
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testEvaluateAbnormal_1() {
        String expression = "1 2 + -";
        notation.evaluate(expression);
    }

    @Test(expected = NullPointerException.class)
    public void testEvaluateAbnormal_2() {
        String expression = "1 + 2 -";
        notation.evaluate(expression);
    }
}