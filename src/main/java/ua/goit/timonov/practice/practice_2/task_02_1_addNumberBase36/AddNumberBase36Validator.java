package ua.goit.timonov.practice.practice_2.task_02_1_addNumberBase36;

/**
 * Validating class for AddNumberBase36
 */
public class AddNumberBase36Validator extends AddNumberBase36 {
    AddNumberBase36 origin = new AddNumberBase36();

    public AddNumberBase36Validator(AddNumberBase36 origin) {
        this.origin = origin;
    }

    @Override
    public String add(String a, String b) {
        checkStringsForNull(a, b);
        return origin.add(a, b);
    }

    private void checkStringsForNull(String a, String b) {
        if (a == null || b == null)
            throw new IllegalArgumentException("One or more string points to null!");
    }
}
