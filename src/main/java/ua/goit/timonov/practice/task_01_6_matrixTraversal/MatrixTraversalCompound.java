package ua.goit.timonov.practice.task_01_6_matrixTraversal;

/**
 * Class to make spiral traversal of matrix
 */

public class MatrixTraversalCompound {

    public int[] print(int[][] input) {
        int lines = input.length;
        int columns = input[0].length;
        Direction direction = Direction.RIGHT;
        Border border = new Border(-1, columns, -1, lines);
        Position position = new Position(0, 0);

        int[] resultArray = new int[lines * columns];
        resultArray[0] = input[position.getnLine()][position.getnColumn()];

        for (int index = 1; index < lines * columns; index++) {
            if (!isPossibleToMoveDirectly(position, direction, border)) {
                direction = direction.makeTurn();
            }
            makeMove(position, direction);
            resultArray[index] = input[position.getnLine()][position.getnColumn()];
        }
        return resultArray;
    }

    private boolean isPossibleToMoveDirectly(Position position, Direction direction, Border border) {
        boolean result = true;
        switch (direction) {
            case RIGHT: {
                if (position.getnColumn() + 1 >= border.getRightBorder()) {
                    border.shiftUpBorder();
                    result = false;
                }
            }
            break;
            case DOWN: {
                if (position.getnLine() + 1 >= border.getDownBorder()) {
                    border.shiftRightBorder();
                    result = false;
                }
            }
            break;
            case LEFT: {
                if (position.getnColumn() - 1 <= border.getLeftBorder()) {
                    border.shiftDownBorder();
                    result = false;
                }
            }
            break;
            case UP: {
                if (position.getnLine() - 1 <= border.getUpBorder()) {
                    border.shiftLeftBorder();
                    result = false;
                }
            }
            break;
        }
        return result;
    }

    private void makeMove(Position position, Direction direction) {
        switch (direction) {
            case RIGHT:
                position.moveRight();
                break;
            case DOWN:
                position.moveDown();
                break;
            case LEFT:
                position.moveLeft();
                break;
            case UP:
                position.moveUp();
                break;
        }
    }
}

