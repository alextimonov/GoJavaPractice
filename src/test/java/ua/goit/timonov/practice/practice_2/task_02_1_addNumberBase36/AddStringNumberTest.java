package ua.goit.timonov.practice.practice_2.task_02_1_addNumberBase36;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for AddStringNumber
 */
public class AddStringNumberTest {
    AddStringNumber sumCalc = new AddStringNumberValidator(new AddStringNumber());

    @Test
    public void testAddNormal_1() {
        String adderA = "9";
        String adderB = "1";
        String expected = "a";
        String actual = sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNormal_2() {
        String adderA = "23";
        String adderB = "32";
        String expected = "55";
        String actual = sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNormal_3() {
        String adderA =     "ZAbcD";
        String adderB =     "12345";
        String expected =  "10cegi";
        String actual = sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNormal_4() {
        String adderA = "HELLO";
        String adderB = "330";
        String expected = "heooo";
        String actual = sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNormal_5() {
        String adderA = "f";
        String adderB = "1";
        String expected = "10";
        String actual = sumCalc.add(adderA, adderB, 16);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNormal_6() {
        String adderA = "1efd";
        String adderB = "7d4c";
        String expected = "9c49";
        String actual = sumCalc.add(adderA, adderB, 16);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNormal_7() {
        String adderA = "1101";
        String adderB = "111";
        String expected = "10100";
        String actual = sumCalc.add(adderA, adderB, AddStringNumber.MIN_RADIX);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNormal_8() {
        String adderA = "zjfghfhdsdfathjjhgjhghjfjfjhjhdsrreqqklhu456hfz5";
        String adderB = "wsfgsgds56346263fgfhghfghfhgfsrr5476hjfgdhdhg3N";
        String expected = "10g7vy7xrkildxnlpkvzwxy0uzwyyzx6kiwixx24xahmjyw2s";
        String actual = sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddBorder_1() {
        String adderA = "hello";
        String adderB = "0";
        String expected = "hello";
        String actual = sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddBorder_2() {
        String adderA = "0";
        String adderB = "0";
        String expected = "0";
        String actual = sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddBorder_6() {
        String adderA = "x0";
        String adderB = "30";
        String expected = "100";
        String actual = sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddBorder_3() {
        String adderA = "zz";
        String adderB = "zz";
        String expected = "1zy";
        String actual = sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddBorder_4() {
        String adderA = "123qwe";
        String adderB = "";
        String expected = "123qwe";
        String actual = sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddBorder_5() {
        String adderA =     "smellsliketenspirit";
        String adderB =        "howmuchisthefish";
        String expected =  "smf3ap8cwwc7ha3yaba";
        String actual = sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAbnormal_1() {
        String adderA = null;
        String adderB = "123";
        sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAbnormal_2() {
        String adderA = "321";
        String adderB = null;
        sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAbnormal_3() {
        String adderA = null;
        String adderB = null;
        sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAbnormal_4() {
        String adderA = "/.,'[";
        String adderB = "123";
        sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAbnormal_5() {
        String adderA = "231wefs234";
        String adderB = "342432\3455";
        sumCalc.add(adderA, adderB, AddStringNumber.MAX_RADIX);
    }

}