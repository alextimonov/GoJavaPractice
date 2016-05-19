package ua.goit.timonov.practice.practice_5.bstSearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for BSTSearch
 */
public class BSTSearchTest {
    BSTSearch tree = new BSTSearch();

    @Test
    public void testExistNormal_1() {
        int[] array = {3, 4, 1, 2, 5, 7};
        tree.buildTree(array);
        boolean expected = true;
        boolean actual = tree.exist(tree.getRoot(), 5);
        assertEquals(expected, actual);
    }

    @Test
    public void testExistNormal_2() {
        int[] array = {3, 4, 1, 2, 5, 7};
        tree.buildTree(array);
        boolean expected = false;
        boolean actual = tree.exist(tree.getRoot(), 8);
        assertEquals(expected, actual);
    }

    @Test
    public void testExistBorder_1() {
        int[] array = {1, 2, 4, 6, 7, 8};
        tree.buildTree(array);
        boolean expected = true;
        boolean actual = tree.exist(tree.getRoot(), 7);
        assertEquals(expected, actual);
    }

    @Test
    public void testExistBorder_2() {
        int[] array = {1, 2, 4, 6, 7, 8};
        tree.buildTree(array);
        boolean expected = false;
        boolean actual = tree.exist(tree.getRoot(), 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testExistNormal_3() {
        int[] array = {2, 2, 2, 2, 2, 2};
        tree.buildTree(array);
        boolean expected = true;
        boolean actual = tree.exist(tree.getRoot(), 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testExistNormal_4() {
        int[] array = {2, 2, 2, 2, 2, 2};
        tree.buildTree(array);
        boolean expected = false;
        boolean actual = tree.exist(tree.getRoot(), 1);
        assertEquals(expected, actual);
    }
}