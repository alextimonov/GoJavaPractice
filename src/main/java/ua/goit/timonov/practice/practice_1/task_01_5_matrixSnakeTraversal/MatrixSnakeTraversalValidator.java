package ua.goit.timonov.practice.practice_1.task_01_5_matrixSnakeTraversal;

/**
 * Testing class for MatrixSnakeTraversal
 */
public class MatrixSnakeTraversalValidator extends MatrixSnakeTraversal {
    /* object of origin class MatrixSnakeTraversal */
    private MatrixSnakeTraversal origin;


    /**
     * Constructor for decorator
     * @param origin        object of origin class MatrixSnakeTraversal
     */
    public MatrixSnakeTraversalValidator(MatrixSnakeTraversal origin) {
        this.origin = origin;
    }

    /**
     * makes validation of given object MatrixSnakeTraversal, than invokes method print of origin class
     * @param input             two-dimensional matrix with numbers
     * @return                  one-dimensional matrix with path of snake traversal
     */
    @Override
    public int[] print(int[][] input) {
        if (input == null) {
            throw new IllegalArgumentException("Matrix points to null!");
        }
        if (input.length == 0 || input[0].length == 0) {
            throw new IllegalArgumentException("Number of lines or columns of matrix is zero!");
        }
        return origin.print(input);
    }
}
