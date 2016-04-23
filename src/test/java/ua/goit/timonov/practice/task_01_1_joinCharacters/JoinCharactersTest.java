package ua.goit.timonov.practice.task_01_1_joinCharacters;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tasting class for JoinCharacter
 */
public class JoinCharactersTest {
    private JoinCharacters joiner = new JoinCharactersValidator(new JoinCharacters());

    @Test
    public void testJoinNormal_1() {
        char[] input = new char[]{'1', '2', '3', '4'};
        int expected = 1234;
        int actual = joiner.join(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testJoinNormal_2() {
        char[] input = new char[]{'5', '0', '4', '1', '0'};
        int expected = 50410;
        int actual = joiner.join(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testJoinNormal_3() {
        char[] input = new char[]{'7', '7', '7', '7', '7'};
        int expected = 77777;
        int actual = joiner.join(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testJoinBorder_1() {
        char[] input = new char[]{'7'};
        int expected = 7;
        int actual = joiner.join(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testJoinBorder_2() {
        char[] input = new char[]{'0', '1', '2', '3'};
        int expected = 123;
        int actual = joiner.join(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testJoinBorder_3() {
        char[] input = new char[]{'0', '0', '0', '0'};
        int expected = 0;
        int actual = joiner.join(input);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testJoinAbnormal_1() {
        char[] input = new char[]{'A'};
        joiner.join(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testJoinAbnormal_2() {
        char[] input = new char[]{'3', '4', '5', 'B'};
        joiner.join(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testJoinAbnormal_3() {
        char[] input = new char[]{'A', 'B', 'C'};
        joiner.join(input);
    }
}