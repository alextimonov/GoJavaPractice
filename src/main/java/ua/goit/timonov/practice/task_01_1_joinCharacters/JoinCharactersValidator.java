package ua.goit.timonov.practice.task_01_1_joinCharacters;

/**
 * Validating decorator for class JoinCharacter
 */
public class JoinCharactersValidator extends JoinCharacters {
    /* object of origin class JoinCharacters */
    private final JoinCharacters origin;

    /**
     * Constructor for decorator
     * @param origin        object of origin class JoinCharacter\
     */
    public JoinCharactersValidator(JoinCharacters origin) {
        this.origin = origin;
    }

    /**
     * makes validation of given object JoinCharacter, than invokes method join of origin class
     * @param input array of chars
     * @return
     */
    @Override
    public int join(char[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] < CHAR_ZERO || input[i] > CHAR_NINE) {
                throw new IllegalArgumentException("Input chars must be figures!");
            }
        }
        return origin.join(input);
    }
}
