package ua.goit.timonov.practice.task_02_5_countBits;

/**
 * Class that count number of bits in binary notation of int value
 */
public class CountBits {
    /* binary radix */
    public static final int RADIX = 2;

    /**
     * counts number of bits in binary notation of int value
     * @param num       integer value
     * @return          number of bits
     */
    public int count(int num) {
        int result = 0;
        if (num < 0) {
            result++;
        }
        num = num & Integer.MAX_VALUE;
        while (num > 0) {
            if (num % RADIX > 0) result++;
            num /= RADIX;
        }
        return result;
    }
}
