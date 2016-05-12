package ua.goit.timonov.practice.practice_4.wordNumber;

/**
 * Class to find number of words in the line
 */
public class WordNumber {

    public static final char CHAR_LOWER_A = 'a';
    public static final char CHAR_LOWER_Z = 'z';
    public static final char CHAR_UPPER_A = 'A';
    public static final char CHAR_UPPER_Z = 'Z';

    /**
     * finds number of words in the line
     * @param input     given line
     * @return          number of words
     */
    public int count(String input) {
        int result = 0;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (charIsLetter(input.charAt(i))) {
                word.append(input.charAt(i));
            }
            else {
                if (word.length() > 0) {
                    result++;
                    word = new StringBuilder();
                }
            }
        }
        if (word.length() > 0) result++;
        return result;
    }

    // returns true if given char is a letter in diapason [a..z, A..Z]
    private boolean charIsLetter(char symbol) {
        return (symbol >= CHAR_LOWER_A && symbol <= CHAR_LOWER_Z) ||
                (symbol >= CHAR_UPPER_A && symbol <= CHAR_UPPER_Z);
    }
}
