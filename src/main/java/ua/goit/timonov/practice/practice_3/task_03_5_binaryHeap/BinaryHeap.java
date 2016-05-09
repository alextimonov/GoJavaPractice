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
        {
        root = insertNode(root, val);
        }
    }

    /**
     * inserts given value to the node or its child nodes
     * @param node      given node of the tree
     * @param val       value to be inserted
     * @return          node in which value has been inserted
     */
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
            return balance(node);
        }
    }

    /**
     * makes balancing of the given node
     * @param node      give node
     * @return          balanced node
     */
    private Node balance(Node node) {
        node.fixHeight();
        if (node.getBalance() == 2) {
            if (node.getRightNode().getBalance() < 0) {
                node.setRightNode(rotateRight(node.getRightNode()));
            }
            return rotateLeft(node);
        }
        if (node.getBalance() == -2) {
            if (node.getLeftNode().getBalance() > 0) {
                node.setLeftNode(rotateLeft(node.getLeftNode()));
            }
            return rotateRight(node);
        }
        return node;
    }

    /**
     * makes right rotation of subtree around given node
     * @param node      given node
     * @return          node that is the root of rotated subtree
     */
    private Node rotateRight(Node node) {
        Node exLeft = node.getLeftNode();
        node.setLeftNode(exLeft.getRightNode());
        exLeft.setRightNode(node);
        node.fixHeight();
        exLeft.fixHeight();
        return exLeft;
    }

    /**
     * makes left rotation of subtree around given node
     * @param node      given node
     * @return          node that is the root of rotated subtree
     */
    private Node rotateLeft(Node node) {
        Node exRight = node.getRightNode();
        node.setRightNode(exRight.getLeftNode());
        exRight.setLeftNode(node);
        node.fixHeight();
        exRight.fixHeight();
        return exRight;
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