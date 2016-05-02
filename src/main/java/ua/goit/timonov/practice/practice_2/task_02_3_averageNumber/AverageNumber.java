package ua.goit.timonov.practice.practice_2.task_02_3_averageNumber;

/**
 * Class that finds average number of two positive numbers
 */
public class AverageNumber {
    /**
     * finds positive average number
     * @param a     number #1
     * @param b     number #2
     * @return      average value
     */
    public int average(int a, int b) {
        if (numbersArePositive(a, b)) {
            return findPositiveAverage(a, b);
        } else {
            if (numbersAreNegative(a, b)) {
                return findNegativeAverage(a, b);
            }
            else {
                return findAverageSignDiffer(a, b);
            }
        }
    }

    // finds average value of two numbers that have different signs
    private int findAverageSignDiffer(int a, int b) {
        return (a + b) / 2;
    }

    // finds average value of two negative numbers
    private int findNegativeAverage(int a, int b) {
        if (a > b) {
            return a - (a - b) / 2;
        }
        else {
            return b - (b - a) / 2;
        }
    }

    // finds average value of two positive numbers
    private int findPositiveAverage(int a, int b) {
        if (a > b) {
            return b + (a - b) / 2;
        }
        else {
            return a + (b - a) / 2;
        }
    }

    // checks if both numbers are negative
    private boolean numbersAreNegative(int a, int b) {
        return a < 0 && b < 0;
    }

    // checks if both numbers are positive
    private boolean numbersArePositive(int a, int b) {
        return a > 0 && b > 0;
    }
}
