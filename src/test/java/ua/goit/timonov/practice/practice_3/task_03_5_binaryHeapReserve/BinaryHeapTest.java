package ua.goit.timonov.practice.practice_3.task_03_5_binaryHeapReserve;

import org.junit.Test;
import ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap.*;

import static org.junit.Assert.*;

/**
 * Created by Alex on 06.05.2016.
 */
public class BinaryHeapTest {

    @Test
    public void testInsertNormal_1() {
        ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap.BinaryHeap heap = new ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap.BinaryHeap(8);
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
        ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap.BinaryHeap heap = new ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap.BinaryHeap(32);
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
        ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap.BinaryHeap heap = new ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap.BinaryHeap(2);
        heap.insert(4);
        heap.insert(2);
        int expected = 4;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }

    @Test
    public void testPollNormal_3() {
        ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap.BinaryHeap heap = new ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap.BinaryHeap(4);
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
        ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap.BinaryHeap heap = new ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap.BinaryHeap(2);
        heap.insert(0);
        heap.insert(1);
    }

    @Test
    public void testPollNormal_4() {
        ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap.BinaryHeap heap = new ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap.BinaryHeap(2);
        heap.insert(0);
        heap.insert(1);
        int expected = 1;
        int actual = heap.poll();
        assertEquals(expected, actual);
    }
}