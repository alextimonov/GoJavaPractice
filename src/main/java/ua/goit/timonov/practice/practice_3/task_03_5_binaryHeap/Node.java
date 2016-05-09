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


}
