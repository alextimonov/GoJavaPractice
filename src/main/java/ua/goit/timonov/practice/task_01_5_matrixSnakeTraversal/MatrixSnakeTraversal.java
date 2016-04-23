package ua.goit.timonov.practice.task_01_5_matrixSnakeTraversal;

/**
 * Class to make snake traversal of matrix
 */
public class MatrixSnakeTraversal {

    /**
     * @param input     two-dimensional matrix with numbers
     * @return          one-dimensional matrix with path of snake traversal
     */
    public int[] print(int[][] input) {
        int lines = input.length;
        int columns = input[0].length;
        int[] resultArray = new int[lines * columns];
        int index = 0;
        boolean moveDirectionIsDown = false;

        for (int j = 0; j < columns ; j++) {
            moveDirectionIsDown = !moveDirectionIsDown;
            for (int i = 0; i < lines ; i++) {
                if (moveDirectionIsDown) {
                    resultArray[index++] = input[i][j];
                }
                else {
                    resultArray[index++] = input[lines-i-1][j];
                }
            }
        }
        return resultArray;
    }
}
