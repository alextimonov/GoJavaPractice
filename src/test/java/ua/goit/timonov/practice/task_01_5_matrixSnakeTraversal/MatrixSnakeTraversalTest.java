package ua.goit.timonov.practice.task_01_5_matrixSnakeTraversal;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for MatrixSnakeTraversal
 */
public class MatrixSnakeTraversalTest {
    MatrixSnakeTraversal snake = new MatrixSnakeTraversalValidator
            (new MatrixSnakeTraversal());

    @Test
    public void testPrintNormal_1() {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expected = {1, 4, 7, 8, 5, 2, 3, 6, 9};
        int[] actual = snake.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintNormal_2() {
        int[][] input = {{1, 2, 3}, {4, 5, 6}};
        int[] expected = {1, 4, 5, 2, 3, 6};
        int[] actual = snake.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintNormal_3() {
        int[][] input = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[] expected = {1, 3, 5, 7, 8, 6, 4, 2};
        int[] actual = snake.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintNormal_4() {
        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[] expected = {1, 5, 9, 13, 14, 10, 6, 2, 3, 7, 11, 15, 16, 12, 8, 4};
        int[] actual = snake.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintBorder_1() {
        int[][] input = {{1, 2, 3, 4, 5}};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = snake.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintBorder_2() {
        int[][] input = {{1}, {2}, {3}, {4}};
        int[] expected = {1, 2, 3, 4};
        int[] actual = snake.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintBorder_3() {
        int[][] input = {{7}};
        int[] expected = {7};
        int[] actual = snake.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintAbnormal_1() {
        int[][] input = null;
        snake.print(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintAbnormal_2() {
        int[][] input = {{}};
        snake.print(input);
    }
}