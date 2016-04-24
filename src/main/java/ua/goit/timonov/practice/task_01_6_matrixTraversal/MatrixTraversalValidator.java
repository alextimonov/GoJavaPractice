package ua.goit.timonov.practice.task_01_6_matrixTraversal;

/**
 * Testing class for MatrixTraversal
 */
public class MatrixTraversalValidator extends MatrixTraversal {
    /* object of origin class */
    private MatrixTraversal origin;

    /**
     * Constructor for decorator
     * @param origin        object of origin class MatrixTraversalCompound
     */
    public MatrixTraversalValidator(MatrixTraversal origin) {
        this.origin = origin;
    }

    /**
     * makes validation of given object MatrixTraversalCompound, than invokes method print of origin class
     * @param input             two-dimensional matrix with numbers
     * @return                  one-dimensional matrix with path of spiral traversal
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
