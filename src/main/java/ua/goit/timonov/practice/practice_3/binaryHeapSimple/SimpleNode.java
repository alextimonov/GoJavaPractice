package ua.goit.timonov.practice.practice_3.binaryHeapSimple;

/**
 * Created by Alex on 05.05.2016.
 */
public class SimpleNode {
    protected int value;
    protected SimpleNode leftNode;
    protected SimpleNode rightNode;

    public SimpleNode() {
    }

    public SimpleNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SimpleNode getLeftNode() {
        return leftNode;
    }

    public SimpleNode getRightNode() {
        return rightNode;
    }

    public void setLeftNode(SimpleNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(SimpleNode rightNode) {
        this.rightNode = rightNode;
    }

    public int pollMax() {
        if (rightNode != null) {
            return rightNode.pollMax();
        }
        else return value;
    }

}
