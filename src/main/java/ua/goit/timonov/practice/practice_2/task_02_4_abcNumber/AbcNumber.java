package ua.goit.timonov.practice.practice_2.task_02_4_abcNumber;

/**
 * Class that decodes the string to a number in such way: "bcd" -> 123.
 */
public class AbcNumber {
    public static final int RADIX = 10;
    public static final char CHAR_A = 'a';
    public static final char CHAR_J = 'j';

    /**
     * Converts given string to number
     * @param num       given string that should contain chars 'a'..'j'
     * @return          decoded number
     */
    public int convert(String num) {
        char[] charArray = num.toCharArray();
        int result = 0;
        for (int i = 0; i < charArray.length; i++) {
            result = result * RADIX + decode(charArray[i]);
        }
        return result;
    }

    // decodes symbol to digit
    private int decode(char symbol) {
        return symbol - CHAR_A;
    }
}