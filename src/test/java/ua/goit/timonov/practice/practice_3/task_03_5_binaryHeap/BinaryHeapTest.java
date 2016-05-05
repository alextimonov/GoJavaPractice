package ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex on 06.05.2016.
 */
public class BinaryHeapTest {

    @Test
    public void testInsertNormal_1() {
        BinaryHeap heap = new BinaryHeap(8);
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
        BinaryHeap heap = new BinaryHeap(32);
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
        BinaryHeap heap = new BinaryHeap(2);
        heap.insert(0);
        heap.insert(1);
        int expected = 1;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }
}