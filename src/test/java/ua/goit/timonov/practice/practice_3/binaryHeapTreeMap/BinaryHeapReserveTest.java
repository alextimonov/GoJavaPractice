package ua.goit.timonov.practice.practice_3.binaryHeapTreeMap;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for BinaryHeapTreeMap
 */
public class BinaryHeapReserveTest {

    @Test
    public void testInsertNormal_1() {
        BinaryHeapTreeMap heap = new BinaryHeapTreeMap(8);
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(2);
        heap.insert(4);
        heap.insert(7);
        heap.insert(9);
        heap.insert(10);
    }

    @Test
    public void testPollNormal_1() {
        BinaryHeapTreeMap heap = new BinaryHeapTreeMap(32);
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(2);
        heap.insert(4);
        heap.insert(7);
        heap.insert(9);
        int expected = 9;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }

    @Test
    public void testPollNormal_2() {
        BinaryHeapTreeMap heap = new BinaryHeapTreeMap(2);
        heap.insert(4);
        heap.insert(2);
        int expected = 4;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }

    @Test
    public void testPollNormal_3() {
        BinaryHeapTreeMap heap = new BinaryHeapTreeMap(4);
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        int expected = 4;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }

    @Test
    public void testInsertNormal_4() {
        BinaryHeapTreeMap heap = new BinaryHeapTreeMap(2);
        heap.insert(0);
        heap.insert(1);
    }

    @Test
    public void testPollNormal_4() {
        BinaryHeapTreeMap heap = new BinaryHeapTreeMap(2);
        heap.insert(0);
        heap.insert(1);
        int expected = 1;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }

    @Test
    public void testInsertAbnormal_1() {
        int number = 32768;
        BinaryHeapTreeMap heap = new BinaryHeapTreeMap(number);
        for (int i = 0; i < number; i++) {
            heap.insert(i);
        }
    }

    @Test
    public void testPollAbnormal_1() {
        int number = 32768;
        BinaryHeapTreeMap heap = new BinaryHeapTreeMap(number);
        for (int i = 0; i < number; i++) {
            heap.insert(i);
        }
        int expected = number - 1;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }
}