package ua.goit.timonov.practice.practice_2.task_02_7_addBinary;

/**
 * Validating class for AddBinary
 */
public class AddBinaryValidator extends AddBinary {
    private AddBinary origin;

    public AddBinaryValidator(AddBinary origin) {
        this.origin = origin;
    }

    @Override
    public String add(String string1, String string2) {
        checkForNull(string1, string2);
        checkForIncorrectChars(string1);
        checkForIncorrectChars(string2);
        return origin.add(string1, string2);
    }

    private void checkForIncorrectChars(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) < CHAR_0 || string.charAt(i) > CHAR_1) {
                throw new IllegalArgumentException("String contains incorrect char (not '0' or '1')!");
            }
        }
    }

    private void checkForNull(String string1, String string2) {
        if (string1 == null || string2 == null) {
            throw new IllegalArgumentException("One or two strings points to null!");
        }
    }
}
