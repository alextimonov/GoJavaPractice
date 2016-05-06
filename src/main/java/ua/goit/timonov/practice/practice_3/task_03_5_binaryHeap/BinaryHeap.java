package ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap;

/**
 * Data structure - Binary Heap
 */
public class BinaryHeap {
    private Node root;

    public BinaryHeap(int size) {
    }

    public void insert(int val) {
        Node newNode = new Node();
        newNode.setValue(val);
        if (root == null) {
            root = newNode;
        }
        else
        {
            Node current = root;
            Node parent;
            while(true)
            {
                parent = current;
                if (val < current.getValue())
                {
                    current = current.getLeftNode();
                    if (current == null)
                    {
                        parent.setLeftNode(newNode);
                        return;
                    }
                }
                else
                {
                    current = current.getRightNode();
                    if (current == null)
                    {
                        parent.setRightNode(newNode);
                        return;
                    }
                }
            }
        }
    }

    public int poll() {
        if (root == null) {
            throw new IllegalArgumentException("There's no elements in the heap!");
        }
        else {
            Node current = root;
            if (current.getRightNode() == null) {
                root = null;
                return current.getValue();
            }
            else {
                Node parent = current;
                while (true) {
                    current = current.getRightNode();
                    if (current.getRightNode() == null) {
                        int result = current.getValue();
                        parent.setRightNode(null);
                        return result;
                    }
                    else {
                        parent = current;
                    }

                }
            }
        }
    }
}
