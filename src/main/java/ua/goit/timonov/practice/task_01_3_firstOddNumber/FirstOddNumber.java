package ua.goit.timonov.practice.task_01_3_firstOddNumber;

/**
 * Class to find first odd number in array
 */
public class FirstOddNumber {

    /**
     * finds first odd number in array of integer numbers
     * @param input     given array of integer numbers
     * @return          index of founded odd number or -1 if there is no odd number in array
     */
    public int find(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (isOddNumber(input[i])) return i;
        }
        return -1;
    }

    // checks if given number is odd
    private boolean isOddNumber(int number) {
        if (Math.abs(number) % 2 != 0) return true;
        else return false;
    }
}
