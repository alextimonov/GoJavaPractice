package ua.goit.timonov.practice.practice_2.task_02_2_positiveAverageNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for PositiveAverageNumber
 */
public class PositiveAverageNumberTest {
    PositiveAverageNumber averageNumber = new PositiveAverageNumberValidator (new PositiveAverageNumber());

    @Test
    public void testAverageNormal_1() {
        int number1 = 2;
        int number2 = 4;
        int expected = 3;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageNormal_2() {
        int number1 = 4;
        int number2 = 7;
        int expected = 5;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageNormal_3() {
        int number1 = 1;
        int number2 = 100;
        int expected = 50;
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
        int number1 = 1;
        int number2 = 1;
        int expected = 1;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageAbnormal_1() {
        int number1 = 0;
        int number2 = 0;
        int expected = 0;
        int actual = averageNumber.average(number1, number2);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageAbnormal_2() {
        int number1 = -5;
        int number2 = 0;
        averageNumber.average(number1, number2);
    }
}