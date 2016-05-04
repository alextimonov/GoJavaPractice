package ua.goit.timonov.practice.practice_3.task_03_6_gnomeFood;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for GnomeFood
 */
public class GnomeFoodTest {
    GnomeFood gnomeFood = new GnomeFood();

    @Test
    public void testFindNormal_1() {
        int[] gnames =      {5, 7, 6, 9, 4};
        int[] portions =    {8, 5, 6, 2, 3};
        int[] expected =    {4, 2, 1, 0, 3};
        int[] actual = gnomeFood.find(gnames, portions);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindNormal_2() {
        int[] gnames =      {6, 12, 6, 9, 4, 10};
        int[] portions =    {8, 3,  5, 6, 2, 3};
        int[] expected =    {1, 0,  5, 2, 4, 3};
        int[] actual = gnomeFood.find(gnames, portions);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindBorder_1() {
        int[] gnames =      {7};
        int[] portions =    {5};
        int[] expected =    {0};
        int[] actual = gnomeFood.find(gnames, portions);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindBorder_2() {
        int[] gnames =      {7, 7, 7};
        int[] portions =    {5, 5, 5};
        int[] expected =    {0, 1, 2};
        int[] actual = gnomeFood.find(gnames, portions);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAbnormal_1() {
        int[] gnames =      {};
        int[] portions =    {};
        int[] expected =    {};
        int[] actual = gnomeFood.find(gnames, portions);
        assertArrayEquals(expected, actual);
    }
}