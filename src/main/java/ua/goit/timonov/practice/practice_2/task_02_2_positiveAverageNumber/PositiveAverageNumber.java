package ua.goit.timonov.practice.practice_2.task_02_2_positiveAverageNumber;

/**
 * Class to find positive average number of two positive numbers
 */
public class PositiveAverageNumber {
    /**
     * finds positive average number
     * @param a     number #1
     * @param b     number #2
     * @return      average value
     */
    public int average(int a, int b) {
        if (a > b) {
            return b + (a - b) / 2;
        }
        else {
            return a + (b - a) / 2;
        }
    }
}