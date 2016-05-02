package ua.goit.timonov.practice.practice_2.task_02_3_averageNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for AverageNumber
 */
public class AverageNumberTest {
    AverageNumber averageNumber = new AverageNumber();

    @Test
    public void testAverageNormal_1() {
        int number1 = 4;
        int number2 = 6;
        int expected = 5;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageNormal_2() {
        int number1 = -4;
        int number2 = -7;
        int expected = -5;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageNormal_3() {
        int number1 = -4;
        int number2 = 7;
        int expected = 1;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageNormal_4() {
        int number1 = -20;
        int number2 = 20;
        int expected = 0;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageNormal_5() {
        int number1 = -20;
        int number2 = -4;
        int expected = -12;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageBorder_1() {
        int number1 = Integer.MAX_VALUE;
        int number2 = Integer.MAX_VALUE;
        int expected = Integer.MAX_VALUE;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageBorder_2() {
        int number1 = 0;
        int number2 = 0;
        int expected = 0;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageBorder_3() {
        int number1 = Integer.MIN_VALUE;
        int number2 = Integer.MIN_VALUE;
        int expected = Integer.MIN_VALUE;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageBorder_4() {
        int number1 = Integer.MIN_VALUE;
        int number2 = Integer.MAX_VALUE;
        int expected = 0;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageBorder_5() {
        int number1 = -2147483648;
        int number2 = -2;
        int expected = -1073741825;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }
}