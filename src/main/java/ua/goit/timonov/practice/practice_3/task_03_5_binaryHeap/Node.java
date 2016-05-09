package ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap;

/**
 * Node of binary heap
 */
public class Node {
    /* pointer to left child node */
    private Node leftNode;
    /* pointer to left child node */
    private Node rightNode;
    /* height of node */
    private int height;
    /* stored value */
    private int value;

    public Node() {
        height = 1;
    }

    public Node(int value) {
        this();
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    /**
     * defines height of current node depending on heights of child nodes
     */
    public void fixHeight() {
        if (leftNode == null && rightNode == null) {
            height = 1;
            return;
        }
        if (rightNode == null) {
            height = leftNode.height + 1;
            return;
        }
        if (leftNode == null) {
            height = rightNode.height + 1;
            return;
        }

        if (leftNode.height > rightNode.height ) {
            height = leftNode.height + 1;
        }
        else height = rightNode.height + 1;
    }

    /**
     * finds the balance of heights of left and right child nodes
     * @return      founded value of balance
     */
    public int getBalance() {
        if (rightNode == null && leftNode == null) return 0;
        if (rightNode == null) return -leftNode.height;
        if (leftNode == null) return rightNode.height;
        return rightNode.height - leftNode.height;
    }

    /**
     * makes balancing of the given node
     * @return          balanced node
     */
    public Node balance() {
        fixHeight();
        if (getBalance() == 2) {
            if (rightNode.getBalance() < 0) {
                rightNode = rightNode.rotateRight();
            }
            return rotateLeft();
        }
        if (getBalance() == -2) {
            if (leftNode.getBalance() > 0) {
                leftNode = leftNode.rotateLeft();
            }
            return rotateRight();
        }
        return this;
    }

    /**
     * makes right rotation of subtree around given node
     * @return          node that is the root of rotated subtree
     */
    private Node rotateRight() {
        Node exLeft = leftNode;
        leftNode = exLeft.rightNode;
        exLeft.rightNode = this;
        fixHeight();
        exLeft.fixHeight();
        return exLeft;
    }

    /**
     * makes left rotation of subtree around given node
     * @return          node that is the root of rotated subtree
     */
    private Node rotateLeft() {
        Node exRight = rightNode;
        rightNode = exRight.leftNode;
        exRight.leftNode = this;
        fixHeight();
        exRight.fixHeight();
        return exRight;
    }
}
