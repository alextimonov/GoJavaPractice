package ua.goit.timonov.practice.task_01_6_matrixTraversal;

/**
 * Created by Alex on 24.04.2016.
 */
public class MatrixTraversal {
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

        while (stepsColumns > -1 && stepsLines > -1) {
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
