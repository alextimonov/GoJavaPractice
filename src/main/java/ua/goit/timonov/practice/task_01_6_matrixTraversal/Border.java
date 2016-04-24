package ua.goit.timonov.practice.task_01_6_matrixTraversal;

/**
 * Created by Alex on 24.04.2016.
 */
public class Border {
    private int leftBorder;
    private int rightBorder;
    private int upBorder;
    private int downBorder;

    public Border(int leftBorder, int rightBorder, int upBorder, int downBoreder) {
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        this.upBorder = upBorder;
        this.downBorder = downBoreder;
    }

    public int getLeftBorder() {
        return leftBorder;
    }

    public int getRightBorder() {
        return rightBorder;
    }

    public int getUpBorder() {
        return upBorder;
    }

    public int getDownBorder() {
        return downBorder;
    }

    public void shiftRightBorder() {
        rightBorder--;
    }

    public void shiftLeftBorder() {
        leftBorder++;
    }

    public void shiftUpBorder() {
        upBorder++;
    }

    public void shiftDownBorder() {
        downBorder--;
    }
}
