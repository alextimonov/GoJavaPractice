package ua.goit.timonov.practice.task_01_6_matrixTraversal;

/**
 * Created by Alex on 24.04.2016.
 */
public enum Direction {
    RIGHT,
    DOWN,
    LEFT,
    UP;

    public Direction makeTurn() {
        if (this == RIGHT) return DOWN;
        if (this == DOWN) return LEFT;
        if (this == LEFT) return UP;
        else return RIGHT;
    }
}
