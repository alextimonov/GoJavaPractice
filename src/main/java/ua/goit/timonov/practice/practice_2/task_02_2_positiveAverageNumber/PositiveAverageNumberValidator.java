package ua.goit.timonov.practice.practice_2.task_02_2_positiveAverageNumber;

/**
 * Validating class for PositiveAverageNumber
 */
public class PositiveAverageNumberValidator extends PositiveAverageNumber {
    private PositiveAverageNumber origin;

    public PositiveAverageNumberValidator(PositiveAverageNumber origin) {
        this.origin = origin;
    }

    @Override
    public int average(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("One or two numbers are not positive!");
        }
        return origin.average(a, b);
    }
}
