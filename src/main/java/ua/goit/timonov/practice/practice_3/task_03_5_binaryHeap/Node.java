package ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap;

/**
 * Created by Alex on 05.05.2016.
 */
public class Node {
    private int value;
    private Node leftNode;
    private Node rightNode;

    public Node() {
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

    public Node getRightNode() {
        return rightNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public int pollMax() {
        if (rightNode != null) {
            return rightNode.pollMax();
        }
        else return value;
    }
}
