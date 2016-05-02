package ua.goit.timonov.practice.practice_2.task_02_4_abcNumber;

/**
 * Validating class for AbcNumber
 */
public class AbcNumberValidator extends AbcNumber {
    private AbcNumber origin;

    public AbcNumberValidator(AbcNumber origin) {
        this.origin = origin;
    }

    @Override
    public int convert(String num) {
        if (num == null) {
            throw new IllegalArgumentException("String points to null!");
        }
        if (num.length() == 0) {
            throw new IllegalArgumentException("String has no chars!");
        }
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) < CHAR_A || num.charAt(i) > CHAR_J) {
                throw new IllegalArgumentException("Chars in the string should be in diapason 'a'..'j'!");
            }
        }
        return origin.convert(num);
    }
}
