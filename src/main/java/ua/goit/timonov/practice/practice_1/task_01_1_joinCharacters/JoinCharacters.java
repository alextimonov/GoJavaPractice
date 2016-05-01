package ua.goit.timonov.practice.practice_1.task_01_1_joinCharacters;

/**
 * Class to join array of chars to integer value
 */
public class JoinCharacters {

    public static final char CHAR_ZERO = '0';
    public static final char CHAR_NINE = '9';
    public static final int RADIX = 10;

    /**
     * @param input     array of chars
     * @return          integer value with digits from input array
     */
    public int join(char[] input) {
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            result = result * RADIX + input[i] - CHAR_ZERO;
        }
        return result;
    }
}
