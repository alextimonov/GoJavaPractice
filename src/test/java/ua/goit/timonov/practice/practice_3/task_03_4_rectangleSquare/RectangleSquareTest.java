package ua.goit.timonov.practice.practice_3.task_03_4_rectangleSquare;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for RectangleSquare
 */
public class RectangleSquareTest {
    RectangleSquare rectangleSquare = new RectangleSquare();

    @Test
    public void testMeasureNormal_1() {
        int[] x = { 0,  0};
        int[] h = {20, 10};
        int[] w = {10, 20};
        int expected = 300;
        int actual = rectangleSquare.measure(x, h, w);
        assertEquals(expected, actual);
    }

    @Test
    public void testMeasureNormal_2() {
        int[] x = { 0,  4};
        int[] h = {20, 10};
        int[] w = { 2,  2};
        int expected = 60;
        int actual = rectangleSquare.measure(x, h, w);
        assertEquals(expected, actual);
    }

    @Test
    public void testMeasureNormal_3() {
        int[] x = {0,   4, 10};
        int[] h = {20, 10, 10};
        int[] w = {2,   2,  5};
        int expected = 110;
        int actual = rectangleSquare.measure(x, h, w);
        assertEquals(expected, actual);
    }

    @Test
    public void testMeasureNormal_4() {
        int[] x = {0, 0, 4};
        int[] h = {5, 2, 3};
        int[] w = {2, 5, 2};
        int expected = 20;
        int actual = rectangleSquare.measure(x, h, w);
        assertEquals(expected, actual);
    }

    @Test
    public void testMeasureNormal_5() {
        int[] x = { 0, 10, 20, 20, 30};
        int[] h = {10, 20, 30, 10, 20};
        int[] w = {60, 40, 10, 20, 10};
        int expected = 1100;
        int actual = rectangleSquare.measure(x, h, w);
        assertEquals(expected, actual);
    }

    @Test
    public void testMeasureBorder_1() {
        int[] x = {10};
        int[] h = {10};
        int[] w = {30};
        int expected = 300;
        int actual = rectangleSquare.measure(x, h, w);
        assertEquals(expected, actual);
    }

    @Test
    public void testMeasureBorder_2() {
        int[] x = {10, 10, 10};
        int[] h = {10, 10, 10};
        int[] w = {30, 30, 30};
        int expected = 300;
        int actual = rectangleSquare.measure(x, h, w);
        assertEquals(expected, actual);
    }

    @Test
    public void testMeasureBorder_3() {
        int[] x = { 5, 10,  0};
        int[] h = {10, 10, 20};
        int[] w = { 7,  6, 20};
        int expected = 400;
        int actual = rectangleSquare.measure(x, h, w);
        assertEquals(expected, actual);
    }

    @Test
    public void testMeasureBorder_4() {
        int[] x = { 0,  5, 10};
        int[] h = {20, 10, 10};
        int[] w = {20,  7,  6};
        int expected = 400;
        int actual = rectangleSquare.measure(x, h, w);
        assertEquals(expected, actual);
    }
}