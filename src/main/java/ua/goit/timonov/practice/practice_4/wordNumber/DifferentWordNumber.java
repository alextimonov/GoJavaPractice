package ua.goit.timonov.practice.practice_4.wordNumber;

import java.util.Set;
import java.util.TreeSet;

/**
 * Class to find number of different words in the line
 */
public class DifferentWordNumber {

    public static final char CHAR_LOWER_A = 'a';
    public static final char CHAR_LOWER_Z = 'z';
    public static final char CHAR_UPPER_A = 'A';
    public static final char CHAR_UPPER_Z = 'Z';

    /**
     * finds number of different words in the line
     * @param input     given line
     * @return          number of words
     */
    public int count(String input) {
        Set<String> dictionary = new TreeSet<>();
        int result = 0;
        StringBuilder builderWord = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (charIsLetter(input.charAt(i))) {
                builderWord.append(input.charAt(i));
            }
            else {
                if (builderWord.length() > 0) {
                    String word = builderWord.toString();
                    if (!dictionary.contains(word)) {
                        dictionary.add(word);
                        result++;
                    }
                    builderWord = new StringBuilder();
                }
            }
        }
        if (builderWord.length() > 0) {
            String word = builderWord.toString();
            if (!dictionary.contains(word)) {
                dictionary.add(word);
                result++;
            }
        }
        return result;
    }

    // returns true if given char is a letter in diapason [a..z, A..Z]
    private boolean charIsLetter(char symbol) {
        return (symbol >= CHAR_LOWER_A && symbol <= CHAR_LOWER_Z) ||
                (symbol >= CHAR_UPPER_A && symbol <= CHAR_UPPER_Z);
    }
}
