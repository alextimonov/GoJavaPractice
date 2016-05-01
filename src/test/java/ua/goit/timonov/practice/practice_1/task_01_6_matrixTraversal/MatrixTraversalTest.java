package ua.goit.timonov.practice.practice_1.task_01_6_matrixTraversal;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for MatrixTraversalCompound
 */
public class MatrixTraversalTest {
    MatrixTraversal spiralTraversal = new MatrixTraversalValidator(new MatrixTraversal());

    @Test
    public void testPrintNormal_1() {
        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[] expected = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};
        int[] actual = spiralTraversal.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintNormal_2() {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expected = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        int[] actual = spiralTraversal.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintNormal_3() {
        int[][] input = {{1, 2, 3}, {4, 5, 6}};
        int[] expected = {1, 2, 3, 6, 5, 4};
        int[] actual = spiralTraversal.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintNormal_4() {
        int[][] input = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[] expected = {1, 2, 4, 6, 8, 7, 5, 3};
        int[] actual = spiralTraversal.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintNormal_5() {
        int[][] input = {{ 1,  2,  3,  4,  5},
                         { 6,  7,  8,  9, 10},
                         {11, 12, 13, 14, 15},
                         {16, 17, 18, 19, 20},
                         {21, 22, 23, 24, 25}};
        int[] expected = {1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6, 7, 8, 9, 14, 19, 18, 17, 12, 13};
        int[] actual = spiralTraversal.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintBorder_1() {
        int[][] input = {{1, 2, 3, 4, 5}};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = spiralTraversal.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintBorder_2() {
        int[][] input = {{1}, {2}, {3}, {4}};
        int[] expected = {1, 2, 3, 4};
        int[] actual = spiralTraversal.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintBorder_3() {
        int[][] input = {{7}};
        int[] expected = {7};
        int[] actual = spiralTraversal.print(input);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintAbnormal_1() {
        int[][] input = null;
        spiralTraversal.print(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintAbnormal_2() {
        int[][] input = {{}};
        spiralTraversal.print(input);
    }

}