package ua.goit.timonov.practice.practice_2.task_02_1_addNumberBase36;

/**
 * Class to convert char in diapason '0..9, a..z' to int 0..35 and backward
 */
public class CharIntConverter {

    public static final int RADIX_TEN = 10;
    public static final char CHAR_A = 'a';
    public static final char CHAR_0 = '0';
    public static final int DIGIT_ZERO = 0;

    /**
     * converts char to integer value with given radix
     * @param radix     radix of number system
     * @param symbol    given symbol
     * @return          integer value of given symbol
     */
    public static int charToInt(int radix, char symbol) {
        if (symbol >= CHAR_A && symbol <= CHAR_A + radix - RADIX_TEN - 1) {
            return symbol - CHAR_A + RADIX_TEN;
        }
        else {
            if (symbol >= CHAR_0 && symbol <= CHAR_0 + RADIX_TEN - 1) {
                return symbol - CHAR_0;
            }
            else throw new IllegalArgumentException("Char should be in intervals 0...9, a...z (or A..Z)!");
        }
    }

    /**
     * converts integer value to char with given radix
     * @param radix         radix of number system
     * @param digit         given integer value
     * @return              view symbol
     */
    public static char intToChar(int radix, int digit) {
        if (digit >= RADIX_TEN && digit < radix) {
            return (char) (CHAR_A + digit - RADIX_TEN);
        }
        else {
            if (digit >= DIGIT_ZERO && digit <= DIGIT_ZERO + RADIX_TEN - 1) {
                return (char) (CHAR_0 + digit);
            }
            else throw new IllegalArgumentException("Number should be in interval 0...35!");
        }
    }
}
