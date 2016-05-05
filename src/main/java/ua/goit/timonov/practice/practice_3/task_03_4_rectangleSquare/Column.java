package ua.goit.timonov.practice.practice_3.task_03_4_rectangleSquare;

/**
 * Class to storage coordinates of rectangle with one side on axe OX
 */
public class Column {
    /* left coordinate of rectangle */
    private int xLeft;
    /* right coordinate of rectangle */
    private int xRight;
    /* height of rectangle */
    private int height;

    /**
     * Constructor with given left coordinate, right coordinate and height
     */
    public Column(int xLeft, int xRight, int height) {
        this.xLeft = xLeft;
        this.xRight = xRight;
        this.height = height;
    }

    public int getxLeft() {
        return xLeft;
    }

    public void setxLeft(int xLeft) {
        this.xLeft = xLeft;
    }

    public int getxRight() {
        return xRight;
    }

    public void setxRight(int xRight) {
        this.xRight = xRight;
    }

    public int getHeight() {
        return height;
    }

    /**
     * finds square of rectangle
     * @return      founded square
     */
    public int findSquare() {
        int width = xRight - xLeft;
        return width * height;
    }
}
