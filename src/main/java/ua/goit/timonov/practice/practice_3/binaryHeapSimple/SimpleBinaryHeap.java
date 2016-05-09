package ua.goit.timonov.practice.practice_3.binaryHeapSimple;

/**
 * Data structure - Binary Heap
 */
public class SimpleBinaryHeap {
    private SimpleNode root;

    public SimpleBinaryHeap(int size) {
    }

    public void insert(int val) {
        SimpleNode newNode = new SimpleNode(val);
        if (root == null) root = newNode;
        else
        {
            SimpleNode current = root;
            SimpleNode parent;
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
            SimpleNode current = root;
            if (current.getRightNode() == null) {
                root = null;
                return current.getValue();
            }
            else {
                SimpleNode parent = current;
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
