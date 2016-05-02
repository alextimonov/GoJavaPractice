package ua.goit.timonov.practice.practice_2.task_02_7_addBinary;

/**
 * Class that adds two unsigned numbers given as strings
 * http://codegym.in.ua/problem/559e4086bcf7b775598c1229
 */
class AddBinary {
    public static final char CHAR_0 = '0';
    public static final char CHAR_1 = '1';
    public static final char CHAR_2 = '2';
    public static final char CHAR_3 = '3';

    /**
     * adds two unsigned numbers given as strings
     * @param a     addend #1
     * @param b     addend #2
     * @return      result of addition
     */
    public String add(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        int resultLength = 0;
        if (aLength < bLength) {
            a = complementString(a, bLength - aLength);
            resultLength = bLength;
        }
        else {
            b = complementString(b, aLength - bLength);
            resultLength = aLength;
        }
        char[] charArray = new char[resultLength];
        char movingChar = CHAR_0;
        for (int i = resultLength - 1; i >= 0; i--) {
            charArray[i] = sumChars(a.charAt(i), b.charAt(i), movingChar);
            if (charArray[i] == CHAR_2) {
                charArray[i] = CHAR_0;
                movingChar = CHAR_1;
            }
            else {
                if (charArray[i] == CHAR_3) {
                    charArray[i] = CHAR_1;
                    movingChar = CHAR_1;
                }
                else movingChar = CHAR_0;
            }
        }
        if (movingChar == CHAR_1) {
            return new String(movingChar + String.valueOf(charArray));
        }
        else {
            return new String(charArray);
        }
    }

    // adds three digits
    private char sumChars(char c1, char c2, char c3) {
        return (char) (c1 - CHAR_0 + c2 - CHAR_0 + c3);
    }

    // adds sequence of chars '0' to begin of given string
    private String complementString(String string, int lengthToAdd) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lengthToAdd; i++) {
            stringBuilder.append('0');
        }
        return stringBuilder + string;
    }
}
