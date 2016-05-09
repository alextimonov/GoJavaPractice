package ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap;

/**
 * Class with implementation of Binary heap based on AVL tree
 */
public class BinaryHeap {
    /* root of the tree */
    private Node root;

    public BinaryHeap(int size) {
    }

    /**
     * inserts given value to the tree
     * @param val       value to be inserted
     */
    public void insert(int val) {
        root = insertNode(root, val);
    }

    /**
     * finds and removes max value in the tree
     * @return      max value
     */
    public int poll() {
        if (root == null) {
            throw new IllegalArgumentException("There's no elements in the heap!");
        }
        else {
            int result = findMaxValue(root);
            removeMaxNode(root);
            return result;
        }
    }

    // inserts given value to the node or its child nodes
    private Node insertNode(Node node, int val) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        else {
            if (val < node.getValue()) {
                Node inserted = insertNode(node.getLeftNode(), val);
                node.setLeftNode(inserted);
            }
            else {
                Node inserted = insertNode(node.getRightNode(), val);
                node.setRightNode(inserted);
            }
            return node.balance();
        }
    }

    // finds max value in the tree
    private int findMaxValue(Node node) {
        if (node.getRightNode() == null) {
            return node.getValue();
        }
        else {
            return findMaxValue(node.getRightNode());
        }
    }

    // removes from the tree node with max value
    private Node removeMaxNode(Node node) {
        Node rightNode = node.getRightNode();
        if (rightNode == null) {
            root = node.getLeftNode();
            return root;
        }
        if (rightNode.getRightNode() != null) {
            return removeMaxNode(rightNode);
        }
        else {
            node.setRightNode(rightNode.getLeftNode());
            return node;
        }
    }
}
