package ua.goit.timonov.practice.practice_2.task_02_6_setZero;

/**
 * Validating class for SetZero
 */
public class SetZeroValidator extends SetZero {
    private SetZero origin;

    public SetZeroValidator(SetZero origin) {
        this.origin = origin;
    }

    @Override
    public int set(int num, int i) {
        if (i < 1 || i > 32) {
            throw new IllegalArgumentException("Parameter i should be in diapason 1..32!");
        }
        return origin.set(num, i);
    }
}
