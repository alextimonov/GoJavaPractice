package ua.goit.timonov.practice.task_01_6_matrixTraversal;

/**
 * Class to make spiral traversal of matrix
 */
public class MatrixTraversal {

    /**
     * @param input         given two-dimensional matrix
     * @return              one-dimensional matrix with path of spiral traversal
     */
    public int[] print(int[][] input) {
        int lines = input.length;
        int columns = input[0].length;
        Direction direction = Direction.RIGHT;

        int[] resultArray = new int[lines * columns];
        int index = 0;
        int curLine = 0;
        int curColumn = -1;

        int stepsColumns = columns;
        int stepsLines = lines - 1;
        while (stepsColumns >= 0 && stepsLines >= 0) {
            switch (direction) {
                case RIGHT: {
                    for (int i = 0; i < stepsColumns; i++) {
                        resultArray[index++] = input[curLine][++curColumn];
                    }
                    stepsColumns--;
                }
                break;
                case LEFT: {
                    for (int i = 0; i < stepsColumns; i++) {
                        resultArray[index++] = input[curLine][--curColumn];
                    }
                    stepsColumns--;
                }
                break;
                case DOWN: {
                    for (int i = 0; i < stepsLines ; i++) {
                        resultArray[index++] = input[++curLine][curColumn];
                    }
                    stepsLines--;
                }
                break;
                case UP: {
                    for (int i = 0; i < stepsLines; i++) {
                        resultArray[index++] = input[--curLine][curColumn];
                    }
                    stepsLines--;
                }
                break;
            }
            direction = direction.makeTurn();
        }
        return resultArray;
    }
}
