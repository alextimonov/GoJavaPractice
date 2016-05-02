package ua.goit.timonov.practice.practice_2.task_02_7_addBinary;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for AddBinary
 */
public class AddBinaryTest {
    AddBinary addBinary = new AddBinaryValidator(new AddBinary());

    @Test
    public void testAddNormal_1() {
        String addend1 =   "101";
        String addend2 =   "100";
        String expected = "1001";
        String actual = addBinary.add(addend1, addend2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNormal_2() {
        String addend1 =   "1111";
        String addend2 =   "1111";
        String expected = "11110";
        String actual = addBinary.add(addend1, addend2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNormal_3() {
        String addend1 =   "1010";
        String addend2 =    "101";
        String expected =  "1111";
        String actual = addBinary.add(addend1, addend2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddBorder_1() {
        String addend1 =   "1111";
        String addend2 =      "0";
        String expected =  "1111";
        String actual = addBinary.add(addend1, addend2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddBorder_2() {
        String addend1 =   "0";
        String addend2 =   "0";
        String expected =  "0";
        String actual = addBinary.add(addend1, addend2);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAbnormal_1() {
        String addend1 =   "721";
        String addend2 =   "111";
        addBinary.add(addend1, addend2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAbnormal_2() {
        String addend1 =   "101";
        String addend2 =   "abs";
        addBinary.add(addend1, addend2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAbnormal_3() {
        String addend1 = null;
        String addend2 = "1101";
        addBinary.add(addend1, addend2);
    }
}