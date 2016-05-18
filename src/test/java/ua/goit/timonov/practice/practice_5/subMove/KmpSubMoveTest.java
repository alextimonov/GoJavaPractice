package ua.goit.timonov.practice.practice_5.subMove;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for KmpSubMove
 */
public class KmpSubMoveTest {
    private KmpSubMove subMove = new KmpSubMove();

    @Test
    public void testSubMoveQuantityNormal_1() {
        String input = "abcd";
        String result = "cdab";
        int expected = 2;
        int actual = subMove.subMoveQuantity(input, result);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubMoveQuantityNormal_2() {
        String input = "qweqwe";
        String result = "weqweq";
        int expected = 2;
        int actual = subMove.subMoveQuantity(input, result);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubMoveQuantityNormal_3() {
        String input = "abcdef";
        String result = "fabcde";
        int expected = 1;
        int actual = subMove.subMoveQuantity(input, result);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubMoveQuantityBorder_1() {
        String input = "abcdef";
        String result = "abcdef";
        int expected = 0;
        int actual = subMove.subMoveQuantity(input, result);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubMoveQuantityBorder_2() {
        String input = "";
        String result = "";
        int expected = 0;
        int actual = subMove.subMoveQuantity(input, result);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubMoveQuantityAbnormal_1() {
        String input = null;
        String result = "abc";
        int expected = -1;
        int actual = subMove.subMoveQuantity(input, result);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubMoveQuantityAbnormal_2() {
        String input = "qwerty";
        String result = "Qwerty";
        int expected = -1;
        int actual = subMove.subMoveQuantity(input, result);
        assertEquals(expected, actual);
    }
}