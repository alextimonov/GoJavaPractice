package ua.goit.timonov.practice.practice_3.binaryHeapSimple;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex on 09.05.2016.
 */
public class SimpleBinaryHeapTest {
    @Test
    public void testInsertNormal_1() {
        SimpleBinaryHeap heap = new SimpleBinaryHeap(8);
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
        SimpleBinaryHeap heap = new SimpleBinaryHeap(32);
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
        SimpleBinaryHeap heap = new SimpleBinaryHeap(2);
        heap.insert(4);
        heap.insert(2);
        int expected = 4;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }

    @Test
    public void testPollNormal_3() {
        SimpleBinaryHeap heap = new SimpleBinaryHeap(4);
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
        SimpleBinaryHeap heap = new SimpleBinaryHeap(2);
        heap.insert(0);
        heap.insert(1);
    }

    @Test
    public void testPollNormal_4() {
        SimpleBinaryHeap heap = new SimpleBinaryHeap(2);
        heap.insert(0);
        heap.insert(1);
        int expected = 1;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }

    @Test(timeout = 3000)
    public void testInsertAbnormal_1() {
        int number = 32768;
        SimpleBinaryHeap heap = new SimpleBinaryHeap(number);
        for (int i = 0; i < number; i++) {
            heap.insert(i);
        }
        String s1 = heap.toString();
        System.out.println(s1);
    }

    @Test(timeout = 3000)
    public void testPollAbnormal_1() {
        int number = 32768;
        SimpleBinaryHeap heap = new SimpleBinaryHeap(number);
        for (int i = 0; i < number; i++) {
            heap.insert(i);
        }
        int expected = number - 1;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }
}