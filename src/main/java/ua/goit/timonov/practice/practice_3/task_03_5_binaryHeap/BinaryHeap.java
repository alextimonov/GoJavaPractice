package ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap;

/**
 * Data structure - Binary Heap
 */
public class BinaryHeap {
    private Node root;

    public BinaryHeap(int size) {
        root = new Node();
        root.setLeftNode(makeChild(size / 2));
        root.setRightNode(makeChild(size / 2));
    }

    private Node makeChild(int size) {
        Node child = new Node();
        if (size >= 2) {
            child.setRightNode(makeChild(size / 2));
            child.setLeftNode(makeChild(size / 2));
        }
        return child;
    }

    public void insert(int val) {
        root.insertValue(val);
    }

    public int poll() {
        return root.pollMax();
    }
}
