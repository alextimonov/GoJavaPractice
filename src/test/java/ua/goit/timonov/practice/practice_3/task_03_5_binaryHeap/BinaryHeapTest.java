package ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing class for BinaryHeap
 */
public class BinaryHeapTest {

    @Test
    public void testInsertNormal_1() {
        BinaryHeap heap = new BinaryHeap(8);
        heap.insert(5);
        heap.insert(3);
        heap.insert(6);
        heap.insert(7);
        heap.insert(8);
        heap.insert(2);
        heap.insert(4);
        heap.insert(9);
    }

    @Test
    public void testPollNormal_1() {
        BinaryHeap heap = new BinaryHeap(32);
        heap.insert(5);
        heap.insert(3);
        heap.insert(6);
        heap.insert(7);
        heap.insert(8);
        heap.insert(2);
        heap.insert(4);
        heap.insert(9);
        int expected = 9;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }

    @Test
    public void testPollNormal_2() {
        BinaryHeap heap = new BinaryHeap(2);
        heap.insert(4);
        heap.insert(2);
        heap.insert(1);
        int expected = 4;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }

    @Test
    public void testPollNormal_3() {
        BinaryHeap heap = new BinaryHeap(6);
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(0);
        int expected = 5;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }

    @Test
    public void testInsertNormal_4() {
        BinaryHeap heap = new BinaryHeap(2);
        heap.insert(1);
        heap.insert(2);
    }

    @Test
    public void testPollNormal_4() {
        BinaryHeap heap = new BinaryHeap(2);
        heap.insert(1);
        heap.insert(2);
        assertEquals(2, heap.poll());
        assertEquals(1, heap.poll());
    }

    @Test
    public void testInsertNormal_5() {
        BinaryHeap heap = new BinaryHeap(2);
        heap.insert(2);
        heap.insert(2);
        heap.insert(2);
        heap.insert(2);
        int expected = 2;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }

    @Test
    public void testNormal_6() {
        BinaryHeap heap = new BinaryHeap(4);
        heap.insert(0);
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        assertEquals(3, heap.poll());
        assertEquals(2, heap.poll());
        assertEquals(1, heap.poll());
        assertEquals(0, heap.poll());
    }

    @Test
    public void testNormal_7() {
        BinaryHeap heap = new BinaryHeap(4);
        heap.insert(3);
        heap.insert(2);
        heap.insert(5);
        heap.insert(4);
        heap.insert(6);
        heap.insert(7);
        heap.insert(8);
        assertEquals(8, heap.poll());
        assertEquals(7, heap.poll());
        assertEquals(6, heap.poll());
        assertEquals(5, heap.poll());
        assertEquals(4, heap.poll());
        assertEquals(3, heap.poll());
        assertEquals(2, heap.poll());
    }

    @Test(timeout = 200)
    public void testInsertAbnormal_1() {
        int number = 32768;
        BinaryHeap heap = new BinaryHeap(number);
        for (int i = 0; i < number; i++) {
            heap.insert(i);
        }
        String s1 = heap.toString();
        System.out.println(s1);
    }

    @Test(timeout = 200)
    public void testPollAbnormal_1() {
        int number = 32768;
        BinaryHeap heap = new BinaryHeap(number);
        for (int i = 0; i < number; i++) {
            heap.insert(i);
        }
        for (int i = number - 1; i >= 0; i--) {
            assertEquals(i, heap.poll());
        }
    }
}