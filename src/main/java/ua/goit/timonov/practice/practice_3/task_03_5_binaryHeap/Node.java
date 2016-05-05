package ua.goit.timonov.practice.practice_3.task_03_5_binaryHeap;

/**
 * Created by Alex on 05.05.2016.
 */
public class Node {
    private int value;
    private boolean isOccupied;
    private Node leftNode;
    private Node rightNode;

    public Node() {
        value = 0;
        isOccupied = false;
        leftNode = null;
        rightNode = null;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void insertValue(int val) {
        if (!isOccupied) {
            this.value = val;
        }
        else {
            if (val >= value) {
                rightNode.insertValue(val);
            }
            else {
                leftNode.insertValue(val);
            }
        }
    }

    public int pollMax() {
        if (rightNode.isOccupied) {
            return rightNode.pollMax();
        }
        else return value;
    }
}
