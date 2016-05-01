package ua.goit.timonov.practice.practice_1.task_01_3_firstOddNumber;

/**
 * Validation decorator for class FirstOddNumber
 */
public class FirstOddNumberValidator extends FirstOddNumber {
    /* object of origin class FirstOddNumber */
    private FirstOddNumber origin = new FirstOddNumber();

    /**
     * Constructor for decorator
     * @param origin        object of origin class FirstOddNumber
     */
    public FirstOddNumberValidator(FirstOddNumber origin) {
        this.origin = origin;
    }

    /**
     * makes validation of given array and than invokes method find of origin class
     * @param input         given array of integer numbers
     * @return              index of founded odd number or -1 if there is no odd number in array
     */
    @Override
    public int find(int[] input) {
        if (input == null) {
            throw new IllegalArgumentException("Input array points to null!");
        }
        if (input.length == 0) {
            throw new IllegalArgumentException("Input array has no elements!");
        }
        return origin.find(input);
    }
}
