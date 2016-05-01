package ua.goit.timonov.practice.practice_1.task_01_6_matrixTraversal;

/**
 * Enum with movement direction
 */
public enum Direction {
    RIGHT,
    DOWN,
    LEFT,
    UP;

    /**
     * changes direction to next one (turning to right)
     * @return      new direction
     */
    public Direction makeTurn() {
        if (this == RIGHT) return DOWN;
        if (this == DOWN) return LEFT;
        if (this == LEFT) return UP;
        else return RIGHT;
    }
}
