package ua.goit.timonov.practice.task_01_6_matrixTraversal;

/**
 * Created by Alex on 24.04.2016.
 */
public class Position {
    private int nLine;
    private int nColumn;

    public Position(int nLine, int nColumn) {
        this.nLine = nLine;
        this.nColumn = nColumn;
    }

    public int getnLine() {
        return nLine;
    }

    public int getnColumn() {
        return nColumn;
    }

    public void moveRight() {
        nColumn++;
    }

    public void moveLeft() {
        nColumn--;
    }

    public void moveDown() {
        nLine++;
    }

    public void moveUp() {
        nLine--;
    }
}
