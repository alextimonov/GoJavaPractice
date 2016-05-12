package ua.goit.timonov.practice.practice_4.wordNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for WordNumber
 */
public class WordNumberTest {

    WordNumber wordNumber = new WordNumber();

    @Test
    public void testCountNormal_1() {
        String line = "I believe I can fly!";
        int expected = 5;
        int actual = wordNumber.count(line);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_2() {
        String line = "You.. you are always in my mind";
        int expected = 7;
        int actual = wordNumber.count(line);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_3() {
        String line = "I was staying on the bus stop when he say \"Hello!\"";
        int expected = 11;
        int actual = wordNumber.count(line);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_4() {
        String line = "You'll never walk along";
        int expected = 5;
        int actual = wordNumber.count(line);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNormal_5() {
        String line = "\"public int find(int num) { \"";
        int expected = 5;
        int actual = wordNumber.count(line);
        assertEquals(expected, actual);
    }



    @Test
    public void testCountBorder_1() {
        String line = "meow-meow-meow";
        int expected = 3;
        int actual = wordNumber.count(line);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountBorder_2() {
        String line = "Armageddon";
        int expected = 1;
        int actual = wordNumber.count(line);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountBorder_3() {
        String line = "14<>#$%^)(+/.,35";
        int expected = 0;
        int actual = wordNumber.count(line);
        assertEquals(expected, actual);
    }
}