package ua.goit.timonov.practice.practice_2.task_02_1_addNumberBase36;

/**
 * Validating class for AddStringNumber
 */
public class AddStringNumberValidator extends AddStringNumber {
    AddStringNumber origin = new AddStringNumber();

    public AddStringNumberValidator(AddStringNumber origin) {
        this.origin = origin;
    }

    @Override
    public String add(String a, String b, int radix) {
        checkStringsForNull(a, b);
        return origin.add(a, b, radix);
    }

    private void checkIfRadixLessThanTwo(int radix) {
        if (radix < MIN_RADIX || radix > MAX_RADIX)
            throw new IllegalArgumentException("Radix should be in diapason " + MIN_RADIX + " ... " + MAX_RADIX + "!");
    }

    private void checkStringsForNull(String a, String b) {
        if (a == null || b == null)
            throw new IllegalArgumentException("One or more string points to null!");
    }
}
