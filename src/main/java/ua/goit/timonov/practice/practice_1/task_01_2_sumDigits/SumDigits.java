package ua.goit.timonov.practice.practice_1.task_01_2_sumDigits;

/**
 * Class to find the sum of digits of given integer number
 */
public class SumDigits {

    public static final int RADIX = 10;

    /**
     * finds the sum of digits of given integer number
     * @param number        given number
     * @return              founded sum of digits
     */
    public int sum(int number) {
        int sum = 0;
        while (Math.abs(number) != 0) {
            sum += Math.abs(number % RADIX);
            number /= RADIX;
        }
        return sum;
    }
}
